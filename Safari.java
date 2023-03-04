import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {
    public static void main(String [] args){
        WebDriver driver = new SafariDriver();
        driver.get("http://www.embibe.com");
        System.out.println(driver.getTitle());
    }
}
