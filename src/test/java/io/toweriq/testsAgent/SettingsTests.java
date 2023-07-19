package io.toweriq.testsAgent;

import org.testng.annotations.Test;

public class SettingsTests extends TestBase {

    @Test(description = "Open Settings page and return back on the Home page")
    public void openSettingsPage(){
        fillSettingsPage();
        settingsPage
                .getSettingsPageHeader().isExists();
        settingsPage
                .getBrokerageInformationPageHeader().isExists();
    }
    @Test(description = "Open the 'Manage users' tab on the 'Settings' page")
    public void openManageUsersTab(){
        fillSettingsPage();
        settingsPage
                .getBrokerageInformationPageHeader().isExists();
        settingsPage
                .clickOnManageUsers();
    }

//    @Test(description = "Open Brokerage information settings page")//
//    public void openBrokerageInformationPage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnBrokerageInformation()
//                .clickBackLinkOnBrokeragePage();
//    }
//
//    @Test(description = "Open Manage users settings page")//
//    public void openManageUsersPage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnManageUsers()
//                .clickBackLinkOnManageUsersPage();
//    }
//
//    @Test(description = "Open Carriers settings page")//
//    public void openCarriersPage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnCarriersSettings()
//                .clickBackLinkOnCarrierPage();
//    }
//
//    @Test(description = "Open Transactions settings page")
//    public void openTransactionPage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnTransactionSettings()
//                .clickBackLinkOnTransactionSettingsPage();
//    }
//    @Test(description = "Open Development portal settings page")//
//    public void openDevelopmentPortalPage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnDevelopmentPortal()
//                .clickBackLinkOnDevelopmentPortalPage();
//    }
//    @Test(description = "Open Business line settings page")//
//    public void openBusinessLinePage(){
//        fillSettingsPage();
//        settingsPage
//                .getSettingsPageHeader().isExists();
//        settingsPage
//                .clickOnBusinessLineSettings()
//                .clickBackLinkOnDevelopmentPortalPage();
//    }

}
