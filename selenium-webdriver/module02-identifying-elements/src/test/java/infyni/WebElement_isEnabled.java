package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElement_isEnabled {
    @Test
    public void testIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/IsEnabled.html");
        WebElement chkElmnt = driver.findElement(By.id("agree"));
        WebElement btnElmnt = driver.findElement(By.id("btn"));
        Assert.assertFalse(chkElmnt.isSelected());
        chkElmnt.click();
        Assert.assertTrue(btnElmnt.isEnabled());
        chkElmnt.click();
        Assert.assertFalse(btnElmnt.isEnabled());
        driver.close();
    }
}
