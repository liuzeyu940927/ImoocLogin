package com.mike.selenium.util;

public class GetAccount {
    public static String getAccountInfo(String key){
        PropUtil propUtil = new PropUtil("conf/account.properties");
        return propUtil.getProp(key);
    }
}
