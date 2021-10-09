package com.adidas.pages;

import com.adidas.base.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {


    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement priceText;

    @FindBy (linkText = "Add to cart")
    public WebElement addCart;



    public int productAdder(String category, String product){

        //click on any category --laptops phones monitors
        driver.findElement(By.linkText(category)).click();
        /** we couldnt create findBy method for products and categories
         * because findby only works with constant*/
        //click on any prucduct that u provide
        driver.findElement(By.linkText(product)).click();


        System.out.println("priceText = " + priceText);

        String [] arrayAmount=priceText.getText().split(" ");
        int listPrice= Integer.parseInt(arrayAmount[0].substring(1));

        addCart.click();

        //sometimes webpage gives no such
        wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert= driver.switchTo().alert();
        alert.accept();

        home.click();

        return listPrice;

    }

}
