package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerServicePage extends BasePage {
    public CustomerServicePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='a-box self-service-rich-card']")
    private List<WebElement> options;

    @FindBy(xpath="//div[@class='a-search a-span12']")
    private WebElement searchBar;

    @FindBy(xpath="//div[@class='help-content csg']")
    private WebElement helpTopics;

    public boolean checkIfElementsAreVisible() {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).isDisplayed() == false) return false;
        }
        return true;
    }
    public boolean checkIfSearchBarIsVsible(){
        return searchBar.isDisplayed();
    }
    public boolean checkIfHelpTopicsAreDisplayed(){
        return helpTopics.isDisplayed();
    }
}

