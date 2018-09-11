package com.mike.selenium.business;

import com.mike.selenium.base.DriverBase;
import com.mike.selenium.handle.HomePageHandle;
import com.mike.selenium.util.GetByLocator;

public class HomePagePro {
    private DriverBase driver;
    private HomePageHandle homePageHandle;

    public HomePagePro(DriverBase driver) {
        this.driver = driver;
        this.homePageHandle = new HomePageHandle(driver);
    }

    /**
     * Execute 'login' process.
     * @param username
     * @param password
     */
    public void executeLoginProcess(String username, String password){
        driver.wait(GetByLocator.getLocator("loginLinkInHomePage"));
        homePageHandle.clickLoginLink();
        driver.wait(GetByLocator.getLocator("usernameInHomePage"));
        homePageHandle.sendKeysUsername(username);
        homePageHandle.sendKeysPassword(password);
        homePageHandle.clickLoginButton();
    }
}
