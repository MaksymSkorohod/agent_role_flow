package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class LibraryPage extends AbstractPage {
    private By libraryPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/h1[1]/b[text()='Library']");
    private By searchForAForm = By.id("tiq-unknown-search-form");
    private By bookmarksTab = By.id("Bookmarks");
    private By bookmarksPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/h1[2][text()='Bookmarks']");
    private By programsTab = By.id("Programs");
    private By programsPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/h1[2][text()='Programs']");
    private By formsTab = By.id("Forms");
    private By formsPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/h1[2][text()='Forms']");
    private By firstFormOnPage = By.xpath("//*[@id=\"companies-table\"]/tbody/tr[1]/td[1]/div/div/div/div/div/label/span[2]");
    private By secondFormOnPage = By.xpath("//*[@id=\"companies-table\"]/tbody/tr[2]/td[1]/div/div/div/div/div/label/span[2]/div/span");
    private By startTransactionButton = By.xpath("//div[@id='root']//button/div[text()='Start transaction']");
    private By newTransactionDialogWindow = By.xpath("//div[@id='transaction-dialog-title']");
    private By nextButtonNewTransactionDialogWindow = By.id("createTSNext");
    private By personalClientOption = By.id("squareImagecheckBoxItempersonal_client");
    private By commercialClientOption = By.id("squareImagecheckBoxItemcommercial_client,");
    private By associatedClientDropDownField = By.id("client");
    private By associatedClientOrProspectOptionList = By.id("optionsList_client");
    private By selectClientSearch = By.id("select-client-search");
    private By marvelClient = By.id("Marvel_Studios");
    private By associatedYearDropdown = By.id("transactionYear");
    private By associated2022Year = By.id("2022");
    private By associated2023Year = By.id("2023");
    private By associated2024Year = By.id("2024");
    private By associatedClientOption = By.xpath("//div[@id='client']//div[3]");
    private By transactionTypeDropDownField = By.id("transactionType");
    private By newBusinessType = By.id("New_business");
    private By renewalType = By.id("Renewal");
    private By startTransaction = By.id("createTSFinish");
    private By cancelTransaction = By.id("createTSCancel");

    @Getter
    TextField LibraryPageHeader = new TextField(libraryPageHeader,"The forms page header with text 'Please select the forms you would like to use in your next transaction'.");
    @Getter
    InputField SearchForAForm = new InputField(searchForAForm,"Enter the form name");
    @Getter
    Button BookmarksTab = new Button(bookmarksTab,"The 'Booknarks' tab on the 'Library' page");
    @Getter
    TextField BookmarksPageHeader = new TextField(bookmarksPageHeader,"The header of the Bookmarks page");
    @Getter
    Button ProgramsTab = new Button(programsTab, "The 'Programs' tab on the 'Library' page");
    @Getter
    TextField ProgramsPageHeader = new TextField(programsPageHeader,"The header of the Programs page");
    @Getter
    Button FormsTab = new Button(formsTab,"The 'Forms' tab on the 'Library' page");
    @Getter
    TextField FormsPageHeader = new TextField(formsPageHeader,"The header of the Forms page");
    @Getter
    Link FirstFormOnPage = new Link(firstFormOnPage,"The 'Hanover Outside Interest' form");
    @Getter
    Link SecondFormOnPage = new Link(secondFormOnPage,"The 'McGowan Program Administration - Workplace Violence' form");
    @Getter
    Button StartTransactionButton = new Button(startTransactionButton,"The 'Start transaction' button on the 'Forms' page");
    @Getter
    TextField NewTransactionTitle = new TextField(newTransactionDialogWindow, "The title for the 'New transaction' modal window");
    @Getter
    Button NextButtonNewTransactionDialogWindow = new Button(nextButtonNewTransactionDialogWindow,"The 'Next' button");
    @Getter
    Button PersonalClientOption = new Button(personalClientOption,"The 'Personal client' option");
    @Getter
    Button CommercialClientOption = new Button(commercialClientOption, "The 'Commercial client' option");
    @Getter
    DropDownList AssociatedClientDropDownField = new DropDownList(associatedClientDropDownField, "The 'Associated client' drop-down field'");
    @Getter
    Button AssociatedClientOrProspectOptionList = new Button(associatedClientOrProspectOptionList,"The 'Associated client or prospect' dropdown field");
    @Getter
    InputField SelectClientSearch = new InputField(selectClientSearch, "The 'Search' field for the clients in the 'Associated client or prospect' dropdown field");
    @Getter
    DropDownOption AssociatedClientOption = new DropDownOption(associatedClientOption, "The option from the 'Associated client' drop-down field'");
    @Getter
    Button MarvelClient = new Button(marvelClient, "Searched client name");
    @Getter
    Button AssociatedYearDropdown = new Button(associatedYearDropdown, "The 'Associated year' dropdown field");
    @Getter
    Button Associated2022Year = new Button(associated2022Year, "The 'Associated 2022' year");
    @Getter
    Button Associated2023Year = new Button(associated2023Year, "The 'Associated 2023' year");
    @Getter
    Button Associated2024Year = new Button(associated2024Year, "The 'Associated 2024' year");
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
        DriverManager.webDriverWait();
        getBookmarksTab().clickButton();
        return this;
    }
    @Step("Click on the 'Programs' tab")
    public LibraryPage programsTab(){
        DriverManager.webDriverWait();
        getProgramsTab().clickButton();
        return this;
    }
    @Step("Click on the 'Forms' tab")
    public LibraryPage formsTab(){
        DriverManager.webDriverWait();
        getFormsTab().clickButton();
        return this;
    }
    @Step("Click on the first form from the Bookmark page")
    public LibraryPage firstFormOnThePage(){
        DriverManager.webDriverWait();
        getFirstFormOnPage().clickLink();
        return this;
    }
    @Step("Click on second form from the Bookmark page")
    public LibraryPage secondFormOnThePage(){
        DriverManager.webDriverWait();
        getSecondFormOnPage().clickLink();
        return this;
    }
    @Step("Click on the 'Start transaction' button")
    public LibraryPage clickStartTransactionOnLibraryPage(){
        getStartTransactionButton().clickButton();
        return this;
    }
    @Step("Click on the 'Next' button on the 'New transaction' modal")
    public LibraryPage clickNextButton(){
        DriverManager.webDriverWait();
        getNextButtonNewTransactionDialogWindow().clickButton();
        return this;
    }
    @Step("Click on the 'Personal client' option")
    public LibraryPage clickPersonalClientOption(){
        DriverManager.webDriverWait();
        getPersonalClientOption().clickButton();
        return this;
    }
    @Step("Click on the 'Commercial client' option")
    public LibraryPage clickCommercialClientOption(){
        DriverManager.webDriverWait();
        getCommercialClientOption().clickButton();
        return this;
    }
    @Step("Click on the 'Associated client' drop-down field")
    public LibraryPage clickOnAssociatedClientField(){
        DriverManager.webDriverWait();
        getAssociatedClientDropDownField().click();
        return this;
    }
    @Step("Enter client name into the 'Search' field for associated clients")
    public LibraryPage enterClientNameForSearchAssociatedClients(String associatedClient){
        DriverManager.webDriverWait();
        getSelectClientSearch().setText(associatedClient);
        return this;
    }
    @Step("Select an option from the 'Associated client' drop-down field")
    public LibraryPage selectOptionFromAssociatedClientsList(){
        DriverManager.webDriverWait();
        getAssociatedClientOption().clickOption();
        return this;
    }
    @Step("Click on the client name")
    public LibraryPage clickOnMarvel(){
        DriverManager.webDriverWait();
        getMarvelClient().clickButton();
        return this;
    }
    @Step("Click on the 'Associated year' option")
    public LibraryPage clickOnAssociatedYearDropdown(){
        DriverManager.webDriverWait();
        getAssociatedYearDropdown().clickButton();
        return this;
    }
    @Step("Click on the 2022 year option")
    public LibraryPage clickOn2022AssociatedYear(){
        DriverManager.webDriverWait();
        getAssociated2022Year().clickButton();
        return this;
    }
    @Step("Click on the 2023 year option")
    public LibraryPage clickOn2023AssociatedYear(){
        DriverManager.webDriverWait();
        getAssociated2023Year().clickButton();
        return this;
    }
    @Step("Click on the 2024 year option")
    public LibraryPage clickOn2024AssociatedYear(){
        DriverManager.webDriverWait();
        getAssociated2024Year().clickButton();
        return this;
    }
    @Step("Click on the 'Transaction type' drop-down field")
    public LibraryPage clickOnTransactionTypeField(){
        getTransactionTypeDropDownField().click();
        return this;
    }
    @Step("Select the 'New business' option from the 'Transaction type' drop-down field'")
    public LibraryPage selectNewBusinessOption(){
        getNewBusinessTypeOption().clickOption();
        return this;
    }
    @Step("Select the 'Renewal' option from the 'Transaction type' drop-down field'")
    public LibraryPage selectRenewalOption(){
        getRenewalTypeOption().clickOption();
        return this;
    }
    @Step("Click on the 'Finish' button")
    public LibraryPage clickOnFinishToCreateNewTransaction(){
        getStartTransaction().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button to cancel creating a new transaction")
    public LibraryPage clickCancelTransaction(){
       getCancelTransaction().clickButton();
        return this;
    }

}
