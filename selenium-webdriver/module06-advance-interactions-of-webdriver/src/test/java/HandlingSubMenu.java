import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingSubMenu {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/actions/MenuOptions.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testApp() throws InterruptedException {
        WebElement servicesMenu = driver.findElement(By.id("services"));
        WebElement webDesignSubMenu = driver.findElement(By.cssSelector("#services > ul > li:nth-child(1)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesMenu).perform();
        Thread.sleep(3000);
        actions.moveToElement(webDesignSubMenu).click().perform();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.quit();
    }
}
