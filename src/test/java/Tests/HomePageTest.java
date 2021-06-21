package Tests;

import Pages.HomePageSignOn;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseTest {

    HomePageSignOn homePageSignOn;

    @BeforeMethod
    void setUpHomePage() throws IOException {

        setup();
       // setup("chrome");

        driver.get("https://pnc.com");
        homePageSignOn = PageFactory.initElements(driver, HomePageSignOn.class);
    }

    @Test
    void testSignOnPage() {
        homePageSignOn.clickOnSignPage();


        homePageSignOn.clickSignOnToText();
        String actualText = homePageSignOn.clickSignOnToText();
        Assert.assertEquals(actualText, "Sign On to");
       // Assert.assertEquals(true, "Sign On to");

    }

    @Test
    void signInPncNegativeTestCases() throws IOException {
        homePageSignOn.clickOnSignPage();
        homePageSignOn.clickEnterUsrId();
        homePageSignOn.enterPassword();
        homePageSignOn.clickOnLogOnField();
        screenshot();
    }
}