package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_getCSSValue {
    @Test
    public void testGetAttribute(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/Style.html");
        WebElement element = driver.findElement(By.id("btn"));
        System.out.println(element.getCssValue("width"));

        
    }
}
