package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    LoginPage loginPage;
    WebDriver driver;
    @BeforeMethod
    public void setUpBeforeClass() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://selenium-practice.vercel.app/misc/login.html");
    }

    @Test
    public void clickLogin_WithCorrectCredentials(){
        DashboardPage dashboardPage = loginPage.clickLogin("admin","password123");
        Assert.assertEquals(dashboardPage.getDasboardTitle(),"Dashboard");
    }



    @Test
    public void clickLogin_WithIncorrectCredentials(){
        DashboardPage dashboardPage = loginPage.clickLogin("tom","tom123");
        Assert.assertEquals(dashboardPage.getDasboardTitle(),"Invalid Credentials");
    }

    @AfterMethod
    public void tearDownAfterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}

