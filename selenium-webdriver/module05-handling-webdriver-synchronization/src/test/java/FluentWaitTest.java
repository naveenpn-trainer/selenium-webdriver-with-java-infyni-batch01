import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;


public class FluentWaitTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/waits/ExplicitWait/TextBox_Wait.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(9))
                .ignoring(NoSuchElementException.class);

        WebElement buggyElmnt = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("buggy1"));
            }
        });

        buggyElmnt.sendKeys("Test");
        driver.findElement(By.id("buggy2")).sendKeys("Test");
        driver.findElement(By.id("buggy3")).sendKeys("Test");
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.quit();
    }
}
