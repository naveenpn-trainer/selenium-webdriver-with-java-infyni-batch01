import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingWithFrames {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://169.254.77.196:8000/IFrame-Main.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().frame("frame1");
        driver.findElement(By.id("temp")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("txtName")).getAttribute("value"));

        driver.switchTo().window(parentWindow);

        driver.switchTo().frame(1);
        Thread.sleep(2000);
        driver.findElement(By.id("txtName2")).sendKeys("Hello");


    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.close();
    }
}
