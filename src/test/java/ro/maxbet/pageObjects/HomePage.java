package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import ro.maxbet.DriverManager;
import ro.maxbet.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class HomePage extends AbstractPage{
    private By popUpBody = By.xpath("//body//div[@class='popup-body']");
    private By closeButtonForPopUp = By.xpath("//body//div[@class='popup-banner']//img[@src='/assets/images/ic_x_colored.svg']");
    private By topMainMenu = By.id("mainTopMenu");
    private By dashboardContent = By.xpath("//div[@class='casino-header']/div[3]");
    private By registerButton = By.xpath("//nav[@id='mainTopMenu']/auth-buttons/button[1]");
    private By registerModalTitle = By.xpath("//dialog-wrapper//div[@class='title']");
    private By logInButton = By.cssSelector(".btn-red-restyle");
    private By userNameInputField = By.cssSelector("[class='input text-center w-100']:nth-of-type(1) input");
    private By passwordInputField = By.cssSelector("[class='input text-center w-100']:nth-of-type(2) input");
    private By logInToMaxBetButton = By.cssSelector("[class='btn-red w-100 button']");
    private By logoOnLogInModal = By.cssSelector(".sign-in .logo");
    private By navBarContentButton = By.xpath("//body/app-root/div/div/main-menu/div[@class='navbar-toggle']");
    private By leftSideBarMenu = By.cssSelector(".left-menu-dropdown");
    private By closeButtonFoeLeftSideBarMenu = By.cssSelector(".ui-menu > .navbar-toggle");
    private By liveCasinoButtonSideBar = By.xpath("//body/app-root//main-menu/left-menu//div/collapse-section[2]/div[1]/div[1]");

    private By casinoButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[1]");
    private By liveCasinoButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[2]");
    private By bettingButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[3]");
    private By liveBettingButton = By.cssSelector("menu-nav-item:nth-of-type(4)  .nav-link");
    private By promotionsButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[5]");
    private By tournamentsButton = By.xpath("//nav[@id='mainTopMenu']/ul/menu-nav-item[6]");
    private By walletButton = By.cssSelector(".wallet");
    private By notificationCenter = By.cssSelector(".notific-center");
    private By notificationModal = By.id("webpush-notification-center-title");
    private By progressIcon = By.cssSelector(".nav-link .circle-container__background");
    private By vipButtonSideMenu = By.cssSelector("[href='\\/en\\/vip']");
    private By vipPage = By.xpath("//body/app-root/div/div/div/vip/div/div[1]/div[1]/div[1]/p[2]");
    private By maxJackpotButton = By.xpath("//div/main-menu/left-menu//div/collapse-section[1]/div[2]/a[3]/div");
    private By maxJackpotPageTitle = By.xpath("//body//div[@class='main-container ro-build']//img[@class='title']");

    @Getter
    TextField PopUpBody = new TextField(popUpBody,"The pop up modal");
    @Getter
    Button CloseButtonForPopUp = new Button(closeButtonForPopUp,"The 'X' button for the popup");
    @Getter
    TextField TopMainMenu = new TextField(topMainMenu,"The top menu of the 'Home' page");
    @Getter
    InputField DashboardContent = new InputField(dashboardContent,"The 'Search' field");
    @Getter
    Button RegisterButton = new Button(registerButton,"The 'Register' button");
    @Getter
    TextField RegisterModalTitle = new TextField(registerModalTitle, "Title of the registration modal");
    @Getter
    InputField UserNameInputField = new InputField(userNameInputField, "The 'Username' input field");
    @Getter
    InputField PasswordInputField = new InputField(passwordInputField, "The 'Password' input field");
    @Getter
    Button LogInToMaxBetButton = new Button(logInToMaxBetButton, "The 'LOGIN TO MAXBET' button");
    @Getter
    Button LogInButton = new Button(logInButton,"The 'Log In' button");
    @Getter
    TextField LogoOnLogInModal = new TextField(logoOnLogInModal, "The 'Maxbet' logo on the log in modal");
    @Getter
    Button NavigationContentButton = new Button(navBarContentButton,"Button for the navigation menu");
    @Getter
    TextField LeftSideBarMenu = new TextField(leftSideBarMenu,"The left side bar menu modal window");
    @Getter
    Button CloseButtonFoeLeftSideBarMenu = new Button(closeButtonFoeLeftSideBarMenu,"The 'X' button for left side bar menu modal window");
    @Getter
    Button LiveCasinoButtonSideBar = new Button(liveCasinoButtonSideBar,"The 'Live Casino' button in the left sidebar menu");


    @Getter
    Button CasinoButton = new Button(casinoButton, "The 'Casino' button");
    @Getter
    Button LiveCasinoButton = new Button(liveCasinoButton, "The 'Live Casino' button");
    @Getter
    Button BettingButton = new Button(bettingButton, "The 'Betting' button");
    @Getter
    Button LiveBettingButton = new Button(liveBettingButton,"The 'Live Betting' button");
    @Getter
    Button PromotionsButton = new Button(promotionsButton, "The 'Promotions' button");
    @Getter
    Button TournamentsButton = new Button(tournamentsButton,"The 'Tournaments' button");
    @Getter
    Button WalletButton = new Button(walletButton, "The 'Wallet/Profile' button");
    @Getter
    Button NotificationCenter = new Button(notificationCenter,"The notification center button");
    @Getter
    TextField NotificationModal = new TextField(notificationModal,"The 'Notification' modal window");
    @Getter
    DialogContainer ProgressIcon = new DialogContainer(progressIcon,"");
    @Getter
    Button VipButtonSideMenu = new Button(vipButtonSideMenu, "The 'VIP' button in the left side bar menu");
    @Getter
    TextField VipPage = new TextField(vipPage,"The 'VIP' page");
    @Getter
    Button MaxJackpotButton = new Button(maxJackpotButton,"The 'MaxJackpot' button in the sidebar menu");
    @Getter
    TextField MaxJackpotPageTitle = new TextField(maxJackpotPageTitle,"The 'MaxJackpot' page title");


    @Step("Click on the 'X' button for the pop up")
    public HomePage clickXForPopUp(){
        getCloseButtonForPopUp().clickButton();
        return this;
    }
    @Step("Click on the 'Register' button from the top menu")
    public HomePage clickOnRegisterButton(){
        getRegisterButton().clickButton();
        return new HomePage();
    }
    @Step("Enter the user name into the 'USERNAME' input field")
    public HomePage enterUserName(String username){
        DriverManager.elementToBeClickable(userNameInputField);
        getUserNameInputField().setText(username);
        System.out.println(username);
        return this;
    }
    @Step("Enter the password into the 'PASSWORD' input field")
    public  HomePage enterPassword(String password){
        getPasswordInputField().setText(password);
        System.out.println(password);
        return this;
    }
    @Step("Click on the 'LOGIN TO MAXBET' button")
    public HomePage clickOnLogInToMaxBetButton(){
        DriverManager.elementToBeClickable(logInToMaxBetButton);
        return this;
    }
    @Step("Click on the 'Log In' button from the top menu")
    public HomePage clickOnLogInButton(){
        DriverManager.webDriverWait();
        getLogInButton().clickButton();
        return this;
    }
    @Step("Click on the 'Navigation menu' button")//navBarContentButton
    public HomePage clickOnNavButton(){
        DriverManager.getWaiter(10);
        getNavigationContentButton().clickButton();//elementToBeClickable(navBarContentButton);
        return this;
    }
    @Step("Click on the 'X' button in the left sidebar menu")
    public HomePage clickXButtonForLeftSideBarMenu(){
        DriverManager.getWaiter(5);
        getCloseButtonFoeLeftSideBarMenu().clickButton();
        return this;
    }
    @Step("Click on the 'Live Casino' button from the lift sidebar menu")
    public HomePage clickLiveCasinoSideBarMenu(){
        DriverManager.webDriverWait();
        getLiveCasinoButtonSideBar().clickButton();
        return this;
    }
    @Step("Click on the 'Casino' button")
    public HomePage clickOnCasinoButton(){
        getCasinoButton().clickButton();
        return this;
    }
    @Step("Click on the 'Live Casino' button")
    public LiveCasinoPage clickOnLiveCasinoButton(){
        DriverManager.clickOnElement("//nav[@id='mainTopMenu']/ul/menu-nav-item[2]");
//        getLiveCasinoButton().clickButton();
        return new LiveCasinoPage();
    }
    @Step("Click on the 'Betting' button")
    public BettingPage clickOnBettingButton(){
        DriverManager.elementToBeClickable(bettingButton);
        return new BettingPage();
    }
    @Step("Click on the 'Live betting' button")
    public LiveBettingPage clickOnLiveBettingButton(){
        getLiveBettingButton().clickButton();
        return new LiveBettingPage();
    }
    @Step("Click on the 'Promotions' button")
    public PromotionsPage clickOnPromotionsButton(){
        DriverManager.webDriverWait();
        getPromotionsButton().clickButton();
        return new PromotionsPage();
    }
    @Step("Click on the 'Tournaments' button")
    public TournamentsPage clickOnTournamentsButton(){
        getTournamentsButton().clickButton();
        return new TournamentsPage();
    }
    @Step("Click on the 'Wallet' button")
    public ProfilePage clickOnWalletButton(){
        DriverManager.elementToBeClickable(walletButton);
        return new ProfilePage();
    }
    @Step("Click on the 'Notification' center button")
    public HomePage clickOnNotificationButton(){
        DriverManager.webDriverWait();
        getNotificationCenter().clickButton();
        return this;
    }
    @Step("Hover on dialog container")
    public HomePage hoverOnTheStar(){
        DriverManager.hoverToElement(By.cssSelector(".nav-link .circle-container__background"));
        return this;
    }
    @Step("Click on the 'VIP' button from the side bar menu")
    public HomePage clickVIPButton(){
        getVipButtonSideMenu().clickButton();
        return this;
    }
    @Step("Click on the 'MaxJackpot' button from the sidebar menu")
    public HomePage clickMaxJackpotButtonFromSideBarMenu(){
        DriverManager.webDriverWait();
        getMaxJackpotButton().clickButton();
        return this;
    }

}
