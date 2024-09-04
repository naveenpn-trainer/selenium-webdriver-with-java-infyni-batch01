package infyni.handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementNotVisibleExceptionDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_hidden");
        driver.findElement(By.id("custId")).sendKeys("abc");
        driver.close();
    }
}
