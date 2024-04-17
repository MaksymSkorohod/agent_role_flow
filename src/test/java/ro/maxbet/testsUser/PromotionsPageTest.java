package ro.maxbet.testsUser;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PromotionsPageTest extends TestBase{
    @Test(description = "Open the 'Promotions' page")
    public void openPromotionPageTest(){
        fillPromotionPage();
        promotionsPage
                .getContentBlockOnPromotionPage().isExists();
        promotionsPage
                .getPlayNowButton().isExists();
    }
    @Test(description = "Click on the 'Opt In' button")
    public void clickOnPlayNowButton(){
        fillPromotionPage();
        promotionsPage
                .getContentBlockOnPromotionPage().isExists();
        promotionsPage
                .clickOnPlayNowButton()
                .getTitleOfPromoPage().isExists();
    }
    @Test(description = "Click on the button from the block section on the 'Promotions' page")
    public void clickButtonOfSection(){
        fillPromotionPage();
        promotionsPage
                .getContentBlockOnPromotionPage().isExists();
        promotionsPage
                .clickOnButtonInBlock();
    }
}
