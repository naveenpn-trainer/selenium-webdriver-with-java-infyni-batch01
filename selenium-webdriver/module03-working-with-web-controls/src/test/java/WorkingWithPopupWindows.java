import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WorkingWithPopupWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/popups/Popup.html");
    }

    @Test
    public void testApp() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window:" + parentWindow);
        Thread.sleep(2000);
        driver.findElement(By.id("help")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> allWindowIterator = allWindows.iterator();
        System.out.println("Parent window:" + allWindowIterator.next());
        String newWindows = allWindowIterator.next();
        driver.switchTo().window(newWindows);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
        Thread.sleep(2000);
        driver.findElement(By.id("chat")).click();

        allWindows = driver.getWindowHandles();
        allWindowIterator = allWindows.iterator();
        System.out.println("Parent window:" + allWindowIterator.next());
        newWindows = allWindowIterator.next();
        driver.switchTo().window(newWindows);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        driver.close();
    }
}
