package io.toweriq.testsAgent;

import org.testng.annotations.Test;

public class PoliciesTests extends TestBase {

    @Test(description = "Open 'Policies' page")
    public void openPoliciesPage(){
        fillPoliciesPage();
        policiesPage
                .getPoliciesPageHeader().isExists();
    }
    @Test(description = "Open policy landing page")
    public void openPolicyLandingPage(){
        fillPoliciesPage();
        policiesPage
                .getPoliciesPageHeader().isExists();
        policiesPage
                .clickOnPolicyFromTable()
                .getPolicyLandingPage().isExists();
    }
}
