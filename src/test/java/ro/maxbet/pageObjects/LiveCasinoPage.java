package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.Button;

public class LiveCasinoPage extends AbstractPage{
    private By liveCasinoButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[2]");
    private By lobbyButtonLiveCasinoPage = By.xpath("//button[@id='lobby']/div[@class='icon-cont']");
    private By providersDropDown = By.xpath("//div[@class='select-container']");
    private By evolutionGamingOption = By.xpath("//div[normalize-space()='EvolutionGaming']");

    @Getter
    Button LiveCasinoButton = new Button(liveCasinoButton, "The 'Live Casino' button");
    @Getter
    Button LobbyButtonLiveCasinoPage = new Button(lobbyButtonLiveCasinoPage,"The 'Lobby' button on the 'Live Casino' page");
    @Getter
    Button ProvidersDropDown = new Button(providersDropDown, "The providers dropdown");
    @Getter
    Button EvolutionGamingOption = new Button(evolutionGamingOption, "The 'Evolution Gaming' option");

    @Step("Click on the 'Live Casino' button")
    public LiveCasinoPage clickOnLiveCasinoButton(){
        getLiveCasinoButton().clickButton();
        return this;
    }
    @Step("Click on the 'Lobby' button from the 'Live Casino' page")
    public LiveCasinoPage clickLobbyButton(){
        getLobbyButtonLiveCasinoPage().clickButton();
        return this;
    }
    @Step("Click on the 'Providers' dropdown")
    public LiveCasinoPage clickOnProviders(){
        DriverManager.webDriverWait();
        getProvidersDropDown().clickButton();
        return this;
    }
    @Step("Click on the 'Evolution Gaming' option from the 'Providers' dropdown")
    public LiveCasinoPage clickOnEvolutionGamingOption(){
        DriverManager.webDriverWait();
        getEvolutionGamingOption().clickButton();
        return this;
    }
}
