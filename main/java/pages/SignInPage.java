package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement signEmailOrPhoneNumberField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInButton;

    @FindBy(xpath="//span[@id='auth-create-account-link']/span[@class='a-button-inner']")
    private WebElement createNewAccountButton;

    public void createNewAccount(){
        createNewAccountButton.click();
    }

    public void writeEmail(final String email) {
        signEmailOrPhoneNumberField.sendKeys(email);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

}
