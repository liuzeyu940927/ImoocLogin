package com.mike.selenium.page;

import com.mike.selenium.base.DriverBase;
import com.mike.selenium.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    /**
     * Constructor
     * @param driver
     */
    public HomePage(DriverBase driver) {
        super(driver);
    }

    /**
     * Get 'login link' element.
     * @return
     */
    public WebElement getLoginLinkElement(){
        return element(GetByLocator.getLocator("loginLinkInHomePage"));
    }

    /**
     * Get 'username input' element.
     * @return
     */
    public WebElement getUsernameElement(){
        return element(GetByLocator.getLocator("usernameInHomePage"));
    }

    /**
     * Get 'password input' element.
     * @return
     */
    public WebElement getPasswordElement(){
        return element(GetByLocator.getLocator("passwordInHomePage"));
    }

    /**
     * Get 'login button' element.
     * @return
     */
    public WebElement getLoginButtonElement(){
        return element(GetByLocator.getLocator("loginButtonInHomePage"));
    }
}
