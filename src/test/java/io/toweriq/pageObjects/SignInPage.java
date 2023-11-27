package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignInPage {

    private By welcomeBackText = By.xpath("//form[@id='personal-info-form']/div/div/div[1]/p[text()='Welcome back.']");
    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By switchButton = By.xpath("//*[@id=\"personal-info-form\"]/div/div/div[1]/p[2]/a[text()='Switch']");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By rememberCheckBox = By.xpath("//*[@id=\"remember\"]");
    private By viewPassword = By.cssSelector("[fill]");
    private By forgotPassword = By.xpath("//a[@href='/forgot-password']");
    private By agree = By.xpath("//input[@id='agree']");
    private By signInButton = By.id("signInBtn");
    private By signUpNow = By.cssSelector("[href='\\/agency']");
    private By emailErrorMessage = By.id("email_field_error");
    private By passwordErrorMessage = By.id("password_field_error");
    private By profileLink = By.id("accountProfile");


    @Getter
    TextField WelcomeBackText = new TextField(welcomeBackText,"The 'Welcome back' title");
    @Getter
    InputField EmailField = new InputField(emailField, "Email Address");
    @Getter
    TextField ErrorEmailField = new TextField(emailErrorMessage, "Error email message");
    @Getter
    Button SwitchButton = new Button(switchButton, "The 'Switch' button");
    @Getter
    InputField PasswordField = new InputField(passwordField, "Password");
    @Getter
    Button ViewPassword = new Button(viewPassword, "Show password");
    @Getter
    Button RememberCheckBox = new Button(rememberCheckBox,"The 'Remember me for 30 days' checkbox");
    @Getter
    Button ForgotPassword = new Button(forgotPassword, "Forgot my password");
    @Getter
    TextField WrongPassword = new TextField(passwordErrorMessage, "Password does not match email address");
    @Getter
    Check RememberMe = new Check(agree, "Remember me on this computer");
    @Getter
    Button SignInButton = new Button(signInButton, "Sign In button");
    @Getter
    Button SignUpNow = new Button(signUpNow, "Sign up now link");
    @Getter
    Button UserIcon = new Button(profileLink, "Profile icon is present");



    @Step("Clear input field")
    public SignInPage clearEmailField(){
        getEmailField().clear();
        return this;
    }
    @Step("Enter email into the 'Email Address field'")
    public SignInPage typeEmail(String email) {
        DriverManager.elementToBeClickable(emailField);//waitForElementVisible(emailField,10);
        getEmailField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("The warning message for 'Email Address' field is shown")
    public void  checkEmailErrorText(String expected) {
        String actual = getErrorEmailField().getText();
        DriverManager.webDriverWait();
        System.out.println("actual is: " + actual);
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
    @Step("Enter password into the 'Password' field")
    public SignInPage typePassword(String password) {
        getPasswordField().setText(password);
        System.out.println(password);
        return this;
    }
    @Step("Click on the 'Switch' button")
    public SignInPage switchClick(){
        DriverManager.elementToBeClickable(switchButton);
        return this;
    }
    @Step("Click on the 'Remember me for 30 days' checkbox")
    public SignInPage clickRememberMeCheckBox(){
        getRememberCheckBox().clickButton();
        return this;
    }

    @Step("The warning message that password does not match")
    public void checkPasswordErrorText(String expected) throws InterruptedException {
        DriverManager.webDriverWait();
        String actualText = getWrongPassword().getText();
        System.out.println(actualText);
        System.out.println(expected);
        Assert.assertEquals(actualText, expected);
        Assert.assertEquals(getWrongPassword().getText(), expected, "Password does not match email address");
    }

    public SignInPage setRememberMe(boolean to) {
        if (to) {
            getRememberMe().select();
        } else {
            getRememberMe().unSelect();
        }
        return this;
    }

    public ResetPasswordPage clickForgotPassword(){
        DriverManager.webDriverWait();
        getForgotPassword().clickButton();
        return new ResetPasswordPage();
    }

    public HomePage clickSignInButton() {
        getSignInButton().clickButton();
        return new HomePage();
    }

    public SignInPage clickWithWrongCredentials() {
        getSignInButton().clickButton();
        return new SignInPage();
    }

}
