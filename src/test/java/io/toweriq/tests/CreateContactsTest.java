package io.toweriq.tests;

import org.testng.annotations.Test;

public class CreateContactsTest extends TestBase {

    @Test(description = "Open 'Contacts' page")
    public void openContactsPage(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink();
    }


    @Test(description = "Click on the 'Create contact' button")
    public void clickOnCreateContactButton(){
        homePage
                .getContactsLink().isExists();
        homePage
                .clickOnContactsLink()
                .clickOnCreateContactButton()
                .clickOnClientDropDownField();
    }
}
