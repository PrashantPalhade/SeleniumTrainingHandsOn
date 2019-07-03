package com.github.redbus.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public static void initialize(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.com/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.MICROSECONDS);

    }

}
