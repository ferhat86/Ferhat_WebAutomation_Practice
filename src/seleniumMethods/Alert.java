package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert {

    WebDriver driver;
    String URL="https://the-internet.herokuapp.com/javascript_alerts";
    @BeforeMethod
    public void setUp(){
        String webDriverPath="DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);

    }

    @Test
    public void alertAccept() throws InterruptedException {
         driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
         Thread.sleep(3000);
        System.out.println("Alert Text is : "+ driver.switchTo().alert().getText());
         driver.switchTo().alert().accept();
    }
    @Test
    public void alertDismiss() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void alertSendKey() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("FERHAT");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
