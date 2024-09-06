package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageUsingPageFactory extends BasePage {

    @FindBy(id="firstName")
    private WebElement txtFirstName;

    @FindBy(id="lastName")
    private WebElement txtLastName;

    @FindBy(id="username")
    private WebElement txtUserName;

    @FindBy(id="email")
    private WebElement txtEmail;

    @FindBy(id="password")
    private WebElement txtPassword;

    @FindBy(tagName="button")
    private WebElement btnSignUp;

    public SignUpPageUsingPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public String signUp(String firstName, String lastName, String userName, String email, String password) {
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtUserName.sendKeys(userName);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSignUp.click();
        return this.driver.findElement(By.id("signupSuccess")).getText();
    }

    public LoginPage clickAlreadyHaveAnAccountLink(){
        this.driver.findElement(By.linkText("Already have an account? Login")).click();
        return new LoginPage(this.driver);
    }


}
