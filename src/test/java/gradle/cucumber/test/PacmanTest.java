package gradle.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features",
                    name = {""},
                    glue = {"gradle.cucumber.steps"})
public class PacmanTest {

}
