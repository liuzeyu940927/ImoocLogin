package com.mike.selenium.base;

import javafx.scene.web.WebErrorEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverBase {
    private WebDriver driver;

    public DriverBase(String browser) {
        this.driver = new SelectDriver().getDriverByBrowser(browser);
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void get(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void sleep(long sleeptime){
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void wait(By by){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public WebElement findElement(WebElement element, By by){
        return element.findElement(by);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void moveTo(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void stop(){
        driver.close();
    }
}
