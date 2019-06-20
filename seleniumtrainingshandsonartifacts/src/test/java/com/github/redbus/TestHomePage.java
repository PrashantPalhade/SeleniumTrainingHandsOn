package com.github.redbus;

import com.github.redbus.base.TestBase;
import com.github.redbus.page.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {
    HomePage hp;

    @BeforeMethod
    public void setUp(){
        initialize();
        hp = new HomePage();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testVerifyHomepageLogo(){
        Assert.assertEquals(true,hp.verifyRedBusLogo());
    }
    @Test
    public void testverifyRedBusTitle(){
        Assert.assertEquals("test",hp.verifyRedBusTitle());
    }
}
