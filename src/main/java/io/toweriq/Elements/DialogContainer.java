package io.toweriq.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DialogContainer extends BaseElement {
    public DialogContainer(By locator, String description) {
        super(locator, description);
    }

    public String getText() {
        return get().getText();
    }

    public void select(int id) {
        getSelectElement().selectByIndex(id);
    }

    public void SelectOption(String text) {

        getSelectElement().selectByVisibleText(text);
    }
    private Select getSelectElement() {
        return new Select(get());
    }

    public void click() {
        get().click();
    }

    public void setText(String text) {
        get().sendKeys(text);
    }
    public void clear() {
    }
    public void clickButton(){
        get().click();
    }
}