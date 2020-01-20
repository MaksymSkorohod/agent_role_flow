package io.toweriq.tests;

import org.testng.annotations.Test;

public class CreateContactsTest extends TestBase {

    @Test(description = "Open 'Contacts' page")
    public void openContactsPage(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
    }
    @Test(description = "Click on the 'Create contact' button")
    public void clickOnCreateContactButton(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField();
    }
}
