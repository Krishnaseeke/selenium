import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CustomXpath {
    public static void main(String [] args){
        System.setProperty("web.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.embibe.com/login");
        //driver.findElement(By.xpath("//*[@class='No thanks']")).click();//"//button[@class='No thanks']"
        //driver.findElement(By.xpath("//*[@id='wzrk-cancel' or @class='No thanks']")).click(); //[Finding elements through OR/AND method]
        driver.findElement(By.xpath("//*[@id='wzrk-cancel' and @class='No thanks']")).click();
        //driver.findElement(By.xpath("//button[starts-with(contains(text(),'I want to miss out'))]")).click(); //[In This code this method is not working need to know RCA ]
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("6303960573");
        //driver.findElement(By.xpath("//span[contains(text(),'Sign In using password')]")).click();
        driver.findElement(By.xpath("//span[text()='Sign In using password']")).click();


        //Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'More Exams')]"))).click().build().perform();

    }
}
