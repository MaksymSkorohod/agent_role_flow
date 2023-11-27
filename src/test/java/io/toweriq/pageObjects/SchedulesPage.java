package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class SchedulesPage extends AbstractPage {

    private By sideSchedulesButton = By.id("sidebarMenuItemSchedules");
    private By schedulePageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/h3[text()='Schedules']");

    @Getter
    Button SideSchedulesButton = new Button(sideSchedulesButton, "The 'Schedules' button in sidebar menu");
    @Getter
    TextField SchedulePageHeader = new TextField(schedulePageHeader,"The 'Schedules' page header");

    @Step("Click on the 'Schedules' button from the sidebar menu")
    public SignInPage clickOnSchedulesButton() {
        DriverManager.elementToBeClickable(sideSchedulesButton);
        return new SignInPage();
    }
}
