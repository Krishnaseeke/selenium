import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("web.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.setCapability("locationContextEnabled", true);
        options.setCapability("notificationPermission", "allow");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Student Discount')]")).click();


    }
}
