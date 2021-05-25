package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
     //   driver.manage().window().maximize();
      //  driver.manage().deleteAllCookies();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
}
