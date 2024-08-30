package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.DashboardTodoPage;
import pageobjects.NavigationMenu;

public class DashboardPageTodoMenuV2Test extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(DashboardPageTodoMenuV2Test.class);
    private DashboardTodoPage dashboardTodoPage;

    @BeforeMethod
    public void setUpBefore() {
        LOGGER.debug("DashboardPageTodoMenuV2Test setUpBefore() method invoked");
        this.dashboardTodoPage = NavigationMenu.clickTodoLink(this.driver);
    }

    @Test
    public void testAddTodo() {
        this.dashboardTodoPage.addTask("Learning Selenium", "High");
        String actualValue = this.dashboardTodoPage.getPriority("Learning Selenium");
        Assert.assertEquals(actualValue,"High");
    }


/*
    @Test
    public void testComplete_Feature(){
        Assert.assertTrue(this.dashboardTodoPage.markToDoComplete("Learning Selenium"));
    }*/
}
