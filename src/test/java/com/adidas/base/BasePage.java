package com.adidas.base;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver= Driver.get();
    public WebDriverWait wait;

    /** we will extends this class where did u use oop consept in ur framework?
     * encapsulation.. we re using in our driver class we have private constructor and we have getter method
     * for our driver object
     * abstraction.. we re using abstration in our tests with testBase and BasePage
     * inheritance.. we re inheriting testBase for out test classes and aslo Base page for our POM's as well
     * polymorphism.. later oscar will say*/

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(partialLinkText = "Home")
    public WebElement home;

    @FindBy(linkText = "Cart")
    public WebElement cart;




}
