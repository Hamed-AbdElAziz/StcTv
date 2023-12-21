package browser;

import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.Home;
import pages.PaymentPage;

public class Browser {

    public Home home;
    public HomePage homePage;
    public PaymentPage paymentPage;

    public Browser(){

        home = new Home();
        homePage = new HomePage();
        paymentPage = new PaymentPage();
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
