package io.toweriq.testsAgent;

import io.toweriq.DriverManager;
import io.toweriq.pageObjects.*;
import io.toweriq.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static io.toweriq.DriverManager.getDriver;
import static io.toweriq.DriverManager.killDriver;


@Listeners({TestListener.class})
public class TestBase {


    protected HomePage homePage;
    protected CompaniesPage companiesPage;
    protected TransactionsPage transactionPage;
    protected PoliciesPage policiesPage;
    protected ContactsPage contactsPage;
    protected LibraryPage libraryPage;
    protected SignaturePage signaturePage;
    protected PortalsPage portalsPage;
    protected SchedulesPage schedulesPage;
    protected ProfileAndPreferencesPage profilePage;
    protected SettingsPage settingsPage;

    @BeforeMethod
    public void openSignInPage() {
        getDriver().get("https://qa.toweriq.io/sign-in");
    }
    @BeforeMethod
    public void signIn() {
        System.out.println("test");
        homePage = new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getRememberCheckBox().isExists();
        new SignInPage()
                .clickRememberMeCheckBox()
                .typePassword("Vfrcbv82")
                .clickSignInButton();
    }
    protected void fillHomePage(){
        DriverManager.webDriverWait();
        homePage = homePage
                .clickOnHomeButton();
    }
    protected void fillSettingsPage(){
        DriverManager.webDriverWait();
        settingsPage = homePage
                .clickOnSettingsButton();
    }
    protected void fillCompanyPage(){
        DriverManager.webDriverWait();
        companiesPage = homePage
                .clickOnCompaniesButton();
    }
    protected void fillTransactionPage() {
        DriverManager.webDriverWait();
        transactionPage = homePage
                .clickOnTransactionsButton();
    }
    protected void fillPoliciesPage(){
        policiesPage = homePage
                .clickOnPoliciesButton();
    }
    protected void fillContactsPage(){
        contactsPage = homePage
                .clickOnContactsButton();
    }
    protected void fillLibraryPage(){
        libraryPage = homePage
                .clickOnLibraryButton();
    }
    protected void fillSignaturePage(){
        signaturePage = homePage
                .clickOnESignatureButton();
    }
    protected void fillPortalsPage(){
        portalsPage = homePage
                .clickOnPortalsButton();
    }
    protected void fillSchedulesPage(){
        schedulesPage = homePage
                .clickOnSchedulesButton();
    }
    protected void fillProfilePage(){
        profilePage = homePage
                .clickOnProfilePreferencesLink();
     }
    @AfterMethod
    public void close(){
        killDriver();
    }
}
