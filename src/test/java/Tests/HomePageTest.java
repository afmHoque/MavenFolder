package Tests;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    void setUpHomePage() {
        setup();
       driver.get("https://www.bnymellon.com");
      //  driver.get("https://nexen.bnymellon.com/app/nxn/login");
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test
    public void access() {
       // dismissAlert();
        windowhandle();
        homePage.nexen();
        homePage.clickClintAccess();
        homePage.enterValidUserId();
        homePage.enterPassword();
        }

    }
