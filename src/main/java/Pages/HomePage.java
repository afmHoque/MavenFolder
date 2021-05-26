package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath = "//*[@id='header-wrapper-dark']/div/div/div[6]/div[2]/div/a/span")
    WebElement clintAccess;

    @FindBy(xpath = "//*[@id='onetrust-close-btn-container']/button")
    WebElement closeButton;


    @FindBy(xpath = "//*[@id='USER']")
    WebElement userId;

    @FindBy (xpath = "//*[@id='PASSWORD']")
    WebElement password;

    public void nexen(){
        clintAccess.click();
    }
    public void clickClintAccess(){
            closeButton.click();
    }
    public void enterValidUserId(){
        userId.sendKeys("Afm");
    }
    public  void enterPassword(){
        password.sendKeys("Afm123");
    }

}

