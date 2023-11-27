package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Check;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class NotificationPage extends AbstractPage{

    private By profileTab = By.id("transactionTabProfile");
    private By underwritersTab = By.id("transactionTabUnderwriters");
    private By allNotificationsInAppCheckBox = By.id("inapp");
    private By allNotificationsInEmailCheckBox = By.id("email");
    private By saveNotificationChanges = By.id("save-changes-button");
    private By discardNotificationChanges = By.id("discard-changes-button");
    private By summaryNotificationsHeader = By.xpath("//form[@id='all-notifications']//h5[.='Summary']");


    @Getter
    Button ClickOnProfileTab = new Button(profileTab, "Click on the 'Profile' tab");
    @Getter
    Button ClickOnUnderwriterTab = new Button(underwritersTab, "Click on the 'Underwriter' tab");
    @Getter
    Button SetAllNotificationsInApp = new Button(allNotificationsInAppCheckBox, "Setting all notifications for In-app");
    @Getter
    Button SetAllNotificationsEmail = new Button(allNotificationsInEmailCheckBox, "Setting all notifications for Email");
    @Getter
    Button SaveChangesForNotifications = new Button(saveNotificationChanges, "Click on 'Save' button to save changes for notifications");
    @Getter
    Button DiscardSavingForNotifications = new Button(discardNotificationChanges, "Click on 'Discard' button notifications");
    @Getter
    TextField SummaryHeaderIsShown = new TextField(summaryNotificationsHeader,"Summary");



    @Step("Click on the 'Profile' tab")
    public ProfileAndPreferencesPage clickOnProfileTab(){
        getClickOnProfileTab().clickButton();
//        DriverManager.WebDriverWait();
        return new ProfileAndPreferencesPage();
    }
    @Step("Setting all notifications for In-app")
    public NotificationPage clickOnInappForAll(){
        DriverManager.webDriverWait();
        getSetAllNotificationsInApp().clickButton();
        return this;
    }
    @Step("Setting all notifications for Email")
    public NotificationPage clickOnEmailForAll(){
        DriverManager.webDriverWait();
        getSetAllNotificationsEmail().clickButton();
        return this;
    }
    @Step("Click on 'Save' to save changes for notifications")
    public NotificationPage saveChangesForNotifications(){
        getSaveChangesForNotifications().clickButton();
        return this;
    }
    @Step("Click on 'Discard' to save changes for notifications")
    public NotificationPage discardChangesForNotifications(){
        getDiscardSavingForNotifications().clickButton();
        return this;
    }

}
