package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class SettingsPage extends AbstractPage {

    private By logoImage = By.xpath("//img[@alt='LogoImg']");
    private By brokerageInformationLink = By.id("settings-brokerage-management");
    private By manageUsersLink = By.id("settings-users-management");
    private By carriersLink = By.id("settings-carriers-management");
    private By transactionSettingLink = By.id("settings-transactions-management");
    private By developmentPortalLink = By.id("settings-development-portal");
    private By bussinessLineLink = By.id("settings-business-line");


    @Getter
    Button LogoImage = new Button(logoImage, "Logo Image");
    @Getter
    Button BrokerageInformation = new Button(brokerageInformationLink, "Brokerage information link");
    @Getter
    Button ManageUsers = new Button(manageUsersLink, "Manage users link");
    @Getter
    Button CarriersSettings = new Button(carriersLink, "Carriers link");
    @Getter
    Button TransactionSettings = new Button(transactionSettingLink, "Transaction settings link");
    @Getter
    Button DevelopmentPortal = new Button(developmentPortalLink, "Development portal link");
    @Getter
    Button BusinessLineSettings = new Button(bussinessLineLink, "Business line link");


    @Step("Click on the logo to return on the Home page")
    public SettingsPage clickOnLogo(){
        getLogoImage().clickButton();
        return this;
    }

    @Step("Click on the Brokerage information link")
    public BrokerageInformationPage clickOnBrokerageInformation(){
        getBrokerageInformation().clickButton();
        return new BrokerageInformationPage();
    }
    @Step("Click on the Manage users link")
    public ManageUsersPage clickOnManageUsers(){
        getManageUsers().clickButton();
        return new ManageUsersPage();
    }
    @Step("Click on the Carriers link")
    public CarriersSettingsPage clickOnCarriersSettings(){
        getCarriersSettings().clickButton();
        return new CarriersSettingsPage();
    }
    @Step("Click on the Transaction settings link")
    public TransactionSettingsPage clickOnTransactionSettings(){
        getTransactionSettings().clickButton();
        return new TransactionSettingsPage();
    }
    @Step("Click on the Development portal link")
    public DevelopmentPortalPage clickOnDevelopmentPortal(){
        getDevelopmentPortal().clickButton();
        return new DevelopmentPortalPage();
    }
    @Step("Click on the Business line link")
    public BusinessLineSettingsPage clickOnBusinessLineSettings(){
        getBusinessLineSettings().clickButton();
        return new BusinessLineSettingsPage();
    }





}
