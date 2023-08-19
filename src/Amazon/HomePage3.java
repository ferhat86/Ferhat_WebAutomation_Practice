package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage3 {



    ChromeDriver driver;
    String amazonUrl ="https://www.amazon.com/";

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
    public void login(){
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("all.ferhatus86@gmail.com");
        driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("tdhdvichosd");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        String expectResult="Amazon Sign-In";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult,expectResult,"Test Fail");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
