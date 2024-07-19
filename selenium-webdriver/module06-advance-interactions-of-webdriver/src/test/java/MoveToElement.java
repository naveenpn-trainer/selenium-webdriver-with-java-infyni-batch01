import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoveToElement {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/actions/MoveByOffset.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        WebElement targetBox = driver.findElement(By.id("obliterate"));
        WebElement sourceOneBox = driver.findElement(By.id("one"));
        WebElement sourceTwoBox = driver.findElement(By.id("two"));
        WebElement sourceThreeBox = driver.findElement(By.id("three"));
        WebElement sourceFourBox = driver.findElement(By.id("four"));
        WebElement sourceFiveBox = driver.findElement(By.id("five"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDrop(sourceOneBox, targetBox)
                .dragAndDrop(sourceTwoBox, targetBox)
                .dragAndDrop(sourceThreeBox, targetBox)
                .dragAndDrop(sourceFourBox, targetBox)
                .dragAndDrop(sourceFiveBox, targetBox)
                .release().perform();

    }

    @AfterMethod
    public void tearDownAfterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
