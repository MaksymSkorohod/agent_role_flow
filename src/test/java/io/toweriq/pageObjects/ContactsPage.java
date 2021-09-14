package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends AbstractPage{

    private By allContactsPageHeader = By.xpath("//div[@id='root']//h1");
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
    private By commercialContactNameInTable = By.xpath(" //table[@id='companies-table']/tbody/tr[1]/td[1]/div/a");
    private By secondCommercialContactNameInTable = By.xpath("//table[@id='companies-table']/tbody/tr[2]/td[1]/div/a");
    private By commercialContactLandingPageHeader = By.xpath("//div[@id='root']//div/h1/a[@href='/contacts/all']");
    private By createContactButton = By.id("create-contact-button");
    private By contactEmailField = By.id("email");
    private By contactFirstNameField = By.id("firstName");
    private By contactLastNameField = By.id("lastName");
    private By contactPhoneNumberField = By.id("phone");
    private By createAndReturnButton = By.id("createCompanyFinish");
    private By cancelButton = By.id("createCompanyCancel");
    private By successWindow = By.xpath("//div[@id='root']//div[@class='notifications-wrapper']");
    private By createProfileDropdown = By.id("profile");
    private By createNewProfileLink = By.id("selectBox-profile");
    private By actionEmailButton = By.id("action-email-btn");
    private By subjectInputFieldForEmail = By.id("subject");
    private By emailBodySpace = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable react-draggable-dragged']//div/div[5]/div[1]/div/div[1]");
    private By sendButtonForEmail = By.xpath("//div[@id='crm-draggable-wrapper']//button[1]/div[.='Send']");
    private By actionNoteButton = By.id("action-note-btn");
    private By actionTaskButton = By.id("action-task-btn");
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
    Button FinishButton = new Button(createAndReturnButton,"Click on the 'Finish' button");
    @Getter
    Button cancelButtonForNewContact =new Button(cancelButton,"Click on the 'Cancel' button");
    @Getter
    TextField SuccessPopUp = new TextField(successWindow,"Success pop-up window appears");
    @Getter
    Button CreateProfileDropdown = new Button(createProfileDropdown,"The 'Assigned profile' dropdown on the Contact landing page");
    @Getter
    Link CreateNewProfileLink = new Link(createNewProfileLink, "The '+Create new profile' link");
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


    @Step("Click on the 'Clients' tab in the sub menu")
    public ContactsPage clickOnClientsTabInSubmenu(){
        getClientsTab().clickTab();
        return this;
    }
    @Step("Click on the 'Personal' clients tab in the sub menu")
    public ContactsPage clickOnPersonalClientsTab(){
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
        getColleaguesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Underwriters' tab in the sub menu")
    public ContactsPage clickOnUnderwritersTab(){
        getUnderwritersTab().clickTab();
        return this;
    }
    @Step("Click on the first commercial contact from the 'Commercial clients' table")
    public ContactsPage clickOnFirstCommercialContactFromTeble(){
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
        DriverManager.WebDriverWait();
        getEnterContactPhoneNumber().setText(phone);
        System.out.println(phone);
        return this;
    }
    @Step("Click on the 'Create and return' button")
    public ContactsPage clickOnFinishButton(){
        getFinishButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public ContactsPage clickOnCancelButton(){
       getCancelButtonForNewContact().clickButton();
        return this;
    }
    @Step("Click on the 'Email' button from the Contact landing page")
    public ContactsPage clickOnEmailButton(){
        DriverManager.WebDriverWait();
        getActionEmailButton().clickButton();
        return this;
    }
    @Step("Enter the subject of the letter into the 'Subject' input field")
    public ContactsPage enterSubjectForEmail(String emailSubject){
        DriverManager.WebDriverWait();
        getSubjectInputFieldForEmail().setText(emailSubject);
        System.out.println(emailSubject);
        return this;
    }
    @Step("Enter the text into the Email")
    public ContactsPage enterDodyOfEmail(String text) {
        DriverManager.WebDriverWait();
        getEmailBodySpace().setText(text);
        System.out.println(text);
        return this;
    }
    @Step("Click on the 'Send' button for the new enail")
    public ContactsPage clickOnSendButtonForEmail(){
        DriverManager.WebDriverWait();
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
        getActionTaskButton().clickButton();
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
        DriverManager.WebDriverWait();
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
        DriverManager.WebDriverWait();
        getContactNameInTable().clickLink();
        return this;
    }
    @Step("Get header text of the contact's landing page")
    public ContactsPage contactLendingPage(){
        DriverManager.WebDriverWait();
        getContactLandingPage().getText();
        System.out.println();
        return this;
    }
    @Step("Click on the 'Edit contact' button")
    public ContactsPage clickOnEditContactButton(){
        DriverManager.WebDriverWait();
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
        DriverManager.WebDriverWait();
        getEnterContactPhoneNumber().clear();
        return this;
    }
    @Step("Click on the 'Companies' tab fromm the Contact landing page")
    public ContactsPage clickOnCompaniesTab(){
        getCompaniesTabOnContactLanding().clickTab();
        return this;
    }
}
