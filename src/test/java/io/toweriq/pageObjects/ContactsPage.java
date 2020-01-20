package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.DropDownList;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;

public class ContactsPage extends AbstractPage{

    private By contactsPageHeader = By.xpath("//h1[text()='Contacts']");
    private By createContactButton = By.id("contactCreate");
    private By clientDropDownField = By.id("account");
    private By clientSearchField = By.id("select-account-search");
    private By createClientFromContact = By.id("selectBox-account");
    private By clientDropDownOptionsWindow = By.xpath("//*[id='account']/div[2]");
    private By selectFirstClientOption = By.xpath("//div[@id='account']/div[2]/div[data-for='option-item_0']");
    private By selectSecondClientOption = By.xpath("//div[@id='account']/div[2]/div[data-for='option-item_1']");
    private By selectThirdClientOption = By.xpath("//div[@id='account']/div[2]/div[data-for='option-item_2']");

    @Getter
    TextField ContactsPageHeader = new TextField(contactsPageHeader,"Header of the 'Contacts' page");
    @Getter
    Button CreateContactButton = new Button(createContactButton,"Click on the 'Create account' button");
    @Getter
    DropDownList ClickOnClientDropDownField = new DropDownList(clientDropDownField,"Click on the 'Client' drop-down field");
    @Getter
    InputField EnterAccountForSearch = new InputField(clientSearchField,"Enter some text into account search");
    @Getter
    Button ClickOnCreateNewAccountLink = new Button(createClientFromContact,"Click on the '+Create new account' link");
    @Getter
    TextField ClientsDropDownOptions = new TextField(clientDropDownOptionsWindow,"Select the client from 'Client' drop-down field");
    @Getter
    DropDownList SelectFirstOptionFromDropDown = new DropDownList(selectFirstClientOption, "Selecting the first option from 'Client' drop-down field");
    @Getter
    Button SelectSecondOptionFromDropDown = new Button(selectSecondClientOption, "Selecting the second option from 'Client' drop-down field");
    @Getter
    Button SelectThirdOptionFromDropDown = new Button(selectThirdClientOption, "Selecting the third option from 'Client' drop-down field");



    @Step("Click on the 'Create contact' button")
    public ContactsPage clickOnCreateContactButton(){
        getCreateContactButton().clickButton();
        return this;
    }
    @Step("Click on the 'Client' drop-down field")
    public ContactsPage clickOnClientDropDownField(){
        getClickOnClientDropDownField().click();
        return this;
    }
    @Step("Select the client from 'Client' drop-down field")
    public ContactsPage chooseClient(){
        getClientsDropDownOptions().getText();
        return this;
    }
    @Step("Enter text into the 'Search account' field")
    public ContactsPage enterTextIntoSearchAccountField(String text){
        getEnterAccountForSearch().setText(text);
        return this;
    }
    @Step("Select the firs option from the 'Client' drop-down list")
    public ContactsPage selectFirstOptionFromClientList(){
        getSelectFirstOptionFromDropDown().getText();
        return this;
    }

}
