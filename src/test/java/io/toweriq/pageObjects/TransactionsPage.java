package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class TransactionsPage extends AbstractPage{

    private By transactionsPageHeader = By.xpath("//h1[text()='Transactions']");
    private By searchOnTransactionPage = By.id("tiq-transaction-search-input");
    private By newTransactionButton = By.id("transactionsCreate");
    private By startWorkflow = By.xpath("//div[@role='tooltip']//p[.='Start workflow']");
    private By selectFromTheForms = By.xpath("//div[@role='tooltip']//p[.='Select forms']");
    private By transactionsTable = By.id("transactions-table");
    private By landingPageHeader = By.xpath("//*[@id=\"root\"]/div[1]//div[2]//div[1]//h1");
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
    InputField SearchForTransaction = new InputField(searchOnTransactionPage,"Search field on 'Transactions' page");
    @Getter
    Button NewTransactionButton = new Button(newTransactionButton, "Click on 'New transaction' button");
    @Getter
    Button SelectStartWorkflow = new Button(startWorkflow, "Select to create new transaction from workflow");
    @Getter
    Button SelectFromTheForms = new Button(selectFromTheForms, "Select to create new transaction from the worms");
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
    @Step("Select and click on the 'Start workflow' button")
    public TransactionsPage clickStartWorkflowButton(){
//        DriverManager.WebDriverWait();
        getSelectStartWorkflow().clickButton();
        return this;
    }
    @Step("Select and click on the 'Select forms' button")
    public TransactionsPage clickSelectFormsButton(){
//        DriverManager.WebDriverWait();
        getSelectFromTheForms().clickButton();
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
