package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Check;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class NotificationPage extends AbstractPage{

    private By profileTab = By.id("transactionTabProfile");
    private By underwritersTab = By.id("transactionTabUnderwriters");
    private By allNotificationsInAppCheckBox = By.xpath("/html//input[@id='inapp']");
    private By allNotificationsInEmailCheckBox = By.id("email");
    private By saveNotificationChanges = By.id("save-changes-button");
    private By discardNotificationChanges = By.id("discard-changes-button");
    private By summaryNotificationsHeader = By.xpath("//form[@id='all-notifications']//h5[.='Summary']");


    @Getter
    Button ClickOnProfileTab = new Button(profileTab, "Click on the 'Profile' tab");
    @Getter
    Button ClickOnUnderwriterTab = new Button(underwritersTab, "Click on the 'Underwriter' tab");
    @Getter
    Check SetAllNotificationsInApp = new Check(allNotificationsInAppCheckBox, "Setting all notifications for In-app");
    @Getter
    Check SetAllNotificationsEmail = new Check(allNotificationsInEmailCheckBox, "Setting all notifications for Email");
    @Getter
    Button SaveChangesForNotifications = new Button(saveNotificationChanges, "Click on 'Save' button to save changes for notifications");
    @Getter
    Button DiscardSavingForNotifications = new Button(discardNotificationChanges, "Click on 'Discard' button notifications");
    @Getter
    TextField SummaryHeaderIsShown = new TextField(summaryNotificationsHeader,"Summary");



    @Step("Click on the 'Profile' tab")
    public ProfileAndPreferencesPage clickOnProfileTab(){
        getClickOnProfileTab().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Underwriters' tab")
    public UnderwritersPage clickOnUnderwriterPage(){
        getClickOnUnderwriterTab().clickButton();
        return new UnderwritersPage();
    }
    @Step("Summary header is visible")
    public NotificationPage summaryTextForNotifications(){
        getSummaryHeaderIsShown().getText();
        System.out.println(getSummaryHeaderIsShown());
        return this;
    }

    @Step("Setting all notifications for In-app")
    public NotificationPage checkNotificationsInApp(boolean to){
        if (to) {
            getSetAllNotificationsInApp().select();
        } else {
            getSetAllNotificationsInApp().unSelect();
        }
        return this;
    }
    @Step("Setting all notifications for Email")
    public NotificationPage checkNotificationsEmail(boolean to){
        if (to) {
            getSetAllNotificationsEmail().select();
        } else {
            getSetAllNotificationsEmail().unSelect();
        }
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
