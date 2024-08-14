package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public String signUp(String firstName, String lastName, String userName, String email, String password) {
        this.driver.findElement(By.id("firstName")).sendKeys(firstName);
        this.driver.findElement(By.id("lastName")).sendKeys(lastName);
        this.driver.findElement(By.id("username")).sendKeys(userName);
        this.driver.findElement(By.id("email")).sendKeys(email);
        this.driver.findElement(By.id("password")).sendKeys(password);
        this.driver.findElement(By.tagName("button")).click();
        return this.driver.findElement(By.id("signupSuccess")).getText();
    }

    public LoginPage clickAlreadyHaveAnAccountLink(){
        this.driver.findElement(By.linkText("Already have an account? Login")).click();
        return new LoginPage(this.driver);
    }


}
