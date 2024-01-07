package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\Jenkins\tools\chromedriver\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


