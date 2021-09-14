package io.toweriq.pageObjects;

import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class ProposalsPage extends AbstractPage {
    private By proposalsPageHeader = By.xpath("//div[@id='root']//div//h1");

    @Getter
    TextField ProposalsPageHeader = new TextField(proposalsPageHeader, "The page header of the Proposals template page");
}
