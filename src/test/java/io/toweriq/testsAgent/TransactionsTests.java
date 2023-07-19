package io.toweriq.testsAgent;

import org.testng.annotations.Test;

import java.util.Random;

public class TransactionsTests extends TestBase {

    @Test(description = "Open 'Transactions' page")
    public void openTransactionsPage(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
    }

    @Test(description = "Create new transaction for the Commercial Clients from the 'Transactions' page")//check
    public void createNewTransactionFromTransactionsPage(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectCommercialClientOption()
                .clickOnAssociatedClientProspectDropdown()
                .searchClientName("Marvel Studios")
                .clickOnTheClientName()
                .clickOnAssociatedYearDropDown()
                .clickOn2022Option()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishButton();
        transactionPage
                .getTransactionLandingPageOpen().isExists();
    }
    @Test(description = "Create Renewal transaction for the Commercial Clients from the 'Transactions' page")//check
    public void createRenewalTransactionFromTransactionsPage(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectCommercialClientOption()
                .clickOnAssociatedClientProspectDropdown()
                .searchClientName("Marvel Studios")
                .clickOnTheClientName()
                .clickOnAssociatedYearDropDown()
                .clickOn2022Option()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishButton();
        transactionPage
                .getTransactionLandingPageOpen().isExists();
    }

    @Test(description = "Create New transaction from the company landing page")//check
    public void createNewTransactionFromCompanyLandingPage(){
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
                .clickOnAssociatedYearDropDown()
                .clickOn2023Option()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishTransactionButton();
    }

    @Test(description = "Create Renewal transaction from the company landing page")//check
    public void createRenewalTransactionFromCompanyLandingPage(){
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
                .clickOnAssociatedYearDropDown()
                .clickOn2023Option()
                .clickOnTransactionTypeDropdown()
                .selectRenewalType()
                .clickOnFinishTransactionButton();
    }

    @Test(description = "Open the transaction's landing page")//check
    public void openTransactionLandingPage(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .getUserRoleDropDownField();
    }
    @Test(description = "Adding the form to created transaction")//check
    public void addFormToCreatedTransaction(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .getTransactionLandingPageOpen().isExists();
        transactionPage
                .clickOnWorkspaceTab()
                .clickOnAddFormButton()
                .clickOnTheForm()
                .clickOnDoneButton();
    }
    @Test(description = "Share created transaction with the added form")
    public void shareCreatedTransactionWithForm(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectCommercialClientOption()
                .clickOnAssociatedClientProspectDropdown()
                .searchClientName("Marvel Studios")
                .clickOnTheClientName()
                .clickOnAssociatedYearDropDown()
                .clickOn2023Option()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishButton();
        transactionPage
                .getTransactionLandingPageOpen().isExists();
        transactionPage
                .clickOnWorkspaceTab()
                .clickOnAddFormButton()
                .clickOnTheForm()
                .clickOnDoneButton();
        transactionPage
                .clickOnSelectRoleDropdown();

    }
    @Test(description = "Creating a new email from the transaction landing page")//check
    public void createEmailOnTransactionPage(){
        fillTransactionPage();
        transactionPage
                .getTransactionsPageHeader().isExists();
        transactionPage
                .clickOnNewTransactionButton()
                .selectCommercialClientOption()
                .clickOnAssociatedClientProspectDropdown()
                .searchClientName("Marvel Studios")
                .clickOnTheClientName()
                .clickOnAssociatedYearDropDown()
                .clickOn2022Option()
                .clickOnTransactionTypeDropdown()
                .selectNewBusinessType()
                .clickOnFinishButton();
        transactionPage
                .getTransactionLandingPageOpen().isExists();
        transactionPage
                .clickEmailButtonOnTransactionPage();
    }
    @Test(description = "Creating the note from the transaction landing page")
    public void createNoteOnTransactionPage(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .getTransactionLandingPageOpen().isExists();
        transactionPage
                .clickNoteButtonOnTransactionPage();
    }
    @Test(description = "Creating the Task from the transaction landing page")
    public void createTaskOnTransactionPage(){
        fillTransactionPage();
        transactionPage
                .clickOnTransactionName()
                .getTransactionLandingPageOpen().isExists();
        transactionPage
                .clickTaskButtonOnTransactionPage();
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

