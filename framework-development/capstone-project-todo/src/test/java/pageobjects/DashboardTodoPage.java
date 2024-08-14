package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DashboardTodoPage extends BasePage {
    public DashboardTodoPage(WebDriver driver) {
        super(driver);
    }


    public void addTask(String todo, String priority){
        this.driver.findElement(By.id("newTodo")).sendKeys(todo);
        Select select = new Select(this.driver.findElement(By.id("priority")));
        select.selectByVisibleText(priority);
        this.driver.findElement(By.xpath("//*[@id='todo']/div/button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
