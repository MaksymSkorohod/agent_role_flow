package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class HomePage {

    private By homeLink = By.id("sidebarMenuItemHome");
    private By transactionsLink = By.id("sidebarMenuItemTransactions");
    private By policiesLink = By.id("sidebarMenuItemPolicies");
    private By clientsLink = By.id("sidebarMenuItemClients");
    private By contactsLink = By.id("sidebarMenuItemContacts");
    private By formsLink = By.id("sidebarMenuItemForms");
    private By profileLink = By.id("accountProfile");
    private By preferencesLink = By.id("accountPreferences");
    private By agentSignOutLink = By.id("accountSignOut");
    private By settingsButton = By.id("pageSettings");
    private By homePageHeader = By.xpath("//div[@id='root']//h1");
    private By clientsPageHeader = By.xpath("//h1[text()='Clients']");
    private By transactionsPageHeader = By.xpath("//h1[text()='Transactions']");
    private By policiesPageHeader = By.xpath("//h1[text()='Policies']");
    private By contactsPageHeader = By.xpath("//h1[text()='Contacts']");
    private By formsPageHeader = By.xpath("//div[@id='root']//div[2]//h1");


    @Getter
    Button UserIcon = new Button(profileLink, "The User's profile icon");
    @Getter
    Button ProfilePreferencesLink = new Button(preferencesLink, "The 'Profile&Preferences' link");
    @Getter
    Button HomeLink = new Button(homeLink, "The 'Home' link in sidebar menu");
    @Getter
    Link AgentSignOutLink = new Link(agentSignOutLink, "The 'Sign out' link");
    @Getter
    Button TransactionsLink = new Button(transactionsLink, "The 'Transactions' link in sidebar menu");
    @Getter
    Button PoliciesLink = new Button(policiesLink, "The 'Policies' link in sidebar menu");
    @Getter
    Button ClientsLink = new Button(clientsLink, "The 'Accounts' link in sidebar menu");
    @Getter
    Button ContactsLink = new Button(contactsLink, "The 'Contacts' link in sidebar menu");
    @Getter
    Button FormsLink = new Button(formsLink,"The 'Forms' link in sidebar menu");
    @Getter
    Button SettingsButton = new Button(settingsButton, "Settings button");
    @Getter
    TextField HomePageHeader = new TextField(homePageHeader, "The home page header");
    @Getter
    TextField ClientsPageHeader = new TextField(clientsPageHeader, "The 'Clients' label is visible");
    @Getter
    TextField TransactionsPageHeader = new TextField(transactionsPageHeader,"The header of the 'Transactions' page");
    @Getter
    TextField PoliciesPageHeader = new TextField(policiesPageHeader, "The 'Policies' label is visible");
    @Getter
    TextField ContactsPageHeader = new TextField(contactsPageHeader,"Header of the 'Contacts' page");
    @Getter
    TextField FormsPageHeader = new TextField(formsPageHeader,"The forms page header with text 'Please select the forms you would like to use in your next transaction'.");

    @Step("Click on the 'Clients' link from the sidebar menu")
    public ClientsPage clickOnClientsLink() {
        DriverManager.WebDriverWait();
        getClientsLink().clickButton();
        return new ClientsPage();
    }
    @Step("Click on the 'Transactions' link from the sidebar menu")
    public TransactionsPage clickOnTransactionsLink(){
        DriverManager.WebDriverWait();
        getTransactionsLink().clickButton();
        return new TransactionsPage();
    }
    @Step("Click on the 'Contact' link from the sidebar menu")
    public ContactsPage clickOnContactsLink(){
        DriverManager.WebDriverWait();
        getContactsLink().clickButton();
        return new ContactsPage();
    }
    @Step("Click on the 'Sign out' link")
    public SignInPage clickSignOutLink(){
        DriverManager.WebDriverWait();
        getAgentSignOutLink().clickLink();
        return new SignInPage();
    }
    @Step("Click on the 'Forms' link from the sidebar menu")
    public FormsPage clickOnFormsLink(){
        DriverManager.WebDriverWait();
        getFormsLink().clickButton();
        return new FormsPage();
    }
    @Step("Click on the 'Policies' link from the sidebar menu")
    public PoliciesPage clickOnPoliciesLink(){
        DriverManager.WebDriverWait();
        getPoliciesLink().clickButton();
        return new PoliciesPage();
    }
    @Step("Click on the Users profile icon")
    public HomePage clickOnProfileIcon(){
        getUserIcon().clickButton();
        return this;
    }
    @Step("Click on the 'Profile&Preferences' link")
    public ProfileAndPreferencesPage clickOnProfilePreferencesLink(){
        DriverManager.WebDriverWait();
        getProfilePreferencesLink().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
        DriverManager.WebDriverWait();
        getSettingsButton().clickButton();
        return new SettingsPage();
    }

}
