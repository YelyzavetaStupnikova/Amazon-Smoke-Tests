package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 120;
    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;
    SignInPage signInPage;
    TodayDealsPage todayDealsPage;
    CreateAccountPage createAccountPage;
    CustomerServicePage customerServicePage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User enters {string} input")
    public void enterSearch(final String KEYWORD) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.enterSearchBar(KEYWORD);
    }

    @And("User clicks on the searchBar")
    public void clickSearchBar() {
        homePage.clickSearchButton();
        new SearchPage(driver).waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User sees {string} corresponding results on the SearchPage")
    public void compareResult(final String KEYWORD) {
        assertTrue(new SearchPage(driver).getFirstSearchedElement().getText().contains(KEYWORD));
    }

    @And("User clicks Deliver To button")
    public void deliverTo() {
        homePage.clickDeliverToButton();
    }

    @And("Choose your location window pops up")
    public void chooseYourLocationWindowPopsUp() {
        assertTrue(homePage.chooseYourLocationPopUpIsVisible());
    }

    @And("User chooses country")
    public void chooseCountry() {
        homePage.clickChooseCountryButton();
        homePage.clickOnFirstCountry();
    }


    @And("User submits changes")
    public void userSubmitsChanges() {
        homePage.clickSubmitCountryChangeButton();
    }

    @And("User opens Sign into the account page")
    public void clickSignIntoTheAccount() {
        homePage.clickSignIn();
    }

    @And("User enters valid {string} email")
    public void enterValidEmail(final String email) {
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.writeEmail(email);
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }


    @And("User presses continue button")
    public void pressContinueButton() {
        signInPage.clickContinueButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User enters {string} password")
    public void enterPassword(final String password) {
        signInPage.getPasswordField().sendKeys(password);
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User presses sign in button")
    public void pressSignIn() {
        signInPage.clickSignIn();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }


    @And("User is greeted on the home page")
    public void checkUserNameIsVisible() {
        assertEquals(homePage.getHelloName().getText(), "Hello, Sign in");
    }

    @And("User clicks on the All options")
    public void clickOnTheAllOptions() {
        homePage.clickAllOptions();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("user clicks sign out")
    public void clickSignOut() {
        homePage.signOut();
    }

    @And("User opens Today Deals Page")
    public void userOpensTodayDealsPage() {
        homePage.clickTodaysDealsPage();
    }

    @And("User selects first item")
    public void userSelectsFirstItem() {
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        todayDealsPage = pageFactoryManager.getTodayDealsPage();
    }

    @And("User Writes a review")
    public void userWritesAReview() {
        todayDealsPage.writeReview();
    }

    @And("User gets an Error")
    public void userGetsAnError() {
        assertTrue(true);
    }

//    @After
//    public void tearDown() {
//        driver.close();
//    }

    @And("User opens Customer Service Page")
    public void userOpensCustomerServicePage() {
        homePage.clickCustomerServiceButton();
    }

    @And("User opens Buy again page")
    public void userOpensBuyAgainPage() {
        homePage.clickBuyAgain();
    }

    @And("User opens Browsing history")
    public void userOpensBrowsingHistory() {
        homePage.clickBrowsingHistory();
    }

    @And("User opens personal page store")
    public void userOpensPersonalPageStore() {
        homePage.clickPersonalAcc();
    }

    @And("User opens Gift Cards page")
    public void userOpensGiftCardsPage() {
        homePage.clickGiftCard();
    }

    @And("User opens Registry page")
    public void userOpensRegistryPage() {
        homePage.clickRegistry();
    }

    @And("User opens Sell page")
    public void userOpensSellPage() {
        homePage.clickSellButton();
    }

    @And("User presses Create new Amazon Account")
    public void userPressesCreateNewAmazonAccount() {
        signInPage.createNewAccount();
    }

    @And("User clicks continue")
    public void clickContinue() {
        signInPage.clickSignIn();
    }

    @And("User sees name error")
    public void userSeesNameError() {
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        createAccountPage = pageFactoryManager.getCreateAccountPage();
        assertEquals(createAccountPage.getNameErrorText(), "Enter your name");
    }

    @And("User sees Mobile or Email Error")
    public void userSeesMobileOrEmailError() {
        assertEquals(createAccountPage.getEmailOrPhoneErrorText(), "Enter your email");
    }

    @And("User sees password error")
    public void userSeesPasswordError() {
        assertEquals(createAccountPage.getPasswordErrorText(), "Enter your password");
    }

    @And("user checks options")
    public void userChecksOptions() {
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        customerServicePage = pageFactoryManager.getCustomerServicePage();
       assertTrue(customerServicePage.checkIfElementsAreVisible());
    }

    @And("User checks searchBar is visible")
    public void userChecksSearchBarIsVisible() {
        assertTrue(customerServicePage.checkIfSearchBarIsVsible());
    }

    @And("User checks if Help Topics are visible")
    public void userChecksIfHelpTopicsAreVisible() {
        assertTrue(customerServicePage.checkIfHelpTopicsAreDisplayed());
    }

    @And("user closes Pop Up")
    public void userClosesPopUp() {
        homePage.closeAlert();
    }
}

