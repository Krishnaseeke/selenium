import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameK {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("");
    }
}
