package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class ManageUsersPage extends AbstractPage{

    private By manageUsersBackLink = By.id("settingsUsersBackLink");
    private By addUserButton = By.id("settingsUsersAddUser");

    @Getter
    Button BackLinkFromManageUsers = new Button(manageUsersBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Manage Users page")
    public ManageUsersPage clickBackLinkOnManageUsersPage(){
        getBackLinkFromManageUsers().clickButton();
        return this;
    }
}
