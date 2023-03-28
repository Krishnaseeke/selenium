import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileuploadK {
    public static void main(String [] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
       // WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        // WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://html.com/input-type-file/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/seekekrishna/Downloads/12.pdf");

    }
}
