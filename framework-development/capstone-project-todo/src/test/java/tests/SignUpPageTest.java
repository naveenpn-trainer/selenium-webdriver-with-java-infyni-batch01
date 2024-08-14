package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.SignUpPage;

public class SignUpPageTest {

    private WebDriver driver;
    LoginPage loginPage;
    SignUpPage signUpPage;
    DashboardPage dashboardPage;

    @BeforeClass
    public void setUpBeforeClass() {
        this.driver = new ChromeDriver();
        this.driver.get("https://selenium-practice.vercel.app/todo_app/login.html");
        this.loginPage = new LoginPage(driver);
    }

    @Test(priority = 0)
    public void testSignUp() {
        this.signUpPage = this.loginPage.clickSignUp();
        String signUpMessage = this.signUpPage.signUp("Nikshay",
                "Pn", "nikshaypn", "nikshaypn.trainer@gmail.com", "Test@1234");
        Assert.assertEquals(signUpMessage, "Signup successful! You can now login.");
    }

    @Test(priority = 1)
    public void testSignInLink() {
        this.loginPage = this.signUpPage.clickAlreadyHaveAnAccountLink();
        Assert.assertEquals(this.loginPage.getPageTitle(),"Login");
    }

    @Test(priority = 2)
    public void testLogin(){
        this.dashboardPage = this.loginPage.login("nikshaypn","Test@1234");
        Assert.assertEquals(this.dashboardPage.getPageTitle(),"Dashboard");
    }

    @AfterClass
    public void tearDownAfterClass() {
        this.driver.quit();
    }
}
