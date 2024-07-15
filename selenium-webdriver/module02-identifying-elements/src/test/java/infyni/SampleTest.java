package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SampleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }


    @Test
    public void fetchAllLinks() throws InterruptedException {
        WebElement searchElmnt = driver.findElement(By.name("q"));
        searchElmnt.sendKeys("java");
        Thread.sleep(5000);
        searchElmnt.sendKeys(Keys.DOWN);
        Thread.sleep(5000);
        searchElmnt.sendKeys(Keys.DOWN);
        Thread.sleep(5000);
        searchElmnt.sendKeys(Keys.DOWN);
        Thread.sleep(10000);

    }


    @AfterMethod
    public void tearDownAfterMethod() {
        this.driver.close();
    }
}
