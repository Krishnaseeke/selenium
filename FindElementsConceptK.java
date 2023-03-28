import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConceptK {
    public static void main(String [] args){
        System.setProperty("web.chrome.driver","");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.embibe.com/login");
        List <WebElement> linklist=  driver.findElements(By.tagName("span"));
        System.out.println(linklist.size());
        for(int i=0; i<linklist.size(); i++){
            String listitem = linklist.get(i).getText();
            System.out.println(listitem);
        }


    }
}
