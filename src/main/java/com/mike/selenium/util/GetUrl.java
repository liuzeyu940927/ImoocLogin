package com.mike.selenium.util;

public class GetUrl {
    public static String getUrl(String key){
        PropUtil propUtil = new PropUtil("conf/url.properties");
        return propUtil.getProp(key);
    }
}
