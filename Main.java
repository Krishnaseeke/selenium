import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String [] args){
        System.out.println("Hi Krishna");
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.embibe.com/");
        driver.getTitle();



    }
}
