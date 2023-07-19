package io.toweriq;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
        }
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            threadDriver.set(new EdgeDriver());
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
        threadDriver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        threadDriver.get().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
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

}
