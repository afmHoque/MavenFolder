package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
    }

    void dismissAlert() {
        driver.switchTo().alert().dismiss();

    }
        void windowhandle () {


            String currentWindow = driver.getWindowHandle();

            driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/a/span")).click();


            // System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());


            Set<String> windows = driver.getWindowHandles();

            Iterator<String> iterator = windows.iterator();

            while (iterator.hasNext()) {

                String newWindwo = iterator.next();

                if (!currentWindow.equalsIgnoreCase(newWindwo)) {
                    driver.switchTo().window(newWindwo);
                }


            }
        }
    }
