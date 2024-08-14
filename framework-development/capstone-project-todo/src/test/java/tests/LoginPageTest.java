package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

public class LoginPageTest {
    LoginPage loginPage;
    WebDriver driver;
    @BeforeMethod
    public void setUpBeforeClass() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://selenium-practice.vercel.app/todo_app/login.html");
    }

    @Test
    public void clickLogin_WithCorrectCredentials(){
        DashboardPage dashboardPage = loginPage.login("admin","password123");
        Assert.assertEquals(dashboardPage.getPageTitle(),"Dashboard");
    }



    @Test
    public void clickLogin_WithIncorrectCredentials(){
        DashboardPage dashboardPage = loginPage.login("tom","tom123");
        Assert.assertEquals(dashboardPage.getPageTitle(),"Login");
        Assert.assertEquals(this.driver.findElement(By.id("loginError")).getText(),"Invalid username or password");
    }

    @AfterMethod
    public void tearDownAfterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}

