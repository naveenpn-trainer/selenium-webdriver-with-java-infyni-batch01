package test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/MathSubtractFeature.feature",
        glue = "step_definitions.example02"
)
public class MathSubtractionFeatureRunner extends AbstractTestNGCucumberTests {
}
