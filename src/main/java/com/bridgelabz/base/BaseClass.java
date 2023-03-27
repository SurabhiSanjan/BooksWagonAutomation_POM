package com.bridgelabz.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {
    public WebDriver driver;
    public static Logger log;
    public void setup(){
        log = Logger.getLogger(BaseClass.class.getName());
        PropertyConfigurator.configure("C:\\Users\\atulk\\IdeaProjects\\AutomationBooksWagon\\log4j.properties");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bookswagon.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeWindow() {
        driver.quit();
}

}

