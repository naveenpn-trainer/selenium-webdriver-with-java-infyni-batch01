import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingDatePicker {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/DatePicker.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("dateofbirth")).sendKeys("05-07-2024");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.close();
    }
}
