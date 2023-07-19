package io.toweriq.testsAgent;

import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test(description = "The navigation test for the sidebar menu")//check
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
    @Test(description = "The 'Sign out' test")//check
    public void signOutFromPortal(){
        homePage
                .clickOnProfileIcon()
                .clickSignOutLink();
    }

    @Test(description = "Click on the '+Add a task' button from the 'Activity feed' page")//check
    public void clickOnTaskButton(){
        homePage
                .clickAddTaskButton()
                .getTaskModalWindow().isExists();
        homePage
                .enterSubjectForTask("Test Task")
                .clickSaveButtonForTask();
    }
    @Test(description = "Open the 'Notification' page from the 'Activity feed'")//check
    public void  openNotificationPage(){
        homePage
                .clickOnNotificationsTab()
                .getNotificationPageHeader().isExists();
    }
    @Test(description = "Open the 'Emails' page from the 'Activity feed'")
    public void  openEmailsPage(){
        homePage
                .clickOnEmailsTab()
                .getEmailsPageHeader().isExists();
    }
    @Test(description = "Open the 'Sent' sub tab for the 'Emails' from the 'Activity feed'")
    public void  openSentEmailsPage(){
        homePage
                .clickOnEmailsTab()
                .clickOnSentEmailsSubTab()
                .getEmailsPageHeader().isExists();
    }
    @Test(description = "Open the 'Hidden' sub tab for the 'Emails' from the 'Activity feed'")
    public void  openHiddenEmailsPage(){
        homePage
                .clickOnEmailsTab()
                .clickOnTheHiddenSubTab()
                .getEmailsPageHeader().isExists();
    }
    @Test(description = "Open the 'Notes' page from the 'Activity feed'")
    public void  openNotesPage(){
        homePage
                .clickOnNotesTab()
                .getNotesPageHeader().isExists();
    }
    @Test(description = "Open the 'Tasks' page from the 'Activity feed'")
    public void  openTasksPage(){
        homePage
                .clickOnTasksTab()
                .getTasksPageHeader().isExists();
    }
}
