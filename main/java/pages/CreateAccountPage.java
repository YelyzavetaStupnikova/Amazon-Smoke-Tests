package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountPage extends BasePage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//a[@id='createAccountSubmit']")
    private WebElement createNewAccountButton;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement verifyEmailButton;

    @FindBy(xpath="//div[@class='a-box-inner a-alert-container']")
    private ArrayList<WebElement> errors;

    public void createAccount(){
        createNewAccountButton.click();
    }
    public void verifyEmail(){
        verifyEmailButton.click();
    }
    public String getNameErrorText(){
     return errors.get(1).getText();
    }
    public String getEmailOrPhoneErrorText(){
        return errors.get(2).getText();
    }
    public String getPasswordErrorText(){
        return errors.get(5).getText();
    }


}
