package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenu {


    public static DashboardTodoPage clickTodoLink(WebDriver driver) {
        driver.findElement(By.linkText("Todo")).click();
        return new DashboardTodoPage(driver);
    }


    public static DashboardSettingsPage clickSettings(WebDriver driver) {
        return null;
    }

    public static DashboardProfilePage clickProfilesMenu(WebDriver driver) {
        return null;
    }
}
