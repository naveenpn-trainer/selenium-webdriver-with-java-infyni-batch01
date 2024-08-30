import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/waits/ExplicitWait/TextBox_Wait.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
