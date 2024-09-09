package step_definitions.example02;

import bussiness_logic.MathUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MathSubtractFeatureTest {
    private int x;
    private int y;
    private int result;

    @Given("two numbers {int} and {int}")
    public void test_add_two_numbers(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @When("I sub both the numbers")
    public void when_i_sub_both_the_numbers() {
        result = MathUtility.sub(x, y);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedValue) {
        Assert.assertEquals(result,expectedValue);
    }

}
