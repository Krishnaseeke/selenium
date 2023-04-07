import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class NavigationP {

    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/pratikshatake/Documents/demo1/msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize(); //To maximize the window
        driver.manage().deleteAllCookies(); //To Delete all the Cookies

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.embibe.com/questions/Use-Eclid%E2%80%99s-division-algorithm-to-find-the-HCF-of-135-and-225./EM1929636");
        //Back and forward button simulation
        driver.navigate().to("https://www.embibe.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().back();

        //To Refresh the page
        driver.navigate().refresh();

    }



    }
