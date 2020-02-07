package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class ContactsTests extends TestBase {

    @Test(description = "Open 'Contacts' page")
    public void openContactsPage(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
    }
    @Test(description = "Create the Contact user for the existing Client")
    public void createContactForExistingClient(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField()
                .selectFirstOptionFromClientList()
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typeEmailOfContact(generateContactEmail())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnCreateAndReturnButton()
                .getSuccessPopUp().isExists();
        contactsPage
                .clickOnSendInviteButton();
    }
    @Test(description = "Create the Contact user for the existing Client and send invite for him later")
    public void createContactAndSendInviteLater(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField()
                .selectFirstOptionFromClientList()
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typeEmailOfContact(generateContactEmail())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnCreateAndReturnButton()
                .getSuccessPopUp().isExists();
        contactsPage
                .clickOnSendInviteLaterButton();
    }
    @Test(description = "Cancel creation of the new Contact for the existing Client")
    public void cancelContactCreation(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField()
                .selectFirstOptionFromClientList()
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typeEmailOfContact(generateContactEmail())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnCancelButton();
    }
    @Test(description = "Creating new Client from the 'Contacts' page")
    public void creatingNewClientFromContactsPage() {
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField()
                .enterTextIntoSearchAccountField("Black Widow")
                .clickOnCreateClientLink()
                .enterCompanyName(generateClientName())
                .clickCreateClientButton()
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typeEmailOfContact(generateContactEmail())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnCreateAndReturnButton()
                .getSuccessPopUp().isExists();
        contactsPage
                .clickOnSendInviteLaterButton();
    }
    @Test(description = "Close 'Create new contact' window")
    public void closeCreateNewContactWindow(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .clickOnClientDropDownField()
                .enterTextIntoSearchAccountField("Black Widow")
                .clickOnCreateClientLink()
                .clickBackToContact()
                .clickToCloseCreateContactModal();
    }
    @Test(description = "Open contact's landing page")
    public void openContactLandingPage(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnContactLinkName()
                .contactHeaderText();
    }

    @Test(description = "Editing contacts information")
    public void editContactInformation(){
        fillContactsPage();
        contactsPage
                .getContactsPageHeader().isExists();
        contactsPage
                .clickOnContactLinkName()
                .clickOnEditContactButton()
                .getEnterContactPhoneNumber().clear();
        contactsPage
                .clearPhoneField()
                .cancelUpdateContact();
    }


    private String generateContactFirstName() {
        String name = "Maori";
        System.out.println(name);
        return name;
    }
    private String generateContactLastName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String lastName = "Warrior " + a;
        System.out.println(lastName);
        return lastName;
    }
    private String generateContactEmail() {
        Random random = new Random();
        int b = random.nextInt(1000) + 1;
        String email = "maoriwarrior" + b + "@mail.com";
        System.out.println(email);
        return email;
    }
    private String generatePhoneNumber(){
        Random random = new Random();
        int c =random.nextInt(1000) +1;
        String phoneNumber = "+18085521"+c;
        System.out.println(phoneNumber);
        return phoneNumber;
    }
    private String generateClientName() {
        Random random = new Random();
        int d = random.nextInt(1000) + 1;
        String name = "Test Client " + d;
        System.out.println(name);
        return name;
    }
}
