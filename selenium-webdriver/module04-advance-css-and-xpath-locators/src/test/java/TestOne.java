import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {
        WebDriver driver;
        @BeforeMethod
        public void setUpBeforeMethod() {
            driver = new ChromeDriver();
            driver.get("https://selenium-practice.vercel.app/advance_locators/DynamicElements.html");

        }

        @Test
        public void testApp() throws InterruptedException {
            Thread.sleep(3000);
//            driver.findElements(By.cssSelector("input[type='text'][id*='input']")).get(1).sendKeys("Hello");
            driver.findElement(By.cssSelector("div#div3>input[type='text'][id*='input']")).sendKeys("Hello");
        }

        @AfterMethod
        public void tearDownAfterMethod() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }
}
