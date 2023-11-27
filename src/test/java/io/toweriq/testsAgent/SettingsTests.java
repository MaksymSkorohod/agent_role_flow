package io.toweriq.testsAgent;

import org.testng.annotations.Test;

public class SettingsTests extends TestBase {

    @Test(description = "Open Settings page and return back on the Home page")
    public void openSettingsPage(){
        fillSettingsPage();
        settingsPage
                .getSettingsPageHeader().isExists();
        settingsPage
                .getBrokerageInformationPageHeader().isExists();
    }
}
