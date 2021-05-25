package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath = "//*[@id='header']/div/div/div[6]/div[2]/div/a/span")
    WebElement clintAccess;


    public void nexxen(){
        clintAccess.click();
    }
}

