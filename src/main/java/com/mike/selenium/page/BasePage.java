package com.mike.selenium.page;

import com.mike.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    private DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }

    public WebElement element(By by){
        return driver.findElement(by);
    }

    public WebElement element(WebElement element,By by){
        return driver.findElement(element, by);
    }

    public void moveTo(WebElement element){
        driver.moveTo(element);
    }

    public void sendKeys(WebElement element, String value){
        element.sendKeys(value);
    }

    public void click(WebElement element){
        element.click();
    }
}
