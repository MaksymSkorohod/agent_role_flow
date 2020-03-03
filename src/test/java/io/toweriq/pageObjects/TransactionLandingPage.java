package io.toweriq.pageObjects;

import org.openqa.selenium.By;

public class TransactionLandingPage extends AbstractPage {

    private By transactionsPageHeader = By.xpath("//div[@id='root']//div//h1");
    private By transactionsLink = By.id("sidebarMenuItemTransactions");

}
