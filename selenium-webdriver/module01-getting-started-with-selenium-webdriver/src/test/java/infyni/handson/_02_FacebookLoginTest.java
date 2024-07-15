package infyni.handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_FacebookLoginTest {
    WebDriver driver = null;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void verifyGreetingText() {
        WebElement h2Elmnt = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(h2Elmnt.getText(), "Facebook helps you connect and share with the people in your life.");
    }

    @Test
    public void testLogin_WithIncorrectCredentials() {

        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys("naveenpn.trainer@gmail.com");

        WebElement txtPassword = driver.findElement(By.name("pass"));
        txtPassword.sendKeys("abc");

        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();

        Assert.assertNotNull(driver.findElement(By.linkText("Find your account and log in.")));

    }

    @Test(enabled = false)
    public void testLogin_WithCorrectCredentials() {

    }

    @Test(enabled = false)
    public void verifySignupLink() {

    }


    @AfterMethod
    public void tearDownAfterMethod() {
        driver.close();
    }
}
