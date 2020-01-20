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

    @Test(description = "Overview of 'Notifications' page")
    public void setAllNotificationForInApp(){
        homePage
                .getUserIcon().isExists();
        homePage
                .clickOnProfileIcon()
                .clickOnProfilePreferencesLink()
                .clickOnNotificationsTab();
    }
}

