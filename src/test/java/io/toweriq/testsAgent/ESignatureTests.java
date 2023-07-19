package io.toweriq.testsAgent;

import org.testng.annotations.Test;

import java.util.Random;

public class ESignatureTests extends TestBase {

    @Test(description = "Open the 'E-Signature' page")
    public void openESignaturePage(){
        fillSignaturePage();
        signaturePage
                .getESignaturePageHeader().isExists();
    }


    private String generateSignatureName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String name = "Test Signature " + a;
        System.out.println(name);
        return name;
    }
}
