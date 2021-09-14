package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class ProgramsPage extends AbstractPage{

    private By programsPageHeader = By.xpath("//h1[text()='Programs']");
    private By firstProgramInTable = By.xpath("//table[@id='programs-table']/tbody/tr[1]/td[1]//div/a");
    private By programLandingPageName = By.xpath("/html//div[@id='root']//div[@role='region']//h6']");


    @Getter
    TextField ProgramsPageHeader = new TextField(programsPageHeader, "The 'Programs' page header is visible");
    @Getter
    Link FirstProgramInTable = new Link(firstProgramInTable,"The first program in the 'Programs' table");
    @Getter
    TextField ProgramLandingPageName = new TextField(programLandingPageName, "The name of the program's lannding page");

    @Step("Click on the first program in the 'Programs' table")
    public ProgramsPage clickOnFirstProgramFromTable() {
        getFirstProgramInTable().clickLink();
        return this;
    }
}
