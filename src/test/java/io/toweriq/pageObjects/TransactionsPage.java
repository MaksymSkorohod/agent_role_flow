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
    private By startTransactionNextButton = By.id("createTSNext");
    private By transactionDialogTitle = By.id("transaction-dialog-title");
    private By transactionNameField = By.id("transactionName");
    private By associatedClientOrProspectDropdown = By.id("client");
    private By selectClientSearch= By.id("select-client-search");
    private By personalClientNameOption = By.xpath("//div[@id='client']//div[text()='Personal Client 1']");
    private By commercialClientNameOption = By.xpath("//*[@id=\"client\"]/div[2]/div[2]");
    private By transactionTypeDropdown = By.id("transactionType");
    private By newBusinessOption = By.xpath("//div[@id='transactionType']//div[text() ='New business']");
    private By renewalOption = By.xpath("//div[@id='transactionType']//div[text() ='Renewal']");
    private By finishTransactionCreationButton = By.id("createTSFinish");
    private By landingPageHeader = By.id("transaction-landing-page");
    private By transactionNameInTable = By.xpath("//table[@id='transactions-table']//tbody//tr[1]/td[2]/div");
    private By transactionsHeaderLink = By.xpath("//div[@id='root']//div/h1//a[@href='/transactions']");
    private By firstTransactionInTable = By.xpath("//table[@id='transactions-table']/tbody/tr[1]/td[2]//a");
    private By transactionArchiveButton = By.id("transactionArchive");
    private By transactionFormsTab = By.id("transactionTabForms");
    private By addFormButton = By.xpath("//div[@id='root']//div[2]//button[text()='Add form']");
    private By schedulesTab = By.id("transactionTabSchedules");
    private By addScheduleButton = By.xpath("//div[@id='root']//div[2]//button[text()='Add schedule']");
    private By attachmentsTab = By.id("transactionTabAttachments");
    private By addAttachmentButton = By.xpath("//div[@id='root']//div[2]//button[text()='Add attachment']");
    private By eSignaturesTab = By.id("transactionTabE-signatures");
    private By addSignatureButton = By.xpath("//div[@id='root']//div[2]//button[text()='Add signature']");

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
    Button StartTransactionNextButton = new Button(startTransactionNextButton, "The 'Next' button");
    @Getter
    TextField TransactionDialogTitle = new TextField(transactionDialogTitle, "The 'Start a transaction' modal window");
    @Getter
    InputField TransactionNameField = new InputField(transactionNameField, "The 'Transaction name' input field");
    @Getter
    Link AssociatedClientOrProspectDropdown = new Link(associatedClientOrProspectDropdown, "The 'Associated client or prospect' dropdown field");
    @Getter
    InputField SearchFieldForClientName = new InputField(selectClientSearch, "The 'Search' field for the 'Associated client or prospect' dropdown");
    @Getter
    Button PersonalClientNameOption = new Button(personalClientNameOption, "The Personal client's name option in the 'Associated client or prospect' dropdown field");
    @Getter
    Button CommercialClientNameOption = new Button(commercialClientNameOption, "The Commercial client's name option in the 'Associated client or prospect' dropdown field");
    @Getter
    Link TransactionTypeDropdown = new Link(transactionTypeDropdown, "The 'Transaction type' dropdown field");
    @Getter
    Link NewBusinessOption = new Link(newBusinessOption, "The 'New Business' option in the 'Transaction type' dropdown");
    @Getter
    Link RenewalOption = new Link(renewalOption, "The 'Renewal' option in the 'Transaction type' dropdown");
    @Getter
    Button FinishTransactionCreationButton = new Button(finishTransactionCreationButton, "The 'Finish' button to complete the creation of the new transaction");
    @Getter
    TextField LandingPageOpen = new TextField(landingPageHeader, "The landing page of the transaction is open");
    @Getter
    Link TransactionNameInTable = new Link(transactionNameInTable,"The transaction name in the table on the 'Transactions' page");
    @Getter
    Link TransactionsLinkInHeader = new Link(transactionsHeaderLink, "The 'Transactions' header link in the sidebar menu");
    @Getter
    Link FirstTransactionInTable = new Link(firstTransactionInTable, "The first transaction in the table on the 'Transactions' page");
    @Getter
    Button TransactionsArchiveButton = new Button(transactionArchiveButton, "The 'Archive transaction' button");
    @Getter
    Button TransactionFormsTab = new Button(transactionFormsTab, "The 'Forms' tab");
    @Getter
    Button AddFormButton = new Button(addFormButton, "The '+Add form' button");
    @Getter
    Button SchedulesTab = new Button(schedulesTab,"The 'Schedules' tab");
    @Getter
    Button AddScheduleButton = new Button(addScheduleButton, "The '+Add schedule' button");
    @Getter
    Button AttachmentsTab = new Button(attachmentsTab, "The 'Attachments' tab");
    @Getter
    Button AddAttachmentButton = new Button(addAttachmentButton, "The '+Add attachment' button");
    @Getter
    Button ESignaturesTab = new Button(eSignaturesTab, "The 'E-signature' tab");
    @Getter
    Button AddSignatureButton = new Button(addSignatureButton, "The '+Add signature' button");


    @Step("Enter text into the 'Search' field")
    public TransactionsPage typeTransactionTitle(String text){
        getSearchForTransaction().setText(text);
        System.out.println(text);
        return this;
    }
    @Step("Click on the 'New transaction' button")
    public TransactionsPage clickOnNewTransactionButton(){
//        DriverManager.WebDriverWait();
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
    @Step("Click on the 'Next' button")
    public TransactionsPage clickOnNextButtonToContinue(){
        getStartTransactionNextButton().clickButton();
        return this;
    }
    @Step("Enter the transaction name into the 'Transaction name' input field")
    public TransactionsPage enterTransactionName(String transactionName){
        getTransactionNameField().setText(transactionName);
        System.out.println(transactionName);
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
    @Step("Select the Personal Client name")
    public TransactionsPage selectNameOfPersonalClient(){
        DriverManager.WebDriverWait();
        getPersonalClientNameOption().clickButton();
        return this;
    }
    @Step("Select the Commercial Client name")
    public TransactionsPage selectNameOfCommercialClient(){
        DriverManager.WebDriverWait();
        getCommercialClientNameOption().clickButton();
        return this;
    }
    @Step("Click on the 'Transaction type' dropdown field")
    public TransactionsPage clickOnTransactionTypeDropdown(){
        getTransactionTypeDropdown().clickLink();
        return this;
    }
    @Step("Select the 'New business' option inside the 'Transaction type' dropdown field")
    public TransactionsPage selectNewBusinessType(){
        getNewBusinessOption().clickLink();
        return this;
    }
    @Step("Select the 'Renewal' option inside the 'Transaction type' dropdown field")
    public TransactionsPage selectRenewalType(){
        getRenewalOption().clickLink();
        return this;
    }
    @Step("Click on the 'Finish' button to complete the transaction creation")
    public TransactionsPage clickOnFinishButton(){
        DriverManager.WebDriverWait();
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
    @Step("Click on the 'Forms' tab")
    public TransactionsPage clickOnFormsTab(){
        getTransactionFormsTab().clickButton();
        return this;
    }
    @Step("Click on the '+Add form' button")
    public TransactionsPage clickOnAddFormButton(){
        getAddFormButton().clickButton();
        return this;
    }
    @Step("Click on the 'Schedules' tab")
    public TransactionsPage clickOnSchedulesTab(){
        getSchedulesTab().clickButton();
        return this;
    }
    @Step("Click on the '+Add schedule' button")
    public TransactionsPage clickOnAddScheduleButton(){
        getAddScheduleButton().clickButton();
        return this;
    }
    @Step("Click on the 'Attachments' tab")
    public TransactionsPage clickOnAttachmentsTab(){
        getAttachmentsTab().clickButton();
        return this;
    }
    @Step("Click on the '+Add attachment' button")
    public TransactionsPage clickOnAddAttachmentButton(){
        getAddAttachmentButton().clickButton();
        return this;
    }
    @Step("Click on the 'E-signature' tab")
    public TransactionsPage clickOnESignatureTab(){
        getESignaturesTab().clickButton();
        return this;
    }
    @Step("Click on the '+Add signature' button")
    public TransactionsPage clickOnAddSignatureButton(){
        getAddSignatureButton().clickButton();
        return this;
    }
}
