package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoseOver {


    WebDriver driver;
    String  URL="https://www.amazon.com/";

    @BeforeMethod
    public void setUp(){
        String webDriverPath="DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(URL);

    }
    @Test
    public void moseOver(){
        WebElement ele1 = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        WebElement ele2 = driver.findElement(By.xpath("//*[text()='Account']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele1).pause(2000).moveToElement(ele2).click().build().perform();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
