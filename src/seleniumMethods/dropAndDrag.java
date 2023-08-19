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

public class dropAndDrag {
    WebDriver driver;
    String URL="https://jqueryui.com/droppable/";
    @BeforeMethod
    public void setUp(){
        String webDriverPath= "DriverBrowser/Windows/chromedriver1.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
//        webDriverManager.chromeDriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }
    @Test
    public void dropAndDrag() throws InterruptedException {
        driver.switchTo().frame(0);
        WebElement el1= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement el2= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions act =new Actions(driver);
        act.dragAndDrop(el1,el2).pause(3000).build().perform();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

    }
    @AfterMethod

    public void tearDown(){
        driver.quit();
    }
}
