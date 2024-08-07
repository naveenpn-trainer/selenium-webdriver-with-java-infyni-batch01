import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public SignUpPage clickSignUp() {
        this.driver.findElement(By.linkText("Don't have an account? Signup")).click();
        return new SignUpPage(this.driver);
    }

    public DashboardPage login(String username, String password){
        this.driver.findElement(By.id("username")).sendKeys(username);
        this.driver.findElement(By.id("password")).sendKeys(password);
        this.driver.findElement(By.tagName("button")).click();
        return new DashboardPage(this.driver);
    }

}
