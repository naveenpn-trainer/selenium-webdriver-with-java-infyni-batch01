package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class _01_LocatingLinks {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
    }

    @Test
    public void clickLink() {
        WebElement lnkText = driver.findElement(By.linkText("Create a Page"));
        lnkText.click();
        Assert.assertEquals(driver.getTitle(), "Facebook");
    }

    @Test
    public void fetchAllLinks() {
       List<WebElement> lnks =  driver.findElements(By.tagName("a"));
       for(WebElement lnk : lnks){
           System.out.println(lnk.getText());
       }
    }

    @Test
    public void testBrowserNavigation(){
        driver.findElement(By.linkText("Sign Up")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Sign Up")).click();
        driver.navigate().back();

    }

    @AfterMethod
    public void tearDownAfterMethod(){
        this.driver.close();
    }
}
