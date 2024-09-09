package test_runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/MathFeature.feature",
        glue = "step_definitions"
)
public class MathFeatureRunner extends AbstractTestNGCucumberTests {
}
