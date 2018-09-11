package com.mike.selenium.handle;

import com.mike.selenium.base.DriverBase;
import com.mike.selenium.page.HomePage;

public class HomePageHandle {
    private DriverBase driver;
    private HomePage homePage;

    public HomePageHandle(DriverBase driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    /**
     * Click login link.
     */
    public void clickLoginLink(){
        homePage.click(homePage.getLoginLinkElement());
    }

    /**
     * Input username.
     * @param username
     */
    public void sendKeysUsername(String username){
        homePage.sendKeys(homePage.getUsernameElement(), username);
    }

    /**
     * Input password.
     * @param password
     */
    public void sendKeysPassword(String password){
        homePage.sendKeys(homePage.getPasswordElement(), password);
    }

    /**
     * Click login button.
     */
    public void clickLoginButton(){
        homePage.click(homePage.getLoginButtonElement());
    }
}
