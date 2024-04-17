package ro.maxbet.utils;

import io.qameta.allure.Attachment;
import ro.maxbet.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "Page Screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }


    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");

        //Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver driver = DriverManager.getDriver();


        //Allure ScreenShotRobot and SaveTestLog
        System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
        saveScreenshotPNG(driver);
    }

}
