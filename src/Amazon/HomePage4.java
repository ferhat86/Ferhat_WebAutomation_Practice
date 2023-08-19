package Amazon;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage4<eleme> {


    ChromeDriver driver;
    String amazonUrl = "https://www.amazon.com/";

    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl );
    }


    @Test(enabled = false)
    public void registrationLogin(){
       driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
       driver.findElement(By.id("createAccountSubmit")).click();
       driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Ferhat Allaoua");
       driver.findElement(By.cssSelector("#ap_email")).sendKeys("adggj@gvycdi.com");
       driver.findElement(By.cssSelector("#ap_password")).sendKeys("dfsert");
       driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("dfsert");
       driver.findElement(By.cssSelector("#continue")).click();
    }
    @Test(enabled = false)

    public void moseOver(){
       WebElement ele1=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
       WebElement ele2=driver.findElement(By.xpath("//span[text()='Content & Devices']"));

        Actions act = new Actions(driver);
        act.moveToElement(ele1).pause(2000).moveToElement(ele2).click().build().perform();
    }

    @Test
    public void radioButton() throws InterruptedException {
        WebElement fr1= driver.findElement(By.className("icp-nav-link-inner"));
//        fr1.click();
        Actions act = new Actions(driver);
        act.moveToElement(fr1).click().build().perform();
        List<WebElement> radios  = driver.findElements(By.xpath("//span[@class='a-label a-radio-label']"));
        radios.get(1).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
