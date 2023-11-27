package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends AbstractPage{

    private By allContactsPageHeader = By.xpath("//h1[text()='Commercial clients']");
    private By allContactsTab = By.id("All contacts");
    private By clientsTab = By.id("Clients");
    private By commercialClientsSubTab = By.id("Commercial");
    private By personalClientsSubTab = By.id("Personal");
    private By colleaguesTab = By.id("Colleagues");
    private By underwritersTab = By.id("Underwriters");
    private By pageHeaders = By.xpath("//div[@id='root']//h1");
    private By allContactsPageTab = By.id("transactionTabAllContacts");
    private By myContactsPageTab = By.id("transactionTabMyContacts");
    private By commercialPageTable = By.id("companies-table");
    private By commercialContactNameInTable = By.xpath("//table[@id='companies-table']/tbody/tr[1]/td[1]/div/a");
    private By secondCommercialContactNameInTable = By.xpath("//table[@id='companies-table']/tbody/tr[2]/td[1]/div/a");
    private By commercialContactLandingPageHeader = By.xpath("//div[@id='root']//div/h1/a[@href='/contacts/all']");
    private By createContactButton = By.id("create-contact-button");
    private By contactEmailField = By.id("email");
    private By contactFirstNameField = By.id("firstName");
    private By contactLastNameField = By.id("lastName");
    private By contactPhoneNumberField = By.id("phone");
    private By permissionTemplateDropDownField = By.id("businessRole");
    private By administratorTemplateOption = By.xpath("//div[@id='businessRole']//div[text()='Administrator']");
    private By collaboratorTemplateOption = By.xpath("//div[@id='businessRole']//div[text()='Collaborator']");
    private By editContactAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='Edit contact']");
    private By viewPoliciesAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='View Policies']");
    private By allTransactionsAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='All Transactions']");
    private By allPoliciesAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='All Policies']");
    private By shareItemsWithingTransactionAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='Share items withing a transaction']");
    private By requestClaimsAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='Request Claims']");
    private By requestEndorsementAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='Request Endorsement']");
    private By requestCertificateAdditionalPermission = By.xpath("//form[@id='new-rolodex-crm-contact-form']//span[text()='Request Certificate']");
    private By createAndReturnButton = By.id("createCompanyFinish");
    private By cancelButton = By.id("createCompanyCancel");
    private By successWindow = By.xpath("//div[@id='root']//div[@class='notifications-wrapper']");
    private By createProfileDropdown = By.id("profile");
    private By createNewProfileLink = By.id("selectBox-profile");
    private By selectTypeOfProfile = By.xpath("//form[@id='new-crm-profile-root-form']//div[@id='profile']");
    private By personalClientType = By.xpath("//div[@id='profile']//div[text()='Personal client']");
    private By commercialClientType = By.xpath("//div[@id='profile']//div[text()='Commercial client']");
    private By companyDropDownField = By.id("company");
    private By selectCompanySearch = By.id("select-company-search");
    private By companyFromDropDownList1 = By.cssSelector("#optionsList_company [data-for='option-itemy_1']");
    private By saveAndReturnButtonForEdit = By.id("createCompanyFinish");
    private By initialsOfTheContact = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]");
    private By actionEmailButton = By.xpath("//*[@id=\"action-email-btn\"]/div");
    private By subjectInputFieldForEmail = By.id("subject");
    private By emailBodySpace = By.xpath("///*[@id=\"crm-draggable-wrapper\"]/div/div[1]/div/div[2]/div/div[5]/div[1]/div");
    private By sendButtonForEmail = By.xpath("//*[@id=\"crm-modal-email-send\"]/div[text()='Send']");
    private By actionNoteButton = By.id("action-note-btn");
    private By actionTaskButton = By.xpath("//*[@id=\"action-task-btn\"]/div");
    private By openedEmailNoteTaskWindow = By.id("crm-draggable-wrapper");
    private By companiesTabOnContactLanding = By.id("transactionTabCompanies");
    private By sendInviteButton = By.id("send-latter-button-modal");
    private By sendInviteLaterButton = By.id("cancel-button-modal");
    private By createNewProspectLink = By.id("selectBox-prospect");
    private By prospectNameField = By.id("name");
    private By createClientButton = By.id("createCompanyFinish");
    private By cancelCreateClientButton = By.id("create-client-button-cancel");
    private By backToContactLink = By.xpath("//div[@id='contact-dialog-title']/p");
    private By contactTable = By.id("contacts-table");
    private By contactNameInTable = By.xpath("//table[@id='contacts-table']/tbody/tr[1]/td[1]/div/a");
    private By contactLandingPage = By.id("contact-landing-page");
    private By editContactButton = By.id("contactLandingEdit");
    private By updateContactButton = By.id("update-account-button-confirm");
    private By cancelUpdateContactButton = By.id("createCompanyFinish");
    private By sendInviteContactModalWindow = By.xpath("/html/body/div[4]/div[3]/div[1]/h1[text()='Success! New contact was created.']");
    private By closeButtonInviteModalWindow = By.xpath("/html/body/div[4]/div[3]/div[1]/button/div");
    private By sendInviteButtonInModal = By.xpath("//*[@id=\"send-latter-button-modal\"]/div[text()='Send invite']");
    private By laterButtonModal = By.xpath("//*[@id=\"cancel-button-modal\"]");


    @Getter
    TextField AllContactsPageHeader = new TextField(allContactsPageHeader,"Header of the 'All Contacts' page");
    @Getter
    Tab AllClients = new Tab(allContactsTab,"All Contacts tab in the sub menu");
    @Getter
    Tab ClientsTab = new Tab(clientsTab,"Clients tab in the sub menu");
    @Getter
    Tab CommercialTab = new Tab(commercialClientsSubTab, "Commercial Clients tab");
    @Getter
    Tab PersonalTab = new Tab(personalClientsSubTab, "Personal Clients tab");
    @Getter
    Tab ColleaguesTab = new Tab(colleaguesTab, "Colleagues tab");
    @Getter
    Tab UnderwritersTab = new Tab(underwritersTab, "Underwriters tab");
    @Getter
    Tab ContactsPageHeaders = new Tab(pageHeaders, "Contacts page headers"); //locations for the all headers
    @Getter
    Table CommercialPageTable = new Table(commercialPageTable, "The table of the commercial contacts");
    @Getter
    Link CommercialContactNameInTable = new Link(commercialContactNameInTable, "The first commercial contact in the 'Commercial clients' table");
    @Getter
    Link SecondCommercialContactNameInTable = new Link(secondCommercialContactNameInTable, "The second commercial contact in the 'Commercial clients' table");
    @Getter
    TextField CommercialContactLandingPageHeader = new TextField(commercialContactLandingPageHeader,"The header of commercial Contact landing page");
    @Getter
    Button CreateContactButton = new Button(createContactButton,"Click on the 'Create account' button");
    @Getter
    InputField EnterContactFirstName = new InputField(contactFirstNameField,"Enter contact's first name into the 'First name' field");
    @Getter
    InputField EnterContactLastName = new InputField(contactLastNameField,"Enter contact's last name into the 'Last name' field");
    @Getter
    InputField EnterContactEmail = new InputField(contactEmailField,"Enter contact's email address into the 'Email address' field");
    @Getter
    InputField EnterContactPhoneNumber =new InputField(contactPhoneNumberField,"Enter contact's phone number into the 'Phone number' field");
    @Getter
    Button PermissionTemplateDropDownField = new Button(permissionTemplateDropDownField, "The 'Permission template' dropdown field");
    @Getter
    Button AdministratorTemplateOption = new Button(administratorTemplateOption, "The 'Administrator' option");
    @Getter
    Button CollaboratorTemplateOption = new Button(collaboratorTemplateOption, "The 'Collaborator' option");
    @Getter
    Check EditContactAdditionalPermission = new Check(editContactAdditionalPermission, "The 'Edit contact' option for the 'Additional permission'");
    @Getter
    Check ViewPoliciesAdditionalPermission = new Check(viewPoliciesAdditionalPermission, "The 'View Policies' option for the 'Additional permission'");
    @Getter
    Check AllTransactionsAdditionalPermission = new Check(allTransactionsAdditionalPermission, "The 'All Transactions' option for the 'Additional permission'");
    @Getter
    Check AllPoliciesAdditionalPermission = new Check(allPoliciesAdditionalPermission, "The 'All Policies' option for the 'Additional permission'");
    @Getter
    Check ShareItemsWithingTransactionAdditionalPermission = new Check(shareItemsWithingTransactionAdditionalPermission, "The 'Share items withing a transaction' option for the 'Additional permission'");
    @Getter
    Check RequestClaimsAdditionalPermission = new Check(requestClaimsAdditionalPermission, "The 'Request Claims' option for the 'Additional permission'");
    @Getter
    Check RequestEndorsementAdditionalPermission = new Check(requestEndorsementAdditionalPermission, "The 'Request Endorsement' option for the 'Additional permission'");
    @Getter
    Check RequestCertificateAdditionalPermission = new Check(requestCertificateAdditionalPermission, "The 'Request Certificate' option for the 'Additional permission'");
    @Getter
    Button FinishButton = new Button(createAndReturnButton,"Click on the 'Finish' button");
    @Getter
    Button CancelButtonForNewContact =new Button(cancelButton,"Click on the 'Cancel' button");
    @Getter
    TextField SuccessPopUp = new TextField(successWindow,"Success pop-up window appears");
    @Getter
    Button CreateProfileDropdown = new Button(createProfileDropdown,"The 'Assigned profile' dropdown on the Contact landing page");
    @Getter
    Link CreateNewProfileLink = new Link(createNewProfileLink, "The '+Create new profile' link");
    @Getter
    Button SelectTypeOfProfile = new Button(selectTypeOfProfile,"The 'Profile' dropdown field for the profile type");
    @Getter
    Button PersonalClientType = new Button(personalClientType,"The 'Personal client' type option");
    @Getter
    Button CommercialClientType = new Button(commercialClientType, "The 'Commercial client' type option");
    @Getter
    Button CompanyDropDownField = new Button(companyDropDownField, "The 'Company' selection dropdown");
    @Getter
    InputField SelectCompanySearch = new InputField(selectCompanySearch,"The search field for the search the company");
    @Getter
    Button CompanyFromDropDownList1 = new Button(companyFromDropDownList1,"The second company from the list");
    @Getter
    Button SaveAndReturnButtonForEdit = new Button(saveAndReturnButtonForEdit,"The 'Save and Return' button on the 'Assign new profile' modal");
    @Getter
    TextField InitialsOfTheContact = new TextField(initialsOfTheContact,"Initials of the contact on the cpntact landing page");
    @Getter
    Button ActionEmailButton = new Button(actionEmailButton, "The 'Email' button on the Contact landing page");
    @Getter
    InputField SubjectInputFieldForEmail = new InputField(subjectInputFieldForEmail, "The 'Subject' input field for the email modal window");
    @Getter
    InputField EmailBodySpace = new InputField(emailBodySpace,"Body space for the text in the email");
    @Getter
    Button SendButtonForEmail = new Button(sendButtonForEmail, "The 'Send' button for email modal window");
    @Getter
    Button ActionNoteButton = new Button(actionNoteButton, "The 'Note' button on the Contact landing page");
    @Getter
    Button ActionTaskButton = new Button(actionTaskButton, "The 'Task' button on the Contact landing page");
    @Getter
    DialogContainer OpenedEmailNoteTaskWindow = new DialogContainer(openedEmailNoteTaskWindow, "The 'Emails', 'Notes' and 'Tasks' window appears");
    @Getter
    Button SendInviteButton = new Button(sendInviteButton,"Click on the 'Send invite' button");
    @Getter
    Button SendInviteLaterButton = new Button(sendInviteLaterButton,"Click on the 'Later' button");
    @Getter
    Link CreateNewProspectLink = new Link(createNewProspectLink,"Click on '+Create new prospect' link");
    @Getter
    InputField ProspectNameField = new InputField(prospectNameField,"Enter the name on a new company into the 'Prospect name' field");
    @Getter
    Link BackToContactLink = new Link(backToContactLink,"Click on 'Back to contact' link");
    @Getter
    Button CreateClientButton = new Button(createClientButton, "Click on the 'Create and return' button");
    @Getter
    Button CancelCreateClientButton = new Button(cancelCreateClientButton, "Click on the 'Cancel' button");
    @Getter
    Table ContactsPageTable = new Table(contactTable,"The table of the contacts");
    @Getter
    Link ContactNameInTable = new Link(contactNameInTable,"The first contact in the table");
    @Getter
    TextField ContactLandingPage = new TextField(contactLandingPage, "Hearer of the contact landing page");
    @Getter
    Button EditContactButton = new Button(editContactButton,"The 'Edit contact' button");
    @Getter
    Button UpdateContactButton = new Button(updateContactButton,"The 'Update' button");
    @Getter
    Button CancelUpdateContactButton = new Button(cancelUpdateContactButton, "The 'Cancel' button to cancel contact's update");
    @Getter
    Tab CompaniesTabOnContactLanding = new Tab(companiesTabOnContactLanding,"The 'Companies' tab on the Contact landing page");
    @Getter
    TextField SendInviteContactModalWindow = new TextField(sendInviteContactModalWindow,"The success message in the modal window.");
    @Getter
    Button CloseButtonInviteModalWindow = new Button(closeButtonInviteModalWindow, "The 'Close' button for the send invite modal window");
    @Getter
    Button SendInviteButtonInModal = new Button(sendInviteButtonInModal,"The 'Send invite' button for the send invite for the new contact");
    @Getter
    Button LaterButtonModal = new Button(laterButtonModal, "The 'Letter' button for the send invite for the new contact");



    @Step("Click on the 'Clients' tab in the sub menu")
    public ContactsPage clickOnClientsTabInSubmenu(){
        getClientsTab().clickTab();
        return this;
    }
    @Step("Click on the 'Personal' clients tab in the sub menu")
    public ContactsPage clickOnPersonalClientsTab(){
        DriverManager.webDriverWait();
        getPersonalTab().clickTab();
        return this;
    }
    @Step("Click on the 'Commercial' clients tab in the sub menu")
    public ContactsPage clickOnCommercialClientsTab(){
        getCommercialTab().clickTab();
        return this;
    }
    @Step("Click on the 'Colleagues' tab in the sub menu")
    public ContactsPage clickOnColleaguesTab(){
        DriverManager.webDriverWait();
        getColleaguesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Underwriters' tab in the sub menu")
    public ContactsPage clickOnUnderwritersTab(){
        DriverManager.webDriverWait();
        getUnderwritersTab().clickTab();
        return this;
    }
    @Step("Click on the first commercial contact from the 'Commercial clients' table")
    public ContactsPage clickOnFirstCommercialContactFromTeble(){
        DriverManager.getWaiter(3);
        getCommercialContactNameInTable().clickLink();
        return this;
    }
    @Step("Click on the second commercial contact from the 'Commercial clients' table")
    public ContactsPage clickOnSecondCommercialContactFromTeble(){
        getSecondCommercialContactNameInTable().clickLink();
        return this;
    }
    @Step("Click on the 'Create contact' button")
    public ContactsPage clickOnCreateContactButton(){
        getCreateContactButton().clickButton();
        return this;
    }
    @Step("Enter the first name of the contact")
    public ContactsPage typeFirsNameOfContact(String name){
        getEnterContactFirstName().setText(name);
        System.out.println(name);
        return this;
    }
    @Step("Enter the last name of the contact")
    public ContactsPage typeLastNameOfContact(String lastName){
        getEnterContactLastName().setText(lastName);
        System.out.println(lastName);
        return this;
    }
    @Step("Enter email address of the contact")
    public ContactsPage typeEmailOfContact(String email){
        getEnterContactEmail().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Enter phone number of the contact")
    public ContactsPage typePhoneNumberOfContact(String phone){
        DriverManager.webDriverWait();
        getEnterContactPhoneNumber().setText(phone);
        System.out.println(phone);
        return this;
    }
    @Step("Click on the 'Permission template' dropdown field")
    public ContactsPage clickOnPermissionTemplateDropdownField(){
        getPermissionTemplateDropDownField().clickButton();
        return this;
    }
    @Step("Select the 'Administrator' role from the 'Permission template' dropdown field")
    public ContactsPage selectAdministratorRole(){
        DriverManager.getWaiter(4);
        getAdministratorTemplateOption().clickButton();
        return this;
    }
    @Step("Select the 'Collaborator' role from the 'Permission template' dropdown field")
    public ContactsPage selectCollaboratorRole() {
        DriverManager.getWaiter(4);
        getCollaboratorTemplateOption().clickButton();
        return this;
    }
    @Step("Check the 'Edit contact' additional permission")
    public ContactsPage checkEditContactAdditionalPermission(){
        getEditContactAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'View Policies' additional permission")
    public ContactsPage checkViewPoliciesAdditionalPermission(){
        getViewPoliciesAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'All Transactions' additional permission")
    public ContactsPage checkAllTransactionsAdditionalPermission(){
        getAllTransactionsAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'All Policies' additional permission")
    public ContactsPage checkAllPoliciesAdditionalPermission(){
        getAllPoliciesAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Share items withing a transaction' additional permission")
    public ContactsPage checkShareItemsWithingTransactionsAdditionalPermission(){
        getShareItemsWithingTransactionAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Claims' additional permission")
    public ContactsPage checkRequestClaimsAdditionalPermission(){
        getRequestClaimsAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Endorsement' additional permission")
    public ContactsPage checkRequestEndorsementAdditionalPermission(){
        getRequestEndorsementAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Certificate' additional permission")
    public ContactsPage checkRequestCertificateAdditionalPermission(){
        getRequestCertificateAdditionalPermission().select();
        return this;
    }
    @Step("Click on the 'Create and return' button")
    public ContactsPage clickOnFinishButton(){
        DriverManager.elementToBeClickable(By.id("createCompanyFinish"));
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public ContactsPage clickOnCancelButton(){
       getCancelButtonForNewContact().clickButton();
        return this;
    }
    @Step("Click on the 'Profile' dropdown")
    public ContactsPage clickOnProfileDropdown(){
        DriverManager.getWaiter(4);
        getCreateProfileDropdown().clickButton();
        return this;
    }
    @Step("Click on the '+Create new profile' link")
    public ContactsPage clickCreateNewProfile(){
        DriverManager.getWaiter(2);
        getCreateNewProfileLink().clickLink();
        return this;
    }
    @Step("Click on the 'Profile' dropdown")
    public ContactsPage clickProfileDropDown(){
        getSelectTypeOfProfile().clickButton();
        return this;
    }
    @Step("Select the 'Personal client' type")
    public ContactsPage selectPersonalClientType(){
        DriverManager.getWaiter(3);
        getPersonalClientType().clickButton();
        return this;
    }
    @Step("Select the 'Commercial client' type")
    public ContactsPage selectCommercialClientType(){
        DriverManager.getWaiter(3);
        getCommercialClientType().clickButton();
        return this;
    }
    @Step("Click on the 'Company' dropdown")
    public ContactsPage companySelectDropDown(){
        getCompanyDropDownField().clickButton();
        return this;
    }
    @Step("Click on the second company from the list")
    public ContactsPage clickOnCompanyName(){
        DriverManager.getWaiter(3);
        getCompanyFromDropDownList1().clickButton();
        return this;
    }
    @Step("Click on the 'Save and return' button on the 'Assign new profile' modal")
    public ContactsPage clickOnSaveAndReturnButton(){
        getSaveAndReturnButtonForEdit().clickButton();
        return this;
    }

    @Step("Click on the 'Email' button from the Contact landing page")
    public ContactsPage clickOnEmailButton(){
        DriverManager.webDriverWait();
        getActionEmailButton().clickButton();
        return this;
    }
    @Step("Enter the subject of the letter into the 'Subject' input field")
    public ContactsPage enterSubjectForEmail(String emailSubject){
        DriverManager.webDriverWait();
        getSubjectInputFieldForEmail().setText(emailSubject);
        System.out.println(emailSubject);
        return this;
    }
    @Step("Enter the text into the Email")
    public ContactsPage enterDodyOfEmail(String text) {
        DriverManager.webDriverWait();
        getEmailBodySpace().setText(text);
        System.out.println(text);
        return this;
    }
    @Step("Click on the 'Send' button for the new enail")
    public ContactsPage clickOnSendButtonForEmail(){
        DriverManager.webDriverWait();
        getSendButtonForEmail().clickButton();
        return this;
    }
    @Step("Click on the 'Note' button from the Contact landing page")
    public ContactsPage clickOnNoteButton(){
        getActionNoteButton().clickButton();
        return this;
    }
    @Step("Click on the 'Task' button from the Contact landing page")
    public ContactsPage clickOnTaskButton(){
        DriverManager.elementToBeClickable(actionTaskButton);
        return this;
    }
    @Step("Click on the 'Send invite' button")
    public ContactsPage clickOnSendInviteButton(){
        getSendInviteButton().clickButton();
        return this;
    }
    @Step("Click on the 'Later' button")
    public ContactsPage clickOnSendInviteLaterButton(){
        getSendInviteLaterButton().clickButton();
        return this;
    }
    @Step("Click on the '+ Create new prospect' link")
    public ContactsPage clickOnCreateProspectLink(){
        getCreateNewProspectLink().clickLink();
        return this;
    }
    @Step("Enter the name of the new company into the 'Prospect name' field")
    public ContactsPage enterProspectName(String company){
        getProspectNameField().setText(company);
        System.out.println(company);
        return this;
    }
    @Step("Click on 'Back to contact' link")
    public ContactsPage clickBackToContact(){
        DriverManager.webDriverWait();
        getBackToContactLink().clickLink();
        return this;
    }
    @Step("Click on 'Back to contact' link")
    public ContactsPage clickCreateClientButton(){
        getCreateClientButton().clickButton();
        return this;
    }
    @Step("Click on the contact link in the table")
    public ContactsPage clickOnContactLinkName(){
        DriverManager.webDriverWait();
        getContactNameInTable().clickLink();
        return this;
    }
    @Step("Get header text of the contact's landing page")
    public ContactsPage contactLendingPage(){
        DriverManager.webDriverWait();
        getContactLandingPage().getText();
        System.out.println();
        return this;
    }
    @Step("Click on the 'Edit contact' button")
    public ContactsPage clickOnEditContactButton(){
        DriverManager.webDriverWait();
        getEditContactButton().clickButton();
        return this;
    }
    @Step("Click on the 'Update' button")
    public ContactsPage clickUpdateContactButton(){
        getUpdateContactButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button to cancel contact's update")
    public ContactsPage cancelUpdateContact(){
        getCancelUpdateContactButton().clickButton();
        return this;
    }
    @Step("Clear 'Phone number' field")
    public ContactsPage clearPhoneField(){
        DriverManager.webDriverWait();
        getEnterContactPhoneNumber().clear();
        return this;
    }
    @Step("Click on the 'Companies' tab fromm the Contact landing page")
    public ContactsPage clickOnCompaniesTab(){
        getCompaniesTabOnContactLanding().clickTab();
        return this;
    }
    @Step("Click on the 'X' button to close send invite modal window")
    public ContactsPage clickCloseButtonForSendInviteModal(){
        getCloseButtonInviteModalWindow().clickButton();
        return this;
    }
    @Step("Click on the 'Send invite' button from the invite modal window")
    public ContactsPage clickSendInviteButton(){
        getSendInviteButtonInModal().clickButton();
        return this;
    }
}