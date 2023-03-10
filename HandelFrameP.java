import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandelFrameP {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pratikshatake/Documents/demo1/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.get("https://classic.freecrm.com/");
        driver.findElement(By.name("username")).sendKeys("PratuT");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("embibe12");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);

        driver.switchTo().frame("mainpanel");//To Handel The Frame
         Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
    }
}
