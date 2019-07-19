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

    public String clickOnIndianFlag() {
        String indWndURL = "";
        String parentGUID = driver.getWindowHandle();
        flagIndia.click();
        Set allGUIDofWnd = driver.getWindowHandles();
       // System.out.println("NumberOfWindows " + allGUIDofWnd);

        for (Object strtGUid : allGUIDofWnd)
        {
            if (!strtGUid.equals(parentGUID))
            {

                indWndURL = driver.switchTo().window((String) strtGUid).getCurrentUrl();
                String CurrWndTitle = driver.getTitle();
/*              System.out.println("Wnd GUID " + strtGUid);
                System.out.println("New Page URL:" + currURL);
                System.out.println("Current Page URL:" + newWndURL);
                System.out.println("Window Name:" + CurrWndTitle);*/
            }
        }
        return indWndURL;
    }

    public String clickOnSGPFlag() {
        String sgpWndURL ="";
        flagSGP.click();
        String strParentWndHndl = driver.getWindowHandle();

        Set allWndHandels = driver.getWindowHandles();
        for (Object strStrtHndl :allWndHandels) {
            if(!strStrtHndl.equals(strParentWndHndl))
               sgpWndURL= driver.switchTo().window((String)strStrtHndl).getCurrentUrl();
        }
        return sgpWndURL;
    }

}
