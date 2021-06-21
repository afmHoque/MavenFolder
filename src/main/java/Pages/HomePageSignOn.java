package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePageSignOn {

    @FindBy(xpath = "//*[@id=\"experiencefragment-d94b5a89cd\"]/div/div/div[1]/button/span[2]")
    WebElement sionOnPage;
    @FindBy(xpath = "//*[@id=\"experiencefragment-d94b5a89cd\"]/div/div/div[2]/div/div/div[2]/form/div/div[1]/div[1]/div[1]/label/input")
    WebElement enterUsrId;
    @FindBy(xpath = "//*[@id=\"experiencefragment-d94b5a89cd\"]/div/div/div[2]/div/div/h4/span[1]")
    WebElement signOnToText;
    @FindBy(xpath = "//*[@id=\"experiencefragment-d94b5a89cd\"]/div/div/div[2]/div/div/div[2]/form/div/div[1]/div[1]/div[3]/label/input")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"experiencefragment-d94b5a89cd\"]/div/div/div[2]/div/div/div[2]/form/div/div[2]/div/input")
    WebElement loginField;
    @FindBy(xpath = "//*[@id=\"breakP44002340\"]/p")
    WebElement copyWrongLogOnMessage;

    public void clickOnSignPage() {
        sionOnPage.click();

    }

    public void clickEnterUsrId() {
        enterUsrId.sendKeys("afm");
    }

    public String clickSignOnToText() {
        String text = signOnToText.getText();
        return text;
    }

    public void enterPassword() {
        password.sendKeys("abc123");
    }

    public void clickOnLogOnField() {
        loginField.click();
    }

//    public void textWrongMessage(){
//        textWrongMessage();
//
//    public String clickWrongLogOnMessage() {
//        String text1= copyWrongLogOnMessage.getText();
//        return text1;

    }
