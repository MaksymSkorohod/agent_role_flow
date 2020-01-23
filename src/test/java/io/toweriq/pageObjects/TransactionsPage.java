package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class TransactionsPage extends AbstractPage{
    private By transactionsPageHeader = By.xpath("//h1[text()='Transactions']");
    private By searchOnTransactionPage = By.id("tiq-transaction-search-input");
    private By newTransactionButton = By.id("transactionsCreate");
    private By startWorkflow = By.xpath("//div[@role='tooltip']//p[.='Start workflow']");
    private By selectFromTheForms = By.xpath("//div[@role='tooltip']//p[.='Select forms']");

    @Getter
    TextField TransactionsPageHeader = new TextField(transactionsPageHeader,"Header of the 'Transactions' page");
    @Getter
    InputField SearchForTransaction = new InputField(searchOnTransactionPage,"Search field on 'Transactions' page");
    @Getter
    Button NewTransactionButton = new Button(newTransactionButton, "Click on 'New transaction' button");
    @Getter
    Button SelectStartWorkflow = new Button(startWorkflow, "Select to create new transaction from workflow");
    @Getter
    Button SelectFromTheForms = new Button(selectFromTheForms, "Select to create new transaction from the worms");

    @Step("Enter text into the 'Search' field")
    public TransactionsPage typeTransactionTitle(String text){
        getSearchForTransaction().setText(text);
        System.out.println(text);
        return this;
    }
    @Step("Click on the 'New transaction' button")
    public TransactionsPage clickOnNewTransactionButton(){
        DriverManager.WebDriverWait();
        getNewTransactionButton().clickButton();
        return this;
    }
    @Step("Select and click on the 'Start workflow' button")
    public TransactionsPage clickStartWorkflowButton(){
        DriverManager.WebDriverWait();
        getSelectStartWorkflow().clickButton();
        return this;
    }
    @Step("Select and click on the 'Select forms' button")
    public TransactionsPage clickSelectFormsButton(){
        DriverManager.WebDriverWait();
        getSelectFromTheForms().clickButton();
        return this;
    }


}
