package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

  /*  void setup(String browser) throws IOException {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver 5");
            driver = new FirefoxDriver();

        }
    }
*/
    void setup() {

        String browser = "chrome";

        switch (browser) {

          /*  case "edge":
                System.setProperty("webdriver.edge.driver", "resources/Edge");
                driver = new EdgeDriver();
                break;*/

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
                driver = new ChromeDriver();
                break;

                /*
            case "explorer":
                System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
                */

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "resources/geckodriver 5");
                driver = new FirefoxDriver();
                break;
        }
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor ar = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        ar.executeScript("window.scrollBy(0,400)");
    }

    public void windowMaximize(){
        driver.manage().window().maximize();
    }

    public void screenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("./ScreenShot/BankProject001"));
    }

    void windowScrollByPixels(String ByPixels) {
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript(ByPixels);
    }

    // scroll down to the bottom of the page
    void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

//       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//       driver = new ChromeDriver();
//       System.setProperty("webdriver.gecko.driver", "resources/geckodriver 3");
//       driver = new FirefoxDriver();

    void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    // implicit wait
    void implicitWait(long wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    public static WebDriver handleNewTab(WebDriver driver1) {
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }

    // Cookies alert

    void cookies() {
        driver.manage().deleteAllCookies();
    }
    public void actionMethod(){
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//button[@id='wbb-button-2']"));
        actions.contextClick(rightClick).build().perform();

    }

    @AfterMethod
    void close() throws IOException {
        screenshot();
    }
}


