import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.embibe.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
        driver.findElement(By.xpath("//i[@class='demo-icon demo-icon--filled demo-icon--default icon-style']")).click();
        driver.findElement(By.xpath("//input[@id='te']")).click();


        /*Select select = new Select(driver.findElement(By.xpath("//i[@class='demo-icon demo-icon--filled demo-icon--default icon-style']")));
        select.selectByVisibleText("Telugu");*/

    }

}
