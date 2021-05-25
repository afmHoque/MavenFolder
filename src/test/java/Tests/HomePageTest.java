package Tests;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    void setUpHomePage() {
        setup();

        driver.get("https://bnymellon.com/");

        driver.switchTo().alert().dismiss();

        String currentWindow = driver.getWindowHandle();

        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/a/span")).getText());

        driver.findElement(By.xpath("//*[@id='USER']")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();

        while (iterator.hasNext()) {

            String newWindwo = iterator.next();

            if (!currentWindow.equalsIgnoreCase(newWindwo)) {

                driver.switchTo().window(newWindwo);

                homePage = PageFactory.initElements(driver, HomePage.class);

            }
        }
    }
            
                @Test
                public void testSignIn(){
                homePage.nexxen();
            }

    }
