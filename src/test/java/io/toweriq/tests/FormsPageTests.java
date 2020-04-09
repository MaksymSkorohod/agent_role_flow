package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class FormsPageTests extends TestBase {

    @Test(description = "Open 'Forms' page")
    public void openFormsPage(){
        fillFormsPage();
        formsPage
                .getFormsPageHeader().isExists();
    }

    @Test(description = "Search for needed form")
    public void searchForAForm(){
        fillFormsPage();
        formsPage
                .getFormsPageHeader().isExists();
        formsPage
                .typeFormName("ACORD COMMERCIAL INSURANCE APPLICATION - 125")
                .getMcGowanForm().isExists();
    }

    @Test(description = "Cancel creating the transaction")
    public void cancelCreatingTransaction(){
        fillFormsPage();
        formsPage
                .getFormsPageHeader().isExists();
        formsPage
                .chooseTheFormForNewBusiness()
                .clickStartTransactionOnFormsPage()
                .getStartTransactionModal().isExists();
        formsPage
                .typeTransactionName(generateTransactionName())
                .clickOnAssociatedClientField()
                .enterClientNameForSearchAssociatedClients("Test")
                .selectOptionFromAssociatedClientField()
                .clickOnTransactionTypeField()
                .selectRenewalOption()
                .clickCancelTransaction();
    }

    @Test(description = "Creating the 'New business' transaction")
    public void createNewBusinessTransactionFromForm(){
        fillFormsPage();
        formsPage
                .getFormsPageHeader().isExists();
        formsPage
                .typeFormName("Axis Cyber Application")
                .chooseTheFormForNewBusiness()
                .clickStartTransactionOnFormsPage()
                .getStartTransactionModal().isExists();
        formsPage
                .typeTransactionName(generateTransactionName())
                .clickOnAssociatedClientField()
                .enterClientNameForSearchAssociatedClients("Test")
                .selectOptionFromAssociatedClientField()
                .clickOnTransactionTypeField()
                .selectNewBusinessOption()
                .clickOnStartTransaction();
    }

    @Test(description = "Creating the 'Renewal' transaction")
    public void createRenewalTransactionFromForm(){
        fillFormsPage();
        formsPage
                .getFormsPageHeader().isExists();
        formsPage
                .typeFormName("McGowan Program Administration - Workplace Violence")
                .chooseTheFormForRenewal()
                .clickStartTransactionOnFormsPage()
                .getStartTransactionModal().isExists();
        formsPage
                .typeTransactionName(generateTransactionName())
                .clickOnAssociatedClientField()
                .enterClientNameForSearchAssociatedClients("Test")
                .selectOptionFromAssociatedClientField()
                .clickOnTransactionTypeField()
                .selectRenewalOption()
                .clickOnStartTransaction();
    }


    private String generateTransactionName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String transaction = "Test Transaction " + a;
        System.out.println(transaction);
        return transaction;
    }

    }
