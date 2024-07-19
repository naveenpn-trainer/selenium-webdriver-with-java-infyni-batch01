import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KeyboardInteraction {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
    }

    @Test
    public void testApp() throws InterruptedException {
        WebElement txtEmail = driver.findElement(By.id("email"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(txtEmail).keyDown(txtEmail, Keys.SHIFT).sendKeys("naveenpn.trainer@gmail.com").keyUp(txtEmail, Keys.SHIFT).perform();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.quit();
    }
}
