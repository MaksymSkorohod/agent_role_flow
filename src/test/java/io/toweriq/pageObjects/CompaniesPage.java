package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class CompaniesPage extends AbstractPage {

    private By allCompaniesTab = By.id("All companies");
    private By allCompaniesPageHeader = By.xpath("//h1[text()='All Companies']");
    private By companiesPageHeaders = By.xpath("//div[@id='root']//div//h1");
    private By clientsCompaniesTab = By.id("Clients");
    private By agenciesTab = By.id("Agencies");
    private By carriersTab = By.id("Carriers");
    private By createNewCompanyButton = By.id("clientCreate");
    private By clientOptionBox = By.xpath("//div[@id='squareImagecheckBoxItemClient']/div");
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
    private By secondClientNameInTable = By.xpath("//table[@id='companies-table']/tbody/tr[2]/td[1]/div/a");
    private By firstRowInClientsTable = By.xpath("//table[@id='accounts-table']//tr[1]//td[1]");
    private By clientLandingPage = By.id("account-landing-page");
    private By clientEditButton = By.id("accountEdit");
    private By closeClientEditMode = By.id("create-client-button-cancel");
    private By clientInformationTab = By.xpath("//div[@id='transactionTabClientInformation']/p");
    private By schedulesDropDown = By.cssSelector("div:nth-of-type(2) > button#tabDropDown");
    private By schedulesOption = By.xpath("//body/div[@role='tooltip']/div/div[1]/div[text()='Schedules']");
    private By clientActionButton = By.id("clientActionsButton");
    private By addSchedule = By.xpath("//body/div[@role='tooltip']//div[text()='Add schedule']");
    private By createScheduleModal = By.id("schedule-dialog-title");
    private By blankScheduleOption = By.id("type0");
    private By createScheduleNextButton = By.id("create-schedule-button-next");
    private By searchFieldForSchedules = By.id("tiq-unknown-search-input");
    private By firstScheduleInTheList = By.xpath("//*[@id=\"73456669776131547321349741207\"]");
    private By scheduleNameInputField = By.id("schedule-name");
    private By scheduleDescriptionInputField = By.id("schedule-description");
    private By createScheduleButton = By.id("create-schedule-button-cancel");
    private By contactTabCompanyLanding = By.id("transactionTabContacts");
    private By transactionsTabOfClient = By.id("transactionTabTransactions");
    private By subTabClientContacts = By.id("transactionTabClientContacts");
    private By subTabOtherContacts = By.id("transactionTabOtherContacts");
    private By createContactButton = By.id("create-client-contact-button");
    private By createNewRolodexButton = By.xpath("//form[@id='select-rolodex-company-form']//div[2]/button");
    private By emailFieldForNewRolodex = By.id("email");
    private By firstNameFieldForNewRolodex = By.id("firstName");
    private By lastNameFieldForNewRolodex = By.id("lastName");
    private By phoneFieldForNewRolodex = By.id("phone");
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
    private By createContactFinishButton = By.xpath("//*[@id=\"createCompanyFinish\"]/div[text()='Save changes']");
    private By addTransactionButton = By.id("create-transaction-button");
    private By starTransactionModal = By.id("transaction-dialog-title");
    private By transactionTypeDropdownField = By.id("transactionType");
    private By associatedYearDropdown = By.id("transactionYear");
    private By optionsListTransactionYear = By.id("optionsList_transactionYear");
    private By associatedYear2021 = By.id("2021");
    private By associatedYear2022 = By.id("2022");
    private By associatedYear2023 = By.id("2023");
    private By transactionTypeDropdown = By.id("transactionType");
    private By newBusinessOption = By.id("New_business");
    private By renewalOption = By.id("Renewal");
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
    Button ClientInformationTab = new Button(clientInformationTab, "The 'Client information' tab on the company landing page");
    @Getter
    Button SchedulesDropDown = new Button(schedulesDropDown, "The 'Schedule' dropdown button");
    @Getter
    Button SchedulesOption = new Button(schedulesOption,"The 'Schedule' option in the 'Schedule' dropdown");
    @Getter
    Button ClientActionButton = new Button(clientActionButton, "The 'Action' button");
    @Getter
    Button AddSchedule = new Button(addSchedule, "The 'Add schedule' button");
    @Getter
    TextField CreateScheduleModal = new TextField(createScheduleModal,"The 'Create schedule' title");
    @Getter
    Button BlankScheduleOption = new Button(blankScheduleOption, "The 'Blank schedule' option in the 'Create schedule' modal");
    @Getter
    Button CreateScheduleNextButton = new Button(createScheduleNextButton, "The 'Next' button on the 'Create schedule' modal");
    @Getter
    InputField SearchFieldForSchedules = new InputField(searchFieldForSchedules,"The search field for the schedules on the 'Create schedule' modal window");
    @Getter
    Button FirstScheduleInTheList = new Button(firstScheduleInTheList, "The first schedule in the list on the 'Create schedule' modal");
    @Getter
    InputField ScheduleNameInputField = new InputField(scheduleNameInputField,"The 'Schedule name' input field");
    @Getter
    InputField ScheduleDescriptionInputField = new InputField(scheduleDescriptionInputField, "The 'Schedule description' input field");
    @Getter
    Button CreateScheduleButton = new Button(createScheduleButton,"The 'Create schedule' button on the 'Create schedule' modal window");
    @Getter
    Tab ContactTabCompanyLanding = new Tab (contactTabCompanyLanding, "The 'Other contacts' sub tab on the company landing page");
    @Getter
    Tab SubTabClientContacts = new Tab (subTabClientContacts,"The 'Client contacts' sub tab on the company landing page");
    @Getter
    Tab SubTabOtherContacts = new Tab (subTabOtherContacts, "The 'Other contacts' sub tab on the company landing page");
    @Getter
    Button AddContactButton = new Button(createContactButton, "The 'Add contact' button on the 'Other contacts' sub tab on the company landing page");
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
    Button CreateContactFinishButton = new Button(createContactFinishButton, "The 'Finish' button for creating Rolodex user");
    @Getter
    Tab TransactionsTabOfClient = new Tab(transactionsTabOfClient, "The 'Transactions' tab on the company landing page");
    @Getter
    Button AddTransactionButton = new Button(addTransactionButton, "The '+Add transaction' button on the 'Transactions' tab at the company landing page");
    @Getter
    TextField StarTransactionModal = new TextField(starTransactionModal,"The 'Start a transaction' modal window");
    @Getter
    Link TransactionTypeDropdownField = new Link(transactionTypeDropdownField,"The 'Transaction type' dropdown field");
    @Getter
    Link AssociatedYear = new Link(associatedYearDropdown, "The 'Associated year' dropdown field");
    @Getter
    DropDownList OptionsListTransactionYear = new DropDownList(optionsListTransactionYear, "The 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2021 = new DropDownOption(associatedYear2021,"The '2021' option from the 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2022 = new DropDownOption(associatedYear2022,"The '2022' option from the 'Associated year' dropdown list");
    @Getter
    DropDownOption AssociatedYear2023 = new DropDownOption(associatedYear2023,"The '2023' option from the 'Associated year' dropdown list");
    @Getter
    Link TransactionTypeDropdown = new Link(transactionTypeDropdown, "The 'Transaction type' dropdown field");
    @Getter
    DropDownOption NewBusinessOption = new DropDownOption(newBusinessOption, "The 'New Business' option in the 'Transaction type' dropdown");
    @Getter
    DropDownOption RenewalOption = new DropDownOption(renewalOption, "The 'Renewal' option in the 'Transaction type' dropdown");
    @Getter
    Button FinishTransactionButton = new Button(finishTransactionButton, "The 'Finish' button to complete creation of the transaction");
    private WebElement driver;

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
        DriverManager.webDriverWait();
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
        DriverManager.webDriverWait();
        String actual = getSuccessCompanyCreationMessage().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is:" + expected);
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
        DriverManager.webDriverWait();
        getCloseClientEditMode().clickButton();
        return this;
    }
    @Step("Click on the 'Client information' tab from the company landing page")
    public CompaniesPage clickClientInformationTab(){
        DriverManager.waitForElementVisible(clientInformationTab,3);
        getClientInformationTab().clickButton();
        return this;
    }
    @Step("Click on the 'Schedule' sub tab from the company landing page")
    public CompaniesPage clickScheduleSubTab(){
        DriverManager.waitForElementVisible(schedulesDropDown,2);
        getSchedulesDropDown().clickButton();
        return this;
    }
    @Step("Select the 'Schedule' option")
    public CompaniesPage clickScheduleOption(){
        DriverManager.webDriverWait();
        getSchedulesOption().clickButton();
        return this;
    }
    @Step("Click on the 'Action' button from the 'Schedules' sub tab")
    public CompaniesPage clickOnActionsButton(){
        DriverManager.webDriverWait();
        getClientActionButton().clickButton();
        return this;
    }
    @Step("Select the 'Add schedule' option")
    public CompaniesPage clickAddSchedulesOption(){
        DriverManager.webDriverWait();
        getAddSchedule().clickButton();
        return this;
    }
    @Step("Click on the 'Blank schedule' option")
    public CompaniesPage clickBlankScheduleOption(){
        getBlankScheduleOption().clickButton();
        return this;
    }
    @Step("Click on the 'Next' button on the 'Create schedule' modal")
    public CompaniesPage clickNextButtonOnCreateScheduleModal(){
        DriverManager.webDriverWait();
        getCreateScheduleNextButton().clickButton();
        return this;
    }
    @Step("Enter schedule template name into the 'Search' input field")
    public CompaniesPage enterScheduleNameinSearchField(String email){
        getSearchFieldForSchedules().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Select and click on the first schedule in the list")
    public CompaniesPage clickOnFirstScheduleInTheList(){
        DriverManager.getWaiter(3);
        getFirstScheduleInTheList().clickButton();
        return this;
    }
    @Step("Enter schedule name into the 'Schedule name' input field")
    public CompaniesPage enterScheduleName(String email){
        getScheduleNameInputField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Enter schedule name into the 'Schedule name' input field")
    public CompaniesPage enterScheduleDescription(String email){
        getScheduleDescriptionInputField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("Click on the 'Create schedule' button on the 'Create schedule' modal window")
    public CompaniesPage clickCreateScheduleButton(){
        getCreateScheduleButton().clickButton();
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
    @Step("Click on the 'Client contacts' sub tab")
    public CompaniesPage clickClientContactsFromCompanyLandingPage(){
        getSubTabClientContacts().clickTab();
        return this;
    }
    @Step("Click on the 'Add contact' button from the 'Other contacts' sub tab")
    public CompaniesPage clickAddContactButton(){
        DriverManager.getWaiter(5);
        getAddContactButton().clickButton();
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
    @Step("Click on the 'Permission template' dropdown field")
    public CompaniesPage clickOnPermissionTemplateDropdownField(){
        getPermissionTemplateDropDownField().clickButton();
        return this;
    }
    @Step("Select the 'Administrator' role from the 'Permission template' dropdown field")
    public CompaniesPage selectAdministratorRole(){
        DriverManager.getWaiter(4);
        getAdministratorTemplateOption().clickButton();
        return this;
    }
    @Step("Select the 'Collaborator' role from the 'Permission template' dropdown field")
    public CompaniesPage selectCollaboratorRole() {
        DriverManager.getWaiter(4);
        getCollaboratorTemplateOption().clickButton();
        return this;
    }
    @Step("Check the 'Edit contact' additional permission")
    public CompaniesPage checkEditContactAdditionalPermission(){
        getEditContactAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'View Policies' additional permission")
    public CompaniesPage checkViewPoliciesAdditionalPermission(){
        getViewPoliciesAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'All Transactions' additional permission")
    public CompaniesPage checkAllTransactionsAdditionalPermission(){
        getAllTransactionsAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'All Policies' additional permission")
    public CompaniesPage checkAllPoliciesAdditionalPermission(){
        getAllPoliciesAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Share items withing a transaction' additional permission")
    public CompaniesPage checkShareItemsWithingTransactionsAdditionalPermission(){
        getShareItemsWithingTransactionAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Claims' additional permission")
    public CompaniesPage checkRequestClaimsAdditionalPermission(){
        getRequestClaimsAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Endorsement' additional permission")
    public CompaniesPage checkRequestEndorsementAdditionalPermission(){
        getRequestEndorsementAdditionalPermission().select();
        return this;
    }
    @Step("Check the 'Request Certificate' additional permission")
    public CompaniesPage checkRequestCertificateAdditionalPermission(){
        getRequestCertificateAdditionalPermission().select();
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
    @Step("Click on the 'Associated year' dropdown")
    public CompaniesPage clickOnAssociatedYearDropDown(){
        getAssociatedYear().clickLink();
        return this;
    }
    @Step("Select the 2021 option from the 'Associated year' dropdown")
    public CompaniesPage clickOn2021Option(){
        getAssociatedYear2021().clickOption();
        return this;
    }
    @Step("Select the 2022 option from the 'Associated year' dropdown")
    public CompaniesPage clickOn2022Option(){
        getAssociatedYear2022().clickOption();
        return this;
    }
    @Step("Select the 2023 option from the 'Associated year' dropdown")
    public CompaniesPage clickOn2023Option(){
        getAssociatedYear2023().clickOption();
        return this;
    }
    @Step("Click on the 'Transaction type' dropdown field")
    public CompaniesPage clickOnTransactionTypeDropdown(){
        getTransactionTypeDropdown().clickLink();
        return this;
    }
    @Step("Select the 'New business' option inside the 'Transaction type' dropdown field")
    public CompaniesPage selectNewBusinessType(){
        getNewBusinessOption().clickOption();
        return this;
    }
    @Step("Select the 'Renewal' option inside the 'Transaction type' dropdown field")
    public CompaniesPage selectRenewalType(){
        getRenewalOption().clickOption();
        return this;
    }
    @Step("Click on the 'Finish' button to complete the transaction creation")
    public CompaniesPage clickOnFinishTransactionButton(){
        DriverManager.webDriverWait();
        getFinishTransactionButton().clickButton();
        return this;
    }

}
