<<<<<<< HEAD
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
=======

>>>>>>> 6945cc49c7e337034e1d73cb05c46a8549bc2873

import java.time.Duration;

public class Main {
<<<<<<< HEAD
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hi Krishna");
        System.setProperty("webdriver.chrome.driver", "/Users/pratikshatake/Documents/demo1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.embibe.com/");
        driver.findElement(By.id("wzrk-cancel")).click();
        driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(10) button:nth-child(1) > img:nth-child(1)")).click();
        Thread.sleep(5000);
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        //driver.findElement(By.xpath(" //*[contains(text(),'Log in')]")).click();
        //Thread.sleep(5000);
        //Alert alt = driver.switchTo().alert();
       //System.out.println(alt.getText());



=======
    public static void main(String [] args){
            System.out.println("Hi Krishna");
           BrowserLaunch.driver.get("https://www.embibe.com/");
           BrowserLaunch.driver.getTitle();
>>>>>>> 6945cc49c7e337034e1d73cb05c46a8549bc2873



    }
}
