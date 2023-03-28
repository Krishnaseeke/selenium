import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;


public class FindElementsConcept {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/pratikshatake/Documents/demo1/msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize(); //To maximize the window
        driver.manage().deleteAllCookies(); //To Delete all the Cookies

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.embibe.com/questions/Use-Eclid%E2%80%99s-division-algorithm-to-find-the-HCF-of-135-and-225./EM1929636");
        //Get the count of the link in the page
        //Get text of the each link on the page

        //All the Links are represent by the <a> html tagName
        List < WebElement> linklist = driver.findElements(By.tagName("a"));


        //Get the size of the links
       System.out.println(linklist.size());

       //To Print the Text of the links
<<<<<<< HEAD
        for (WebElement webElement : linklist) {
            String linktext = webElement.getText();
            System.out.println(linktext);
        }
=======
       for(int i=0;i< linklist.size(); i++) {
           String linktext= linklist.get(i).getText();
           System.out.println(linktext);
       }
>>>>>>> e24ca6ce2b3a2128b4b250084381eb5b535d7ded


    }
}
