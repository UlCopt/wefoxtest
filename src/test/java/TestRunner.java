import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumberOptions"},
        features = "src/test/java/features",
        glue = {"stepDefinitions", "utilities"},
        dryRun = false,
        monochrome = true,
        tags = {"@search"}
)
public class TestRunner {
}
