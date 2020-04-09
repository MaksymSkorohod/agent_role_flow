package io.toweriq.tests;

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
    protected ClientsPage clientsPage;
    protected TransactionsPage transactionPage;
    protected PoliciesPage policiesPage;
    protected ContactsPage contactsPage;
    protected FormsPage formsPage;
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
//                .clearEmailField()
                .typeEmail("toweriqautotest+1@gmail.com")
                .typePassword("Vfrcbv82")
                .setRememberMe(true)
                .clickSignInButton();
    }
    protected void fillSettingsPage(){
        DriverManager.WebDriverWait();
        settingsPage = homePage
                .clickOnSettingsButton();
    }
    protected void fillClientsPage(){
        DriverManager.WebDriverWait();
        clientsPage = homePage
                .clickOnClientsLink();
    }
    protected void fillTransactionPage() {
        DriverManager.WebDriverWait();
        transactionPage = homePage
                .clickOnTransactionsLink();
    }
    protected void fillPoliciesPage(){
        policiesPage = homePage
                .clickOnPoliciesLink();
    }
    protected void fillContactsPage(){
        contactsPage = homePage
                .clickOnContactsLink();
    }
    protected void fillFormsPage(){
        formsPage = homePage
                .clickOnFormsLink();
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
