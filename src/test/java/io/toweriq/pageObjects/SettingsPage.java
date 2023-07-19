package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class SettingsPage extends AbstractPage {

    private By sideSettingsButton = By.id("sidebarMenuItemSettings");
    private By settingsPageHeader = By.xpath("//h1[text()='Settings']");
    private By brokerageInformationTab = By.xpath("//div[@id='root']//div[@role='button']//p[text()='Brokerage information']");
    private By brokerageInformationHeader = By.xpath("//div[@id='root']//div//h1");
    private By manageUsersTab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[2]//div[1]//div/p");
    private By manageUsersHeader = By.xpath("//div[@id='root']//div//h1");
    private By carriersTab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[3]//div[1]//div/p");
    private By carriersHeader = By.xpath("//div[@id='root']//div//h1");
    private By developmentPortalTab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/div[1]/div[1]/div/p");
    private By schemaDefinitionHeader = By.xpath("//div[@id='root']//div//h1");
    private By businessLineTab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[5]");
    private By businessLineHeader = By.xpath("//div[@id='root']//div//h1");
    private By brandingStylesTab = By.xpath("//*[@id=\"root\"]//div[@role='button']//p[text()='Branding & styles']");
    private By brandingStylesHeader = By.xpath("//div[@id='root']//div//h1");
    private By subscriptionsTab = By.xpath("//*[@id=\"root\"]//div[@role='button']//p[text()='Subscriptions']");
    private By invoicesSubTab = By.xpath("//*[@id=\"root\"]//div[@role='button']//p[text()='Invoices']");
    private By invoicesHeader = By.xpath("//div[@id='root']//div//h1");
    private By addRemoveLicensesSubTab = By.xpath("//*[@id=\"root\"]//div[@role='button']//p[text()='Add & remove licenses']");
    private By addRemoveLicensesHeader = By.xpath("//div[@id='root']//div//h1");
    private By assignLicensesSubTab = By.xpath("//*[@id=\"root\"]//div[@role='button']//p[text()='Assign user licenses']");






    @Getter
    Button SettingsButton = new Button(sideSettingsButton, "The 'Settings' button in sidebar menu");
    @Getter
    TextField SettingsPageHeader = new TextField(settingsPageHeader, "The page header of the Settings page");
    @Getter
    Button BrokerageInformation = new Button(brokerageInformationTab, "The 'Brokerage information' tab");
    @Getter
    TextField BrokerageInformationPageHeader = new TextField(brokerageInformationHeader, "The page header of the 'Brokerage Information' page");
    @Getter
    Button ManageUsers = new Button(manageUsersTab, "The 'Manage users' tab");
    @Getter
    TextField ManageUsersHeader = new TextField(manageUsersHeader, "The page header of the 'Manage Users' tab");
    @Getter
    Button CarriersSettings = new Button(carriersTab, "Carriers link");
    @Getter
    Button DevelopmentPortal = new Button(developmentPortalTab, "Development portal link");
    @Getter
    Button BusinessLineSettings = new Button(businessLineTab, "Business line link");



    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
        DriverManager.webDriverWait();
        getSettingsButton().clickButton();
        return new SettingsPage();
    }
    @Step("Click on the 'Brokerage information' tab")
    public BrokerageInformationPage clickOnBrokerageInformation(){
//        DriverManager.WebDriverWait();
        getBrokerageInformation().clickButton();
        return new BrokerageInformationPage();
    }
    @Step("Click on the 'Manage users' tab")
    public ManageUsersPage clickOnManageUsers(){
        DriverManager.webDriverWait();
        getManageUsers().clickButton();
        return new ManageUsersPage();
    }
    @Step("Click on the Carriers link")
    public CarriersSettingsPage clickOnCarriersSettings(){
//        DriverManager.WebDriverWait();
        getCarriersSettings().clickButton();
        return new CarriersSettingsPage();
    }
    @Step("Click on the Development portal link")
    public DevelopmentPortalPage clickOnDevelopmentPortal(){
//        DriverManager.WebDriverWait();
        getDevelopmentPortal().clickButton();
        return new DevelopmentPortalPage();
    }
    @Step("Click on the Business line link")
    public BusinessLineSettingsPage clickOnBusinessLineSettings(){
//        DriverManager.WebDriverWait();
        getBusinessLineSettings().clickButton();
        return new BusinessLineSettingsPage();
    }





}
