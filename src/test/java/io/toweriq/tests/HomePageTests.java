package io.toweriq.tests;

import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test(description = "The navigation test for the sidebar menu")
    public void navigationOnSidebarMenu(){
        homePage
                .getHomePageHeader().isExists();
        homePage
                .clickOnClientsLink()
                .getClientsPageHeader().isExists();
        homePage
                .clickOnTransactionsLink()
                .getTransactionsPageHeader().isExists();
        homePage
                .clickOnPoliciesLink()
                .getPoliciesPageHeader().isExists();
        homePage
                .clickOnContactsLink()
                .getContactsPageHeader().isExists();
        homePage
                .clickOnLibraryLink()
                .getLibraryPageHeader().isExists();
    }
    @Test(description = "The 'Sign out' test")
    public void signOutFromPortal(){
        homePage
                .clickOnProfileIcon()
                .clickSignOutLink();
    }
}
