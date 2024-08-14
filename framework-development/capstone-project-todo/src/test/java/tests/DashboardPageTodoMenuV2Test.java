package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.DashboardTodoPage;
import pageobjects.NavigationMenu;

public class DashboardPageTodoMenuV2Test extends BaseTest {

    private DashboardTodoPage dashboardTodoPage;

    @BeforeMethod
    public void setUpBefore() {
        this.dashboardTodoPage = NavigationMenu.clickTodoLink(this.driver);
    }

    @Test
    public void testAddTodo() {
        this.dashboardTodoPage.addTask("Learning Selenium", "High");
    }
}
