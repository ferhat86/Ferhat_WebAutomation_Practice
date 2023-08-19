package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {


    WebDriver driver;
    String URL = "https://demo.guru99.com/selenium/newtours/";

    @BeforeMethod
    public void setUp() {
        String webDriverPath = "DriverBrowser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void dropDown() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

        Select dropDown = new Select(driver.findElement(By.name("country")));
       List<WebElement> dropDown1 = dropDown.getOptions();
        System.out.println("Elements count in DropDown: "+ dropDown1.size());
        dropDown.selectByIndex(4);
        Thread.sleep(3000);
        dropDown.selectByVisibleText("ALGERIA");
        int j=0;
        for (int i=0;i<dropDown1.size();i++){
            j=i+1;
            System.out.println("Item Number is : " + j + ":" + dropDown1.get(i).getText());

    }



    }
@AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
