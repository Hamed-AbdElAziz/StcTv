package utils;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFormatter {
    public static String formatJsonValue(String filePath, String jsonPath) throws IOException {

        String jsString = new String(Files.readAllBytes(Paths.get(filePath)));
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsString);

        String[] keys = jsonPath.split("\\.");
        JsonNode node = jsonNode;
        for (String key : keys) {
            if (node.isArray()) {
                int index = getIndexFromKey(key);
                if (index >= 0 && index < node.size()) {
                    node = node.get(index);
                } else {
                    throw new IllegalArgumentException("Invalid JSON path: " + jsonPath);
                }
            } else if (node.isObject()) {
                if (node.has(key)) {
                    node = node.get(key);
                } else {
                    throw new IllegalArgumentException("Invalid JSON path: " + jsonPath);
                }
            } else {
                throw new IllegalArgumentException("Invalid JSON path: " + jsonPath);
            }
        }

        if (node != null && !node.isNull()) {
            return node.asText();
        } else {
            throw new IllegalArgumentException("Value not found for JSON path: " + jsonPath);
        }
    }

    private static int getIndexFromKey(String key) {
        try {
            return Integer.parseInt(key);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}
