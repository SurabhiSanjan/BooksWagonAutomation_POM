package com.bridgelabz.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;

    @FindBy(id = "ctl00_lblUser")
    WebElement accountDropDown;
    @FindBy(xpath = "/html/body/form/div[10]/div/div/div/div/div[2]/div[1]/div[3]/div/a")
    WebElement signUpLink;

    @FindBy(id = "ctl00_phBody_SignUp_txtName")
    WebElement fullName;

    @FindBy(id = "ctl00_phBody_SignUp_txtEmail")
    WebElement mobileNum;

    @FindBy(xpath = "//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]")
    WebElement continueButton;

    @FindBy(id = "ctl00_phBody_SignUp_txtOTP")
    WebElement otp;

    @FindBy(id = "ctl00_phBody_SignUp_txtPassword")
    WebElement password;

    @FindBy(id = "ctl00_phBody_SignUp_txtConfirmPwd")
    WebElement confPassword;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDataInField() throws InterruptedException {
        accountDropDown.click();
        Thread.sleep(500);
        signUpLink.click();
        Thread.sleep(500);
        fullName.sendKeys("Surabhi Sanjan");
        Thread.sleep(500);
        mobileNum.sendKeys("8544370256");
        Thread.sleep(500);
        continueButton.click();
        Thread.sleep(500);
        otp.sendKeys("359889");
        Thread.sleep(500);
        password.sendKeys("Surabhi@1");
        Thread.sleep(500);
        confPassword.sendKeys("Surabhi@1");
        Thread.sleep(1000);
    }

}