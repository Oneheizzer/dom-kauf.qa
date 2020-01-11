package domkauf.cucumber;

import cucumber.api.CucumberOptions;
import domkauf.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/")

public class MainRunner extends TestBase {
}
