import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandleFrameK {
    public static void main(String[] args){

        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        // WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.get("https://classic.freecrm.com/");
        driver.findElement(By.name("username")).sendKeys("PratuT");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("embibe12");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().frame("mainpanel");//To Handel The Frame
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
    }
}
