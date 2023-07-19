package io.toweriq.testsAgent;

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

    @Test(description = "Open 'Contacts' landing page")//checked
    public void openContactsPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
    }
    @Test(description = "Create simple Rolodex contact user (Email address only)")//checked
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
    @Test(description = "Create the Rolodex contact user (First and Last Name only)")//checked
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
    @Test(description = "Create the Rolodex contact user (Email, First Name, Last Name)")//checked
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
    @Test(description = "Create the Rolodex contact user from the Company landing page(First Name and Last Name name only)")//checked
    public void createRolodexFromCompanyLandingOnlyNames(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickOtherContactsFromCompanyLandingPage()
                .clickAddContactButton()
                .clickCreateContactFromAssociateOthersCompany()
                .enterFirstNameRolodex(generateContactFirstName())
                .enterLastNameRolodex(generateContactLastName())
                .clickFinishButtonForRolodex();
    }
    @Test(description = "Create the Rolodex contact user from the Company landing page(Emails only)")//checked
    public void createRolodexFromCompanyLandingOnlyEmails(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickOtherContactsFromCompanyLandingPage()
                .clickAddContactButton()
                .clickCreateContactFromAssociateOthersCompany()
                .enterEmailAddressOfNewRolodexUser(generateContactEmail())
                .clickFinishButtonForRolodex();
    }
    @Test(description = "Create the Administrator user from the Company landing page")//checked
    public void createAdministratorFromCompanyLandingPage(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickClientContactsFromCompanyLandingPage()
                .clickAddContactButton()
                .clickCreateContactFromAssociateOthersCompany()
                .enterEmailAddressOfNewRolodexUser(generateContactEmail())
                .enterFirstNameRolodex(generateContactFirstName())
                .enterLastNameRolodex(generateContactLastName())
                .enterPhoneRolodex(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectAdministratorRole()
                .clickFinishButtonForRolodex();
    }
    @Test(description = "Create the Collaborator user from the Company landing page")//checked
    public void createCollaboratorFromCompanyLandingPage(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickClientContactsFromCompanyLandingPage()
                .clickAddContactButton()
                .clickCreateContactFromAssociateOthersCompany()
                .enterEmailAddressOfNewRolodexUser(generateContactEmail())
                .enterFirstNameRolodex(generateContactFirstName())
                .enterLastNameRolodex(generateContactLastName())
                .enterPhoneRolodex(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectCollaboratorRole()
                .clickFinishButtonForRolodex();
    }
    @Test(description = "Create the Collaborator user from the Company landing page with the additional permissions")//checked
    public void createCollaboratorFromCompanyLandingPageAdditionalPermissions(){
        fillCompanyPage();
        companiesPage
                .getCompaniesPageHeader().isExists();
        companiesPage
                .clickOnClientsTab()
                .clickOnClientFromTable()
                .clickContactsTabFromCompanyLandingPage()
                .clickClientContactsFromCompanyLandingPage()
                .clickAddContactButton()
                .clickCreateContactFromAssociateOthersCompany()
                .enterEmailAddressOfNewRolodexUser(generateContactEmail())
                .enterFirstNameRolodex(generateContactFirstName())
                .enterLastNameRolodex(generateContactLastName())
                .enterPhoneRolodex(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectCollaboratorRole()
                .checkEditContactAdditionalPermission()
                .checkViewPoliciesAdditionalPermission()
                .checkAllTransactionsAdditionalPermission()
                .checkAllPoliciesAdditionalPermission()
                .checkShareItemsWithingTransactionsAdditionalPermission()
                .checkRequestClaimsAdditionalPermission()
                .checkRequestEndorsementAdditionalPermission()
                .checkRequestCertificateAdditionalPermission()
                .clickFinishButtonForRolodex();
    }

    @Test(description = "Creating a new Administrator user from the 'Contacts' page")//check
    public void createAdministratorFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectAdministratorRole()
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }

    @Test(description = "Creating a new Collaborator user from the 'Contacts' page")//check
    public void createCollaboratorFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectCollaboratorRole()
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }
    @Test(description = "Creating a new Collaborator user from the 'Contacts' page with the additional permissions")//check
    public void createCollaboratorFromContactPageWithAdditionalPermissions(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnCreateContactButton()
                .typeEmailOfContact(generateContactEmail())
                .typeFirsNameOfContact(generateContactFirstName())
                .typeLastNameOfContact(generateContactLastName())
                .typePhoneNumberOfContact(generatePhoneNumber())
                .clickOnPermissionTemplateDropdownField()
                .selectCollaboratorRole()
                .checkEditContactAdditionalPermission()
                .checkViewPoliciesAdditionalPermission()
                .checkAllTransactionsAdditionalPermission()
                .checkAllPoliciesAdditionalPermission()
                .checkShareItemsWithingTransactionsAdditionalPermission()
                .checkRequestClaimsAdditionalPermission()
                .checkRequestEndorsementAdditionalPermission()
                .checkRequestCertificateAdditionalPermission()
                .clickOnFinishButton()
                .getSuccessPopUp().isExists();
    }

    @Test(description = "Set personal profile for the new created user")//check
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
                .clickOnProfileDropdown()
                .clickCreateNewProfile()
                .clickProfileDropDown()
                .selectCommercialClientType()
                .companySelectDropDown()
                .clickOnCompanyName()
                .clickOnSaveAndReturnButton()
                .getSuccessPopUp().isExists();
    }

    @Test(description = "Create new email from the Contact landing page")//check
    public void createEmailFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnClientsTabInSubmenu()
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnFirstCommercialContactFromTeble()
                .getContactLandingPage();
        contactsPage
                .clickOnCompaniesTab()
                .clickOnEmailButton()
                .enterSubjectForEmail(generateEmailSubject());
    }
    @Test(description = "Create new note from the Contact landing page")//check
    public void createNoteFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnClientsTabInSubmenu()
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnFirstCommercialContactFromTeble()
                .getContactLandingPage().isExists();
        contactsPage
                .clickOnCompaniesTab()
                .clickOnNoteButton();
    }
    @Test(description = "Create new Task from the Contact landing page")//check
    public void createTaskFromContactPage(){
        fillContactsPage();
        contactsPage
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnClientsTabInSubmenu()
                .getAllContactsPageHeader().isExists();
        contactsPage
                .clickOnFirstCommercialContactFromTeble()
                .getContactLandingPage();
        contactsPage
                .clickOnCompaniesTab()
                .clickOnTaskButton();
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
