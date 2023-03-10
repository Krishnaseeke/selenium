import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MousemoveConceptP {

    public static void main(String [] args) throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "/Users/pratikshatake/Documents/demo1/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.get("https://www.spicestyle.com/");

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();

        Thread.sleep(3000);
        driver.findElement(By.linkText("Earphones/Headphones")).click();
    }

}
