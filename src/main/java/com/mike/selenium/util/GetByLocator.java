package com.mike.selenium.util;

import org.openqa.selenium.By;

public class GetByLocator {
    public static By getLocator(String key){
        PropUtil propUtil = new PropUtil("conf/element.properties");
        String locator = propUtil.getProp(key);

        if(!"".equals(locator)){
            String locatorType = locator.split(">")[0];
            String locatorValue = locator.split(">")[1];

            if("id".equals(locatorType)){
                return By.id(locatorValue);
            }else if ("name".equals(locatorType)){
                return By.name(locatorValue);
            }else if ("className".equals(locatorType)){
                return By.className(locatorValue);
            }else if ("tagName".equals(locatorType)){
                return By.tagName(locatorValue);
            }else if ("linkText".equals(locatorType)){
                return By.linkText(locatorValue);
            }else {
                return By.xpath(locatorValue);
            }
        }

        return null;
    }
}
