package com.bridgelabz.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;

public class HomePage {
    WebDriver driver;
    @CacheLookup
    @FindBy(id = "inputbar")
    WebElement searchBar;
    @CacheLookup
    @FindBy(id = "btnTopSearch")
    WebElement buttonToSearch;

    @CacheLookup
    @FindBy(id = "ctl00_lnkbtnLogout")
    WebElement logoutBtn;

    @CacheLookup
    @FindBy(xpath = "/html/body/form/div[10]/div[1]/div[2]/div[2]/div[1]/div[4]/div[5]/input")
    WebElement wishlist;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void  searchBook() throws InterruptedException {
        searchBar.sendKeys("Atomic Habits");
        Thread.sleep(500);
        buttonToSearch.click();
        Thread.sleep(500);
        wishlist.click();
        Thread.sleep(500);
    }

    public void logout() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Point coordinate = driver.findElement(By.linkText("Surabhi Sanjan")).getLocation();
        robot.mouseMove((int) coordinate.getX()+10, (int) coordinate.getY()+120);
        Thread.sleep(2000);
        logoutBtn.click();
        Thread.sleep(1000);
    }
}
