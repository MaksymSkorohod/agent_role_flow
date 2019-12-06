package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountsTest extends TestBase {

    @Test(description = "Cancel creation of the new Account")
    public void clickOnCancelButtonForCreatingAccount(){
        homePage
                .getAccountsLink().isExists();
        homePage
                .clickOnAccountsLink()
                .clickOnAccountCreateButton()
                .typeAccountName(generateAccountNumber())
                .typeUrl(generateAccountUrl())
                .typeCityName("San Francisco")
                .clickOnCancelButton();
    }

    @Test (description = "Creating new Account")
    public void createAccount(){
        homePage
                .getAccountsLink().isExists();
        homePage
                .clickOnAccountsLink()
                .clickOnAccountCreateButton()
                .typeAccountName(generateAccountNumber())
                .typeUrl(generateAccountUrl())
                .clickIndustryDropDown()
                .selectIndustryOption("Energy")
                .clickToShowNumberOfEmployees()
                .selectEmployeesOption(">201")
                .typeStreetName(generateStreetAddress())
                .typeCityName("San Francisco")
                .clickToShowStates()
                .selectStateOption("CA")
                .typeZipCode("90012")
                .clickOnCreateAndReturnButton();
    }




    private String generateAccountNumber() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String account = "Test Account " + a;
        return account;
    }

    private String generateAccountUrl() {
        Random random = new Random();
        int b = random.nextInt(1000) + 1;
        String url = "www.testaccount" + b + ".com";
        System.out.println(url);
        return url;
    }

    private String generateStreetAddress() {
        Random random = new Random();
        int c = random.nextInt(1000) + 1;
        String street = "Alameda " + c;
        System.out.println(street);
        return street;
    }
}
