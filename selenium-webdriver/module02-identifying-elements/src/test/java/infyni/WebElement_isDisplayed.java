package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElement_isDisplayed {

    @Test
    public void testIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/IsDisplayed.html");
        WebElement txtElmnt = driver.findElement(By.id("t1"));
        WebElement btnElmnt = driver.findElement(By.id("btn1"));
        Assert.assertTrue(txtElmnt.isDisplayed());
        btnElmnt.click();
        Assert.assertFalse(txtElmnt.isDisplayed());
        driver.close();
    }
}
