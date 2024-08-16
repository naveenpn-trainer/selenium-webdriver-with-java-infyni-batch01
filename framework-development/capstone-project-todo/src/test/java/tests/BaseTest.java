package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageobjects.LoginPage;
import util.ResourceFileUtil;
import util.ResourceFileUtilRefactored;

public class BaseTest {

    protected WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUpBeforeClass() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get(ResourceFileUtilRefactored.getInstance().getTestConfigValue("applicationURL"));
        loginPage.login(ResourceFileUtilRefactored.getInstance().getTestConfigValue("username"), ResourceFileUtilRefactored.getInstance().getTestConfigValue("password"));
//        driver.get(ResourceFileUtil.getTestConfigValue("applicationURL"));
//        loginPage.login(ResourceFileUtil.getTestConfigValue("username"), ResourceFileUtil.getTestConfigValue("password"));
    }


    @AfterClass
    public void tearDownAfterClass() {
        this.driver.quit();
    }
}
