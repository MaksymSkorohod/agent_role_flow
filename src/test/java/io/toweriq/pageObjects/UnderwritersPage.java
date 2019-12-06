package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class UnderwritersPage extends AbstractPage{

    private By profileTab = By.id("transactionTabProfile");
    private By notificationsTab = By.id("transactionTabNotifications");
    private By addUnderwriterButton = By.id("add-underwriter-button");


    @Getter
    Button ClickOnProfileTab = new Button(profileTab, "Click on the 'Profile' tab");
    @Getter
    Button ClickOnNotificationsTab = new Button(notificationsTab, "Click on the 'Notifications' tab");
    @Getter
    Button AddUnderwriterButton = new Button(addUnderwriterButton, "The 'Add underwriter' button");


    @Step("Click on the 'Profile' tab")
    public ProfileAndPreferencesPage clickOnProfileTab(){
        getClickOnProfileTab().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Notifications' tab")
    public NotificationPage clickOnNotificationsTab(){
        getClickOnNotificationsTab().clickButton();
        return new NotificationPage();
    }
    @Step("Click on the 'Add underwriter' button")
    public UnderwritersPage clickAddUnderwriterButton(){
      getAddUnderwriterButton().clickButton();
      return this;
  }
}
