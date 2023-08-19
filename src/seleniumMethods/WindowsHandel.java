package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandel {


    WebDriver driver;
    String URL = "https://www.amazon.com/";

    @BeforeMethod
    public void setUp(){
        String webDriverPath ="DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(URL);

    }
    @Test(enabled = false)
    public void windowsHandel() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
        driver.findElement(By.xpath("//a[text()='Digital Services and Device Support']")).click();
        String handled =driver.getWindowHandle();

       Thread.sleep(3000);
//       driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
       driver.switchTo().window(handled);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Manage devices')]"))).click().build().perform();
//               driver.findElement(By.xpath("//div[contains(text(),'Manage devices')]")).click();
//       String handled1= driver.getWindowHandle();
//       driver.switchTo().window(handled1);

//
//        Thread.sleep(3000);


//       driver.findElement(By.xpath("//div[contains(text(),'A delivery, order or return')]")).click();



    }
    @Test(enabled = true)
     void windowHandel(){
        //String ele1=driver.getWindowHandle();
       driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
        driver.findElement(By.xpath("//a[text()='Digital Services and Device Support']")).click();
      Set<String> ele3=driver.getWindowHandles();
        for(String element:ele3) {
            String t=driver.switchTo().window(element).getTitle();
            //System.out.println(t);
            if(t.contains("Amazon Customer Service Support – Amazon.com")){
                driver.close();
            }
           driver.findElement(By.xpath("//div[text()='Manage devices']")).click();
        }
    }

    @AfterMethod
    private void tearDown(){
        driver.quit();
    }
}
