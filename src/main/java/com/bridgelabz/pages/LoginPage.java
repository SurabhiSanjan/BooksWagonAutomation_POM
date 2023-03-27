package com.bridgelabz.pages;
import com.bridgelabz.utility.ReadPropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends ReadPropertyFile {
    WebDriver driver;
    @FindBy(id = "ctl00_lblUser")
    WebElement accountDropDown;

    @FindBy(id = "ctl00_phBody_SignIn_txtEmail")
    WebElement enterMobile;

    @FindBy(id = "ctl00_phBody_SignIn_txtPassword")
    WebElement enterPassword;

    @FindBy(id = "ctl00_phBody_SignIn_btnLogin")
    WebElement login;

    public LoginPage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginToBooksWagon(String mobile, String pass) throws InterruptedException {
        accountDropDown.click();
        Thread.sleep(500);
        driver.findElement(By.name(properties.getProperty("loginmobileData"))).sendKeys(mobile);
        //enterMobile.sendKeys(mobile);
        Thread.sleep(500);
        enterPassword.sendKeys(pass);
        Thread.sleep(500);
        login.click();
        Thread.sleep(2000);
    }
}
