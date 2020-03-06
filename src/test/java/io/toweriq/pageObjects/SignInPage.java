package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.Check;
import io.toweriq.Elements.InputField;
import io.toweriq.Elements.TextField;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignInPage {

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By viewPassword = By.cssSelector("[fill]");
    private By forgotPassword = By.xpath("//a[@href='/forgot-password']");
    private By agree = By.xpath("//input[@id='agree']");
    private By signInButton = By.id("signInBtn");
    private By signUpNow = By.cssSelector("[href='\\/agency']");
    private By emailErrorMessage = By.xpath("//*[@for='email']/../div[contains(@class, 'ValidationError-root')]");
    private By passwordErrorMessage = By.xpath("//*[@for='password']/../div[contains(@class, 'ValidationError-root')]");
    private By profileLink = By.id("accountProfile");


    @Getter
    InputField EmailField = new InputField(emailField, "Email Address");
    @Getter
    TextField ErrorEmailField = new TextField(emailErrorMessage, "Error email message");
    @Getter
    InputField PasswordField = new InputField(passwordField, "Password");
    @Getter
    Button ViewPassword = new Button(viewPassword, "Show password");
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
//        DriverManager.WebDriverWait();
        getEmailField().setText(email);
        System.out.println(email);
        return this;
    }
    @Step("The warning message for 'Email Address' field is shown")
    public void  checkEmailErrorText(String expected) {
        String actual = getErrorEmailField().getText();
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

    @Step("The warning message that password does not match")
    public void checkPasswordErrorText(String expected) throws InterruptedException {
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
//        DriverManager.WebDriverWait();
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
