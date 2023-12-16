package StcTv_taf.tests.subscription_packages;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/StcTv_taf/tests/subscription_packages"},
        glue = {"StcTv_taf.tests"},
        monochrome = true
)
public class SubscriptionPackagesRunner extends AbstractTestNGCucumberTests {
}

