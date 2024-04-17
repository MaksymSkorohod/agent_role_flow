package ro.maxbet.testsUser;

import org.testng.annotations.Test;

public class LiveBettingPageTest extends TestBase{
    @Test(description = "Click the 'Soccer' button")
    public void clickSoccerButtonFromLiveBettingPage(){
        liveBettingPage
                .clickSoccerButton();
    }
}
