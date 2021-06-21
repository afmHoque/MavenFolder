package reportPackage;

import Pages.HomePagePersonal;
import Tests.BaseTest;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;

public class I_Listener extends TestListenerAdapter {
    public void onTestStart(ITestResult results) {

        System.out.println("Test Case is starting");
    }

    public void onTestSuccess(ITestResult results) {

        System.out.println("Test Case is successful");
    }

    public void onTestFailure(ITestResult results) {
        BaseTest x = new BaseTest();
        try {
            x.screenshot();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("Test Case Failed");
    }



}
