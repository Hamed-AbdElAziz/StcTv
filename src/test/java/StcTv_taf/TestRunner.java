package StcTv_taf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/StcTv_taf/tests/features"},
        glue = {"StcTv_taf.tests"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
