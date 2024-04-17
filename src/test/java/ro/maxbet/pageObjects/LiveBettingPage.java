package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.Button;

public class LiveBettingPage extends AbstractPage{
    public By soccerButton = By.cssSelector("div:nth-of-type(3) > .button.sportItem__button");

    @Getter
    Button SoccerButton = new Button(soccerButton, "The 'Soccer' button on the 'Betting' page");

    @Step("Click on the 'Soccer' button from the 'Betting' page")
    public LiveBettingPage clickSoccerButton(){
        DriverManager.elementToBeClickable(soccerButton);
        return this;
    }
}
