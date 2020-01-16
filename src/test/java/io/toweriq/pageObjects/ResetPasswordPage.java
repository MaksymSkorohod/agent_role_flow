package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.Elements.Button;
import io.toweriq.Elements.InputField;
import lombok.Getter;
import org.openqa.selenium.By;

public class ResetPasswordPage {

    private By emailFieldToRestorePassword = By.xpath("//input[@id='email']");
    private By resetPasswordButton = By.xpath("//div[text()='Reset password']");
    private By backToSignInPage = By.xpath("//div[text()='Back to Sign In']");

    @Getter
    InputField EmailFieldToRestore = new InputField(emailFieldToRestorePassword, "Email Address");
    @Getter
    Button ResetPasswordButton = new Button(resetPasswordButton, "Reset passwor button");
    @Getter
    Button BackToSignInPage = new Button(backToSignInPage, "Back to Sign In page button");



    @Step("Enter email into the 'Email Address field'")
    public ResetPasswordPage typeEmail(String email) {
        getEmailFieldToRestore().setText(email);
        return this;
    }

    public ResetPasswordPage clickResetPasswordButton(){
        getResetPasswordButton().clickButton();
        return this;
    }

    public SignInPage clickBackToSignInPage(){
        getBackToSignInPage().clickButton();
        return new SignInPage();
    }

}
