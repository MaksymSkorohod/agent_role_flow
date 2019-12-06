package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.DropDownList;
import io.toweriq.Elements.InputField;
import lombok.Getter;
import org.openqa.selenium.By;

public class AccountsPage extends AbstractPage {

    private By createAccountButton = By.id("accountCreate");
    private By accountNameField = By.id("accountName");
    private By websiteUrl = By.id("website");
    private By industryField = By.id("industry");
    private By industryOptions = By.xpath("//*[@id=\"industry\"]//div[text()=\"Energy\"]");
    private By employeesField = By.id("employees");
    private By employeesOption = By.xpath("//*[@id=\"employees\"]//div[text()=\">201\"]");
    private By addressLineField1 = By.id("address1");
    private By cityField = By.id("town");
    private By stateField = By.id("state");
    private By stateDropdownOption = By.xpath("//*[@id=\"state\"]//div[text()=\"CA\"]"); //%s
    private By zipCodeField = By.id("postal");
    private By cancelCreateButton = By.id("create-account-button-cancel");
    private By createAndReturnButton = By.id("create-account-button-confirm");


    @Getter
    Button CreateNewAccountButton = new Button(createAccountButton, "Click on the 'Create account' button");
    @Getter
    InputField AccountNameField = new InputField(accountNameField, "Account name");
    @Getter
    InputField AccountWebsite = new InputField(websiteUrl, "Website URL");
    @Getter
    DropDownList ClickOnIndustryDropDown = new DropDownList(industryField, "Industry");
    @Getter
    DropDownList ClickOnIndustryOption = new DropDownList(industryOptions,"Industry options");
    @Getter
    DropDownList ClickNumberOfEmployeesDropDown = new DropDownList(employeesField,"Number of employees");
    @Getter
    DropDownList ClickNumberOfEmployeesOption = new DropDownList(employeesOption,"Employees option");
    @Getter
    InputField StreetNameField = new InputField(addressLineField1, "Address Line 1");
    @Getter
    InputField CityNameField = new InputField(cityField,"Add city name");
    @Getter
    DropDownList ClickOnStateDropDown = new DropDownList(stateField,"State/Region");
    @Getter
    DropDownList ClickOnStateOption = new DropDownList(stateDropdownOption, "State/Region option");
    @Getter
    InputField ZipCodeField = new InputField(zipCodeField,"Postal code");
    @Getter
    DropDownList ClickStatesOption = new DropDownList(zipCodeField,"State option");
    @Getter
    Button CancelButton = new Button(cancelCreateButton,"Click on the 'Cancel' button for creating new account");
    @Getter
    Button CreateAndReturnButton = new Button(createAndReturnButton,"Click on the 'Create and return' button");


    @Step("Click on the 'Create account' button")
    public AccountsPage clickOnAccountCreateButton(){
        getCreateNewAccountButton().clickButton();
        return this;
    }
    @Step("Enter the name of the company into the 'Account name' field")
    public AccountsPage typeAccountName(String account) {
        getAccountNameField().setText(account);
        System.out.println(account);
        return this;
    }
    @Step("Enter Url of the company website into the 'Website URL' field")
    public AccountsPage typeUrl(String url){
        getAccountWebsite().setText(url);
        return this;
    }
    @Step("Click on the 'Industry' drop-down field")
    public AccountsPage clickIndustryDropDown(){
        ClickOnIndustryDropDown.click();
        return this;
    }
    @Step("Select industry option")
    public AccountsPage selectIndustryOption(String industry){
        getClickOnIndustryOption().click();
        System.out.println(industry);
        return this;
    }
    @Step("Select number of employees from the 'Number of employees' drop-down field")
    public AccountsPage clickToShowNumberOfEmployees(){
        ClickNumberOfEmployeesDropDown.click();
        return this;
    }
    @Step("Select employees option")
    public AccountsPage selectEmployeesOption(String employees){
        getClickNumberOfEmployeesDropDown().click();
        System.out.println(employees);
        return this;
    }
    @Step("Enter the name of the street into the 'Street Line 1' field")
    public AccountsPage typeStreetName(String street){
        getStreetNameField().setText(street);
        return this;
    }
    @Step("Enter the name of the city into the 'City' field")
    public AccountsPage typeCityName(String city){
        getCityNameField().setText(city);
        System.out.println(city);
        return this;
    }
    @Step("Click on the 'State/Region' drop-down field")
    public AccountsPage clickToShowStates(){
        ClickOnStateDropDown.click();
        return this;
    }
    @Step("Select state option")
    public AccountsPage selectStateOption(String text){
        getClickOnStateOption().click();
        return this;
    }
    @Step("Enter zip code into the 'Postal code' field")
    public AccountsPage typeZipCode(String zip){
        getZipCodeField().setText(zip);
        System.out.println(zip);
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public AccountsPage clickOnCancelButton(){
        getCancelButton().clickButton();
        return this;
    }
    @Step("Click on the 'Create and return' button")
    public AccountsPage clickOnCreateAndReturnButton(){
        getCreateAndReturnButton().clickButton();
        return this;
    }
}
