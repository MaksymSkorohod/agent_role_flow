package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class ContactsTests extends TestBase {

    @Test(description = "Move between contact tabs")
    public void movingBetweencontactsTabs(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader();
        contactsPage
                .clickOnClientsTabInSubmenu()
                .getContactsPageHeaders().isExists();
        contactsPage
                .clickOnPersonalClientsTab()
                .getContactsPageHeaders().isExists();
        contactsPage
                .clickOnColleaguesTab()
                .getContactsPageHeaders().isExists();
        contactsPage
                .clickOnUnderwritersTab()
                .getContactsPageHeaders().isExists();
    }

    @Test(description = "Open 'Contacts' landing page")
    public void openContactsPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
    }
    @Test(description = "Create simple Rolodex contact user (Email address only)")
    public void createRolodexEmailOnly(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }
    @Test(description = "Create the Rolodex contact user (First and Last Name only)")
    public void createRolodexNamesOnly(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .clickOnFinishButton()
                .getSuccessPopUp();
    }
    @Test(description = "Create the Rolodex contact user (Email, First Name, Last Name)")
    public void createContactAndSendInviteLater(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }
    @Test(description = "Create the Rolodex contact user from the Company landing page(First Name and Last Name name only)")
    public void createRolodexFromCompanyLandingOnlyNames(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickOtherContactsFromCompanyLandingPage()
                .clickAddContactFromOtherContactsSubTab()
                .clickCreateContactFromAssociateOthersCompany()
                .enterFirstNameRolodex(generateContactFirstName())
                .enterLastNameRolodex(generateContactLastName())
                .clickFinishButtonForRolodex();
    }
    @Test(description = "Create the Rolodex contact user from the Company landing page(Emails only)")
    public void createRolodexFromCompanyLandingOnlyEmails(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickOtherContactsFromCompanyLandingPage()
                .clickAddContactFromOtherContactsSubTab()
                .clickCreateContactFromAssociateOthersCompany()
                .enterEmailAddressOfNewRolodexUser(generateContactEmail())
                .clickFinishButtonForRolodex();
    }

    @Test(description = "Set personal profile for the new created user")
    public void setPersonalProfile(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }

    @Test(description = "Create new email from the Contact landing page")
    public void createEmailFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnClientsTabInSubmenu()
                .clickOnFirstCommercialContactFromTeble()
                .getContactLandingPage();
        contactsPage
                .clickOnCompaniesTab()
                .clickOnEmailButton()
                .enterSubjectForEmail(generateEmailSubject());
//                .enterDodyOfEmail("Test email text")
//                .clickOnSendButtonForEmail();
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
    private String generateProspectName() {
        Random random = new Random();
        int d = random.nextInt(1000) + 1;
        String name = "Test Client " + d;
        System.out.println(name);
        return name;
    }
    private String generateEmailSubject() {
        Random random = new Random();
        int d = random.nextInt(1000) + 1;
        String subject = "Hello test letter - " + d;
        System.out.println(subject);
        return subject;
    }
}
