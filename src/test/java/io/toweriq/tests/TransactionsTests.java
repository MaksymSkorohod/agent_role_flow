package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class TransactionsTests extends TestBase {

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

    @Test(description = "Create new transaction for the Personal Clients")
    public void createNewTransactionForPersonalClient(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectPersonalClientOption()
                .clickOnNextButtonToContinue()
                .enterTransactionName(generatePersonalTransactionName())
                .clickOnAssociatedClientProspectDropdown()
                .searchClientName("Personal Client 1")
                .selectNameOfPersonalClient()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishButton()
                .clickOnFinishButton();
    }

    @Test(description = "Create new transaction for the Commercial Clients")
    public void createNewTransactionForCommercialClient(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectCommercialClientOption()
                .clickOnNextButtonToContinue()
                .enterTransactionName(generateCommercialTransactionName())
                .clickOnAssociatedClientProspectDropdown()
                .selectNameOfCommercialClient()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType();
    }

    @Test(description = "Create transaction from the company landing page")
    public void createNewTransactionFromCompanyLangingPage(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientFromTable()
                .getClientsLandingPageHeader().isExists();
        companiesPage
                .clickOnTransactionsTabOnCompanyLandingPage()
                .clickOnAddTransaction()
                .enterTransactionName(generateCommercialTransactionName())
                .clickOnTransactionTypeDropdownField()
                .selectNewBusinessType()
                .clickOnFinishTransactionButton();

    }

    @Test(description = "Open the transaction's landing page")
    public void openTransactionLandingPage(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .getLandingPageOpen().isExists();
    }

    @Test(description = "Overview transactions landing page tabs")
    public void tabsOverview(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .clickOnSchedulesTab()
                .clickOnAttachmentsTab()
                .clickOnESignatureTab()
                .clickOnFormsTab();
    }

    private String generatePersonalTransactionName() {
        Random random = new Random();
        int a = random.nextInt(10000) + 1;
        String name = "Personal Client Transaction " + a;
        System.out.println(name);
        return name;
    }
    private String generateCommercialTransactionName() {
        Random random = new Random();
        int a = random.nextInt(10000) + 1;
        String name = "Commercial Client Transaction " + a;
        System.out.println(name);
        return name;
    }

}

