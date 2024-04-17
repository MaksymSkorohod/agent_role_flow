package ro.maxbet.testsUser;

import org.testng.annotations.Test;
import ro.maxbet.DriverManager;


public class HomePageTests extends TestBase {

    @Test(description = "Open the 'Live Casino' page ")
    public void openLiveCasinoPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .getLiveCasinoButton().isExists(10);
        homePage
                .clickOnLiveCasinoButton();
    }
    @Test(description = "Open the 'Betting' page")
    public void openBettingPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnBettingButton();
    }
    @Test(description = "Open the 'Live Betting' page")
    public void openLiveBettingPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnLiveBettingButton();
        String currentUrl = DriverManager.getUrl();
        System.out.println(currentUrl);
        if(currentUrl.equals("https://dev.maxbet.ro/en/live-betting")) {
            System.out.println(currentUrl);
        }
    }
    @Test(description = "Open the 'Promotions' page")
    public void openPromotionPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnPromotionsButton()
                .getTitleOfThePage();
        String title = DriverManager.getDriver().getTitle();
        System.out.println(title);
    }

    @Test(description = "Open the 'Tournaments' page")
    public void openTournamentsPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .clickOnTournamentsButton();
        tournamentsPage
                .getTournamentsPageTitle().isExists();
    }
    @Test(description = "Open the 'Wallet/Profile' page")
    public void openWalletPage(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .getWalletButton().isExists();
        homePage
                .clickOnWalletButton();

    }
    @Test(description = "Open the 'Notification' modal")
    public void openNotificationCenter(){
        homePage
                .getTopMainMenu().isExists();
        homePage
                .getNotificationCenter().isExists();
        homePage
                .clickOnNotificationButton()
                .getNotificationCenter().isEnable();
    }
    @Test(description = "Open the 'VIP' page")
    public void openVipPage(){
        homePage
                .getNavigationContentButton().isExists(15);
        homePage
                .clickOnNavButton()
                .getVipButtonSideMenu().isExists();
        homePage
                .clickVIPButton()
                .getVipPage().isExists();
    }
    @Test(description = "Open side bar menu from the home page")
    public void openSideBarMenu(){
        homePage
                .getNavigationContentButton().isExists(10);
        homePage
                .clickOnNavButton()
                .getLeftSideBarMenu().isExists();
        homePage
                .clickXButtonForLeftSideBarMenu();
    }
    @Test(description = "Open the 'MaxJackpot' page from the sidebar menu")
    public void openMaxJackpotPageFromSideBarMenu(){
        homePage
                .getNavigationContentButton().isExists( 10);
        homePage
                .clickOnNavButton()
                .getLeftSideBarMenu().isExists();
        homePage
                .getMaxJackpotButton().isExists();
        homePage
                .clickMaxJackpotButtonFromSideBarMenu();
        homePage
                .getMaxJackpotPageTitle().isExists();
    }

}
