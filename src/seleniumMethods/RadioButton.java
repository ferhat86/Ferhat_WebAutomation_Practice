package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton {


    WebDriver driver;
    String URL = "https://www.amazon.com/";

    @BeforeMethod
    public void setUp(){
        String webDriverPath="DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
    }
    @Test
    public void radioButton() throws InterruptedException {
        driver.findElement(By.className("icp-nav-link-inner")).click();
        List<WebElement> radio = driver.findElements(By.xpath("//span[@class='a-label a-radio-label']"));
        radio.get(1).click();
        Thread.sleep(3000);
        driver.findElement(By.className("a-button-input")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
