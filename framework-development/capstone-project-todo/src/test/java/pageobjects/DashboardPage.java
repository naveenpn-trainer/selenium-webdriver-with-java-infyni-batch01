package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public DashboardTodoPage clickTodoLink() {
        this.driver.findElement(By.linkText("Todo")).click();
        return new DashboardTodoPage(this.driver);
    }


    public DashboardSettingsPage clickSettings() {
        return null;
    }

    public DashboardProfilePage clickProfilesMenu() {
        return null;
    }
}
