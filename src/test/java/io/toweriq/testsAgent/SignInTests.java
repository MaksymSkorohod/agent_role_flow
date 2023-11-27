package io.toweriq.testsAgent;

import io.toweriq.pageObjects.HomePage;
import io.toweriq.pageObjects.SignInPage;
import org.testng.annotations.Test;

public class SignInTests extends TestBase {

    @Override
    public void signIn(){
        homePage = new HomePage();
    }

    @Test(description = "Successful Sign In")
    public void signInTest() {
        new SignInPage()
                .getWelcomeBackText().isExists();
        new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getRememberCheckBox().isExists();
        new SignInPage()
                .typePassword("Vfrcbv82")
                .clickRememberMeCheckBox()
                .clickSignInButton()
                .getUserIcon().isExists();
    }
    @Test(description = "Empty email field")
    public void emptyEmailField(){
        new SignInPage()
                .typeEmail("  ")
                .checkEmailErrorText("Email is required and should not be less than 6 characters long");
    }
    @Test(description = "Incorrect Email address")
    public void wrongEmailAddress(){
        new SignInPage()
                .typeEmail("toweriqautotest1outlook.com")
                .checkEmailErrorText("Email is not valid, only letters (a-z), numbers (0-9), stub line(-), and periods (.) are allowed.");
    }
    @Test(description = "Wrong password notification")
    public void wrongPassword() throws InterruptedException {
        new SignInPage()
                .getWelcomeBackText().isExists();
        new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getRememberCheckBox().isExists();
        new SignInPage()
                .typePassword("Vfrcbv19821111111")
                .clickWithWrongCredentials()
                .getWrongPassword().isExists();
        new SignInPage()
                .checkPasswordErrorText("Password does not match email address.");
    }
    @Test(description = "Click on forget password link")
    public void forgetPassword(){
        new SignInPage()
                .getWelcomeBackText().isExists();
        new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getForgotPassword().isExists();
        new SignInPage()
                .clickForgotPassword()
                .clickBackToSignInPage();
    }
    @Test(description = "Send email to restore Agent's password")
    public void sendRestorePassword(){
        new SignInPage()
                .getWelcomeBackText().isExists();
        new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getForgotPassword().isExists();
        new SignInPage()
                .clickForgotPassword()
                .typeEmail("toweriqautotest+1@gmail.com")
                .clickResetPasswordButton()
                .clickBackToSignInPage();
    }
    @Test(description = "Click on the 'Switch' button from the 'Sig In' page")
    public void clickSwitchButton(){
        new SignInPage()
                .getWelcomeBackText().isExists();
        new SignInPage()
                .typeEmail("toweriqautotest1@outlook.com")
                .clickSignInButton();
        new SignInPage()
                .getSwitchButton().isExists();
        new SignInPage()
                .switchClick();
    }
}
