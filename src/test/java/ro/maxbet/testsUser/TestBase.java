package ro.maxbet.testsUser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.TextField;
import ro.maxbet.pageObjects.*;
import ro.maxbet.utils.TestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;

import static ro.maxbet.DriverManager.*;


@Listeners({TestListener.class})
    public class TestBase {
    protected HomePage homePage;
    protected LiveCasinoPage liveCasinoPage;
    protected BettingPage bettingPage;
    protected LiveBettingPage liveBettingPage;
    protected PromotionsPage promotionsPage;
    protected TournamentsPage tournamentsPage;
    protected ProfilePage profilePage;

    @BeforeMethod
    public void LogIn() {
        getDriver().get("https://dev.maxbet.ro/en");
        DriverManager.webDriverWait();
        System.out.println("Test");
        homePage = new HomePage();
        checkWarningDialog();
        new LogInPage()
                .clickOnLogInButton();
        new LogInPage()
                .getLogInModalWindow().isExists(5);
        new LogInPage()
                .enterUserName("James_Bond")
                .enterPassword("Vfrcbv82")
                .clickOnLogInToMaxBetButton();
        checkWarningDialog();
        new LogInPage()
                .getLogInModalWindow().isGone(1);
        new HomePage()
                .getPopUpBody().isExists();
        new HomePage()
                .clickXForPopUp();
    }

    private Boolean isOpenedWarning = false;

    public void checkWarningDialog() {
        if (isOpenedWarning) return;
        TextField warningDialog = new LogInPage().getWarningNotificationsModal();
        if (warningDialog.isExists()) {
            isOpenedWarning = true;
            new LogInPage().clickAcceptButton().getWarningNotificationsModal().isEnable();
        }
    }
    protected void fillHomePage(){
        DriverManager.webDriverWait();
        homePage = homePage
                .clickOnLogInButton();
    }
    protected void fillLiveCasinoPage(){
        DriverManager.webDriverWait();
        liveCasinoPage = homePage
                .clickOnLiveCasinoButton();
    }
    protected void fillBettingPage(){
        DriverManager.webDriverWait();
        bettingPage = homePage
                .clickOnBettingButton();
    }
    protected void fillLiveBetting(){
        DriverManager.webDriverWait();
        liveBettingPage = homePage
                .clickOnLiveBettingButton();
    }
    protected void fillPromotionPage(){
        DriverManager.webDriverWait();
        promotionsPage = homePage
                .clickOnPromotionsButton();
    }
    protected void fillProfilePage(){
        profilePage = homePage
                .clickOnWalletButton();
    }

    @AfterMethod
    public void close(){
        isOpenedWarning = false;
       killDriver();
//       isOpenedWarning = false;
    }
}
