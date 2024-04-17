package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.Button;
import ro.maxbet.Elements.InputField;
import ro.maxbet.Elements.TextField;

public class LogInPage{
    private By topMainMenu = By.id("mainTopMenu");
    private By registerButton = By.xpath("//nav[@id='mainTopMenu']/auth-buttons/button[1]");
    private By registerModalTitle = By.xpath("//dialog-wrapper//div[@class='title']");
    private By logInButton = By.cssSelector(".btn.btn-red-restyle");
    private By logInModalWindow = By.cssSelector(".ng-star-inserted > .sign-in");
    private By logoOnLogInModal = By.cssSelector(".sign-in .logo");
    private By userNameInputField = By.cssSelector("[class='input text-center w-100']:nth-of-type(1) input");
    private By passwordInputField = By.cssSelector("[class='input text-center w-100']:nth-of-type(2) input");
    private By logInToMaxBetButton = By.xpath("//form[@class='content ng-dirty ng-touched ng-valid']/input[@value='Login to Maxbet']");
    private By warningNotificationsModal = By.cssSelector("body > div.overlay-dialog-container > dialog-wrapper > div > allow-notifications-popup > div");
    private By acceptAllNotificationsButton = By.cssSelector("body > div.overlay-dialog-container > dialog-wrapper > div > allow-notifications-popup > div > div.modal-footer > button.btn.btn-red-restyle");
    private By depositPopUp = By.xpath("//body[@class='ng-tns-0-3']//dialog-wrapper/div[2]");
    private By xButtonDepositPopUp = By.cssSelector(".close");

    @Getter
    TextField TopMainMenu = new TextField(topMainMenu,"The top menu of the 'Home' page");
    @Getter
    Button RegisterButton = new Button(registerButton,"The 'Register' button");
    @Getter
    TextField RegisterModalTitle = new TextField(registerModalTitle, "Title of the registration modal");
    @Getter
    InputField UserNameInputField = new InputField(userNameInputField, "The 'Username' input field");
    @Getter
    InputField PasswordInputField = new InputField(passwordInputField, "The 'Password' input field");
    @Getter
    Button LogInToMaxBetButton = new Button(logInToMaxBetButton, "The 'LOGIN TO MAXBET' button");
    @Getter
    Button LogInButton = new Button(logInButton,"The 'Log In' button");
    @Getter
    TextField LogoOnLogInModal = new TextField(logoOnLogInModal, "The 'Maxbet' logo on the log in modal");
    @Getter
    TextField LogInModalWindow = new TextField(logInModalWindow, "The 'Log in' modal window");
    @Getter
    TextField WarningNotificationsModal = new TextField(warningNotificationsModal,"The dialog container");
    @Getter
    Button AcceptAllNotificationsButton = new Button(acceptAllNotificationsButton,"The 'Accept' button for the dialog container");
    @Getter
    TextField DepositPopUp = new TextField(depositPopUp, "The 'Deposit' modal window");
    @Getter
    Button XButtonDepositPopUp = new Button(xButtonDepositPopUp, "The 'X' button for the deposit modal window");

    @Step("Click on the 'Register' button from the top menu")
    public LogInPage clickOnRegisterButton(){
        getRegisterButton().clickButton();
        return this;
    }
    @Step("Enter the user name into the 'USERNAME' input field")
    public LogInPage enterUserName(String username){
        DriverManager.elementToBeClickable(userNameInputField);
        getUserNameInputField().setText(username);
        System.out.println(username);
        return this;
    }
    @Step("Enter the password into the 'PASSWORD' input field")
    public  LogInPage enterPassword(String password){
        getPasswordInputField().setText(password);
        System.out.println(password);
        return this;
    }
    @Step("Click on the 'LOGIN TO MAXBET' button")
    public LogInPage clickOnLogInToMaxBetButton(){
        getLogInToMaxBetButton().clickButton();
        return this;
    }
    @Step("Click on the 'Log In' button from the top menu")
    public LogInPage clickOnLogInButton(){
        getLogInButton().clickButton();
        return new LogInPage();
    }
    @Step("Click on the 'Accept' button for the dialog conteiner")
    public LogInPage clickAcceptButton(){
        DriverManager.elementToBeClickable(acceptAllNotificationsButton);
        return new LogInPage();
    }
    @Step("Click on the 'X' button for the deposit pop-up window")
    public LogInPage clickXButtonForDepositPopUp(){
        DriverManager.elementToBeClickable(xButtonDepositPopUp);
        return new LogInPage();
    }

}
