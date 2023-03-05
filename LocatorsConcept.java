import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.embibe.com/questions/The-functional-unit-of-lung-is/EM2853418");
        //driver.findElement(By.linkText("/html/body/div[1]/div/div[1]/div/div/div/button")).click();
        driver.findElement(By.cssSelector("ecSxel")).click();
    }
}
