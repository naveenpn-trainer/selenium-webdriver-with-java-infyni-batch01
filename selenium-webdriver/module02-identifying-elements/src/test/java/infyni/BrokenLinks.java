package infyni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://selenium-practice.vercel.app/misc/BrokenLinks.html");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement element : allLinks) {
            boolean isLinkBroken = isBrokenLink(element.getAttribute("href"));
            System.out.println("The given link " + element.getAttribute("href") + " is broken= " + isLinkBroken);
        }


    }

    public static boolean isBrokenLink(String anchorURL) {

        URL url = null;
        try {
            url = new URL(anchorURL);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            System.out.println(responseCode);
            if (responseCode >= 300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
            return true;
        }
    }
}
