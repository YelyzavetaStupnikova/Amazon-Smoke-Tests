package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    private List<WebElement> listOfSearchedResults;

    public WebElement getFirstSearchedElement(){
        return listOfSearchedResults.get(2);
    }
}
