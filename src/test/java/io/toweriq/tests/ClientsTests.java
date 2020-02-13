package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class ClientsTests extends TestBase {


    @Test(description = "Open 'Clients' page")
    public void openClientsPage(){
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
    }

    @Test(description = "Cancel creation of the new Client")
    public void clickOnCancelButtonForCreatingClient() {
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
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
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickOnCreateAndReturnButton()
                .getThePrimaryContactBlock().isExists();
    }

    @Test(description = "Check if warning message appear for not filling out the 'First name' field for the primary contact")
    public void warningMessagesForPrimaryContactFirstNameField(){
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
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
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
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
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
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
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
                .clickOnClientCreateButton()
                .typeClientName(generateClientName())
                .typeUrl(generateClientUrl())
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact("chitauriwarriormail.com")
                .clickOnCreateAndReturnButton()
                .checkEmailErrorMessage("Contact email is not valid");
    }
    @Test(description = "Open the Client's landing page")
    public void openClientLandingPage(){
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
                .clickOnClientFromTable()
                .getClientLandingPageHeader().isExists();
    }
    @Test(description = "Open 'Edit' mode from the client landing page")
    public void openEditModeForClient(){
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
                .clickOnClientFromTable()
                .clickOnEditClientButton()
                .clickOnXButton()
                .getEditClientDialogWindow().isEnable();
    }
    @Test(description = "Creating the new manually policy from the client's landing page")
    public void createNewManualPolicyFromClientPage(){
        fillClientsPage();
        clientsPage
                .getClientsPageHeader().isExists();
        clientsPage
                .clickOnAnotherClientFromTable()
                .clickOnNewPolicy()
                .selectFromManualInput()
                .clickNextToCreatePolicy()
                .typePolicyNumber(generatePolicyNumber())
                .clickCarrierDropDown()
                .searchFieldForCarriers("21 st Century Insurance")
                .selectCarrier()
                .clickLineOfBusinessDropDown()
                .selectLineOfBusiness()
                .clickInceptionDatePicker()
                .clickTodayButton()
                .clickExpirationDatePicker()
                .clickNextMonth()
                .clickNextMonth()
                .selectCurrentDate()
                .clickAttachFilesButton()
                .choosePdfFile()
                .clickAttachFileButton()
                .selectPolicyFile()
                .clickConfirmFileType()
                .typePremiumSum("800000")
                .typeAggregateLimitSum("500000")
                .typeDeductibleSum("300000")
                .confirmPolicyCreationButton();
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
    private String generatePolicyNumber() {
        Random random = new Random();
        int e = random.nextInt(100000) + 1;
        String policy = "PN # " + e;
        System.out.println(policy);
        return policy;
    }
}
