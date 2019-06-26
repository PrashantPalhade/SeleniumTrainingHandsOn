package com.github.redbus.page;
import com.github.redbus.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//*[@class='bodycont']//div[@class='heroimg']")
    WebElement redBusLogo;

    @FindBy(xpath = "//*[@class='abouttitle']")
    WebElement redBusTitle;

    @FindBy(xpath = "//*[@class='ctitle']")
    WebElement countriesWeOperate;

    @FindBy(xpath = "//img[@title='redBus India']")
    WebElement flagIndia;

    @FindBy(xpath = "//img[@title='redBus Singapore']")
    WebElement flagSGP;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyRedBusLogo() {
        return redBusLogo.isDisplayed();
    }

    public String verifyRedBusTitle() {
        return redBusTitle.getText();
    }

    public String verifyCountriesWeOperate() {
        return countriesWeOperate.getText();
    }

    public void clickOnIndianFlag() {

        flagIndia.click();
        String test = flagIndia.getText();
        System.out.println("Print "+test);
    }
    public void clickOnSGPFlag() {
        flagSGP.click();
    }

}
