package io.toweriq.tests;

import io.toweriq.pageObjects.HomePage;
import io.toweriq.pageObjects.SignInPage;
import org.testng.annotations.*;

import static io.toweriq.DriverManager.getDriver;
import static io.toweriq.DriverManager.killDriver;

public class TestBase {

    protected HomePage homePage;

    @BeforeMethod
    public void signIn() {
        homePage = new SignInPage()
                .clearEmailField()
                .typeEmail("toweriqautotest+1@gmail.com")
                .typePassword("Vfrcbv82")
                .setRememberMe(true)
                .clickSignInButton();
    }


    @BeforeMethod
    public void openSignInPage(){
        getDriver().get("https://app.mytoweriq.com/sign-in");
    }


    @AfterMethod
    public void close(){
      killDriver();
    }
}
