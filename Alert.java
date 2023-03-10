import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hi Krishna");
        //System.setProperty("webdriver.chrome.driver", "/Users/pratikshatake/Documents/demo1/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        org.openqa.selenium.Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        String text = alt.getText();
        if(text.equals("Please enter a valid user name")) {
            System.out.println("Title is correct");
        }
            else{
                System.out.println("Title is incorrect" );


        }
            alt.accept();
        }



    }


