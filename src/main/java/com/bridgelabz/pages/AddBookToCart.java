package com.bridgelabz.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AddBookToCart {
    WebDriver driver;
    @CacheLookup
    @FindBy(linkText = "New Arrivals")
    WebElement newArrivals;
    @CacheLookup
    @FindBy(xpath = "/html/body/form/div[10]/div[1]/div[3]/div[1]/div[3]/ul/li[1]/a")
    WebElement bookCover;
    @CacheLookup
    @FindBy(xpath = "/html/body/form/div[10]/div[1]/div[3]/div[1]/div[4]/ul/li[1]/a")
    WebElement language;
    @CacheLookup
    @FindBy(xpath = "/html/body/form/div[10]/div[1]/div[3]/div[2]/div[2]/div[1]/div/a/img")
    WebElement book;
    @CacheLookup
    @FindBy(xpath = "/html/body/form/div[10]/div/div/div/div[1]/div[2]/div[7]/div/a/input")
    WebElement buyNow;
    @CacheLookup
    @FindBy(id = "BookCart_lvCart_ctrl0_txtQty")
    WebElement qty;

    @CacheLookup
    @FindBy(id = "BookCart_lvCart_ctrl0_imgUpdate")
    WebElement reload;

    @CacheLookup
    @FindBy(id = "BookCart_lvCart_imgPayment")
    WebElement placeOrder;

    @CacheLookup
    @FindBy(id = "ctl00_cpBody_lvCustomerAdd_ctrl0_btnUseAddress")
    WebElement deliver;


    public AddBookToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        newArrivals.click();
        Thread.sleep(1000);
        bookCover.click();
        Thread.sleep(2000);
        language.click();
        Thread.sleep(1000);
        book.click();
        Thread.sleep(2000);
        buyNow.click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        qty.click();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(500);
        qty.sendKeys("3");
        Thread.sleep(1000);
        reload.click();
        Thread.sleep(2000);
        placeOrder.click();
        Thread.sleep(1000);
        deliver.click();
        Thread.sleep(2000);
    }
}
