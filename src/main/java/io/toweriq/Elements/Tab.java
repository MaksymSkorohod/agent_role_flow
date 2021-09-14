package io.toweriq.Elements;
import org.openqa.selenium.By;

public class Tab extends TextField{
    public Tab(By locator, String description) {
        super(locator, description);
}
public void clickTab(){
    get().click();}
}
