package com.github.redbus.page;

import com.github.redbus.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

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

    @FindBy(xpath = "//header[@id='rh_header']//a[@class='redbus-logo home-redirect']")
    WebElement redBusInLogo;

    @FindBy(xpath = "//input[@id='src']")
    WebElement FromSource;

    @FindBy(xpath = "//input[@id='dest']")
    WebElement ToDestinaion;

    @FindBy(xpath = "//label[@class='db text-trans-uc']")
    WebElement TravelDate;

    @FindBy(xpath = "//label[@class='db text-trans-uc tal']")
    WebElement ReturnDate;

    @FindBy(xpath = "//button[@id='search_btn']")
    WebElement btnSearchBus;


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
        String parentGUID = driver.getWindowHandle();
        flagIndia.click();
        String test = flagIndia.getText();
        Set allGUIDofWnd = driver.getWindowHandles();
        for (Object strtGUid : allGUIDofWnd) {
            if(!strtGUid.equals(parentGUID))
            {
               String currURL = driver.getCurrentUrl();
                String CurrWndTitle = driver.getTitle();
                System.out.println("Child GUID " + strtGUid);
            }
        }
        System.out.println("Print " + test);
    }

    public void clickOnSGPFlag() {
        flagSGP.click();
        String test = flagIndia.getText();
        System.out.println("Print " + test);
    }

}
