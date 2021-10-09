package com.adidas.base;

import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected  String url;

    @BeforeMethod
    public void setUp(){

        driver= Driver.get(); //it will enough to initialize the driver object
        driver.manage().window().maximize();

        actions= new Actions(driver); //double clicking hoverover scroll up-down
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url= ConfigurationReader.get("url");

        driver.get(url);

    }



    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();

    }

}
