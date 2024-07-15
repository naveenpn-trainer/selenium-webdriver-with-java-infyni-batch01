import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {
    @Test
    public void testDropDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice.vercel.app/webcontrols/DropDown.html");
        WebElement drpDwnElmnt = driver.findElement(By.id("userexp"));
        Select select = new Select(drpDwnElmnt);
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Successfull Calls");
        Thread.sleep(2000);
        select.selectByValue("internet");
    }
}
