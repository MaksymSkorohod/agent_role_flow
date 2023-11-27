package io.toweriq;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class DriverManager {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal();

    public static WebDriver getDriver(){
        if(threadDriver.get()==null){
            initDriver();
        }
        return threadDriver.get();
    }
    private static void initDriver() {
        String browser = System.getProperty("browser", "chrome");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            threadDriver.set(new ChromeDriver());
            getDriver().manage().window().maximize();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadDriver.set(new FirefoxDriver());
            getDriver().manage().window().maximize();
        }
    }
    public static void killDriver(){
        threadDriver.get().close();
        threadDriver.remove();
    }
    public static void goTo(String url) {
        getDriver().navigate().to(url);
    }

    public static void webDriverWait(){
        threadDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        threadDriver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
    public static WebDriverWait getWaiter(long timeOutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(threadDriver.get(), timeOutInSeconds);
        webDriverWait.ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        return webDriverWait;
    }
    public static By waitForElementVisible(By findElement, long timeOutInSeconds){
        getWaiter(timeOutInSeconds).until(visibilityOfElementLocated(findElement));
        return findElement;
    }
    public static void elementToBeClickable(By elementLocator){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        clickableElement.click();
    }

}
