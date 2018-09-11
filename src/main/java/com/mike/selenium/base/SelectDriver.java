package com.mike.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver getDriverByBrowser(String browser){
        if ("chrome".equalsIgnoreCase(browser)){
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }else {
            System.setProperty("webdriver.firefox.bin",
                    "D:\\Firefox\\firefox.exe");
            System.setProperty("webdriver.firefox.marionette",
                    "D:\\Firefox\\geckodriver.exe");
            return new FirefoxDriver();
        }

    }
}
