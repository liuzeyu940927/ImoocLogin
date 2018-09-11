package com.mike.selenium.testCase;

import com.mike.selenium.base.DriverBase;

public class CaseBase {
    protected DriverBase initDriver(String browser){
        return new DriverBase(browser);
    }
}
