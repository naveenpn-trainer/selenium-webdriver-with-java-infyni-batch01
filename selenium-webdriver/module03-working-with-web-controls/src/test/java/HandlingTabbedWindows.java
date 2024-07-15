import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class HandlingTabbedWindows {

    @Test
    public void testTabbedWindows(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/");
        driver.findElement(By.linkText("Simple Login")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();
        String parentWindow = iterator.next();
        String newWindow = iterator.next();
        driver.switchTo().window(newWindow);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
