package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class CreateClientsTest extends TestBase {

    @Test(description = "Open 'Clients' page")
    public void openAccountsPage(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .getCreateNewClientButton().isExists();
    }

    @Test(description = "Cancel creation of the new Client")
    public void clickOnCancelButtonForCreatingClient() throws InterruptedException {
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickOnCloseButton();
    }

    @Test (description = "Creating new Client")
    public void createAccount(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickOnCreateAndReturnButton();
    }

    @Test(description = "Check if warning message appear for not filling out the 'First name' field for the primary contact")
    public void warningMessagesForPrimaryContactFirstNameField(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickOnCreateAndReturnButton()
                .checkFirstNameFieldWarningText("This field is required");
    }

    @Test(description = "Check if warning message appear for not filling out the 'Last name' field for the primary contact")
    public void warningMessagesForPrimaryContactLastNameField(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickOnCreateAndReturnButton()
                .checkLastNameFieldWarningText("This field is required");
    }

    @Test(description = "Check if warning message appear for not filling out the 'Email' field for the primary contact")
    public void warningMessagesForPrimaryContactEmailField(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .clickOnCreateAndReturnButton()
                .checkEmailFieldWarningText("This field is required");
    }

    @Test(description = "Check if error message appear for not valid email address for the primary contact")
    public void errorMessagesForPrimaryContactEmailField(){
        homePage
                .getClientsLink().isExists();
        homePage
                .clickOnClientsLink()
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact("chitauriwarriormail.com")
                .clickOnCreateAndReturnButton()
                .checkEmailErrorMessage("Contact email is not valid");
    }

    private String generateClientName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String name = "Test Client " + a;
        System.out.println(name);
        return name;
    }

    private String generateClientUrl() {
        Random random = new Random();
        int b = random.nextInt(1000) + 1;
        String url = "www.testclient" + b + ".com";
        System.out.println(url);
        return url;
    }

    private String generateContactFirstName() {
        String name = "Chitauri";
        System.out.println(name);
        return name;
    }

    private String generateContactLastName() {
        Random random = new Random();
        int c = random.nextInt(1000) + 1;
        String lastName = "Warrior " + c;
        System.out.println(lastName);
        return lastName;
    }

    private String generateContactEmail() {
        Random random = new Random();
        int d = random.nextInt(1000) + 1;
        String email = "chitauriwarrior" + d + "@mail.com";
        System.out.println(email);
        return email;
    }
}
