package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.Button;
import ro.maxbet.Elements.TextField;

public class PromotionsPage extends AbstractPage{
private By contentBlockOnPromotionPage = By.cssSelector(".block_layer_2 .content");
private By playNowButton = By.cssSelector(".block_layer_2 .btn-red-restyle");
private By detailsButton = By.cssSelector(".block_layer_2 .btn-white-border");
private By titleOfPromoPage = By.cssSelector("playNowButton");
private By blockLayer1 = By.cssSelector(".block_layer_1");
private By button2BlockLayer = By.cssSelector("div:nth-of-type(2) > .btn");
private By button3BlockLayer = By.cssSelector(".ng-star-inserted:nth-of-type(3) button");

@Getter
    TextField ContentBlockOnPromotionPage = new TextField(contentBlockOnPromotionPage,"The content block on the 'Promotions' page");
@Getter
    Button PlayNowButton = new Button(playNowButton,"The 'Opt In' button in the content block on the 'Promotions' page");
@Getter
    Button DetailsButton = new Button(detailsButton,"The 'Details' button in the content block on the 'Promotions' page");
@Getter
TextField TitleOfPromoPage = new TextField(titleOfPromoPage,"The title of the Promo2 page");
@Getter
TextField BlockLayer1 = new TextField(blockLayer1, "The block section on the 'Promotions' page");
@Getter
Button Button2BlockLayer = new Button(button2BlockLayer,"The button in the block section on the 'Promotions' page");

@Step("Click on the 'Opt In' button")
    public PromotionsPage clickOnPlayNowButton(){
    DriverManager.elementToBeClickable(playNowButton);
    return this;
}
@Step("Click on the 'Details' button")
    public PromotionsPage clickDetailsButton(){
    DriverManager.elementToBeClickable(detailsButton);
    return this;
}
@Step("Click on the button from the block section on the 'Promotions' page")
    public PromotionsPage clickOnButtonInBlock(){
    DriverManager.webDriverWait();
    getButton2BlockLayer().clickButton();
    return this;
}


    public void getTitleOfThePage() {
    }
}
