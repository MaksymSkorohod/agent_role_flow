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
                .clickOnUnderwriterPage()
                .clickOnProfileTab();
    }

    @Test(description = "Set all notification for In-app")
    public void setAllNotificationForInApp(){
        homePage
                .getUserIcon().isExists();
        homePage
                .clickOnProfileIcon()
                .clickOnProfilePreferencesLink()
                .clickOnNotificationsTab()
                .checkNotificationsEmail(true);
    }

}

