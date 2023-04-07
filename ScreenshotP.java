import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenshotP {

    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/pratikshatake/Documents/demo1/msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize(); //To maximize the window
        driver.manage().deleteAllCookies(); //To Delete all the Cookies

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.embibe.com/");

        //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        


    }
}
