import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotK {
    public static void main(String [] args) throws IOException, InterruptedException {
        System.setProperty("web.chrome.driver","/Users/seekekrishna/eclipse-workspace/Microsite_V1/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.embibe.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       /* TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("/Users/seekekrishna/Documents/selenium/google.png");
        FileUtils.copyFile(SrcFile, DestFile); */
        // https://www.guru99.com/take-screenshot-selenium-webdriver.html
        Thread.sleep(3000);
        File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SS,new File("/Users/seekekrishna/Documents/selenium/google.png"));

    }
}
