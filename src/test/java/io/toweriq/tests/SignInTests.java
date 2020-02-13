package io.toweriq.tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.toweriq.pageObjects.HomePage;
import io.toweriq.pageObjects.SignInPage;
import org.testng.annotations.Test;

public class SignInTests extends TestBase {

    @Override
    public void signIn(){
        homePage = new HomePage();
    }
    @Test(priority = 0, description = "Successful Sign In")
    @Severity(SeverityLevel.NORMAL)
    public void signInTest() {
        new SignInPage()
                .clearEmailField()
                .typeEmail("toweriqautotest+1@gmail.com")
                .typePassword("Vfrcbv82")
                .setRememberMe(true)
                .clickSignInButton()
                .getUserIcon().isExists();
    }

    @Test(description = "Empty email field")
    public void emptyEmailField(){
        new SignInPage()
                .clearEmailField()
                .typeEmail("  ")
                .typePassword("Vfrcbv82")
                .setRememberMe(true)
                .clickWithWrongCredentials()
                .checkEmailErrorText("Email is required and should not be less than 6 characters long");
    }

    @Test(description = "Incorrect Email address")
    public void wrongEmailAddress(){
        new SignInPage()
                .clearEmailField()
                .typeEmail("toweriqautotestgmail.com")
                .typePassword("Vfrcbv82")
                .setRememberMe(true)
                .clickWithWrongCredentials()
                .checkEmailErrorText("Email is not valid, only letters (a-z), numbers (0-9), and periods (.) are allowed.");
    }

    @Test(description = "Wrong password notification")
    public void wrongPassword() throws InterruptedException {
        new SignInPage()
                .clearEmailField()
                .typeEmail("toweriqautotest+1@gmail.com")
                .typePassword("Vfrcbv19821111111")
                .setRememberMe(true)
                .clickWithWrongCredentials()
                .getWrongPassword().isExists();
        new SignInPage()
                .checkPasswordErrorText("Password does not match email address");
    }

    @Test(description = "Click on forget password link")
    public void forgetPassword(){
        new SignInPage()
                .clickForgotPassword()
                .clickBackToSignInPage();
    }

    @Test(description = "Send email to restore Agent's password")
    public void sendRestorePassword(){
        new SignInPage()
                .clickForgotPassword()
                .typeEmail("toweriqautotest+1@gmail.com")
                .clickResetPasswordButton()
                .clickBackToSignInPage();
    }


}
