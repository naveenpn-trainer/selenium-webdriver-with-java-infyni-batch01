import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResizableElementAutomation  {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testApp() throws InterruptedException {

        WebElement resizableElement = driver.findElement(By.id("resizable"));
        WebElement resizableHandle = resizableElement.findElement(By.className("ui-resizable-se"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", resizableHandle);

        Actions actions = new Actions(driver);
        actions.clickAndHold(resizableHandle).moveByOffset(50, 50).release().perform();
        Thread.sleep(2000);
        actions.clickAndHold(resizableHandle).moveByOffset(150, 150).release().perform();
        Thread.sleep(2000);
    }


    @AfterMethod
    public void tearDownAfterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}