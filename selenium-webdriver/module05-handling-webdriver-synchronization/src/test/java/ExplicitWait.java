import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/waits/ExplicitWait/TextBox_Wait.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buggy1")));
        driver.findElement(By.id("buggy1")).sendKeys("Test");

        driver.findElement(By.id("buggy2")).sendKeys("Test");

        driver.findElement(By.id("buggy3")).sendKeys("Test");

        Thread.sleep(1000);


    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.quit();
    }
}
