package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ClientsPage extends AbstractPage {

    private By clientsPageHeader = By.xpath("//h1[text()='Clients']");
    private By createNewClientButton = By.id("clientCreate");
    private By clientNameField = By.id("clientName");
    private By websiteUrl = By.id("website");
    private By primaryContactFirstNameField = By.id("firstName");
    private By primaryContactLastNameField = By.id("lastName");
    private By primaryContactEmailField = By.id("email");
    private By createAndReturnButton = By.id("create-contact-button-confirm");
    private By closeButton = By.cssSelector("div#account-dialog-title svg[role='img'] > path");
    private By firstNameFieldIsRequired = By.xpath("//*[@id='new-client-form']/div[1]/div[2]/div[1]/div[text()='This field is required']");
    private By lastNameFieldIsRequired = By.xpath("//*[@id='new-client-form']/div[1]/div[2]/div[2]/div[text()='This field is required']");
    private By emailFieldIsRequired = By.xpath("//*[@id='new-client-form']/div[1]/div[2]/div[3]/div[text()='This field is required']");
    private By notValidContactEmailAddress = By.xpath("//*[@id='new-client-form']/div[1]/div[2]/div[3]/div[text()='Contact email is not valid']");
    private By contactOnLandingPage = By.xpath("//h3[.='Primary contact']");
    private By clientsTable = By.id("accounts-table");
    private By clientNameInTable = By.xpath("//table[@id='accounts-table']/tbody/tr[1]/td[1]/div/a");
    private By firstRowInClientsTable = By.xpath("//table[@id='accounts-table']//tr[1]//td[1]");
    private By clientLandingPageHeader = By.xpath("//div[@id='root']//h1");
    private By clientEditButton = By.id("accountEdit");
    private By editClientDialogWindow = By.xpath("//div[@role='presentation']/div[@role='document']/div[@role='dialog']");
    private By closeClientEditMode = By.xpath("//div[@id='account-dialog-title']//button[@type='button']");

    @Getter
    TextField ClientsPageHeader = new TextField(clientsPageHeader, "The 'Clients' label is visible");
    @Getter
    Button CreateNewClientButton = new Button(createNewClientButton, "The 'New client' button");
    @Getter
    InputField ClientNameField = new InputField(clientNameField, "The 'Client name' field");
    @Getter
    InputField AccountWebsite = new InputField(websiteUrl, "The 'Website URL' field");
    @Getter
    InputField PrimaryContactFirstName = new InputField(primaryContactFirstNameField, "The 'First name' field");
    @Getter
    InputField PrimaryContactLastNameField = new InputField(primaryContactLastNameField,"The 'Last name' field");
    @Getter
    InputField PrimaryContactEmailField =new InputField(primaryContactEmailField, "The 'Email' field");
    @Getter
    Button CreateAndReturnButton = new Button(createAndReturnButton,"The 'Create and return' button");
    @Getter
    Button CloseNewClientWindowButton = new Button(closeButton, "The 'X' button to close 'New Client' window");
    @Getter
    TextField TheFirstNameFieldIsRequired = new TextField(firstNameFieldIsRequired, "Message 'This field is required' for the 'First name' field");
    @Getter
    TextField TheLastNameFieldIsRequired = new TextField(lastNameFieldIsRequired, "Message 'This field is required' for the 'Last name' field");
    @Getter
    TextField TheEmailFieldIsRequired = new TextField(emailFieldIsRequired, "This field is required");
    @Getter
    TextField TheEmailIsNotValidForContact = new TextField(notValidContactEmailAddress, "Contact email is not valid");
    @Getter
    TextField ThePrimaryContactBlock = new TextField(contactOnLandingPage,"The client's landing page is visible");
    @Getter
    Button ClickOnFirstClientInTable = new Button(firstRowInClientsTable, "Selecting the third option from 'Client' drop-down field");
    @Getter
    Link ClientNameInTable = new Link(clientNameInTable,"The client name in the table");
    @Getter
    TextField ClientLandingPageHeader = new TextField(clientLandingPageHeader,"Landing page hearer of the selected client");
    @Getter
    Button EditClientButton = new Button(clientEditButton,"The 'Edit client' button");
    @Getter
    Button CloseClientEditMode = new Button(closeClientEditMode,"The 'X' button to close 'Edit client' window");
    @Getter
    DialogContainer EditClientDialogWindow = new DialogContainer(editClientDialogWindow,"The 'Edit client' window");

    @Step("Click on the 'New client' button")
    public ClientsPage clickOnClientCreateButton(){
        getCreateNewClientButton().clickButton();
        return this;
    }
    @Step("Enter the name of the company into the 'Client name' field")
    public ClientsPage typeClientName(String clientName) {
        getClientNameField().setText(clientName);
        System.out.println(clientName);
        return this;
    }
    @Step("Enter Url of the company website into the 'Website URL' field")
    public ClientsPage typeUrl(String url){
        getAccountWebsite().setText(url);
        return this;
    }
    @Step("Enter the first name of the primary contact")
    public ClientsPage typeFirsNameForPrimaryContact(String name){
        getPrimaryContactFirstName().setText(name);
        System.out.println(name);
        return this;
    }
    @Step("Enter the last name of the primary contact")
    public ClientsPage typeLastNameForPrimaryContact(String lastName){
        getPrimaryContactLastNameField().setText(lastName);
        System.out.println(lastName);
        return this;
    }
    @Step("Enter the email address of the primary contact")
    public ClientsPage typeEmailForPrimaryContact(String email){
        getPrimaryContactEmailField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Click on the 'Create and return' button")
    public ClientsPage clickOnCreateAndReturnButton(){
        DriverManager.WebDriverWait();
        getCreateAndReturnButton().clickButton();
        return this;
    }
    @Step("Click on the 'X' button")
    public ClientsPage clickOnCloseButton(){
        getCloseNewClientWindowButton().clickButton();
        return this;
    }
    @Step("The warning message for 'First name' field for the primary contact is shown")
    public void  checkFirstNameFieldWarningText(String expected) {
        String actual = getTheFirstNameFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Last name' field for the primary contact is shown")
    public void  checkLastNameFieldWarningText(String expected) {
        String actual = getTheLastNameFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Email' field for the primary contact is shown")
    public void  checkEmailFieldWarningText(String expected) {
        String actual = getTheEmailFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Email' field for the primary contact is shown")
    public void  checkEmailErrorMessage(String expected) {
        String actual = getTheEmailIsNotValidForContact().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("Click on the client name from the table")
    public ClientsPage clickOnClientFromTable(){
        getClientNameInTable().clickLink();
        return this;
    }
    @Step("Click on the 'Edit client' button from the client landing page")
    public ClientsPage clickOnEditClientButton(){
        getEditClientButton().clickButton();
        return  this;
    }
    @Step("Click on the 'X' button to close 'Edit client' window")
    public ClientsPage clickOnXButton(){
        DriverManager.WebDriverWait();
        getCloseClientEditMode().clickButton();
        return this;
    }

}
