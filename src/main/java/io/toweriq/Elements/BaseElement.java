package io.toweriq.Elements;

import org.openqa.selenium.By;

public class BaseElement {

    private By locator;
    private String description;

    public BaseElement(By locator, String description){
        this.locator = locator;
        this.description = description;
    }
}
