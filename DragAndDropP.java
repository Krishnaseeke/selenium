import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropP {

    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pratikshatake/Documents/demo1/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //To maximize the window
        driver.manage().deleteAllCookies(); //To Delete all the Cookies

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);  //To Handel the Frame

        Actions act = new Actions(driver);  //To use Drag and Drop method
        act.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
                .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
                .release()
                .build()
                .perform();
    }

}
