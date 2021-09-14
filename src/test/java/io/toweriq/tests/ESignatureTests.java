package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class ESignatureTests extends TestBase {

    @Test(description = "Open the 'E-Signature' page")
    public void openESignaturePage(){
        fillSignaturePage();
        signaturePage
                .getESignaturePageHeader().isExists();
    }
    @Test(description = "Create headless e-signuture draft")
    public void createESignatureDraft(){
        fillSignaturePage();
        signaturePage
                .getESignaturePageHeader().isExists();
        signaturePage
                .clickCreateSignatureButton()
                .enterSignatureName(generateSignatureName())
                .addDescription("For the test")
                .saveDraftButton()
                .clickBackToDashboard()
                .clickYesToConfirm();

    }

    private String generateSignatureName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String name = "Test Signature " + a;
        System.out.println(name);
        return name;
    }
}
