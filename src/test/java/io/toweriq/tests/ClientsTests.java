package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class ClientsTests extends TestBase {


    @Test(description = "Open 'Companies' page")
    public void openClientsPage(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
    }
    @Test(description = "Creating a new Insured Company from the 'All Companies' page")
    public void createInsuredCompany(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnCompanyCreateButton()
                .selectClientOption()
                .clickNextButton()
                .typeClientName(generateClientName())
                .clickLifecycleDropdown()
                .selectInsuredStage()
                .typeUrl(generateClientUrl())
                .clickOnFinishButton();
//                .checkSuccessCompanyCreated("company was created!");
    }
    @Test(description = "Creating a new 'Prospect' from the 'All Companies' page")
    public void createNewProspect(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnCompanyCreateButton()
                .selectClientOption()
                .clickNextButton()
                .typeClientName(generateClientName())
                .clickLifecycleDropdown()
                .selectProspectStage()
                .typeUrl(generateClientUrl())
                .clickOnFinishButton();
    }

    @Test(description = "Creating a new 'Lead' from the 'All Companies' page")
    public void createNewLead(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnCompanyCreateButton()
                .selectClientOption()
                .clickNextButton()
                .typeClientName(generateClientName())
                .clickLifecycleDropdown()
                .selectLeadStage()
                .typeUrl(generateClientUrl())
                .clickOnFinishButton()
                .getSuccessCompanyCreationMessage().isExists();
    }

    @Test(description = "Cancel creation of the new Client")
    public void clickOnCancelButtonForCreatingClient() {
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnCompanyCreateButton()
                .selectClientOption()
                .clickNextButton()
                .typeClientName(generateClientName())
                .clickLifecycleDropdown()
                .selectLeadStage()
                .typeUrl(generateClientUrl())
                .clickOnCancelButton();
    }
    @Test(description = "Creating the Prospect company with the primary contact")
    public void createProspectWithTheContact(){
        fillCompanyPage();
        companiesPage
                .getAllCompaniesPageHeader().isExists();
        companiesPage
                .clickOnCompanyCreateButton()
                .selectClientOption()
                .clickNextButton()
                .typeClientName(generateClientName())
                .clickLifecycleDropdown()
                .selectProspectStage()
                .typeUrl(generateClientUrl())
                .clickPrimaryContactDropdown()
                .typeSomeNameInSearchField("Blah Blah")
                .clickCreateNewContactLink()
                .typeFirsNameForPrimaryContact(generateContactFirstName())
                .typeLastNameForPrimaryContact(generateContactLastName())
                .typeEmailForPrimaryContact(generateContactEmail())
                .clickCreateForPrimaryContact();
    }



    private String generateClientName() {
        Random random = new Random();
        int a = random.nextInt(10000) + 1;
        String name = "Test Company " + a;
        System.out.println(name);
        return name;
    }

    private String generateClientUrl() {
        Random random = new Random();
        int b = random.nextInt(10000) + 1;
        String url = "www.testcompany" + b + ".com";
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
        int d = random.nextInt(10000) + 1;
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
