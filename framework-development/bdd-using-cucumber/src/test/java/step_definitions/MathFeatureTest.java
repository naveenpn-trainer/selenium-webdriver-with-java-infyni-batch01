package step_definitions;

import bussiness_logic.MathUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class MathFeatureTest {
    private int x;
    private int y;
    private int result;

    @Given("two numbers {int} and {int}")
    public void test_add_two_numbers(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @When("I add both the numbers")
    public void when_i_add_both_the_numbers() {
        result = MathUtility.add(x, y);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedValue) {
        Assert.assertEquals(result,expectedValue);
    }

}
