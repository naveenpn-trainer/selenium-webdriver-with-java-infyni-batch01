import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSliders extends BaseTest{

    @Test
    public void testApp(){
        driver.get("https://jqueryui.com/resources/demos/slider/default.html");
        WebElement mainSlider = driver.findElement(By.id("slider"));
        int width = mainSlider.getSize().width/2;
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
        System.out.println(width);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, width,0).perform();
    }
}
