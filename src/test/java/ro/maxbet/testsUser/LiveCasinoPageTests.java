package ro.maxbet.testsUser;

import org.testng.annotations.Test;

public class LiveCasinoPageTests extends TestBase{
    @Test(description = "Open the 'Live Casino' page ")
    public void openLiveCasinoPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnLiveCasinoButton();
    }
    @Test(description = "Open the 'Live Casino' page from the left side menu")
    public void openLiveCasinoFromSideMenu(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnNavButton()
                .getLiveCasinoButtonSideBar().isExists();
        homePage
                .clickLiveCasinoSideBarMenu();
    }
    @Test(description = "Click on the 'Lobby' button from the 'Live Casino' page")
    public void clickLobbyButton(){
      fillLiveCasinoPage();
      liveCasinoPage
                .getLobbyButtonLiveCasinoPage().isExists();
      liveCasinoPage
                .clickLobbyButton();
    }
    @Test(description = "Click on the 'Providers' dropdown")
    public void clickOnProviderDropdown(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnNavButton()
                .getLiveCasinoButtonSideBar().isExists();
        homePage
                .clickLiveCasinoSideBarMenu();
//        fillLiveCasinoPage();
        liveCasinoPage
                .getProvidersDropDown().isExists();
        liveCasinoPage
                .clickOnProviders();
    }
}
