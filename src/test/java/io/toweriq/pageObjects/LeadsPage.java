package io.toweriq.pageObjects;

import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class LeadsPage extends AbstractPage {
    private By leadsPageHeader = By.xpath("//h1[text()='Leads']");


    @Getter
    TextField LeadsPageHeader = new TextField(leadsPageHeader, "The 'Leads' page header is visible");
}
