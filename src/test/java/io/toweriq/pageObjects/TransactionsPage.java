package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class TransactionsPage extends AbstractPage{

    private By transactionsPageHeader = By.xpath("//h1[text()='Transactions']");
    private By searchOnTransactionPage = By.id("tiq-transaction-search-input");
    private By transactionsTable = By.id("transactions-table");
    private By newTransactionButton = By.id("transactionsCreate");
    private By transactionForPersonalClient = By.id("squareImagecheckBoxItempersonal_client");
    private By transactionForCommercialClient = By.id("squareImagecheckBoxItemcommercial_client,");
    private By transactionDialogTitle = By.id("transaction-dialog-title");
    private By personalClientNameOption = By.xpath("//div[@id='client']//div[text()='Personal Client 1']");
    private By commercialClientNameOption = By.id("Marvel_Studios");
    private By associatedClientOrProspectDropdown = By.id("client");
    private By optionsListClient = By.id("optionsList_client");
    private By selectClientSearch = By.id("select-client-search");
    private By associatedClientSelect = By.id("Marvel_Studios");
    private By associatedYearDropdown = By.id("transactionYear");
    private By optionsListTransactionYear = By.id("optionsList_transactionYear");
    private By associatedYear2022 = By.id("2022");
    private By associatedYear2023 = By.id("2023");
    private By associatedYear2024 = By.id("2024");
    private By transactionTypeDropdown = By.id("transactionType");
    private By newBusinessOption = By.id("New_business");
    private By renewalOption = By.id("Renewal");
    private By finishTransactionCreationButton = By.id("createTSFinish");
    private By transactionsLinkOnLandingPage = By.xpath("//div[@id='root']//div/h1/a[@href='/transactions']");
    private By transactionLandingPageHeader = By.id("transaction-landing-page");
    private By transactionNameInTable = By.xpath("//table[@id='transactions-table']//tbody//tr[1]/td[2]/div");
    private By transactionsHeaderLink = By.xpath("//div[@id='root']//div/h1//a[@href='/transactions']");
    private By firstTransactionInTable = By.xpath("//table[@id='transactions-table']/tbody/tr[1]/td[2]//a");
    private By transactionArchiveButton = By.id("transactionArchive");
    private By tabsOnTransactionLandingPage = By.xpath("//div[@id='root']//div[1]/div[2]/div[@role='button']");
    private By transactionTabWorkspace = By.xpath("//div[@id='transactionTabWorkspace']/p");
    private By transactionFormsSubTab = By.id("transactionTabForms");
    private By addFormButton = By.id("add-form-btn");
    private By theFormForTransaction = By.xpath("//table[@id='companies-table']//tr[1]/td[1]");
    private By doneButtonForAddingForm = By.id("done");
    private By emailButtonOnTransactionPage = By.id("action-email-btn");
    private By subjectFieldNewEmail = By.id("subject");
    private By emailTextArea = By.cssSelector(".ql-container.ql-snow > .ql-blank.ql-editor");
    private By sendButtonForEmail = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable']//div[text()='Send']");
    private By noteButtonOnTransactionPage = By.id("action-note-btn");
    private By taskButtonOnTransactionPage = By.id("action-task-btn");
    private By transactionSubTabClientRecordForms = By.id("transactionTabClientRecordForms");
    private By transactionSubTabSchedules = By.id("transactionTabSchedules");
    private By addScheduleButton = By.id("add-schedule-btn");
    private By transactionSubTabAttachments = By.id("transactionTabAttachments");
    private By addAttachmentButton = By.id("add-attachment-btn");
    private By transactionSubTabESignatures = By.id("transactionTabE-signatures");
    private By addSignatureButton = By.id("add-signature-btn");
    private By transactionTabEmails = By.id("transactionTabEmails");
    private By transactionTabNotes = By.id("transactionTabNotes");
    private By transactionTabTasks = By.xpath("//div[@id='transactionTabTasks']/p");
    private By userRoleDropDown = By.cssSelector("[class='css-1pcexqc-container select-component']");


    @Getter
    TextField TransactionsPageHeader = new TextField(transactionsPageHeader,"The header of the 'Transactions' page");
    @Getter
    Table TransactionsTable = new Table(transactionsTable, "");
    @Getter
    InputField SearchForTransaction = new InputField(searchOnTransactionPage,"Search field on 'Transactions' page");
    @Getter
    Button NewTransactionButton = new Button(newTransactionButton, "Click on 'New transaction' button");
    @Getter
    Link TransactionForPersonalClient = new Link(transactionForPersonalClient, "The 'Personal Client' option");
    @Getter
    Link TransactionForCommercialClient = new Link(transactionForCommercialClient, "The 'Commercial Client' option");
    @Getter
    TextField TransactionDialogTitle = new TextField(transactionDialogTitle, "The 'Start a transaction' modal window");
    @Getter
    Button PersonalClientNameOption = new Button(personalClientNameOption, "The Personal client's name option in the 'Associated client or prospect' dropdown field");
    @Getter
    Button CommercialClientNameOption = new Button(commercialClientNameOption, "The Commercial client's name option in the 'Associated client or prospect' dropdown field");
    @Getter
    Link AssociatedClientOrProspectDropdown = new Link(associatedClientOrProspectDropdown, "The 'Associated client or prospect' dropdown field");
    @Getter
    DropDownList OptionsListClient = new DropDownList(optionsListClient, "The 'Associated client or prospect' option list");
    @Getter
    InputField SearchFieldForClientName = new InputField(selectClientSearch, "The 'Search' field for the 'Associated client or prospect' dropdown");
    @Getter
    DropDownOption AssociatedClientSelect = new DropDownOption(associatedClientSelect,"The name of the selected client");
    @Getter
    Link AssociatedYear = new Link(associatedYearDropdown, "The 'Associated year' dropdown field");
    @Getter
    DropDownList OptionsListTransactionYear = new DropDownList(optionsListTransactionYear, "The 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2022 = new DropDownOption(associatedYear2022,"The '2022' option from the 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2023 = new DropDownOption(associatedYear2023,"The '2023' option from the 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2024 = new DropDownOption(associatedYear2024,"The '2024' option from the 'Associated year' dropdown list");
    @Getter
    Link TransactionTypeDropdown = new Link(transactionTypeDropdown, "The 'Transaction type' dropdown field");
    @Getter
    DropDownOption NewBusinessOption = new DropDownOption(newBusinessOption, "The 'New Business' option in the 'Transaction type' dropdown");
    @Getter
    DropDownOption RenewalOption = new DropDownOption(renewalOption, "The 'Renewal' option in the 'Transaction type' dropdown");
    @Getter
    Button FinishTransactionCreationButton = new Button(finishTransactionCreationButton, "The 'Finish' button to complete the creation of the new transaction");
    @Getter
    TextField TransactionLandingPageOpen = new TextField(transactionLandingPageHeader, "The landing page of the transaction is open");
    @Getter
    Link TransactionNameInTable = new Link(transactionNameInTable,"The transaction name in the table on the 'Transactions' page");
    @Getter
    Link TransactionsLinkInHeader = new Link(transactionsHeaderLink, "The 'Transactions' header link in the sidebar menu");
    @Getter
    Link FirstTransactionInTable = new Link(firstTransactionInTable, "The first transaction in the table on the 'Transactions' page");
    @Getter
    Button TransactionsArchiveButton = new Button(transactionArchiveButton, "The 'Archive transaction' button");
    @Getter
    Tab TabsOnTransactionLandingPage = new Tab(tabsOnTransactionLandingPage, "The tabs on the transaction landing page");
    @Getter
    Link TransactionsLinkLandingPage = new Link(transactionsLinkOnLandingPage,"The 'Transactions' link on the transaction landing page");
    @Getter
    Tab TransactionTabWorkspace = new Tab(transactionTabWorkspace,"The 'Information' tab on the company landing page");
    @Getter
    Tab TransactionFormsSubTab = new Tab(transactionFormsSubTab, "The 'Forms' tab");
    @Getter
    Button AddFormButton = new Button(addFormButton, "The '+Add form' button");
    @Getter
    Button TheFormForTransaction = new Button(theFormForTransaction, "The form for the transaction");
    @Getter
    Button DoneButtonForAddingForm = new Button(doneButtonForAddingForm, "The 'Done' button for adding the forms too transactions");
    @Getter
    Button EmailButtonOnTransactionPage = new Button(emailButtonOnTransactionPage,"The 'Email' button on the transaction landing page");
    @Getter
    Button NoteButtonOnTransactionPage = new Button(noteButtonOnTransactionPage,"The 'Note' button on the transaction landing page");
    @Getter
    Button TaskButtonOnTransactionPage = new Button(taskButtonOnTransactionPage,"The 'Task' button on the transaction landing page");
    @Getter
    Tab TransactionSubTabClientRecordForms = new Tab(transactionSubTabClientRecordForms,"The 'Client record forms' sub tab on the company landing page");
    @Getter
    Tab TransactionSubTabSchedules = new Tab(transactionSubTabSchedules,"The 'Schedules' sub tab on the company landing page");
    @Getter
    Button AddScheduleButton = new Button(addScheduleButton, "The '+Add schedule' button");
    @Getter
    Tab TransactionSubTabAttachments = new Tab(transactionSubTabAttachments, "The 'Attachments' sub tab on the company landing page");
    @Getter
    Button AddAttachmentButton = new Button(addAttachmentButton, "The '+Add attachment' button");
    @Getter
    Tab TransactionSubTabESignatures = new Tab(transactionSubTabESignatures, "The 'E-signature' sub tab on the company landing page");
    @Getter
    Button AddSignatureButton = new Button(addSignatureButton, "The '+Add signature' button");
    @Getter
    Tab TransactionTabEmails = new Tab(transactionTabEmails,"The 'Emails' tab on the company landing page");
    @Getter
    Tab TransactionTabNotes = new Tab(transactionTabNotes, "The 'Notes' tab on the company landing page");
    @Getter
    Tab TransactionTabTasks = new Tab(transactionTabTasks, "The 'Tasks' tab on the company landing page");
    @Getter
    DropDownList UserRoleDropDownField = new DropDownList(userRoleDropDown, "The 'Select a user role' area on the transaction landing page");


    @Step("Enter text into the 'Search' field")
    public TransactionsPage typeTransactionTitle(String text){
        getSearchForTransaction().setText(text);
        System.out.println(text);
        return this;
    }
    @Step("Click on the 'New transaction' button")
    public TransactionsPage clickOnNewTransactionButton(){
        getNewTransactionButton().clickButton();
        return this;
    }
    @Step("Select the 'Personal client' option")
    public TransactionsPage selectPersonalClientOption(){
        getTransactionForPersonalClient().clickLink();
        return this;
    }
    @Step("Select the 'Commercial client' option")
    public TransactionsPage selectCommercialClientOption(){
        getTransactionForCommercialClient().clickLink();
        return this;
    }
    @Step("Click on the 'Associated client or prospect' dropdown field")
    public TransactionsPage clickOnAssociatedClientProspectDropdown(){
        getAssociatedClientOrProspectDropdown().clickLink();
        return this;
    }
    @Step("Search for the client name")
    public TransactionsPage searchClientName(String clientName){
        getSearchFieldForClientName().setText(clientName);
        System.out.println(clientName);
        return this;
    }
    @Step("Click on the name of the searched client")
    public TransactionsPage clickOnTheClientName(){
        getAssociatedClientSelect().clickOption();
        return this;
    }
    @Step("Click on the 'Associated year' dropdown")
    public TransactionsPage clickOnAssociatedYearDropDown(){
        getAssociatedYear().clickLink();
        return this;
    }
    @Step("Select the 2022 option from the 'Associated year' dropdown")
    public TransactionsPage clickOn2022Option(){
        getAssociatedYear2022().clickOption();
        return this;
    }
    @Step("Select the 2023 option from the 'Associated year' dropdown")
    public TransactionsPage clickOn2023Option(){
        getAssociatedYear2023().clickOption();
        return this;
    }
    @Step("Select the 2024 option from the 'Associated year' dropdown")
    public TransactionsPage clickOn2024Option(){
        getAssociatedYear2024().clickOption();
        return this;
    }
    @Step("Click on the 'Transaction type' dropdown field")
    public TransactionsPage clickOnTransactionTypeDropdown(){
        getTransactionTypeDropdown().clickLink();
        return this;
    }
    @Step("Select the 'New business' option inside the 'Transaction type' dropdown field")
    public TransactionsPage selectNewBusinessType(){
        getNewBusinessOption().clickOption();
        return this;
    }
    @Step("Select the 'Renewal' option inside the 'Transaction type' dropdown field")
    public TransactionsPage selectRenewalType(){
        getRenewalOption().clickOption();
        return this;
    }
    @Step("Click on the 'Finish' button to complete the transaction creation")
    public TransactionsPage clickOnFinishButton(){
        DriverManager.waitForElementVisible(finishTransactionCreationButton,5);
        getFinishTransactionCreationButton().clickButton();
        return this;
    }
    @Step("Click on the transaction name from the table on the 'Transactions' page")
    public TransactionsPage clickOnTransactionName(){
        getTransactionNameInTable().clickLink();
        return this;
    }
    @Step("Click on the 'Transactions' link on the header of the transaction landing page")
    public TransactionsPage clickTransactionsHeaderLink(){
        getTransactionsLinkInHeader().clickLink();
        return this;
    }
    @Step("Click on the 'Transactions' button")
    public TransactionsPage clickOnTransactionsLink(){
        DriverManager.webDriverWait();
      getTransactionsLinkLandingPage().clickLink();
      return this;
    }
    @Step("Click on the 'Workspace' tab on the transaction landing page")
    public TransactionsPage clickOnWorkspaceTab(){
        DriverManager.getWaiter(2);
        getTransactionTabWorkspace().clickTab();
        return this;
    }
    @Step("Click on the 'Forms' tab")
    public TransactionsPage clickOnFormsSubTab(){
        getTransactionFormsSubTab().clickTab();
        return this;
    }
    @Step("Click on the '+Add form' button")
    public TransactionsPage clickOnAddFormButton(){
        getAddFormButton().clickButton();
        return this;
    }
    @Step("Click on the Form")
    public TransactionsPage clickOnTheForm(){
        getTheFormForTransaction().clickButton();
        return this;
    }
    @Step("Click on the 'Done' button on the 'Add forms' modal")
    public TransactionsPage clickOnDoneButton(){
        getDoneButtonForAddingForm().clickButton();
        return this;
    }
    @Step("Click on the 'Email' button on the transaction landing page")
    public TransactionsPage clickEmailButtonOnTransactionPage (){
        getEmailButtonOnTransactionPage().clickButton();
        return this;
    }
    @Step("Click on the 'Note' button on the transaction landing page")
    public TransactionsPage clickNoteButtonOnTransactionPage (){
        getNoteButtonOnTransactionPage().clickButton();
        return this;
    }
    @Step("Click on the 'Task' button on the transaction landing page")
    public TransactionsPage clickTaskButtonOnTransactionPage (){
        getTaskButtonOnTransactionPage().clickButton();
        return this;
    }
    @Step("Click on the 'Schedules' tab")
    public TransactionsPage clickOnSchedulesSubTab(){
        getTransactionSubTabSchedules().clickTab();
        return this;
    }
    @Step("Click on the '+Add schedule' button")
    public TransactionsPage clickOnAddScheduleButton(){
        getAddScheduleButton().clickButton();
        return this;
    }
    @Step("Click on the 'Attachments' tab")
    public TransactionsPage clickOnAttachmentsTab(){
        getTransactionSubTabAttachments().clickTab();
        return this;
    }
    @Step("Click on the '+Add attachment' button")
    public TransactionsPage clickOnAddAttachmentButton(){
        getAddAttachmentButton().clickButton();
        return this;
    }
    @Step("Click on the 'E-signature' tab")
    public TransactionsPage clickOnESignatureTab(){
        getTransactionSubTabESignatures().clickTab();
        return this;
    }
    @Step("Click on the '+Add signature' button")
    public TransactionsPage clickOnAddSignatureButton(){
        getAddSignatureButton().clickButton();
        return this;
    }
    @Step("Click on the 'Emails' tab on the transaction landing page")
    public TransactionsPage clickOnEmailsTab(){
        DriverManager.waitForElementVisible(transactionTabEmails,10);
        getTransactionTabEmails().clickTab();
        return this;
    }
    @Step("Click on the 'Notes' tab on the transaction landing page")
    public TransactionsPage clickOnNotesTab(){
        getTransactionTabNotes().clickTab();
        return this;
    }
    @Step("Click on the 'Tasks' tab on the transaction landing page")
    public TransactionsPage clickOnTasksTab(){
        DriverManager.waitForElementVisible(transactionTabTasks,3);
        getTransactionTabTasks().clickTab();
        return this;
    }
    @Step("Click on the 'Select a user role' dropdown")
    public TransactionsPage clickOnSelectRoleDropdown(){
        DriverManager.getWaiter(5);
        getUserRoleDropDownField().click();
        return this;
    }
}
