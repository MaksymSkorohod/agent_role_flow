package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class TransactionSettingsPage extends AbstractPage{

    private By transactionBackLink = By.id("settingsTransactionsBackLink");
    private By myWorkflowTab = By.id("transactionTabMy workflows");
    private By myApplicationsTab = By.id("transactionTabMy applications");

    @Getter
    Button BackLinkFromTransactions = new Button(transactionBackLink, " Back to settings link");

    @Step("Click 'Back to settings' from Transaction Settings page")
    public TransactionSettingsPage clickBackLinkOnTransactionSettingsPage(){
        getBackLinkFromTransactions().clickButton();
        return this;
    }
}
