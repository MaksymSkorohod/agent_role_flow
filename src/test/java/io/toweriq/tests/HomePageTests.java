package io.toweriq.tests;

import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test(description = "The navigation test for the sidebar menu")
    public void navigationOnSidebarMenu(){
        homePage
                .getHomePageHeader().isExists();
        homePage
                .clickOnContactsButton()
                .getAllContactsPageHeader().isExists();
        homePage
                .clickOnCompaniesButton()
                .getAllCompaniesPageHeader().isExists();
        homePage
                .clickOnPoliciesButton()
                .getPoliciesPageHeader().isExists();
        homePage
                .clickOnTransactionsButton()
                .getTransactionsPageHeader().isExists();
        homePage
                .clickOnSubmissionsButton()
                .getSubmissionPageHeader().isExists();
        homePage
                .clickOnLibraryButton()
                .getLibraryPageHeader().isExists();
        homePage
                .clickOnCustomFormsButton()
                .getCustomFormsPageHeader().isExists();
        homePage
                .clickOnProposalsButton()
                .getProposalsPageHeader().isExists();
        homePage
                .clickOnPortalsButton()
                .getPortalsPageHeader().isExists();
        homePage
                .clickOnESignatureButton()
                .getESignaturePageHeader().isExists();
        homePage
                .clickOnSettingsButton()
                .getSettingsPageHeader().isExists();
        homePage
                .clickOnProfileIcon()
                .clickSignOutLink();
    }
    @Test(description = "The 'Sign out' test")
    public void signOutFromPortal(){
        homePage
                .clickOnProfileIcon()
                .clickSignOutLink();
    }
}
