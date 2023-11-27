package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Tab;
import io.toweriq.Elements.Table;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SettingsPage extends AbstractPage {

    private By sideSettingsButton = By.id("sidebarMenuItemSettings");
    private By settingsPageHeader = By.xpath("//div[@id=\"root\"]//div//h3");
    private By settingsBarMenu = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div");
    //Brokerage Information
    private By brokerageTab = By.id("Brokerage");
    private By brokerageInformationSubTab = By.xpath("//div[@id='root']//div[@role='button']//p[text()='Brokerage information']");
    private By brokerageInformationHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Brokerage Information']");
    private By propertiesManagementSubTab = By.xpath("//div[@id='root']//div[@role='button']//p[text()='Properties management']");
    private By propertiesManagementHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Properties management']");
    //Manage Users
    private By manageUsersTab = By.id("Manage users");
    private By manageUsersSubTab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div");
    private By manageUsersHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Manage Users']");
    private By permissionTemplatesSubTab = By.id("Permission templates");
    private By permissionTemplateHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Permission templates']");
    //Carriers
    private By carriersTab = By.id("Carriers");
    private By carriersHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Carriers']");
    //Claims
    private By claimsTab = By.id("Claims");
    private By claimsPageHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Claims']");
    //Development Portal
    private By developmentPortalTab = By.id("Development Portal");
    private By schemaDefinitionSubTab = By.id("Schema definition");
    private By schemaDefinitionHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Schema definitions settings']");
    private By apiHooksSubTab = By.id("API Hooks UI");
    private By apiHooksPageHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='API Keys settings']");
    // Business Lines
    private By businessLineTab = By.id("Business lines");
    private By businessLineHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Business line creator']");
    //Branding & styles
    private By brandingStylesTab = By.id("Branding & styles");
    private By brandingStylesHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Branding & styles']");
    //Subscriptions
    private By subscriptionsTab = By.id("Subscriptions");
    private By invoicesSubTab = By.id("Invoices");
    private By invoicesHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Invoices']");
    private By addRemoveLicensesSubTab = By.id("Add & remove licenses");
    private By addRemoveLicensesHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Add and remove licenses']");
    private By assignUserLicensesSubTab = By.id("Assign user licenses");
    private By assignUserLicensesSubHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Assign user licenses']");
    //Integrations
    private By integrationsTab = By.id("Integrations");
    private By emailIntegrationHeader = By.xpath("//div[@id=\"root\"]//div//h1[text()='Email integrations']");

    @Getter
    Button SettingsButton = new Button(sideSettingsButton, "The 'Settings' button in sidebar menu");
    @Getter
    TextField SettingsPageHeader = new TextField(settingsPageHeader, "The page header of the Settings page");
    @Getter
    Table SettingsBarMenu = new Table(settingsBarMenu,"The bar menu of the 'Settings' page");
    @Getter
    Tab BrokerageTab = new Tab(brokerageTab, "The 'Brokerage' tab");
    @Getter
    Tab BrokerageInformation = new Tab(brokerageInformationSubTab, "The 'Brokerage information' tab");
    @Getter
    TextField BrokerageInformationPageHeader = new TextField(brokerageInformationHeader, "The page header of the 'Brokerage Information' page");
    @Getter
    Tab PropertiesManagementSubTab = new Tab(propertiesManagementSubTab, "The 'Properties management' sub tab");
    @Getter
    TextField PropertiesManagementHeader = new TextField(propertiesManagementHeader, "The page header of the 'Properties management' page header");

    @Getter
    Tab ManageUsersTab = new Tab(manageUsersTab, "The 'Manage users' tab");
    @Getter
    Tab ManageUsersSubTab = new Tab(manageUsersSubTab, "The 'Manage users' sub tab");
    @Getter
    TextField ManageUsersHeader = new TextField(manageUsersHeader, "The page header of the 'Manage Users' tab");
    @Getter
    Tab PermissionTemplatesSubTab = new Tab(permissionTemplatesSubTab, "The 'Permission templates' sub tab");
    @Getter
    TextField PermissionTemplateHeader = new TextField(permissionTemplateHeader, "The 'Permission templates' page header");

    @Getter
    Tab CarriersSettings = new Tab(carriersTab, "The 'Carriers' tab");
    @Getter
    TextField CarriersHeader = new TextField(carriersHeader,"The 'Carriers' page header");

    @Getter
    Tab ClaimsTab = new Tab(claimsTab,"The 'Claims' tab");
    @Getter
    TextField ClaimsPageHeader = new TextField(claimsPageHeader,"The 'Claims' page header");

    @Getter
    Tab DevelopmentPortal = new Tab(developmentPortalTab, "The 'Development portal' tab");
    @Getter
    Tab SchemaDefinitionSubTab = new Tab(schemaDefinitionSubTab,"The 'Schema definition' sub tab");
    @Getter
    TextField SchemaDefinitionHeader = new TextField(schemaDefinitionHeader,"The 'Schema definitions settings' page header");
    @Getter
    Tab ApiHooksSubTab = new Tab(apiHooksSubTab,"The 'API Keys' sub tab");
    @Getter
    TextField ApiHooksPageHeader = new TextField(apiHooksPageHeader,"The 'API Keys settings' page header");

    @Getter
    Tab BusinessLineSettings = new Tab(businessLineTab, "The 'Business lines' tab");
    @Getter
    TextField BusinessLineHeader = new TextField(businessLineHeader, "The 'Business lines' page header");

    @Getter
    Tab BrandingStylesTab = new Tab(brandingStylesTab,"The 'Branding & Styles' tab");
    @Getter
    TextField BrandingStylesHeader = new Tab(brandingStylesHeader, "The 'Branding & Styles' page header");

    @Getter
    Tab SubscriptionsTab = new Tab(subscriptionsTab, "The 'Subscriptions' tab");
    @Getter
    Tab InvoicesSubTab = new Tab(invoicesSubTab, "The 'Invoices' sub tab");
    @Getter
    TextField InvoicesHeader = new TextField(invoicesHeader,"The 'Invoices' page header");
    @Getter
    Tab AddRemoveLicensesSubTab = new Tab(addRemoveLicensesSubTab,"The 'Add & remove licenses' sub tab");
    @Getter
    TextField AddRemoveLicensesHeader = new TextField(addRemoveLicensesHeader,"The 'Add & remove licenses' page header");
    @Getter
    Tab AssignUserLicensesSubTab = new Tab(assignUserLicensesSubTab,"The 'Assign user licenses' sub tab");
    @Getter
    TextField AssignUserLicensesSubHeader = new TextField(assignUserLicensesSubHeader,"The 'Assign user licenses' page header");

    @Getter
    Tab IntegrationsTab = new Tab(integrationsTab,"The 'Integration' sub tab");
    @Getter
    TextField EmailIntegrationHeader = new TextField(emailIntegrationHeader,"The 'Email integration' page header");


    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
        DriverManager.webDriverWait();
        getSettingsButton().clickButton();
        return new SettingsPage();
    }
    @Step("Click on the 'Brokerage information' tab")
    public SettingsPage clickOnBrokerageInformation(){
        getBrokerageInformation().clickTab();
        return this;
    }
    @Step("Click on the 'Permission templates' sub tab")
    public SettingsPage clickOnPermissionTemplatesSubTab(){
        getPermissionTemplatesSubTab().clickTab();
        return this;
    }
    @Step("Click on the 'Manage users' tab")
    public SettingsPage clickOnManageUsers(){
        DriverManager.elementToBeClickable(manageUsersSubTab);
        return this;
    }
    @Step("Click on the Carriers link")
    public SettingsPage clickOnCarriersSettings(){
        getCarriersSettings().clickTab();
        return this;
    }
    @Step("Click on the Development portal link")
    public SettingsPage clickOnDevelopmentPortal(){
        getDevelopmentPortal().clickTab();
        return this;
    }
    @Step("Click on the Business line link")
    public SettingsPage clickOnBusinessLineSettings(){
        getBusinessLineSettings().clickTab();
        return this;
    }





}
