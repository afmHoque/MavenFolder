package Tests;

import Pages.HomePagePersonal;
import Pages.HomePageSignOn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class PersonalTest extends BaseTest {

    HomePagePersonal homePagePersonal;

    @BeforeMethod
    void setUpHomePage() throws IOException {

        setup();

        driver.get("https://pnc.com");
        homePagePersonal = PageFactory.initElements(driver, HomePagePersonal.class);

        windowMaximize();

    }
    @Test
    void testPersonal() throws InterruptedException, IOException {
        homePagePersonal.personalCheeking();
        homePagePersonal.checking();
        homePagePersonal.zipCode();
       // windowScrollByPixels ("window.scrollBy(0,1500)");

        implicitWait(10);
        homePagePersonal.virtualApplyNow();

        String mainWindow = driver.getWindowHandle();
        System.out.println("============ "+mainWindow );

        Set windows = driver.getWindowHandles();
        System.out.println("=================== " + windows);

        Iterator itr = windows.iterator();

        while(itr.hasNext()){
            String curr_window = (String) itr.next();
           if(!curr_window.equalsIgnoreCase(mainWindow)){
               driver.switchTo().window(curr_window);

               System.out.println("I am in the new window........");
               System.out.println("Title: " + driver.getCurrentUrl());

               homePagePersonal.ageLimit();
               implicitWait(10);
               homePagePersonal.existingCus();
               implicitWait(5);
               homePagePersonal.ageLimit();
               implicitWait(5);
               homePagePersonal.existingCus();
               implicitWait(5);
               homePagePersonal.nextPage();
               implicitWait(5);
               homePagePersonal.myName();
               implicitWait(5);
               homePagePersonal.myMiddleName();
               implicitWait(5);
               homePagePersonal.myLastName();
               implicitWait(5);
               homePagePersonal.myDateOfBirth();
               implicitWait(5);
               homePagePersonal.myEmail();
               implicitWait(5);
               homePagePersonal.myReEmail();
               implicitWait(5);
               homePagePersonal.myPhoneNumber();
               implicitWait(5);
              // homePagePersonal.myUSCityZen();
               implicitWait(5);
               homePagePersonal.mySSN();
               implicitWait(5);
               homePagePersonal.myAddress1();
               implicitWait(5);
               homePagePersonal.myAddress2();
               implicitWait(5);
               homePagePersonal.myAttention();
               implicitWait(5);
               homePagePersonal.myCity();
               homePagePersonal.selectMethod();
               implicitWait(5);
               homePagePersonal.myZipCode();
               scrollDown();
               // 6 month
             //  homePagePersonal.myAddressValidity();
               /*
               homePagePersonal.myPreviousAddress();
               homePagePersonal.myApt();
               homePagePersonal.myAttention2();
               homePagePersonal.myPreviousCity();
               homePagePersonal.myPreviousStateSelect();

               homePagePersonal.myPreviousZip();

                */

               homePagePersonal.myDriverLicence();

               homePagePersonal.myIdNumber();
               homePagePersonal.myIssuingState();
               homePagePersonal.myIssuingDate();
               homePagePersonal.myDrivingExpirationDate();
               actionMethod();
               String actual= homePagePersonal.myWrongMessage();
               Assert.assertEquals(actual,"Enter a valid 9-digit Social security number");
               screenshot();
           }
        }
    }
}
