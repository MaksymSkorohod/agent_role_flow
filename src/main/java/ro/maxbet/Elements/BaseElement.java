package ro.maxbet.Elements;

import ro.maxbet.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseElement {
    private By locator;
    private By locatorTarget;
    private String description;
    private String lastBorder;
    private WebElement lastElement;

    public BaseElement(By locator, String description){
        this.locator = locator;
        this.description = description;
    }

    public BaseElement(By locator, By locatorTarget, String description){
        this.locator = locator;
        this.locatorTarget = locatorTarget;
        this.description = description;
    }

    protected By getLocator(){
        return locator;
    }

    protected By getLocatorTarget(){
        return locatorTarget;
    }

    protected WebElement get(){
        WebElement element = DriverManager.getDriver().findElement(locator);
        highlight(element);
        return element;
    }

    protected WebElement getTarget(){
        WebElement element = DriverManager.getDriver().findElement(locatorTarget);
        highlight(element);
        return element;
    }

    private void highlight(WebElement element) {
        unhighlight();
        lastElement = element;
        lastBorder = (String) ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid yellow;");
    }

    private void unhighlight() {
        if (lastElement != null) {
            try {
                ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].setAttribute('style', arguments[1]);", lastElement, lastBorder);
            } finally {
                lastElement = null;
            }
        }
    }

    public boolean isExists(long...timeout){
        long currentTimeout = 5;
        if(timeout.length > 0) {
            currentTimeout = timeout[0];
        }
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),currentTimeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            get();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isEnable(long... timeout) {
        if(isExists(timeout)){
            return get().isEnabled();
        }
        return false;
    }
    public boolean isGone(long...timeout){
        long currentTimeout = 5;
        if(timeout.length > 0) {
            currentTimeout = timeout[0];
        }
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),currentTimeout);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
            get();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void verify(){
        Assert.assertTrue(isExists());
    }


    private void highlightElement(WebElement element){
        unhighlightLast();
        lastElement = element;
        lastBorder = (String)((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].setAttribute('style, arguments[1]);",element, "color:yellow; border: 2px solid yellow;");
    }

    private void unhighlightLast(){
        if (lastElement != null){
            try {
                ((JavascriptExecutor) DriverManager.getDriver()). executeScript("arguments[0].setAttribute('style, arguments[1]);", lastElement, lastBorder);
            } finally{
                lastElement = null;
            }
        }
    }
    private void waitUntil(){

    }
}
