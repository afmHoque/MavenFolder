package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePagePersonal {

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div/div[5]/div/div/div/div[1]/ul/li[1]/a/span")
    WebElement personal;
    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/div[1]/div/div[1]/div/a/p/b")
    WebElement myCheeking;
    @FindBy(xpath = "//*[@id=\"zipSubmit\"]")
    WebElement zipSubmit;
    @FindBy(linkText = "Apply Now")
    WebElement applyNow;

    @FindBy(xpath = "//div[@class='mat-radio-container']")
    List<WebElement> ages;
    // @FindBy(xpath = "//*[@id='mat-radio-2']/label/div[1]/div[1]")
    // WebElement age;

   // @FindBy(xpath = "//*[@id='mat-radio-6']/label/div[1]/div[1]")

    @FindBy(id = "mat-radio-6-input")
    WebElement existing;

    @FindBy(xpath = "//*[@id='wbb-button-1']")
    WebElement next;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='middleInitial']")
    WebElement middleName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='dob']")
    WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='email2']")
    WebElement reEmail;
    @FindBy(xpath = "//input[@id='primaryPhoneNumber']")
    WebElement phoneNumber;
//    @FindBy(xpath= "//mat-radio-button[@id='mat-radio-5']/label/div[1]/div[1]")
//    WebElement usCitizen;
    @FindBy(xpath = "//input[@id='ssn']")
    WebElement ssn;
    @FindBy(xpath = "//input[@id='primaryAddressLine1']")
    WebElement address1;
    @FindBy(xpath = "//input[@id='primaryAddressLine2']")
    WebElement address2;
    @FindBy(xpath = "//input[@id='primaryLocator']")
    WebElement attention;
    @FindBy(css = "[id='primaryCity']")
    WebElement city;
    @FindBy(css = "[id='primaryStateProvince']")
    WebElement selectState;
    @FindBy(xpath = "//input[@id='primaryPostalCode']")
    WebElement zip;

    // Validity 6 month address

//    @FindBy(xpath = "//*[@id=\"mat-radio-3\"]/label/div[1]/div[2]")
//    WebElement addressValidity;

   /* @FindBy(xpath = "//input[@id='secondaryAddressLine1']")
    WebElement previousAddress;
    @FindBy(xpath = "//input[@id='secondaryAddressLine2']")
    WebElement apt;
    @FindBy(xpath = "//input[@id='secondaryLocator']")
    WebElement attention2;
    @FindBy(xpath = "//input[@id='secondaryCity']")
    WebElement previousCity;
    @FindBy(xpath = "//select[@id='secondaryStateProvince']")
    WebElement previousState;
    @FindBy(xpath = "//input[@id='secondaryPostalCode']")
    WebElement previousZip;

    */
    @FindBy(xpath = "//select[@id='wbb-common-input-core-4']")
    WebElement driverLicence;
    @FindBy(xpath = "//input[@id='driversLicenseNumber']")
    WebElement idNumber;
    @FindBy(xpath = "//select[@id='wbb-common-input-core-5']")
    WebElement issuingState;
    @FindBy(xpath = "//input[@id='issueDate']")
    WebElement issuingDate;
    @FindBy(xpath = "//input[@id='expirationDate']")
    WebElement expirationDate;
    @FindBy (xpath = "//mat-error[@id='mat-error-13']")
    WebElement wrongMessage;


    public void personalCheeking(){
        personal.click();
    }
    public void checking(){
        myCheeking.click();
    }
    public void zipCode(){
        zipSubmit.click();
    }
    public void virtualApplyNow(){
        applyNow.click();
    }
    public void ageLimit(){
        System.out.println("El==============" + ages.size() );
        ages.get(0).click();
        // age.click();
    }

    public void existingCus(){
        //existing.click();
        ages.get(3).click();
    }
    public void nextPage(){
        next.click();
    }
    public void myName(){
        firstName.sendKeys("AFM Hoque");
    }
    public void myMiddleName(){
        middleName.sendKeys("M");
    }
    public void myLastName(){
        lastName.sendKeys("Hoque");
    }
    public void myDateOfBirth(){
        dateOfBirth.sendKeys("01/01/1910");
    }
    public void myEmail(){
        email.sendKeys("hoque11@gmail.com");
    }
    public void myReEmail(){
        reEmail.sendKeys("hoque11@gmail.com");
    }
    public void myPhoneNumber(){
        phoneNumber.sendKeys("9172854201");
    }
//    public void myUSCityZen(){
//        usCitizen.click();
//    }
    public void mySSN(){
        ssn.sendKeys("1234567890");
    }
    public void myAddress1(){
        address1.sendKeys("180-16 Wexford TR");
    }
    public void myAddress2(){
        address2.sendKeys("3c");
    }
    public void myAttention(){
        attention.sendKeys("Police");
    }
    public void myCity(){
        city.sendKeys("Queens");
    }
    public void selectMethod(){
        Select select = new Select(selectState);
        select.selectByIndex(30);
    }
    public void myZipCode(){
        zip.sendKeys("11435");
    }
    // 6 month
//    public void myAddressValidity(){
//        addressValidity.click();
//    }
  /*  public void myPreviousAddress(){
        previousAddress.sendKeys("180-16 Wexford TR");
    }
    public void myApt(){
        apt.sendKeys("3B");
    }
    public void myAttention2(){
        attention2.sendKeys("Police");
    }
    public void myPreviousCity(){
        previousCity.sendKeys("Queens");
    }
    public void myPreviousStateSelect(){
        Select select = new Select(previousState);
        select.selectByValue("NY");
    }
    public void myPreviousZip(){
        previousZip.sendKeys("11435");
    }
   */

    public void myDriverLicence(){
        Select select = new Select(driverLicence);
        select.selectByIndex(1);
    }
    public void myIdNumber(){
        idNumber.sendKeys("123456789");
    }
    public void myIssuingState(){
        Select select = new Select(issuingState);
        select.selectByIndex(33);
    }
    public void myIssuingDate(){
        issuingDate.sendKeys("01/01/2020");
    }
    public void myDrivingExpirationDate(){
        expirationDate.sendKeys("01/01/2025");
    }
    public String  myWrongMessage(){
        String text = wrongMessage.getText();
        return text;
    }
}

