package browser;

import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.Home;
import pages.PaymentWrapper;

public class Browser {

    public Home home;
    public HomePage homePage;
    public PaymentWrapper paymentWrapper;

    public Browser(){

        home = new Home();
        homePage = new HomePage();
        paymentWrapper = new PaymentWrapper();
    }

    public boolean elementIsDisplayed (WebElement element)
    {
        try{
            return element.isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }

}
