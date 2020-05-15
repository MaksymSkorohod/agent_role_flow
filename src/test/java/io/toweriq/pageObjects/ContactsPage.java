package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class ContactsPage extends AbstractPage{

    private By contactsPageHeader = By.xpath("//h1[text()='Contacts']");
    private By closeCreateContactModal = By.xpath("//div[@id='contact-dialog-title']//button[@type='button']");
    private By createContactButton = By.id("contactCreate");
    private By clientDropDownField = By.id("client");
    private By clientSearchField = By.id("select-client-search");
    private By createClientFromContact = By.id("selectBox-account");
    private By selectFirstClientFromDropDown = By.xpath("//div[@id='client']//div[@data-for='option-item_0']");
    private By contactFirstNameField = By.id("firstName");
    private By contactLastNameField = By.id("lastName");
    private By contactEmailField = By.id("email");
    private By contactPhoneNumberField = By.id("phone");
    private By createAndReturnButton = By.id("create-contact-button-confirm");
    private By cancelButton = By.id("create-contact-button-cancel");
    private By successWindow = By.xpath("//div[@role='presentation']/div[@role='document']");
    private By sendInviteButton = By.id("send-latter-button-modal");
    private By sendInviteLaterButton = By.id("cancel-button-modal");
    private By createNewProspectLink = By.id("selectBox-prospect");
    private By prospectNameField = By.id("name");
    private By createClientButton = By.id("create-contact-button-confirm");// the id need to be changed to "create-client-button-confirm"
    private By cancelCreateClientButton = By.id("create-client-button-cancel");
    private By backToContactLink = By.xpath("//div[@id='contact-dialog-title']/p");
    private By contactTable = By.id("contacts-table");
    private By contactNameInTable = By.xpath("//table[@id='contacts-table']/tbody/tr[1]/td[1]/div/a");
    private By contactLandingPageHeader = By.xpath("//div[@id='root']//h1");
    private By editContactButton = By.id("contactLandingEdit");
    private By updateContactButton = By.id("update-account-button-confirm");
    private By cancelUpdateContactButton = By.id("create-contact-button-cancel"); // the id need to be changed to "update-account-button-cancel"


    @Getter
    TextField ContactsPageHeader = new TextField(contactsPageHeader,"Header of the 'Contacts' page");
    @Getter
    Button CloseCreateContactModal = new Button(closeCreateContactModal,"Click on the 'x' button to close 'Create new contact' modal");
    @Getter
    Button CreateContactButton = new Button(createContactButton,"Click on the 'Create account' button");
    @Getter
    DropDownList ClickOnClientDropDownField = new DropDownList(clientDropDownField,"Click on the 'Client' drop-down field");
    @Getter
    InputField EnterClientNameForSearch = new InputField(clientSearchField,"Enter some text into account search");
    @Getter
    Button ClickOnCreateNewAccountLink = new Button(createClientFromContact,"Click on the '+Create new account' link");
    @Getter
    DropDownList SelectFirstOptionFromDropDown = new DropDownList(selectFirstClientFromDropDown,"Select the first client name from 'Client' drop-down field");
    @Getter
    InputField EnterContactFirstName = new InputField(contactFirstNameField,"Enter contact's first name into the 'First name' field");
    @Getter
    InputField EnterContactLastName = new InputField(contactLastNameField,"Enter contact's last name into the 'Last name' field");
    @Getter
    InputField EnterContactEmail = new InputField(contactEmailField,"Enter contact's email address into the 'Email address' field");
    @Getter
    InputField EnterContactPhoneNumber =new InputField(contactPhoneNumberField,"Enter contact's phone number into the 'Phone number' field");
    @Getter
    Button CreateAndReturnButton = new Button(createAndReturnButton,"Click on the 'Create and return' button");
    @Getter
    Button cancelButtonForNewContact =new Button(cancelButton,"Click on the 'Cancel' button");
    @Getter
    TextField SuccessPopUp = new TextField(successWindow,"Success pop-up window appears");
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
    TextField ContactLandingPageHeader = new TextField(contactLandingPageHeader, "Hearer of the contact landing page");
    @Getter
    Button EditContactButton = new Button(editContactButton,"Click on the 'Edit contact' button");
    @Getter
    Button UpdateContactButton = new Button(updateContactButton,"Click on the 'Update' button");
    @Getter
    Button CancelUpdateContactButton = new Button(cancelUpdateContactButton, "Click on the 'Cancel' button to cancel contact's update");


    @Step("Click on the 'Create contact' button")
    public ContactsPage clickOnCreateContactButton(){
        getCreateContactButton().clickButton();
        return this;
    }
    @Step("Click on the 'Client or prospect' drop-down field")
    public ContactsPage clickOnClientDropDownField(){
        DriverManager.WebDriverWait();
        getClickOnClientDropDownField().click();
        return this;
    }
    @Step("Enter text into the 'Search account' field")
    public ContactsPage enterTextIntoSearchAccountField(String text){
        DriverManager.WebDriverWait();
        getEnterClientNameForSearch().setText(text);
        return this;
    }
    @Step("Select the first option from the 'Client' drop-down list")
    public ContactsPage selectFirstOptionFromClientList(){
        getSelectFirstOptionFromDropDown().click();
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
    public ContactsPage clickOnCreateAndReturnButton(){
        getCreateAndReturnButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public ContactsPage clickOnCancelButton(){
       getCancelButtonForNewContact().clickButton();
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
    public ContactsPage contactHeaderText(){
        DriverManager.WebDriverWait();
        getContactLandingPageHeader().getText();
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
}
