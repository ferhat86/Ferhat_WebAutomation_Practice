package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage2 {

    ChromeDriver driver;
    String amazonUrl="https://www.amazon.com/";

    @BeforeMethod
    public void setUp(){
        String chromeDriverPath="DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
    }

    @Test
    public void searchBox2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String expectedResult="Amazon.com : iphone";
        String actualResult= driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult,"Test Fail");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
