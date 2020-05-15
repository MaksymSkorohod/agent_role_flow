package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class LibraryPage extends AbstractPage {
    private By libraryPageHeader = By.xpath("//div[@id='root']//div/div[2]/div/h1[1]");
    private By searchForAForm = By.id("tiq-unknown-search-form");
    private By bookmarksTab = By.id("transactionTabBookmarks");
    private By programsTab = By.id("transactionTabPrograms");
    private By formsTab = By.id("transactionTabForms");
    private By hanoverForm = By.xpath("//div[@id='root']//div/span[.='Hanover Outside Interest']");
    private By mcGowanForm = By.xpath("//div[@id='root']//span[text()='McGowan Program Administration - Workplace Violence']");
    private By formsStartTransactionButton = By.xpath("//div[@id='root']//button/div[text()='Start transaction']");
    private By startTransactionModal = By.xpath("//div[@role='presentation']/div[@role='document']/div[@role='dialog']");
    private By transactionNameField = By.id("transactionName");
    private By associatedClientDropDownField = By.id("client");
    private By associatedClientSearchField = By.xpath("//input[@id='select-client-search']");
    private By associatedClientOption = By.xpath("//div[@id='client']//div[3]");
    private By transactionTypeDropDownField = By.id("transactionType");
    private By newBusinessType = By.xpath("//div[2]/div[text()='New business']");
    private By renewalType = By.xpath("//div[2]/div[text()='Renewal']");
    private By startTransaction = By.id("create-transaction-button-confirm");
    private By cancelTransaction = By.id("create-transaction-button-cancel");

    @Getter
    TextField LibraryPageHeader = new TextField(libraryPageHeader,"The forms page header with text 'Please select the forms you would like to use in your next transaction'.");
    @Getter
    InputField SearchForAForm = new InputField(searchForAForm,"Enter the form name");
    @Getter
    Button BookmarksTab = new Button(bookmarksTab,"The 'Booknarks' tab on the 'Library' page");
    @Getter
    Button ProgramsTab = new Button(programsTab, "The 'Programs' tab on the 'Library' page");
    @Getter
    Button FormsTab = new Button(formsTab,"The 'Forms' tab on the 'Library' page");
    @Getter
    Link HanoverForm = new Link(hanoverForm,"The 'Hanover Outside Interest' form");
    @Getter
    Link McGowanForm = new Link(mcGowanForm,"The 'McGowan Program Administration - Workplace Violence' form");
    @Getter
    Button FormsStartTransactionButton = new Button(formsStartTransactionButton,"The 'Start transaction' button on the 'Forms' page");
    @Getter
    DialogContainer StartTransactionModal = new DialogContainer(startTransactionModal, "The 'Start a transaction' modal window");
    @Getter
    InputField TransactionNameField = new InputField(transactionNameField, "The 'Transaction name' input field");
    @Getter
    DropDownList AssociatedClientDropDownField = new DropDownList(associatedClientDropDownField, "The 'Associated client' drop-down field'");
    @Getter
    InputField AssociatedClientSearchField = new InputField(associatedClientSearchField, "The Associated client search field");
    @Getter
    DropDownOption AssociatedClientOption = new DropDownOption(associatedClientOption, "The option from the 'Associated client' drop-down field'");
    @Getter
    DropDownList TransactionTypeDropDownField = new DropDownList(transactionTypeDropDownField, "The 'Transaction type' drop-down field'");
    @Getter
    DropDownOption NewBusinessTypeOption = new DropDownOption(newBusinessType, "The 'New business' option from the 'Transaction type' drop-down field'");
    @Getter
    DropDownOption RenewalTypeOption = new DropDownOption(renewalType, "The 'Renewal' option from the 'Transaction type' drop-down field'");
    @Getter
    Button StartTransaction = new Button(startTransaction, "The 'Start transaction' button");
    @Getter
    Button CancelTransaction = new Button(cancelTransaction, "The 'Cancel' button");


    @Step("Clear search field")
    public LibraryPage clearSearchField(){
        getSearchForAForm().clear();
        return this;
    }
    @Step("Enter the form name into the 'Search' field")
    public LibraryPage typeFormName(String formName){
        getSearchForAForm().setText(formName);
        System.out.println(formName);
        return this;
    }
    @Step("Click on the 'Bookmarks' tab")
    public LibraryPage bookmarkTab(){
        DriverManager.WebDriverWait();
        getBookmarksTab().clickButton();
        return this;
    }
    @Step("Click on the 'Programs' tab")
    public LibraryPage programsTab(){
        DriverManager.WebDriverWait();
        getProgramsTab().clickButton();
        return this;
    }
    @Step("Click on the 'Forms' tab")
    public LibraryPage formsTab(){
        DriverManager.WebDriverWait();
        getFormsTab().clickButton();
        return this;
    }

    @Step("Click on the 'Start transaction' button")
    public LibraryPage clickStartTransactionOnLibraryPage(){
        getFormsStartTransactionButton().clickButton();
        return this;
    }
    @Step("Enter the name of the transaction into the 'Transaction name' field")
    public LibraryPage typeTransactionName(String transactionName){
        getTransactionNameField().setText(transactionName);
        System.out.println(transactionName);
        return this;
    }
    @Step("Click on the 'Associated client' drop-down field")
    public LibraryPage clickOnAssociatedClientField(){
        DriverManager.WebDriverWait();
        getAssociatedClientDropDownField().click();
        return this;
    }
    @Step("Enter client name into the 'Search' field for associated clients")
    public LibraryPage enterClientNameForSearchAssociatedClients(String associatedClient){
        DriverManager.WebDriverWait();
        getAssociatedClientSearchField().setText(associatedClient);
        return this;
    }
    @Step("Select an option from the 'Associated client' drop-down field")
    public LibraryPage selectOptionFromAssociatedClientField(){
        DriverManager.WebDriverWait();
        getAssociatedClientOption().clickOption();
        return this;
    }
    @Step("Click on the 'Transaction type' drop-down field")
    public LibraryPage clickOnTransactionTypeField(){
        getTransactionTypeDropDownField().click();
        return this;
    }
    @Step("Select the 'New business' option from the 'Transaction type' drop-down field'")
    public LibraryPage selectNewBusinessOption(){
//        DriverManager.WebDriverWait();
        getNewBusinessTypeOption().clickOption();
        return this;
    }
    @Step("Select the 'Renewal' option from the 'Transaction type' drop-down field'")
    public LibraryPage selectRenewalOption(){
//        DriverManager.WebDriverWait();
        getRenewalTypeOption().clickOption();
        return this;
    }
    @Step("Click on the 'Start transaction' button")
    public LibraryPage clickOnStartTransaction(){
        getStartTransaction().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button to cancel creating a new transaction")
    public LibraryPage clickCancelTransaction(){
       getCancelTransaction().clickButton();
        return this;
    }

}
