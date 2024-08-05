package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public DashboardPage clickLogin(String userName, String password) {
       this.driver.findElement(By.id("username")).sendKeys(userName);
       this.driver.findElement(By.id("password")).sendKeys(password);
       this.driver.findElement(By.tagName("button")).click();
       return new DashboardPage(this.driver);
    }

    public void clickSignUp() {

    }
}
