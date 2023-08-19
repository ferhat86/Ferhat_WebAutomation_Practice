package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";

@BeforeMethod
    public void setUp(){
        String chromeDriverPath="DriverBrowser/Windows/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.get(amazonUrl);


    }

    @Test
    public void searchBox() throws InterruptedException {
String expectedResult="Amazon.com. Spend less. Smile more.";
        String actualResult= driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult,"Test Fail");
        Thread.sleep(5000);

    }
@AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
