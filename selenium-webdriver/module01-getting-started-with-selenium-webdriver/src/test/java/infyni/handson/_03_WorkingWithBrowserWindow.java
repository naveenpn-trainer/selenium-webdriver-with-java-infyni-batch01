package infyni.handson;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver.Window;

public class _03_WorkingWithBrowserWindow {

    @Test
    public void playWithBrowserWindow() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Window window= driver.manage().window();
        window.setSize(new Dimension(100,100));
        Thread.sleep(2000);
        window.maximize();
        Thread.sleep(2000);
        window.setSize(new Dimension(600,100));
        Thread.sleep(2000);
        window.setPosition(new Point(10,20));
        Thread.sleep(2000);
        window.maximize();
        driver.close();
    }
}
