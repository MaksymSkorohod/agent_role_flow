package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.Link;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class FormsPage extends AbstractPage {
    private By formsPageHeader = By.xpath("//div[@id='root']//div[2]//h1");
    private By searchForAForm = By.id("tiq-unknown-search-input");
    private By acordFormsBlock = By.xpath("//div[@id='root']//div[@role='button']//h3[.='ACORD']");
    private By acord125 = By.xpath("//div[@id='root']//div/span[.='ACORD 125']");
    private By acord126 = By.xpath("//div[@id='root']//div/span[.='ACORD 126']");
    private By foundFormLocator = By.xpath("//div/label/span[text()='ACORD COMMERCIAL INSURANCE APPLICATION - 125']");

    @Getter
    TextField FormsPageHeader = new TextField(formsPageHeader,"The forms page header with text 'Please select the forms you would like to use in your next transaction'.");
    @Getter
    InputField SearchForAForm = new InputField(searchForAForm,"Enter the form name");
    @Getter
    TextField FoundFormLocator = new TextField(foundFormLocator,"The searchable form from the list of the forms");
    @Getter
    TextField AcordBlock = new TextField(acordFormsBlock,"The 'ACORD' block is exists");
    @Getter
    Link Acord125 = new Link(acord125,"Select 'ACORD 125' form from the block");
    @Getter
    Link Acord126 = new Link(acord126,"Select 'ACORD 126' form from the block");


    @Step("Clear search field")
    public FormsPage clearSearchField(){
        getSearchForAForm().clear();
        return this;
    }
    @Step("Enter the form name into the 'Search' field")
    public FormsPage typeFormName(String formName){
        getSearchForAForm().setText(formName);
        System.out.println(formName);
        return this;
    }
    @Step("Click on the selected form")
    public FormsPage clickOnTheForm(){
        getFoundFormLocator().getText();
        return this;
    }
    @Step("Choose 'ACORD 125' form")
    public FormsPage chooseAcord125(){
        getAcord125().clickLink();
        return this;
    }

}
