package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
    WebDriver driver;

    @CacheLookup
    @FindBy(id = "ctl00_lblWishlistCount")
    WebElement chkWishlist;

    public Wishlist(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void wishlistCheck() throws InterruptedException {

        chkWishlist.click();
        Thread.sleep(5000);
    }
}
