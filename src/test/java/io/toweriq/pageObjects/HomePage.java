package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class HomePage {
    private By pageSidebar = By.id("pageSidebar");
    private By sideHomeButton = By.id("sidebarMenuItemHome");
    private By homePageHeader = By.xpath("//div[@id='root']//h1");
    private By sideContactsButton = By.id("sidebarMenuItemContacts");
    private By contactPageHeader = By.xpath("//div[@id='root']//h1");
    private By sideCompaniesButton = By.id("sidebarMenuItemCompanies");
    private By companiesPageHeader = By.xpath("//div[@id='root']//div//h3");
    private By sidePoliciesButton = By.id("sidebarMenuItemPolicies");
    private By policiesPageHeader = By.xpath("//div[@id='root']//div/h1");
    private By sideTransactionsButton = By.id("sidebarMenuItemTransactions");
    private By sideSubmissionsButton = By.id ("sidebarMenuItemSubmissions");
    private By sideLibraryButton = By.id("sidebarMenuItemLibrary");
    private By sideCustomFormsButton = By.id("sidebarMenuItemCustom forms");
    private By sideProposalsButton = By.id("sidebarMenuItemProposals");
    private By sidePortalsButton = By.id("sidebarMenuItemPortals");
    private By portalsPageHeader = By.xpath("//div[@id='root']//div//h1");
    private By sideSignatureButton = By.id("sidebarMenuItemE-signatures");
    private By signaturesPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/h3");
    private By sideSettingsButton = By.id("sidebarMenuItemSettings");
    private By settingsPageHeader = By.xpath("//div[@id='root']//div//h3");
    private By profileLink = By.id("accountProfile");
    private By preferencesLink = By.id("accountPreferences");
    private By agentSignOutLink = By.id("accountSignOut");

    @Getter
    Button SidebarButton = new Button(pageSidebar, "The 'Sidebar menu' button in sidebar menu");
    @Getter
    Button HomeButton = new Button(sideHomeButton, "The 'Home' link in sidebar menu");
    @Getter
    TextField HomePageHeader = new TextField(homePageHeader, "The page header");
    @Getter
    Button ContactsButton = new Button(sideContactsButton, "The 'Contacts' button in sidebar menu");
    @Getter
    TextField ContactPageHeader = new TextField(contactPageHeader, "The page header of the Contacts page");
    @Getter
    Button CompaniesButton = new Button(sideCompaniesButton, "The 'Companies' button in sidebar menu");
    @Getter
    TextField CompaniesPageHeader = new TextField(companiesPageHeader,"The page header of the Companies page");
    @Getter
    Button PoliciesButton = new Button(sidePoliciesButton, "The 'Policies' button in sidebar menu");
    @Getter
    TextField PoliciesPageHeader = new TextField(policiesPageHeader,"The page header of the Policies page");
    @Getter
    Button TransactionsButton = new Button(sideTransactionsButton, "The 'Transactions' button in sidebar menu");
    @Getter
    Button SubmissionButton = new Button(sideSubmissionsButton, "The 'Transactions' button in sidebar menu");
    @Getter
    Button LibraryButton = new Button(sideLibraryButton,"The 'Library' button in sidebar menu");
    @Getter
    Button CustomFormsButton = new Button(sideCustomFormsButton, "The 'Custom forms' button in sidebar menu");
    @Getter
    Button ProposalsButton = new Button(sideProposalsButton, "The 'Proposals' button in sidebar menu");
    @Getter
    Button PortalsButton = new Button(sidePortalsButton, "The 'Portals' button in sidebar menu");
    @Getter
    TextField PortalsPageHeader = new TextField(portalsPageHeader, "The page header of the Portals template page");
    @Getter
    Button SignatureButton = new Button(sideSignatureButton,"The 'E-signature' button in sidebar menu");
    @Getter
    TextField SignaturesPageHeader = new TextField(signaturesPageHeader, "The page header of the E-Signatures template page");
    @Getter
    Button SettingsButton = new Button(sideSettingsButton, "The 'Settings' button in sidebar menu");
    @Getter
    TextField SettingsPageHeader = new TextField(settingsPageHeader, "The page header of the Settings page");
    @Getter
    Link AgentSignOutLink = new Link(agentSignOutLink, "The 'Sign out' link");
    @Getter
    Button UserIcon = new Button(profileLink, "The User's profile icon");
    @Getter
    Button ProfilePreferencesLink = new Button(preferencesLink, "The 'Profile&Preferences' link");

    @Step("Click on the 'Home' button from the sidebar menu")
    public HomePage clickOnHomeButton(){
        getHomeButton().clickButton();
        return new HomePage();
    }
    @Step("Click on the 'Contacts' page from the sidebar menu")
    public ContactsPage clickOnContactsButton(){
        getContactsButton().clickButton();
        return new ContactsPage();
    }
    @Step("Click on the 'Companies' button from the sidebar menu")
    public CompaniesPage clickOnCompaniesButton() {
//        DriverManager.WebDriverWait();
        getCompaniesButton().clickButton();
        return new CompaniesPage();
    }
    @Step("Click on the 'Policies' button from the sidebar menu")
    public PoliciesPage clickOnPoliciesButton(){
//        DriverManager.WebDriverWait();
        getPoliciesButton().clickButton();
        return new PoliciesPage();
    }
    @Step("Click on the 'Transactions' button from the sidebar menu")
    public TransactionsPage clickOnTransactionsButton(){
//        DriverManager.WebDriverWait();
        getTransactionsButton().clickButton();
        return new TransactionsPage();
    }
    @Step("Click on the 'Submissions' button from the sidebar menu")
    public SubmissionsPage clickOnSubmissionsButton(){
        getSubmissionButton().clickButton();
        return new SubmissionsPage();
    }
    @Step("Click on the 'Library' button from the sidebar menu")
    public LibraryPage clickOnLibraryButton(){
//        DriverManager.WebDriverWait();
        getLibraryButton().clickButton();
        return new LibraryPage();
    }
    @Step("Click on the 'Custom Forms' button from the sidebar menu")
    public CustomFormsPage clickOnCustomFormsButton(){
//        DriverManager.WebDriverWait();
        getCustomFormsButton().clickButton();
        return new CustomFormsPage();
    }
    @Step("Click on the 'Proposals template' button from the sidebar menu")
    public ProposalsPage clickOnProposalsButton(){
        DriverManager.WebDriverWait();
        getProposalsButton().clickButton();
        return new ProposalsPage();
    }
    @Step("Click on the 'Portals' portals from the sidebar menu")
    public PortalsPage clickOnPortalsButton(){
        DriverManager.WebDriverWait();
        getPortalsButton().clickButton();
        return new PortalsPage();
    }
    @Step("Click on the 'E-signature' button from the sidebar menu")
    public SignaturePage clickOnESignatureButton(){
        DriverManager.WebDriverWait();
        getSignatureButton().clickButton();
        return new SignaturePage();
    }
    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
//        DriverManager.WebDriverWait();
        getSettingsButton().clickButton();
        return new SettingsPage();
    }
    @Step("Click on the Users profile icon")
    public HomePage clickOnProfileIcon(){
        getUserIcon().clickButton();
        return this;
    }
    @Step("Click on the 'Profile&Preferences' link")
    public ProfileAndPreferencesPage clickOnProfilePreferencesLink(){
//        DriverManager.WebDriverWait();
        getProfilePreferencesLink().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Sign out' link")
    public SignInPage clickSignOutLink(){
        DriverManager.WebDriverWait();
        getAgentSignOutLink().clickLink();
        return new SignInPage();
    }


}
