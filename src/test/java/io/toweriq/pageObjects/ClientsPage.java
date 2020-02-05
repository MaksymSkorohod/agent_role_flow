package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.TextField;
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
    private By firstRowInClientsTable = By.xpath("//table[@id='accounts-table']//tr[1]//td[1]");



    @Getter
    TextField ClientsPageHeader = new TextField(clientsPageHeader, "The 'Clients' label is visible");
    @Getter
    Button CreateNewClientButton = new Button(createNewClientButton, "Click on the 'New client' button");
    @Getter
    InputField ClientNameField = new InputField(clientNameField, "Client name");
    @Getter
    InputField AccountWebsite = new InputField(websiteUrl, "Website URL");
    @Getter
    InputField PrimaryContactFirstName = new InputField(primaryContactFirstNameField, "First name");
    @Getter
    InputField PrimaryContactLastNameField = new InputField(primaryContactLastNameField,"Last name");
    @Getter
    InputField PrimaryContactEmailField =new InputField(primaryContactEmailField, "Email");
    @Getter
    Button CreateAndReturnButton = new Button(createAndReturnButton,"Click on the 'Create and return' button");
    @Getter
    Button CloseNewClientWindowButton = new Button(closeButton, "Click on 'X' button to close 'New Client' window");
    @Getter
    TextField TheFirstNameFieldIsRequired = new TextField(firstNameFieldIsRequired, "This field is required");
    @Getter
    TextField TheLastNameFieldIsRequired = new TextField(lastNameFieldIsRequired, "This field is required");
    @Getter
    TextField TheEmailFieldIsRequired = new TextField(emailFieldIsRequired, "This field is required");
    @Getter
    TextField TheEmailIsNotValidForContact = new TextField(notValidContactEmailAddress, "Contact email is not valid");
    @Getter
    TextField ThePrimaryContactBlock = new TextField(contactOnLandingPage,"The client's landing page is visible");
    @Getter
    Button ClickOnFirstClientInTable = new Button(firstRowInClientsTable, "Selecting the third option from 'Client' drop-down field");


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
}
