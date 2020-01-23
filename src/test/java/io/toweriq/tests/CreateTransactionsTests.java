package io.toweriq.tests;

import io.toweriq.pageObjects.TransactionsPage;
import org.testng.annotations.Test;

public class CreateTransactionsTests extends TestBase {

    @Test(description = "Open 'Transactions' page")
    public void openTransactionsPage(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
    }

    @Test(description = "Click on 'New transaction' button")
    public void clickOnNewTransactionButton() {
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
            transactionPage
                    .clickOnNewTransactionButton();
        }


    @Test(description = "Click on 'New transaction' button and choose 'Start workflow' option")
    public void chooseStartWorkflowOption(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .clickStartWorkflowButton();
    }

    @Test(description = "Click on 'New transaction' button and choose 'Select forms' option")
    public void chooseSelectFormsOption(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .clickSelectFormsButton();
    }
}

