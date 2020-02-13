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
    private By clientNameInTable = By.xpath("//table[@id='accounts-table']/tbody/tr[1]/td[1]/div/a");
    private By secondClientNameInTable = By.xpath("//table[@id='accounts-table']/tbody/tr[2]/td[1]/div/a");
    private By firstRowInClientsTable = By.xpath("//table[@id='accounts-table']//tr[1]//td[1]");
    private By clientLandingPageHeader = By.xpath("//div[@id='root']//h1");
    private By clientEditButton = By.id("accountEdit");
    private By editClientDialogWindow = By.xpath("//div[@role='presentation']/div[@role='document']/div[@role='dialog']");
    private By closeClientEditMode = By.xpath("//div[@id='account-dialog-title']//button[@type='button']");
    private By newPolicyLink = By.id("accountNewPolicy");
    private By createPolicyFromTransaction = By.id("connectionType0");
    private By createPolicyManual = By.id("connectionType1");
    private By createPolicyCancelButton = By.id("create-policy-button-cancel");
    private By createPolicyNextButton = By.id("create-policy-button-next");
    private By policyNumberField = By.id("policy-number");
    private By carrierDropdownField = By.id("carrier");
    private By carrierDropDownSearchField = By.id("select-carrier-search");
    private By carrierNameOption = By.xpath("//div[@id='carrier']//div[text()='21st Century Insurance']");
    private By lineOfBusinessDropDown = By.id("lineOfBusinessesList");
    private By lineOfBusinessOption = By.xpath("//div[@id='lineOfBusinessesList']//div[4]");
    private By policyInceptionDate = By.xpath("//form[@id='new-policy-form']//div[@class='calendar-container']/div[@class='input-calendar']");
    private By todayButtonForInceptionDate = By.xpath("//form[@id='new-policy-form']//span[@class='today-btn']");
    private By policyExpirationDate = By.xpath("//form[@id='new-policy-form']//div[8]//div[@class='input-calendar']");
    private By nextMonthController = By.xpath("//form[@id='new-policy-form']//div[@class='input-calendar']//span[3]");
    private By currentDate = By.cssSelector(".cell.current.day");
    private By uploadPolicyDocumentButton = By.id("tlAttachFile");
    private By attachedPDFFile = By.xpath("//form[@id='new-account-form']//p[@title='General-Liability-Quote-Example.pdf']");
    private By attachFileConfirm = By.id("attachFileConfirm");
    private By binderFileOption = By.id("connectionType0");
    private By policyFileOption = By.id("connectionType1");
    private By confirmFileType = By.id("confirm-file-type");
    private By closeFileConfirm = By.id("go-back");
    private By premiumInputField = By.id("premium");
    private By aggregateLimitInputField = By.id("aggregate-limit");
    private By deductibleInputField = By.id("deductible");
    private By createPolicyPreviousButton = By.id("previous");
    private By createPolicyConfirmButton = By.id("create-policy-button-confirm");


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
    Link SecondClientNameInTable = new Link(secondClientNameInTable,"The another client name in the table");
    @Getter
    TextField ClientLandingPageHeader = new TextField(clientLandingPageHeader,"Landing page hearer of the selected client");
    @Getter
    Button EditClientButton = new Button(clientEditButton,"The 'Edit client' button");
    @Getter
    Button CloseClientEditMode = new Button(closeClientEditMode,"The 'X' button to close 'Edit client' window");
    @Getter
    DialogContainer EditClientDialogWindow = new DialogContainer(editClientDialogWindow,"The 'Edit client' window");
    @Getter
    Link NewPolicyLink = new Link(newPolicyLink,"The 'New policy' link on the client landing page");
    @Getter
    Link CreatePolicyFromTransaction = new Link(createPolicyFromTransaction, "Create the new policy from the transaction option");
    @Getter
    Link CreatePolicyManual = new Link(createPolicyManual, "Create the new policy from the manual input");
    @Getter
    Button CreatePolicyCancelButton = new Button(createPolicyCancelButton, "The 'Cancel' button for creating a new policy");
    @Getter
    Button CreatePolicyNextButton = new Button(createPolicyNextButton, "The 'Next' button to continue creating the policy");
    @Getter
    InputField PolicyNumberField = new InputField(policyNumberField,"The 'Policy number' input field");
    @Getter
    DropDownList CarrierDropdownField = new DropDownList(carrierDropdownField, "The 'Carrier' drop-down field");
    @Getter
    InputField CarrierDropDownSearchField = new InputField(carrierDropDownSearchField,"The carrier drop-down search input field");
    @Getter
    DropDownOption CarrierNameOption = new DropDownOption(carrierNameOption, "The option of the carriers in the 'Carrier' drop-down field");
    @Getter
    DropDownList LineOfBusinessDropDown = new DropDownList(lineOfBusinessDropDown, "The 'Lines of Businesses' drop-down field");
    @Getter
    DropDownOption LineOfBusinessOption = new DropDownOption(lineOfBusinessOption, "The option of the business lines in the 'Lines of Businesses' drop-down field");
    @Getter
    DialogContainer PolicyInceptionDate = new DialogContainer(policyInceptionDate, "The 'Inception' date picker field");
    @Getter
    Button TodayButtonForInceptionDate = new Button(todayButtonForInceptionDate, "The 'Today' button for the 'Inception' date picker field");
    @Getter
    DialogContainer PolicyExpirationDate = new DialogContainer(policyExpirationDate, "The 'Expiration' date picker field");
    @Getter
    Button NextMonthController = new Button(nextMonthController, "The next month button for the 'Expiration' date picker field");
    @Getter
    Link CurrentDate = new Link(currentDate, "Current date sell");
    @Getter
    Button UploadPolicyDocumentButton = new Button(uploadPolicyDocumentButton, "The 'Attach files' button");
    @Getter
    Link AttachedPDFFile = new Link(attachedPDFFile, "Uploaded PDF file");
    @Getter
    Button AttachFileConfirm = new Button(attachFileConfirm,"The 'Attach file' button");
    @Getter
    Link BinderFileOption = new Link(binderFileOption, "The Binder file option");
    @Getter
    Link PolicyFileOption = new Link(policyFileOption, "The Policy file option");
    @Getter
    Button ConfirmFileType = new Button(confirmFileType, "The 'Confirm file type' button");
    @Getter
    Button CloseFileConfirm =new Button(closeFileConfirm, "The 'Close' button for the 'What type of file is this?' modal window");
    @Getter
    InputField PremiumInputField = new InputField(premiumInputField, "The 'Premium' input field");
    @Getter
    InputField AggregateLimitInputField = new InputField(aggregateLimitInputField, "The 'Aggregate limit' input field");
    @Getter
    InputField DeductibleInputField = new InputField(deductibleInputField, "The 'Deductible' input field");
    @Getter
    Button CreatePolicyPreviousButton = new Button(createPolicyPreviousButton, "The 'Previous' button");
    @Getter
    Button CreatePolicyConfirmButton = new Button(createPolicyConfirmButton, "The 'Create policy' button to finish policy creation");


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
    @Step("Click on the client name from the table")
    public ClientsPage clickOnAnotherClientFromTable(){
        getSecondClientNameInTable().clickLink();
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
    @Step("Click on the 'New policy' link from the client landing page")
    public ClientsPage clickOnNewPolicy(){
        DriverManager.WebDriverWait();
        getNewPolicyLink().clickLink();
        return  this;
    }
    @Step("Select 'From transaction' option for the creation of the new policy")
    public ClientsPage selectFromTransactionOption(){
        DriverManager.WebDriverWait();
        getCreatePolicyFromTransaction().clickLink();
        return this;
    }
    @Step("Select 'Manual input' option for the creation of the new policy")
    public ClientsPage selectFromManualInput(){
        DriverManager.WebDriverWait();
        getCreatePolicyManual().clickLink();
        return this;
    }
    @Step("Click on the 'Cancel' button for creating a new policy")
    public ClientsPage clickCancelForCreatePolicy(){
        getCreatePolicyCancelButton().clickButton();
        return this;
    }
    @Step("Click on the 'Next' button to continue creating a new policy")
    public ClientsPage clickNextToCreatePolicy(){
        getCreatePolicyNextButton().clickButton();
        return this;
    }
    @Step("Enter the number of the policy into the 'Policy Number' field")
    public ClientsPage typePolicyNumber(String policyNumber){
        getPolicyNumberField().setText(policyNumber);
        System.out.println(policyNumber);
        return this;
    }
    @Step("Click on the 'Carrier' dropdown field")
    public ClientsPage clickCarrierDropDown(){
        getCarrierDropdownField().click();
        return this;
    }
    @Step("Enter carrier name into the search field for the 'Carrier' dropdown")
    public ClientsPage searchFieldForCarriers(String carrier){
        DriverManager.WebDriverWait();
        getCarrierDropDownSearchField().setText(carrier);
        return this;
    }
    @Step("Select the carrier option")
    public ClientsPage selectCarrier(){
        DriverManager.WebDriverWait();
        getCarrierNameOption().clickOption();
        return this;
    }
    @Step("Click on the 'Line of Business' drop-down field")
    public ClientsPage clickLineOfBusinessDropDown(){
        getLineOfBusinessDropDown().click();
        return this;
    }
    @Step("Select the line of business option")
    public ClientsPage selectLineOfBusiness(){
        DriverManager.WebDriverWait();
        getLineOfBusinessOption().clickOption();
        return this;
    }
    @Step("Click on the 'Inception' date picker")
    public ClientsPage clickInceptionDatePicker(){
        getPolicyInceptionDate().click();
        return this;
    }
    @Step("Click on the 'Today' button")
    public ClientsPage clickTodayButton(){
        DriverManager.WebDriverWait();
        getTodayButtonForInceptionDate().clickButton();
        return  this;
    }
    @Step("Click on the 'Expiration' date picker")
    public ClientsPage clickExpirationDatePicker(){
        getPolicyExpirationDate().click();
        return this;
    }
    @Step("Click on the next month button")
    public ClientsPage clickNextMonth(){
        DriverManager.WebDriverWait();
        getNextMonthController().clickButton();
        return this;
    }
    @Step("Select current date of the next month")
    public ClientsPage selectCurrentDate(){
        DriverManager.WebDriverWait();
        getCurrentDate().clickLink();
        return this;
    }
    @Step("Click on the 'Attach files' button")
    public ClientsPage clickAttachFilesButton(){
        getUploadPolicyDocumentButton().clickButton();
        return this;
    }
    @Step("Select PDF file from the 'Recent files' page")
    public ClientsPage choosePdfFile(){
        getAttachedPDFFile().clickLink();
        return this;
    }
    @Step("Click on the 'Attach file' button")
    public ClientsPage clickAttachFileButton(){
        getAttachFileConfirm().clickButton();
        return this;
    }
    @Step("Select 'Binder file' type")
    public ClientsPage selectBinderFile(){
        getBinderFileOption().clickLink();
        return this;
    }
    @Step("Select 'Policy file' type")
    public ClientsPage selectPolicyFile(){
        getPolicyFileOption().clickLink();
        return this;
    }
    @Step("Click on the 'Confirm file type' button")
    public ClientsPage clickConfirmFileType(){
        getConfirmFileType().clickButton();
        return this;
    }
    @Step("Enter text the sum into 'Premium' field")
    public ClientsPage typePremiumSum(String text){
        getPremiumInputField().setText(text);
        return this;
    }
    @Step("Enter text the sum into 'Aggregate limit' field")
    public ClientsPage typeAggregateLimitSum(String text){
        getAggregateLimitInputField().setText(text);
        return this;
    }
    @Step("Enter text the sum into 'Deductible' field")
    public ClientsPage typeDeductibleSum(String text){
        getDeductibleInputField().setText(text);
        return this;
    }
    @Step("Click on the 'Previous' button")
    public ClientsPage previousButton(){
        getCreatePolicyPreviousButton().clickButton();
        return this;
    }
    @Step("Click 'Create policy' button to confirm policy creation")
    public ClientsPage confirmPolicyCreationButton(){
        getCreatePolicyConfirmButton().clickButton();
        return this;
    }
}
