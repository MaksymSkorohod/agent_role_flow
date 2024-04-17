package ro.maxbet.testsUser;

import org.testng.annotations.Test;

public class BettingPageTest extends TestBase{
    @Test(description = "Open the 'Betting' page")
    public void openBettingPage(){
        fillBettingPage();
        bettingPage
                .getBetslipModal().isExists();
        bettingPage
                .clickOnMyTicketBetslip();
    }
}
