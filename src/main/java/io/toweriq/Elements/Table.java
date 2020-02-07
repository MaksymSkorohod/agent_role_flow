package io.toweriq.Elements;

import org.openqa.selenium.By;

public class Table extends BaseElement {

    public Table(By locator, String description) {
        super(locator, description);
    }

    public String getText(){
        return get().getText();
    }


}
