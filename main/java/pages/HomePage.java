package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-toaster-blocking='0']")
    private WebElement alertBlocking;

    @FindBy(xpath = "//span[@class='a-button-inner']")
    private List<WebElement> closeAlert;

    public void closeAlert(){
        if (alertBlocking.isDisplayed()) closeAlert.get(0).click();
    }

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_0']")
    private WebElement todaysDealsPage;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBarField;

    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='nav-line-2 nav-progressive-content']")
    private WebElement deliverToButton;

    @FindBy(xpath = "//div[@class='a-popover-wrapper']")
    private WebElement chooseLocationPopUpWindow;

    @FindBy(xpath = "//span[@class='a-button-dropdown a-button a-button-span12']")
    private WebElement chooseCountryButton;

    @FindBy(xpath = "//ul[@class='a-nostyle a-list-link']/li[@aria-labelledby]")
    private List<WebElement> countries;

    @FindBy(xpath = "//button[@name='glowDoneButton']")
    private WebElement submitChangeCountryButton;

    @FindBy(xpath = "//span[@class='nav-line-2 nav-progressive-content']")
    private WebElement changedCountry;

    @FindBy(xpath = "//div[@class='nav-line-1-container']/span[@class='nav-line-1 nav-progressive-content']")
    private WebElement preSignInButton;

    @FindBy(xpath = "//a[@class='nav-action-button' and @data-nav-ref='nav_signin']/span")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement helloName;

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement allOptionsLeftBar;

    @FindBy(xpath = "//a[text()='Sign Out']")
    private WebElement signOutButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_1']")
    private WebElement customerServiceButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_2']")
    private WebElement buyAgainButton;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav-recently-viewed']")
    private WebElement browSingHistoryButton;

    @FindBy(xpath = "//span[@id='nav-your-amazon-text']")
    private WebElement personalAcc;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_3']")
    private WebElement giftCard;

    @FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_2']")
    private WebElement registry;

    @FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_4']")
    private WebElement sellButton;

    public void clickSellButton(){
        sellButton.click();
    }
    public void clickRegistry(){
        registry.click();
    }

    public void clickGiftCard(){
        giftCard.click();
    }
    public void clickPersonalAcc() {
        personalAcc.click();
    }

    public void clickBrowsingHistory() {
        browSingHistoryButton.click();
    }

    public void clickBuyAgain() {
        buyAgainButton.click();
    }

    public void signOut() {
        signOutButton.click();
    }

    public void clickTodaysDealsPage() {
        todaysDealsPage.click();
    }

    public void clickAllOptions() {
        allOptionsLeftBar.click();
    }

    public void clickSignIn() {
        preSignInButton.click();
    }

    public WebElement getHelloName() {
        return helloName;
    }

    public void enterSearchBar(final String input) {
        searchBarField.sendKeys(input);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickDeliverToButton() {
        deliverToButton.click();
    }

    public boolean chooseYourLocationPopUpIsVisible() {
        return chooseLocationPopUpWindow.isDisplayed();
    }

    public void clickChooseCountryButton() {
        chooseCountryButton.click();
    }

    public void clickOnFirstCountry() {
        countries.get(2).click();
    }

    public void clickSubmitCountryChangeButton() {
        submitChangeCountryButton.click();
    }

    public void clickCustomerServiceButton() {
        customerServiceButton.click();
    }
}







