package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    public SearchPage getSearchPage() {return new SearchPage(driver);}
    public LanguageSettingPage getLanguageSettingsPage(){
        return new LanguageSettingPage(driver);
    }
    public SignInPage getSignInPage() {return new SignInPage(driver);}
    public TodayDealsPage getTodayDealsPage(){return new TodayDealsPage(driver);}
    public CreateAccountPage getCreateAccountPage() {
        return new CreateAccountPage(driver);
    }
    public CustomerServicePage getCustomerServicePage() { return new CustomerServicePage(driver); }
}
