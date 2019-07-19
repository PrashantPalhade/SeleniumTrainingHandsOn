package com.github.redbus;

import com.github.redbus.base.TestBase;
import com.github.redbus.page.HomePage;
import com.google.common.util.concurrent.AbstractScheduledService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {
    HomePage hp;

    @BeforeMethod
    public void setUp() {
        initialize();
        hp = new HomePage();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

  @Test
    public void testVerifyHomepageLogo() {
        Assert.assertEquals(true, hp.verifyRedBusLogo());
    }

    @Test
    public void testVerifyRedBusTitle() {
        Assert.assertEquals("We'll Take You Places!", hp.verifyRedBusTitle());
    }

    @Test
    public void testVerifyRedBusFlagIndNavigate() {
        String returnClickInd = hp.clickOnIndianFlag();
        System.out.println("URL Redbus Ind  :"+returnClickInd);
        Assert.assertEquals("https://www.redbus.in/",returnClickInd);
      //  hp.clickOnIndianFlag();

    }

    @Test
    public void testVerifySGPFlagNavigate() {
     //   hp.clickOnSGPFlag();
        String returnClickonSGP = hp.clickOnSGPFlag();
        Assert.assertEquals("https://www.redbus.sg/",returnClickonSGP);

        System.out.print("SGP Flag"+returnClickonSGP);
    }
/*
    @Test
    public void verifyCountriesWeOperate() {
        hp.verifyCountriesWeOperate();
    }
*/
}
