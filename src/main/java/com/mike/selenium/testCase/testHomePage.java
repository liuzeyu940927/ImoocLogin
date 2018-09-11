package com.mike.selenium.testCase;

import com.mike.selenium.base.DriverBase;
import com.mike.selenium.business.HomePagePro;
import com.mike.selenium.util.GetAccount;
import com.mike.selenium.util.GetUrl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testHomePage extends CaseBase {
    private DriverBase driver;
    private HomePagePro homePagePro;

    @BeforeClass
    public void init(){
        this.driver = initDriver("firefox");
        this.homePagePro = new HomePagePro(driver);
        driver.get(GetUrl.getUrl("imoocHomePage"));
    }

    @Test
    public void testLogin(){
        String username = GetAccount.getAccountInfo("username");
        String password = GetAccount.getAccountInfo("password");
        homePagePro.executeLoginProcess(username, password);
    }

    @AfterClass
    public void end(){
        driver.sleep(3000);
        driver.stop();
    }
}
