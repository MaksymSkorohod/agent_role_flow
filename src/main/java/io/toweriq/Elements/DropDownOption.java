package io.toweriq.Elements;

import org.openqa.selenium.By;

public class DropDownOption extends TextField {
    public DropDownOption(By locator, String description) {
        super(locator, description);
    }

    public void clickOption(){
        get().click();
    }
}
