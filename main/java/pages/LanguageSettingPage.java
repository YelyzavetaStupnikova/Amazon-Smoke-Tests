package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LanguageSettingPage extends BasePage {
    @FindBy(xpath = "//i[@class='a-icon a-icon-radio']")
    private List<WebElement> changeLanguageButtons;

    @FindBy(xpath = "//span[@id='icp-btn-save-announce']")
    private WebElement submitButton;

    public void clickChangeLanguageButton() {
        changeLanguageButtons.get(1).click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public LanguageSettingPage(WebDriver driver) {
        super(driver);
    }


}
