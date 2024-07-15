import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClick {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/actions/DoubleClick.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        WebElement btnElmnt = driver.findElement(By.name("dblClick"));
        Actions actions = new Actions(driver);
        actions.doubleClick(btnElmnt).perform();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.quit();
    }
}
