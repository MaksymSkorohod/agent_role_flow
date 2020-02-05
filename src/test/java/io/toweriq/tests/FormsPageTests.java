package io.toweriq.tests;

import org.testng.annotations.Test;

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
                .getFoundFormLocator().isExists();
    }

}
