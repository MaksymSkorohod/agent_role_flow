package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProspectsPage extends AbstractPage{

    private By prospectsPageHeader = By.xpath("//h1[text()='Prospects']");
    private By newProspectButton = By.id("clientCreate");
    private By newProspectDialogModal = By.id("client-dialog-title");
    private By prospectNameField = By.id("clientName");
    private By prospectUrl = By.id("website");
    private By firstNameProspect = By.id("firstName");
    private By lastNameProspect = By.id("lastName");
    private By prospectPrimaryContactEmail = By.id("email");
    private By prospectNameIsRequired = By.id("clientName_field_error");
    private By firstNameFieldIsRequired = By.id("firstName_field_error");
    private By lastNameFieldIsRequired = By.id("lastName_field_error");
    private By emailFieldIsRequired = By.id("email_field_error");
    private By notValidContactEmailAddress = By.xpath("//*[@id='new-client-form']/div[1]/div[2]/div[3]/div[text()='Contact email is not valid']");
    private By createProspectButton = By.id("create-client-button-confirm");
    private By cancelProspectCreation = By.id("create-client-button-cancel");
    private By successNotification = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div");
    private By prospectLandingPage = By.id("prospect-landing-page");


    @Getter
    TextField ProspectsPageHeader = new TextField(prospectsPageHeader, "The 'Prospects' page header is visible");
    @Getter
    Button NewProspectButton = new Button(newProspectButton, "The 'New prospect' button");
    @Getter
    TextField NewProspectDialogModal = new TextField(newProspectDialogModal, "The 'New prospect' modal window");
    @Getter
    InputField ProspectNameField = new InputField(prospectNameField, "The 'Prospect name' input field");
    @Getter
    InputField ProspectUrl = new InputField(prospectUrl, "The 'Website URL' input field");
    @Getter
    InputField FirstNameProspect = new InputField(firstNameProspect, "The 'First name' input field for the primary contact of the Prospect");
    @Getter
    InputField LastNameProspect = new InputField(lastNameProspect, "The 'Last name' input field for the primary contact of the Prospect");
    @Getter
    InputField ProspectPrimaryContactEmail = new InputField(prospectPrimaryContactEmail, "The 'Email' input field for the primary contact of the Prospect");
    @Getter
    TextField FirstNameFieldIsRequired = new TextField(firstNameFieldIsRequired, "Warning message that the 'First name' field is required");
    @Getter
    TextField LastNameFieldIsRequired = new TextField(lastNameFieldIsRequired, "Warning message that the 'Last name' field is required");
    @Getter
    TextField EmailFieldIsRequired = new TextField(emailFieldIsRequired, "Warning message that the 'Email' field is required");
    @Getter
    TextField NotValidContactEmailAddress = new TextField(notValidContactEmailAddress, "Warning message that email address is not valid");
    @Getter
    Button CreateProspectButton = new Button(createProspectButton, "The 'Create and return' button for the new prospect");
    @Getter
    Button CancelProspectCreation = new Button(cancelProspectCreation, "The 'Cancel' button for creation of new prospect");
    @Getter
    TextField ProspectNameIsRequired = new TextField(prospectNameIsRequired, "Message 'This field is required' for the 'Prospect name' field");
    @Getter
    TextField TheFirstNameFieldIsRequired = new TextField(firstNameFieldIsRequired, "Message 'This field is required' for the 'First name' field");
    @Getter
    TextField TheLastNameFieldIsRequired = new TextField(lastNameFieldIsRequired, "Message 'This field is required' for the 'Last name' field");
    @Getter
    TextField TheEmailFieldIsRequired = new TextField(emailFieldIsRequired, "This field is required");
    @Getter
    TextField TheEmailIsNotValidForContact = new TextField(notValidContactEmailAddress, "Contact email is not valid");
    @Getter
    TextField SuccessNotification =new TextField(successNotification,"The success notification that the Prospect was created");
    @Getter
    TextField ProspectLandingPage = new TextField(prospectLandingPage, "The prospects landing page");

    @Step("Click on the 'New prospect' button")
    public ProspectsPage clickNewProspectButton(){
        DriverManager.webDriverWait();
        getNewProspectButton().clickButton();
        return  this;
    }
    @Step("Enter the name of the company into the 'Prospect name' field")
    public ProspectsPage typeProspectName(String prospectName) {
        getProspectNameField().setText(prospectName);
        System.out.println(prospectName);
        return this;
    }
    @Step("Enter the website of the prospect company into the 'Website URL' field")
    public ProspectsPage typeUrl(String Url) {
        getProspectUrl().setText(Url);
        System.out.println(Url);
        return this;
    }
    @Step("Enter the first name of the prospect primary contact user into the 'First name' field")
    public ProspectsPage typeFirstName(String firstName) {
        getFirstNameProspect().setText(firstName);
        System.out.println(firstName);
        return this;
    }
    @Step("Enter the last name of the prospect primary contact user into the 'Last name' field")
    public ProspectsPage typeLastName(String lastName) {
        getLastNameProspect().setText(lastName);
        System.out.println(lastName);
        return this;
    }
    @Step("Enter the email address of the prospect primary contact user into the 'First name' field")
    public ProspectsPage typeEmailAddress(String emailAddress) {
        getProspectPrimaryContactEmail().setText(emailAddress);
        System.out.println(emailAddress);
        return this;
    }
    @Step("Click on the 'Create and return' button to create new Prospect")
    public ProspectsPage clickCreateAndReturn(){
        getCreateProspectButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public ProspectsPage clickCancel(){
         getCancelProspectCreation().clickButton();
        return this;
    }
    @Step("The warning message for 'Prospect name' field for the primary contact of the Prospect is shown")
    public void  checkProspectNameFieldWarningText(String expected) {
        String actual = getProspectNameIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'First name' field for the primary contact of the Prospect is shown")
    public void  checkFirstNameFieldWarningText(String expected) {
        String actual = getTheFirstNameFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Last name' field for the primary contact of the Prospect is shown")
    public void  checkLastNameFieldWarningText(String expected) {
        String actual = getTheLastNameFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Email' field for the primary contact of the Prospect is shown")
    public void  checkEmailFieldWarningText(String expected) {
        String actual = getTheEmailFieldIsRequired().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("The warning message for 'Email' field for the primary contact is shown")
    public void  checkEmailErrorMessage(String expected) {
        String actual = getTheEmailIsNotValidForContact().getText();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }

}
