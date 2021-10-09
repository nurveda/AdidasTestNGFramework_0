package com.adidas.utilities;

public class BrowserUtils {

    /** REPEATED METHODS CAN BE STORED IN THIS CLASS REUSABILITY */

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
