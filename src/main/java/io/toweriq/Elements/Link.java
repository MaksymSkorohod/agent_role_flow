package io.toweriq.Elements;

import org.openqa.selenium.By;

public class Link extends TextField {
    public Link(By locator, String description) {
        super(locator, description);
    }

    public void clickLink(){
        get().click();
    }
}
