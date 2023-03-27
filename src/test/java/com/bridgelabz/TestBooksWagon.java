package com.bridgelabz;
import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.TestNGListeners;
import com.bridgelabz.pages.*;
import com.bridgelabz.utility.DataProviderLogic;
import org.testng.annotations.*;
import java.awt.*;
import java.io.IOException;

@Listeners(TestNGListeners.class)
public class TestBooksWagon extends BaseClass {
    RegistrationPage register;
    LoginPage login;
    Wishlist wish;
    HomePage home;
    AddBookToCart addBook;

    Address add;

    @BeforeMethod
    public void initialization() throws IOException {
        setup();
        register = new RegistrationPage(driver);
        login = new LoginPage(driver);
        home = new HomePage(driver);
        wish = new Wishlist(driver);
        addBook = new AddBookToCart(driver);
        add = new Address(driver);
    }

    @Test(priority = 0)
    public void insertDataInField() throws InterruptedException {
        Thread.sleep(1000);
        register.enterDataInField();
    }

    @Test(priority = 1, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void homepageSearchActivity(String mob, String pass) throws InterruptedException, AWTException {
       login.loginToBooksWagon(mob, pass);
        Thread.sleep(500);
        home.searchBook();
        home.logout();
    }

    @Test(priority = 2, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void wishlistCheckActivity(String mob, String pass) throws InterruptedException, AWTException {
        login.loginToBooksWagon(mob, pass);
        Thread.sleep(500);
        wish.wishlistCheck();
        Thread.sleep(500);
        home.logout();
    }
    @Test(priority = 3, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void placeOrder(String mob, String pass) throws InterruptedException, AWTException {
        login.loginToBooksWagon(mob, pass);
        addBook.addToCart();
        Thread.sleep(3000);
    }

    @Test(priority = 4, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void AddressSave(String mob, String pass) throws InterruptedException, AWTException {
        login.loginToBooksWagon(mob, pass);
        Thread.sleep(1000);
        add.fillAddress();
        Thread.sleep(500);
        home.logout();
        Thread.sleep(500);
    }
    @AfterMethod
    public void tearDown() {
        closeWindow();
    }
}
