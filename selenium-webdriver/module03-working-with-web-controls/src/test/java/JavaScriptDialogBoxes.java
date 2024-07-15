import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptDialogBoxes {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/alerts_example.html");
    }

    @Test
    public void handleAlertBox() {
        driver.findElement(By.className("btn-warning")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void handleConfirmBox() {
        driver.findElement(By.className("btn-success")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

    }

    @Test
    public void handlePrompt() {
        driver.findElement(By.className("btn-danger")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Test Message");
        alert.accept();
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.close();
    }
}
