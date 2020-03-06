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
}
