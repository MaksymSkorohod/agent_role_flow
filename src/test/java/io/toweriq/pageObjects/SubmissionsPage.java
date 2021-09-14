package io.toweriq.pageObjects;

import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class SubmissionsPage extends AbstractPage {
    private By submissionsPageHeader = By.xpath("//div[@id='root']//div/h1");

    @Getter
    TextField SubmissionPageHeader = new TextField(submissionsPageHeader, "The page header of the Transactions page");

}
