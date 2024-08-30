package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.DashboardTodoPage;

public class DashboardPageTodoMenuTest extends BaseTest {

    private DashboardPage dashboardPage;
    private DashboardTodoPage dashboardTodoPage;

    @BeforeMethod
    public void setUpBefore() {
        dashboardPage = new DashboardPage(this.driver);
//        dashboardTodoPage = new DashboardTodoPage(this.driver);
    }

    @Test(groups = "regression")
    public void testAddTodo() {
        this.dashboardTodoPage = dashboardPage.clickTodoLink();
        this.dashboardTodoPage.addTask("Learning Selenium", "High");
    }
}
