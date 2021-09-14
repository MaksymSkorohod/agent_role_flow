package io.toweriq.pageObjects;

import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class CustomFormsPage extends AbstractPage {
    private By customFormsPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/h3");

    @Getter
    TextField CustomFormsPageHeader = new TextField(customFormsPageHeader, "The page header of the Transactions page");
}
