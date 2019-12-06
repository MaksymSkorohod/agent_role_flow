package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class CarriersSettingsPage extends AbstractPage {

    private By carriersBackLink = By.id("settingsCarriersBackLink");
    private By addCarrierButton = By.id("settingsCarriersAddCarrier");

    @Getter
    Button BackLinkFromCarrier = new Button(carriersBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Carrier page")
    public CarriersSettingsPage clickBackLinkOnCarrierPage(){
        getBackLinkFromCarrier().clickButton();
        return this;
    }
}
