package io.toweriq.testsAgent;

import org.testng.annotations.Test;

import java.util.Random;

public class LibraryPageTests extends TestBase {

    @Test(description = "Open 'Forms' page")
    public void openFormsPage(){
        fillLibraryPage();
        libraryPage
                .getLibraryPageHeader().isExists();
    }



    private String generateTransactionName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String transaction = "Test Transaction " + a;
        System.out.println(transaction);
        return transaction;
    }

    }
