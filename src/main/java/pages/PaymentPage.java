package pages;

import base.Base;
import org.openqa.selenium.By;

public class PaymentPage extends Base {
    private By ksaCheckBox= By.id("stc-checkbox");
    private By ksaPrice = By.xpath("//div[@id='stc-price']/b");
    private By ksaCurrency = By.xpath("//div[@id='stc-price']/i");
    private By ksaVisaCheckBox= By.id("cc_ksa-checkbox");
    private By ksaVisaPrice = By.xpath("//div[@id='cc_ksa-price']/b");
    private By ksaVisaCurrency = By.xpath("//div[@id='cc_ksa-price']/i");
    private By tierName = By.id("order-tier-name");
    private By orderPrice = By.id("order-tier-price");
    private By totalPrice = By.id("order-total-price");

    private By kwCheckBox= By.id("vk-checkbox");
    private By KwPrice = By.xpath("//div[@id='vk-price']/b");
    private By kwCurrency = By.xpath("//div[@id='vk-price']/i");
    private By kwVisaCheckBox= By.id("cc_kuw-checkbox");
    private By kwVisaPrice = By.xpath("//div[@id='cc_kuw-price']/b");
    private By kwVisaCurrency = By.xpath("//div[@id='cc_kuw-price']/i");

    private By bhCheckBox= By.id("vb-checkbox");
    private By bhPrice = By.xpath("//div[@id='vb-price']/b");
    private By bhCurrency = By.xpath("//div[@id='vb-price']/i");
    private By bhVisaCheckBox= By.id("cc_brn-checkbox");
    private By bhVisaPrice = By.xpath("//div[@id='cc_brn-price']/b");
    private By bhVisaCurrency = By.xpath("//div[@id='cc_brn-price']/i");

}
