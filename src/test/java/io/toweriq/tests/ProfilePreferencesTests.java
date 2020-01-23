package io.toweriq.tests;

import io.toweriq.Elements.TextField;
import org.testng.annotations.Test;

public class ProfilePreferencesTests extends TestBase {

    @Test(description = "Profile&Preferences overview")
    public void clickOnProfilePreferencesTabs(){
        homePage
                .getUserIcon().isExists();
        homePage
                .clickOnProfileIcon()
                .clickOnProfilePreferencesLink()
                .clickOnNotificationsTab()
                .clickOnProfileTab();
    }

    @Test(description = "Set all notifications for 'In-app' and discard changes")
    public void setAllNotificationForInApp(){
        homePage
                .getUserIcon().isExists();
        homePage
                .clickOnProfileIcon()
                .clickOnProfilePreferencesLink()
                .clickOnNotificationsTab()
                .clickOnInappForAll()
                .clickOnInappForAll()
                .discardChangesForNotifications();
    }

    @Test(description = "Set all notifications for 'Email' and discard changes")
    public void setAllNotificationForEmail(){
        homePage
                .getUserIcon().isExists();
        homePage
                .clickOnProfileIcon()
                .clickOnProfilePreferencesLink()
                .clickOnNotificationsTab()
                .clickOnEmailForAll()
                .clickOnEmailForAll()
                .discardChangesForNotifications();
    }
}

