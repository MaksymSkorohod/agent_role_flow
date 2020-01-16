package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
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
    private By settingsButton = By.id("pageSettings");


    @Getter
    Button UserIcon = new Button(profileLink, "Click on the User's profile icon");
    @Getter
    Button ProfilePreferencesLink = new Button(preferencesLink, "Click on the 'Profile&Preferences' link");
    @Getter
    Button HomeLink = new Button(homeLink, "Click on the 'Home' link");
    @Getter
    Button TransactionsLink = new Button(transactionsLink, "Click on the 'Transactions' link");
    @Getter
    Button PoliciesLink = new Button(policiesLink, "Click on the 'Policies' link");
    @Getter
    Button ClientsLink = new Button(clientsLink, "Click on the 'Accounts' link");
    @Getter
    Button ContactsLink = new Button(contactsLink, "Click on the 'Contacts' link");
    @Getter
    Button FormsLink = new Button(formsLink,"Click on the 'Forms' link");
    @Getter
    Button SettingsButton = new Button(settingsButton, "Settings button");

    @Step("Click on the 'Clients' link from the sidebar menu")
    public ClientsPage clickOnClientsLink() {
        getClientsLink().clickButton();
        return new ClientsPage();
    }
    @Step("Click on the 'Transactions' link from the sidebar menu")
    public TransactionsPage clickOnTransactionsLink() {
        getTransactionsLink().clickButton();
        return new TransactionsPage();
    }
    @Step("Click on the 'Contact' link from the sidebar menu")
    public ContactsPage clickOnContactsLink(){
        getContactsLink().clickButton();
        return new ContactsPage();
    }
    @Step("Click on the 'Forms' link from the sidebar menu")
    public FormsPage clickOnFormsLink(){
        getFormsLink().clickButton();
        return new FormsPage();
    }
    @Step("Click on the Users profile icon")
    public HomePage clickOnProfileIcon(){
        getUserIcon().clickButton();
        return this;
    }
    @Step("Click on the 'Profile&Preferences' link")
    public ProfileAndPreferencesPage clickOnProfilePreferencesLink(){
        getProfilePreferencesLink().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
        getSettingsButton().clickButton();
        return new SettingsPage();
    }

}
