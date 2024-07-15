package infyni.handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_LaunchBrowserTest {

    @Test
    public void launchBrowser(){
        // Chrome Browser
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();
    }

}
