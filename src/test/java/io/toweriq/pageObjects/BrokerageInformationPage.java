package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class BrokerageInformationPage extends AbstractPage{

    private By brokerageBackLink = By.id("settingsBrokerageBackLink");
    private By addLocationButton = By.id("brokerageSettingsAddLocation");


    @Getter
    Button BackLinkFromBrokerage = new Button(brokerageBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Brokerage page")
    public BrokerageInformationPage clickBackLinkOnBrokeragePage(){
        getBackLinkFromBrokerage().clickButton();
        return this;
    }
}
