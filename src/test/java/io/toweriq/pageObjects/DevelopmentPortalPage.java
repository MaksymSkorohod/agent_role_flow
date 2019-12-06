package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class DevelopmentPortalPage extends AbstractPage{

    private By developmentPortalBackLink = By.id("settingsTransactionsBackLink");


    @Getter
    Button BackLinkFromDevelopmentPortal = new Button(developmentPortalBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Development portal page")
    public DevelopmentPortalPage clickBackLinkOnDevelopmentPortalPage(){
        getBackLinkFromDevelopmentPortal().clickButton();
        return this;
    }
}
