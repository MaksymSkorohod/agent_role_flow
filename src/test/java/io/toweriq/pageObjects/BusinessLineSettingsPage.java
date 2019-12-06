package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class BusinessLineSettingsPage extends AbstractPage{

    private By businessLineBackLink = By.id("settingsCarriersBackLink");


    @Getter
    Button BackLinkFromBusinessLine = new Button(businessLineBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Business line page")
    public BusinessLineSettingsPage clickBackLinkOnDevelopmentPortalPage(){
        getBackLinkFromBusinessLine().clickButton();
        return this;
    }
}
