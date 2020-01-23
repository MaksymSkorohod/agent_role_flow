package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class ProfileAndPreferencesPage extends AbstractPage {

    private By profileLink = By.id("accountProfile");
    private By preferencesLink = By.id("accountPreferences");
    private By profileTab = By.id("transactionTabProfile");
    private By notificationsTab = By.id("transactionTabNotifications");
    private By underwritersTab = By.id("transactionTabUnderwriters");



    @Getter
    Button UserIcon = new Button(profileLink, "Click on the User's profile icon");
    @Getter
    Button ProfilePreferencesLink = new Button(preferencesLink, "Click on the 'Profile&Preferences' link");
    @Getter
    Button ClickOnProfileTab = new Button(profileTab, "Click on the 'Profile' tab");
    @Getter
    Button ClickOnNotificationsTab = new Button(notificationsTab, "Click on the 'Notifications' tab");
    @Getter
    Button ClickOnUnderwriterTab = new Button(underwritersTab, "Click on the 'Underwriter' tab");



    @Step("Click on the 'Profile' tab")
    public ProfileAndPreferencesPage clickOnProfileTab(){
        getClickOnProfileTab().clickButton();
        return this;
    }
    @Step("Click on the 'Notifications' tab")
    public NotificationPage clickOnNotificationsTab(){
        getClickOnNotificationsTab().clickButton();
        DriverManager.WebDriverWait();
        return new NotificationPage();
    }
    @Step("Click on the 'Underwriters' tab")
    public UnderwritersPage clickOnUnderwriterPage(){
        getClickOnUnderwriterTab().clickButton();
        return new UnderwritersPage();
    }


}
