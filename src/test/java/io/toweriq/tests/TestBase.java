package io.toweriq.tests;

import io.toweriq.DriverManager;
import io.toweriq.pageObjects.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static io.toweriq.DriverManager.getDriver;
import static io.toweriq.DriverManager.killDriver;

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
        getDriver().get("https://app.mytoweriq.com/sign-in");
    }

    @BeforeMethod
    public void signIn() {
        System.out.println("test");
        homePage = new SignInPage()
                .clearEmailField()
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


    @AfterMethod
    public void close(){
      killDriver();
    }
}
