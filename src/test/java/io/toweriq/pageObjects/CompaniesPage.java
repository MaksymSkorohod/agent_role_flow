package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompaniesPage extends AbstractPage {

    private By allCompaniesTab = By.id("All companies");
    private By allCompaniesPageHeader = By.xpath("//h1[text()='All Companies']");
    private By companiesPageHeaders = By.xpath("//div[@id='root']//div//h1");
    private By clientsCompaniesTab = By.id("Clients");
    private By agenciesTab = By.id("Agencies");
    private By carriersTab = By.id("Carriers");
    private By createNewCompanyButton = By.id("clientCreate");
    private By clientOptionBox = By.xpath("//div[@id='squareImagecheckBoxItemClient']/div[2]");
    private By otherOptionBox = By.xpath("//div[@id='squareImagecheckBoxItemOther']/div[2]");
    private By nextButtonCreate = By.id("createCompanyNext");
    private By clientNameField = By.id("clientName");
    private By lifecycleDropdown = By.id("lifecycleStage");
    private By insuredLifecycleStage = By.xpath("//div[@id='lifecycleStage']//div[text()='Insured']");
    private By leadLifecycleStage = By.xpath("//div[@id='lifecycleStage']//div[text()='Lead']");
    private By prospectLifecycleStage = By.xpath("//div[@id='lifecycleStage']//div[text()='Prospect']");
    private By websiteUrl = By.id("website");
    private By primaryContactDropdown = By.id("contact");
    private By selectContactSearchInput = By.id("select-contact-search");
    private By createNewContactLink = By.id("selectBox-Contact");
    private By primaryContactFirstNameField = By.id("firstName");
    private By primaryContactLastNameField = By.id("lastName");
    private By primaryContactEmailField = By.id("email");
    private By createPrimaryContactButton = By.id("createCompanyFinish");
    private By finishButton = By.id("createCompanyFinish");
    private By cancelButton = By.id("createCompanyCancel");
    private By companyCreationMessage = By.xpath("//div[@id='root']//div[@class='notification-message']//div[text() = 'company was created!']");
    private By companiesPageTable = By.id("companies-table");
    private By clientNameInTable = By.xpath("//table[@id='companies-table']/tbody/tr[1]/td[1]/div/a");
    private By secondClientNameInTable = By.xpath("//table[@id='accounts-table']/tbody/tr[2]/td[1]/div/a");
    private By firstRowInClientsTable = By.xpath("//table[@id='accounts-table']//tr[1]//td[1]");
    private By clientLandingPage = By.id("account-landing-page");
    private By clientEditButton = By.id("accountEdit");
    private By closeClientEditMode = By.id("create-client-button-cancel");
    private By contactTabCompanyLanding = By.id("transactionTabContacts");
    private By transactionsTabOfClient = By.id("transactionTabTransactions");
    private By subTabOtherContacts = By.id("transactionTabOtherContacts");
    private By createOtherContactButton = By.id("create-contact-button");
    private By createNewRolodexButton = By.xpath("//form[@id='select-rolodex-company-form']//div[2]/button");
    private By emailFieldForNewRolodex = By.id("email");
    private By firstNameFieldForNewRolodex = By.id("firstName");
    private By lastNameFieldForNewRolodex = By.id("lastName");
    private By phoneFieldForNewRolodex = By.id("phone");
    private By createContactFinishButton = By.id("createCompanyFinish");
    private By addTransactionButton = By.id("create-transaction-button");
    private By starTransactionModal = By.id("transaction-dialog-title");
    private By transactionNameField = By.id("transactionName");
    private By transactionTypeDropdownField = By.id("transactionType");
    private By newTransactionType = By.xpath("//*[@id=\"transactionType\"]/div[2]/div[1]");
    private By renewalTransaction = By.xpath("//*[@id=\"transactionType\"]/div[2]/div[2]");
    private By finishTransactionButton = By.id("createTSFinish");

    @Getter
    TextField AllCompaniesPageHeader = new TextField(allCompaniesPageHeader, "The 'Clients' label is visible");
    @Getter
    TextField CompaniesPageHeader = new TextField(companiesPageHeaders, "The 'Clients' label is visible");
    @Getter
    Tab AllCompaniesTab = new Tab(allCompaniesTab, "The 'All companies' tab on the 'Companies' page");
    @Getter
    Tab ClientsTab = new Tab(clientsCompaniesTab, "The 'Companies' tab on the 'Companies' page");
    @Getter
    Tab AgenciesTab = new Tab(agenciesTab, "The 'Agencies' tab on the 'Companies' page");
    @Getter
    Tab CarriersTab = new Tab (carriersTab, "The 'Carriers' tab on the 'Companies' page");
    @Getter
    Button CreateNewCompanyButton = new Button(createNewCompanyButton, "The 'New client' button");
    @Getter
    Button ClientOption = new Button(clientOptionBox, "The 'Client' option for select");
    @Getter
    Button OtherOption = new Button(otherOptionBox, "The 'Other' option for select");
    @Getter
    Button NextButton = new Button(nextButtonCreate, "The 'Next' button on the 'New company' modal slider");
    @Getter
    InputField ClientNameField = new InputField(clientNameField, "The 'Client name' field");
    @Getter
    Button LifecycleStageDropdown = new Button(lifecycleDropdown, "The 'Lifecycle stage' dropdown field");
    @Getter
    DropDownOption InsuredOption = new DropDownOption(insuredLifecycleStage, "The 'Insured' option from the 'Lifecycle stage' dropdown field");
    @Getter
    DropDownOption LeadOption = new DropDownOption(leadLifecycleStage, "The 'Lead' option from the 'Lifecycle stage' dropdown field");
    @Getter
    DropDownOption ProspectOption = new DropDownOption(prospectLifecycleStage, "The 'Prospect' option from the 'Lifecycle stage' dropdown field");
    @Getter
    InputField WebsiteUrl = new InputField(websiteUrl, "The 'Website URL' field");
    @Getter
    Button PrimaryContactDropdownField = new Button(primaryContactDropdown, "The 'Primary Contact' dropdown field");
    @Getter
    InputField SearchFieldForContacts = new InputField(selectContactSearchInput,"The 'Search' field in the 'Primary Contact' dropdown");
    @Getter
    Link CreateNewContactLink = new Link(createNewContactLink, "The '+Create new Contact' link in the 'Primary Contact' dropdown");
    @Getter
    InputField PrimaryContactFirstName = new InputField(primaryContactFirstNameField, "The 'First name' field");
    @Getter
    InputField PrimaryContactLastNameField = new InputField(primaryContactLastNameField,"The 'Last name' field");
    @Getter
    InputField PrimaryContactEmailField =new InputField(primaryContactEmailField, "The 'Email' field");
    @Getter
    Button CreateButtonForContact = new Button(createPrimaryContactButton, "The 'Create' button for new primary contact");
    @Getter
    Button FinishButton = new Button(finishButton,"The 'Finish' button");
    @Getter
    Button CancelButton = new Button(cancelButton, "The 'Cancel' button to close 'New Client' window");
    @Getter
    TextField SuccessCompanyCreationMessage = new TextField(companyCreationMessage,"The success message that the company was created");
    @Getter
    Button ClickOnFirstClientInTable = new Button(firstRowInClientsTable, "Selecting the third option from 'Client' drop-down field");
    @Getter
    Table CompaniesPageTable = new Table(companiesPageTable, "The table of the clients on the 'Companies' page");
    @Getter
    Link ClientNameInTable = new Link(clientNameInTable,"The client name in the table");
    @Getter
    Link SecondClientNameInTable = new Link(secondClientNameInTable,"The another client name in the table");
    @Getter
    TextField ClientsLandingPageHeader = new TextField(clientLandingPage,"Landing page header of the selected client");
    @Getter
    Button EditClientButton = new Button(clientEditButton,"The 'Edit client' button");
    @Getter
    Button CloseClientEditMode = new Button(closeClientEditMode,"The 'Cancel' button to close 'Edit client' window");
    @Getter
    Tab ContactTabCompanyLanding = new Tab (contactTabCompanyLanding, "The 'Contacts' tab on the company landing page");
    @Getter
    Tab SubTabOtherContacts = new Tab (subTabOtherContacts, "The 'Other contacts' sub tab on the company landing page");
    @Getter
    Button AddOtherContactButton = new Button(createOtherContactButton, "The 'Add contact' button on the 'Other contacts' sub tab on the company landing page");
    @Getter
    Button CreateNewRolodexButton = new Button(createNewRolodexButton, "The '+Create contact' button on the 'Associate others to company' modal window");
    @Getter
    InputField EmailFieldForNewRolodex = new InputField(emailFieldForNewRolodex, "The 'Email address' input field");
    @Getter
    InputField FirstNameFieldForNewRolodex = new InputField(firstNameFieldForNewRolodex, "The 'First name' input field");
    @Getter
    InputField LastNameFieldForNewRolodex = new InputField(lastNameFieldForNewRolodex, "The 'Last name' input field");
    @Getter
    InputField PhoneFieldForNewRolodex = new InputField(phoneFieldForNewRolodex, "The 'Phone number' input field");
    @Getter
    Button CreateContactFinishButton = new Button(createContactFinishButton, "The 'Finish' button for creating Rolodex user");
    @Getter
    Tab TransactionsTabOfClient = new Tab(transactionsTabOfClient, "The 'Transactions' tab on the company landing page");
    @Getter
    Button AddTransactionButton = new Button(addTransactionButton, "The '+Add transaction' button on the 'Transactions' tab at the company landing page");
    @Getter
    TextField StarTransactionModal = new TextField(starTransactionModal,"The 'Start a transaction' modal window");
    @Getter
    InputField TransactionNameField = new InputField(transactionNameField, "The 'Transaction' input field");
    @Getter
    Link TransactionTypeDropdownField = new Link(transactionTypeDropdownField,"The 'Transaction type' dropdown field");
    @Getter
    Link NewTransactionType = new Link(newTransactionType, "The 'New transaction' type");
    @Getter
    Link RenewalTransactionType = new Link(renewalTransaction, "The 'Renewal' transaction type");
    @Getter
    Button FinishTransactionButton = new Button(finishTransactionButton, "The 'Finish' button to complete creation of the transaction");

    @Step("Click on the 'All companies' tab from the 'Companies' page")
    public CompaniesPage clickOnAllCompaniesTab(){
        getAllCompaniesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Clients' tab from the 'Companies' page")
    public CompaniesPage clickOnClientsTab(){
        getClientsTab().clickTab();
        return this;
    }
    @Step("Click on the 'Agencies' tab from the 'Companies' page")
    public CompaniesPage clickOnAgenciesTab(){
        getAgenciesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Carriers' tab from the 'Companies' page")
    public CompaniesPage clickOnCarriersTab(){
        getCarriersTab().clickTab();
        return this;
    }
    @Step("Click on the 'Create Company' button")
    public CompaniesPage clickOnCompanyCreateButton(){
        getCreateNewCompanyButton().clickButton();
        return this;
    }
    @Step("Select the 'Client' option")
    public CompaniesPage selectClientOption(){
        getClientOption().clickButton();
        return this;
    }
    @Step("Select the 'Other' option")
    public CompaniesPage selectOtherOption(){
        getOtherOption().clickButton();
        return this;
    }
    @Step("Click on the 'Next' button")
    public CompaniesPage clickNextButton(){
        getNextButton().clickButton();
        return this;
    }
    @Step("Enter the name of the company into the 'Client name' field")
    public CompaniesPage typeClientName(String clientName) {
        getClientNameField().setText(clientName);
        System.out.println(clientName);
        return this;
    }
    @Step("Click on the 'Lifecycle stage' dropdown field")
    public CompaniesPage clickLifecycleDropdown(){
        getLifecycleStageDropdown().clickButton();
        return this;
    }
    @Step("Select the 'Insured' stage")
    public CompaniesPage selectInsuredStage(){
        getInsuredOption().clickOption();
        return this;
    }
    @Step("Select the 'Lead' stage")
    public CompaniesPage selectLeadStage(){
        getLeadOption().clickOption();
        return this;
    }
    @Step("Select the 'Prospect' stage")
    public CompaniesPage selectProspectStage(){
        getProspectOption().clickOption();
        return this;
    }
    @Step("Enter Url of the company website into the 'Website URL' field")
    public CompaniesPage typeUrl(String url){
        getWebsiteUrl().setText(url);
        return this;
    }
    @Step("The 'Primary Contact' dropdown field")
    public CompaniesPage clickPrimaryContactDropdown(){
        getPrimaryContactDropdownField().clickButton();
        return this;
    }
    @Step("Enter some name into the 'Search' field the 'Primary Contact' dropdown field")
    public CompaniesPage typeSomeNameInSearchField(String name){
        getSearchFieldForContacts().setText(name);
        System.out.println(name);
        return this;
    }
    @Step("Click on the '+Create new Contact' link from the 'Primary Contact' dropdown")
    public CompaniesPage clickCreateNewContactLink(){
        getCreateNewContactLink().clickLink();
        return this;
    }
    @Step("Enter the first name of the primary contact")
    public CompaniesPage typeFirsNameForPrimaryContact(String name){
        getPrimaryContactFirstName().setText(name);
        System.out.println(name);
        return this;
    }
    @Step("Enter the last name of the primary contact")
    public CompaniesPage typeLastNameForPrimaryContact(String lastName){
        getPrimaryContactLastNameField().setText(lastName);
        System.out.println(lastName);
        return this;
    }
    @Step("Enter the email address of the primary contact")
    public CompaniesPage typeEmailForPrimaryContact(String email){
        getPrimaryContactEmailField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Click on the 'Create' button to create the primary contact user")
    public CompaniesPage clickCreateForPrimaryContact(){
        getCreateButtonForContact().clickButton();
        return this;
    }
    @Step("Click on the 'Finish' button")
    public CompaniesPage clickOnFinishButton(){
        DriverManager.WebDriverWait();
        getFinishButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public CompaniesPage clickOnCancelButton(){
        getCancelButton().clickButton();
        return this;
    }
    @Step("The success message that the new Company was creates")
    public void checkSuccessCompanyCreated(String expected){
        DriverManager.WebDriverWait();
        String actual = getSuccessCompanyCreationMessage().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is:" +expected);
        Assert.assertEquals(actual,expected);
    }
    @Step("Click on the client name from the table")
    public CompaniesPage clickOnClientFromTable(){
        getClientNameInTable().clickLink();
        return this;
    }
    @Step("Click on the client name from the table")
    public CompaniesPage clickOnAnotherClientFromTable(){
        getSecondClientNameInTable().clickLink();
        return this;
    }
    @Step("Click on the 'Edit client' button from the client landing page")
    public CompaniesPage clickOnEditClientButton(){
        getEditClientButton().clickButton();
        return  this;
    }
    @Step("Click on the 'X' button to close 'Edit client' window")
    public CompaniesPage clickOnXButton(){
        DriverManager.WebDriverWait();
        getCloseClientEditMode().clickButton();
        return this;
    }

    @Step("Click on the 'Contacts' tab from the company landing page")
    public CompaniesPage clickContactsTabFromCompanyLandingPage(){
        getContactTabCompanyLanding().clickTab();
        return this;
    }
    @Step("Click on the 'Other Contacts' sub tab from the company landing page")
    public CompaniesPage clickOtherContactsFromCompanyLandingPage(){
        getSubTabOtherContacts().clickTab();
        return this;
    }
    @Step("Click on the 'Add contact' button from the 'Other contacts' sub tab")
    public CompaniesPage clickAddContactFromOtherContactsSubTab(){
        getAddOtherContactButton().clickButton();
        return this;
    }
    @Step("Click on the '+ Create contact' button from the 'Associate others to company' modal window")
    public CompaniesPage clickCreateContactFromAssociateOthersCompany(){
        getCreateNewRolodexButton().clickButton();
        return this;
    }
    @Step("Enter email address for a new Rolodex user")
    public CompaniesPage enterEmailAddressOfNewRolodexUser(String email){
        getEmailFieldForNewRolodex().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Enter the First name for the Rolodex user")
    public CompaniesPage enterFirstNameRolodex(String name){
        getFirstNameFieldForNewRolodex().setText(name);
        System.out.println(name);
        return this;
    }
    @Step("Enter the Last name for the Rolodex user")
    public CompaniesPage enterLastNameRolodex(String lastName){
        getLastNameFieldForNewRolodex().setText(lastName);
        System.out.println(lastName);
        return this;
    }
    @Step("Enter the phone number for the Rolodex user")
    public CompaniesPage enterPhoneRolodex(String phone){
        getPhoneFieldForNewRolodex().setText(phone);
        System.out.println(phone);
        return this;
    }
    @Step("Click on the 'Finish' button to finish creating new Rolodex user")
    public CompaniesPage clickFinishButtonForRolodex(){
        getCreateContactFinishButton().clickButton();
        return this;
    }

    @Step("Click on the 'Transactions' tab from the company landing page")
    public CompaniesPage clickOnTransactionsTabOnCompanyLandingPage(){
        getTransactionsTabOfClient().clickTab();
        return this;
    }
    @Step("Click on the '+Add transaction' from the 'Transactions' tab at the company landing page")
    public CompaniesPage clickOnAddTransaction(){
        getAddTransactionButton().clickButton();
        return this;
    }
    @Step("Enter the transaction name into the 'Transaction name' input field")
    public CompaniesPage enterTransactionName(String transactionName){
        getTransactionNameField().setText(transactionName);
        System.out.println(transactionName);
        return this;
    }
    @Step("Click on the 'Transaction type' dropdown field")
    public CompaniesPage clickOnTransactionTypeDropdownField(){
        getTransactionTypeDropdownField().clickLink();
        return this;
    }
    @Step("Select the 'New business' option inside the 'Transaction type' dropdown field")
    public CompaniesPage selectNewBusinessType(){
        getNewTransactionType().clickLink();
        return this;
    }
    @Step("Select the 'Renewal' option inside the 'Transaction type' dropdown field")
    public CompaniesPage selectRenewalType(){
        getRenewalTransactionType().clickLink();
        return this;
    }
    @Step("Click on the 'Finish' button to complete the transaction creation")
    public CompaniesPage clickOnFinishTransactionButton(){
        DriverManager.WebDriverWait();
        getFinishTransactionButton().clickButton();
        return this;
    }

}
