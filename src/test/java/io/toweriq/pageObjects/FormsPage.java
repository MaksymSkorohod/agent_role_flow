package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class FormsPage extends AbstractPage {
    private By formsPageHeader = By.xpath("//div[@id='root']//div[2]//h1");
    private By searchForAForm = By.id("tiq-unknown-search-input");
    private By acordFormsBlock = By.xpath("//div[@id='root']//div[@role='button']//h3[.='ACORD']");
    private By axisForm = By.xpath("//div[@id='root']//div/span[.='Axis Cyber Application']");
    private By mcGowanForm = By.xpath("//div[@id='root']//span[text()='McGowan Program Administration - Workplace Violence']");
    private By formsStartTransactionButton = By.xpath("//div[@id='root']//button/div[text()='Start transaction']");
    private By startTransactionModal = By.xpath("//div[@role='presentation']/div[@role='document']/div[@role='dialog']");
    private By transactionNameField = By.id("transactionName");
    private By associatedClientDropDownField = By.id("client");
    private By associatedClientOption = By.xpath("//div[@id='client']//div[3]");
    private By transactionTypeDropDownField = By.id("transactionType");
    private By newBusinessType = By.xpath("//div[2]/div[text()='New business']");
    private By renewalType = By.xpath("//div[2]/div[text()='Renewal']");
    private By startTransaction = By.id("start-transaction-button");
    private By cancelTransaction = By.id("transaction-cancel");

    @Getter
    TextField FormsPageHeader = new TextField(formsPageHeader,"The forms page header with text 'Please select the forms you would like to use in your next transaction'.");
    @Getter
    InputField SearchForAForm = new InputField(searchForAForm,"Enter the form name");
    @Getter
    TextField AcordBlock = new TextField(acordFormsBlock,"The 'ACORD' block is exists");
    @Getter
    Link AxisForm = new Link(axisForm,"The 'Axis Cyber Application' form");
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
    public FormsPage clearSearchField(){
        getSearchForAForm().clear();
        return this;
    }
    @Step("Enter the form name into the 'Search' field")
    public FormsPage typeFormName(String formName){
        getSearchForAForm().setText(formName);
        System.out.println(formName);
        return this;
    }
    @Step("Click on the selected form")
    public FormsPage clickOnTheForm(){
        getMcGowanForm().getText();
        return this;
    }
    @Step("Choose 'Axis Cyber Application' form")
    public FormsPage chooseTheFormForNewBusiness(){
        getAxisForm().clickLink();
        return this;
    }
    @Step("Choose 'The 'McGowan Program Administration' form")
    public FormsPage chooseTheFormForRenewal(){
        getMcGowanForm().clickLink();
        return this;
    }
    @Step("Click on the 'Start transaction' button")
    public FormsPage clickStartTransactionOnFormsPage(){
        getFormsStartTransactionButton().clickButton();
        return this;
    }
    @Step("Enter the name of the transaction into the 'Transaction name' field")
    public FormsPage typeTransactionName(String transactionName){
        getTransactionNameField().setText(transactionName);
        System.out.println(transactionName);
        return this;
    }
    @Step("Click on the 'Associated client' drop-down field")
    public FormsPage clickOnAssociatedClientField(){
        getAssociatedClientDropDownField().click();
        return this;
    }
    @Step("Select an option from the 'Associated client' drop-down field")
    public FormsPage selectOptionFromAssociatedClientField(){
//        DriverManager.WebDriverWait();
        getAssociatedClientOption().clickOption();
        return this;
    }
    @Step("Click on the 'Transaction type' drop-down field")
    public FormsPage clickOnTransactionTypeField(){
        getTransactionTypeDropDownField().click();
        return this;
    }
    @Step("Select the 'New business' option from the 'Transaction type' drop-down field'")
    public FormsPage selectNewBusinessOption(){
//        DriverManager.WebDriverWait();
        getNewBusinessTypeOption().clickOption();
        return this;
    }
    @Step("Select the 'Renewal' option from the 'Transaction type' drop-down field'")
    public FormsPage selectRenewalOption(){
//        DriverManager.WebDriverWait();
        getRenewalTypeOption().clickOption();
        return this;
    }
    @Step("Click on the 'Start transaction' button")
    public FormsPage clickOnStartTransaction(){
        getStartTransaction().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button to cancel creating a new transaction")
    public FormsPage clickCancelTransaction(){
       getCancelTransaction().clickButton();
        return this;
    }

}
