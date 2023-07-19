package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class PoliciesPage extends AbstractPage {

    private By policiesPageHeader = By.xpath("//h1[text()='Policies']");
    private By policyInPoliciesTable = By.xpath("//table[@id='policies-table']//tr[1]/td[1]//a");
    private By policyLandingPage = By.id("policy-landing-page");

    @Getter
    TextField PoliciesPageHeader = new TextField(policiesPageHeader, "The 'Policies' label is visible");
    @Getter
    Link PolicyNameInPoliciesTable = new Link(policyInPoliciesTable,"The policy name in the 'Policies' table");
    @Getter
    TextField PolicyLandingPage = new TextField(policyLandingPage, "The policy landing page header is visible");

    @Step("Click on the policy name from the table on the 'Policies' page")
    public PoliciesPage clickOnPolicyFromTable(){
        DriverManager.webDriverWait();
        getPolicyNameInPoliciesTable().clickLink();
        return this;
    }
}
