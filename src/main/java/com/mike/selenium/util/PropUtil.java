package com.mike.selenium.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtil {
    private String filePath;
    private Properties prop;

    public PropUtil(String filePath) {
        this.filePath = filePath;
        this.prop = readProp();
    }

    public Properties readProp(){
        Properties properties = new Properties();
        try {
            InputStream is = new FileInputStream(this.filePath);
            BufferedInputStream bis = new BufferedInputStream(is);
            properties.load(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getProp(String key){
        if (prop.containsKey(key)){
            return prop.getProperty(key);
        }
        return "";
    }
}
