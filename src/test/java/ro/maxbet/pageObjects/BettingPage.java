package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.Tab;
import ro.maxbet.Elements.TextField;

public class BettingPage extends AbstractPage{
    private By betslipModal = By.cssSelector(".betslip.ng-star-inserted");
    private By ticketTabOnBetslip = By.cssSelector(".betslip-tabs > button:nth-of-type(1)");
    private By myTicketTabOnBetslip = By.cssSelector(".betslip-tabs > button:nth-of-type(2)");

    @Getter
    TextField BetslipModal = new TextField(betslipModal,"The Betslip modal window");
    @Getter
    Tab TicketTabOnBetslip = new Tab(ticketTabOnBetslip, "The 'Ticket' tab on the Betslip modal window");
    @Getter
    Tab MyTicketTabOnBetslip = new Tab(myTicketTabOnBetslip, "The 'My ticket' tab on the Betslip modal window");

    @Step("Click on the 'Ticket' tab from the Betslip modal window")
    public BettingPage clickOnTicketTabBetslip(){
        DriverManager.webDriverWait();
        getTicketTabOnBetslip().clickTab();
        return this;
    }
    @Step("Click on the 'My ticket' tab from the Betslip modal window")
    public BettingPage clickOnMyTicketBetslip(){
        DriverManager.webDriverWait();
        getMyTicketTabOnBetslip().clickTab();
        return this;
    }
}
