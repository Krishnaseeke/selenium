import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.embibe.com/questions/The-functional-unit-of-lung-is/EM2853418");
        //driver.get("https://www.embibe.com/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='sc-gswNZR ecSxel']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='sc-kDvujY iXiPEQ']")).click();
        driver.findElement(By.xpath("//input[@class='sc-kDvujY iXiPEQ']")).sendKeys("6303960573");
        driver.findElement(By.xpath("//button[@class='sc-gswNZR cAXbMq']")).click();
    }
}
