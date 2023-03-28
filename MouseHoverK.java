import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverK {
    public static void main(String [] args){
        System.setProperty("web.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.embibe.com/questions/What-are-the-functions-of-our-lungs%3F/EM7370977");
        driver.findElement(By.xpath("//button[contains(text(),'EXAMS')]")).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//body[@style='overflow: hidden;']/div[@id='__next']/div[@style='display: block;']/div[@class='sc-bcXHqe gZrvQV header-box']/div[@class='sc-bcXHqe iGBKQj']/div[@class='sc-bcXHqe sc-eDvSVe hzvkKW fRZbbQ']/div[@class='sc-bcXHqe sc-eDvSVe iyKMox fRZbbQ']/div[@class='sc-bcXHqe sc-eDvSVe ORTqb bHrWfm']/div[@class='sc-bcXHqe iGBKQj']/div[@class='sc-bcXHqe hUhyoB']/div[@class='sc-bcXHqe sc-eDvSVe UwWNH fRZbbQ']/div[@class='sc-bcXHqe kWUZxk']/div[@class='sc-bcXHqe sc-eDvSVe kYvfdP fRZbbQ']/a[12]/div[1]"))).click().build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//body[@style='overflow: hidden;']/div[@id='__next']/div[@style='display: block;']/div[@class='sc-bcXHqe gZrvQV header-box']/div[@class='sc-bcXHqe iGBKQj']/div[@class='sc-bcXHqe sc-eDvSVe hzvkKW fRZbbQ']/div[@class='sc-bcXHqe sc-eDvSVe iyKMox fRZbbQ']/div[@class='sc-bcXHqe sc-eDvSVe ORTqb bHrWfm']/div[@class='sc-bcXHqe iGBKQj']/div[@class='sc-bcXHqe hUhyoB']/div[@class='sc-bcXHqe sc-eDvSVe iPrAHB fRZbbQ']/div[@class='sc-bcXHqe blfUDC']/div[@class='sc-bcXHqe sc-eDvSVe kYvfdP fRZbbQ']/a[5]/div[1]"))).click().build().perform();
    }
}
