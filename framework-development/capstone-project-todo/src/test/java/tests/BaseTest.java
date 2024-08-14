package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageobjects.LoginPage;

public class BaseTest {

    protected WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUpBeforeClass() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://selenium-practice.vercel.app/todo_app/login.html");
        loginPage.login("admin", "password123");
    }


    @AfterClass
    public void tearDownAfterClass() {
        this.driver.quit();
    }
}
