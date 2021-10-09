package com.adidas.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */

public class ConfigurationReader {

    private static Properties properties;

    static {  //why we have static block here? cuz it runs before everything(first) and once we want to load the file first (one time) then we can get the info

        try {
            // what file to read
            String path = "configuration.properties"; //file is directly under the our project name
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input); //input is representing our data inside the configuration file

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) { //this method purpose is: u provide the key and u get the value
//we can call this method with className cuz its static method
        return properties.getProperty(keyName);
    }
}


//SINGLE RESPONSIBILITY PRINCIPLE--> IT HAS ONLY ONE JOB ONE METHOD --WE GONNA PROVIDE THE KEY
// AND IT GIVE THE VALUE
//