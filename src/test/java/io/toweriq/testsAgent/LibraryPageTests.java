package io.toweriq.testsAgent;

import org.testng.annotations.Test;

import java.util.Random;

public class LibraryPageTests extends TestBase {

    @Test(description = "Open the 'Bookmarks' page")
    public void openBookmarksPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .getBookmarksPageHeader().isExists();
    }
    @Test(description = "Open the 'Programs' page")
    private void openProgramsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .programsTab()
                .getProgramsPageHeader().isExists();
    }
    @Test(description = "Open the 'Forms' page")
    public void openFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .formsTab()
                .getFormsPageHeader().isExists();
    }
    @Test(description = "Create a new transaction from the 'Bookmark' page")
    public void createNewTransactionFromBookmarkPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .getBookmarksPageHeader().isExists();
        libraryPage
                .firstFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2024Year().isExists();
        libraryPage
                .clickOn2024AssociatedYear()
                .clickOnTransactionTypeField()
                .getNewBusinessTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickOnFinishToCreateNewTransaction();
    }
    @Test(description = "Create renewal transaction from the 'Bookmark' page")
    public void createRenewalTransactionFromBookmarkPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .getBookmarksPageHeader().isExists();
        libraryPage
                .secondFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2023Year().isExists();
        libraryPage
                .clickOn2023AssociatedYear()
                .clickOnTransactionTypeField()
                .getRenewalTypeOption().isExists();
        libraryPage
                .selectRenewalOption()
                .clickOnFinishToCreateNewTransaction();
    }
    @Test(description = "Cancel creating a new transaction from the 'Bookmark' page")
    public void cancelCreatingNewTransactionFromBookmarkPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .getBookmarksPageHeader().isExists();
        libraryPage
                .firstFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2024Year().isExists();
        libraryPage
                .clickOn2024AssociatedYear()
                .clickOnTransactionTypeField()
                .getNewBusinessTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickCancelTransaction();
    }
    @Test(description = "Cancel creating renewal transaction from the 'Bookmark' page")
    public void cancelCreatingRenewalTransactionFromBookmarkPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .getBookmarksPageHeader().isExists();
        libraryPage
                .secondFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2023Year().isExists();
        libraryPage
                .clickOn2023AssociatedYear()
                .clickOnTransactionTypeField()
                .getRenewalTypeOption().isExists();
        libraryPage
                .selectRenewalOption()
                .clickCancelTransaction();
    }
    @Test(description = "Create a new transaction from the 'Forms' page")
    public void createNewTransactionFromFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .formsTab()
                .getFormsPageHeader().isExists();
        libraryPage

                .firstFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2023Year().isExists();
        libraryPage
                .clickOn2023AssociatedYear()
                .clickOnTransactionTypeField()
                .getNewBusinessTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickOnFinishToCreateNewTransaction();
    }
    @Test(description = "Create a renewal transaction from the 'Forms' page")
    public void createRenewalTransactionFromFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .formsTab()
                .getFormsPageHeader().isExists();
        libraryPage

                .secondFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2022Year().isExists();
        libraryPage
                .clickOn2022AssociatedYear()
                .clickOnTransactionTypeField()
                .getRenewalTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickOnFinishToCreateNewTransaction();
    }
    @Test(description = "Cancel creation of a new transaction from the 'Forms' page")
    public void cancelCreationNewTransactionFromFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .formsTab()
                .getFormsPageHeader().isExists();
        libraryPage

                .firstFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2023Year().isExists();
        libraryPage
                .clickOn2023AssociatedYear()
                .clickOnTransactionTypeField()
                .getNewBusinessTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickCancelTransaction();
    }
    @Test(description = "Cancel renewal transaction creation from the 'Forms' page")
    public void cancelRenewalTransactionCreationFromFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
        libraryPage
                .formsTab()
                .getFormsPageHeader().isExists();
        libraryPage

                .secondFormOnThePage()
                .clickStartTransactionOnLibraryPage()
                .getNewTransactionTitle().isExists();
        libraryPage
                .clickNextButton()
                .getCommercialClientOption().isExists();
        libraryPage
                .clickCommercialClientOption()
                .clickOnAssociatedClientField()
                .getAssociatedClientOrProspectOptionList().isExists();
        libraryPage
                .enterClientNameForSearchAssociatedClients("Marvel Studios")
                .clickOnMarvel()
                .clickOnAssociatedYearDropdown()
                .getAssociated2022Year().isExists();
        libraryPage
                .clickOn2022AssociatedYear()
                .clickOnTransactionTypeField()
                .getRenewalTypeOption().isExists();
        libraryPage
                .selectNewBusinessOption()
                .clickCancelTransaction();
    }

    }
