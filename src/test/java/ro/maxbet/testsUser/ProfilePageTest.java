package ro.maxbet.testsUser;

import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase{
    @Test(description = "Click on the 'Edit' button to open the  'Edit profile information' modal")
    public void openEditProfileModal(){
        fillProfilePage();
        profilePage
                .getProfilePage().isExists(3);
        profilePage
                .clickOnEditButtonForProfile()
                .getEditProfileModal().isExists();
    }

    @Test(description = "Open the 'Payments methods' modal from the 'Profile' page")
    public void openTheDepositModal(){
        fillProfilePage();
        profilePage
                .getDepositSection().isExists(3);
        profilePage
                .clickOnPaymentsMethodButton()
                .getDepositsModal().isExists();

    }
    @Test(description = "Open the 'Bonus History' modal from the 'Profile' page")
    public void openBonusHistoryModal(){
        fillProfilePage();
        profilePage
                .getBonusSection().isExists(3);
        profilePage
                .getBonusHistoryButton().isExists();
        profilePage
                .clickOnBonusHistoryButton()
                .getBonusHistoryModal().isExists();
    }
    @Test(description = "Open the 'Transactions & withdrawals' modal from the 'Profile' page")
    public void openTransactionsModal(){
        fillProfilePage();
        profilePage
                .getTransactionsWithdrawalSection().isExists(3);
        profilePage
                .getAllTransactionsButton().isExists();
        profilePage
                .clickOnAllTransactionsButton()
                .getTransactionsModal().isExists();
    }
    @Test(description = "Open the 'Withdraw' modal")// check this case
    public void openWithdrawModal(){
        fillProfilePage();
        profilePage
                .getResponsibleGamingSection().isExists(3);
        profilePage
                .getWithdrawalsButton().isExists();
        profilePage
                .clickWithdrawalsButton()
                .getWithdrawModal().isExists();
    }
    @Test(description = "Open the 'Pending Withdrawals' modal")
    public void openPendingWithdrawalsModal(){
        fillProfilePage();
        profilePage
                .getResponsibleGamingSection().isExists(3);
        profilePage
                .getPendingWithdrawalsButton().isExists();
        profilePage
                .clickPendingWithdrawalsButton()
                .getPendingWithdrawalsModal().isExists();
    }
    @Test(description = "Open the 'Maxbet Gamble Responsibly' modal from the 'Profile' page")
    public void openMaxbetGambleResponsiblyModal(){
        fillProfilePage();
        profilePage
                .getResponsibleGamingSection().isExists(3);
        profilePage
                .getDetailsButton().isExists(5);
        profilePage
                .clickDetailsButton()
                .getResponsibleModal();
    }
    @Test(description = "Open the 'Your limits' modal")
    public void openYourLimitsModal(){
        fillProfilePage();
        profilePage
                .getResponsibleGamingSection().isExists(3);
        profilePage
                .getYourLimitsButton().isExists();
        profilePage
                .clickYourLimitsButton()
                .getYourLimitsModal().isExists();
    }
    @Test(description = "Open the 'Take a break' modal")
    public void openTakeABreakModal(){
        fillProfilePage();
        profilePage
                .getResponsibleGamingSection().isExists(3);
        profilePage
                .getSelfExclusionButton().isExists();
        profilePage
                .clickSelfExclusionButton()
                .getTakeABreak().isExists();
    }
}
