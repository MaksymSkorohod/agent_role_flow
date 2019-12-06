package io.toweriq.tests;

import org.testng.annotations.Test;

public class SettingsTests extends TestBase {

    @Test(description = "Open Settings page and return back on the Home page")
    public void openSettingsPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnLogo();
    }

    @Test(description = "Open Brokerage information settings page")
    public void openBrokerageInformationPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnBrokerageInformation()
                .clickBackLinkOnBrokeragePage();
    }
    @Test(description = "Open Manage users settings page")
    public void openManageUsersPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnManageUsers()
                .clickBackLinkOnManageUsersPage();
    }
    @Test(description = "Open Carriers settings page")
    public void openCarriersPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnCarriersSettings()
                .clickBackLinkOnCarrierPage();
    }
    @Test(description = "Open Transaction settings page")
    public void openTransactionPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnTransactionSettings()
                .clickBackLinkOnTransactionSettingsPage();
    }
    @Test(description = "Open Development portal settings page")
    public void openDevelopmentPortalPage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnDevelopmentPortal()
                .clickBackLinkOnDevelopmentPortalPage();
    }
    @Test(description = "Open Business line settings page")
    public void openBusinessLinePage(){
        homePage
                .getSettingsButton().isExists();
        homePage
                .clickOnSettingsButton()
                .clickOnBusinessLineSettings()
                .clickBackLinkOnDevelopmentPortalPage();
    }

}
