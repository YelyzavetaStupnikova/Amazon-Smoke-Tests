package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodayDealsPage extends BasePage{
    public TodayDealsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id='100 8f06692e-announce']")
    private WebElement item;

    @FindBy(xpath = "//a[@id='a-autoid-40-announce']")
    private WebElement writeReviewButton;

    public void writeReview(){
        writeReviewButton.click();
    }

    private void clickFirstItem(){
        item.click();
    }
}
