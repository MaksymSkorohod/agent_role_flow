package ro.maxbet.pageObjects;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ro.maxbet.Elements.Button;
import ro.maxbet.Elements.TextField;

public class ProfilePage extends AbstractPage{

    private By profilePage = By.cssSelector(".user-section");
    private By editButton = By.cssSelector(".profile-btn");
    private By editProfileModal = By.xpath("//body[@class='ng-tns-0-3']//dialog-wrapper/div[2]/user-info-change//p[text()='Edit profile information']");
    private By bonusSection = By.cssSelector("Maxbet Gamble Responsibly");
    private By bonusHistoryButton = By.cssSelector(".bonus-section .link");
    private By bonusHistoryModal = By.xpath("//body//dialog-wrapper//bonus-history//div[text()='Bonus History']");
    private By depositSection = By.cssSelector("deposit-section .deposit");
    private By paymentMethodsButton = By.cssSelector("deposit-section .link");
    private By depositsModal = By.xpath("//body//dialog-wrapper//deposit/div/div/div[2]/div[.=' Deposit ']");
    private By transactionsWithdrawalSection = By.cssSelector(".withdrawal");
    private By allTransactionsButton = By.cssSelector(".withdrawal .link");
    private By transactionsModal = By.xpath("//body//dialog-wrapper/div[2]/transactions//div/div[2]/div[1]/div[text()='Transactions']");
    private By withdrawalsButton = By.cssSelector(".withdrawal .links .item:nth-of-type(1)");
    private By withdrawModal = By.xpath("//body//dialog-wrapper//withdraw//div[text()=' Withdraw ']");
    private By pendingWithdrawalsButton = By.cssSelector(".withdrawal .item:nth-of-type(2) .icon");
    private By pendingWithdrawalsModal = By.xpath("//body/div[6]/dialog-wrapper/div[2]/pending//div/div[2]/div[1]/div");
    private By responsibleGamingSection = By.cssSelector(".responsible-gaming");
    private By detailsButton = By.cssSelector(".responsible-gaming .link");
    private By responsibleModal = By.xpath("//body//dialog-wrapper//responsible-details//div[text()='Maxbet Gamble Responsibly']");
    private By yourLimitsButton = By.cssSelector(".responsible-gaming .item:nth-of-type(1) .icon");
    private By yourLimitsModal = By.xpath("//body//dialog-wrapper/div[2]/limits//p[text()='Your limits']");
    private By selfExclusionButton = By.cssSelector(".responsible-gaming .item:nth-of-type(2) .icon");
    private By takeABreak = By.xpath("//body/div[6]/dialog-wrapper/div[2]/exclusion/div/div/div[2]/div[1]/p[text()='Take a break']");

    @Getter
    TextField ProfilePage = new TextField(profilePage,"The profile page");
    @Getter
    Button EditButton = new Button(editButton, "The 'Edit' button");
    @Getter
    TextField EditProfileModal = new TextField(editProfileModal, "The 'Edit profile information' window");
    @Getter
    TextField BonusSection = new TextField(bonusSection, "The 'Quick Deposit' section");
    @Getter
    Button BonusHistoryButton = new Button(bonusHistoryButton,"The 'Bonus history' button in the 'Bonuses' section");
    @Getter
    TextField BonusHistoryModal = new TextField(bonusHistoryModal,"The 'Bonus history' modal");
    @Getter
    TextField DepositSection = new TextField(depositSection,"The 'Bonuses' section");
    @Getter
    Button PaymentMethodsButton = new Button(paymentMethodsButton, "The 'Payment methods' button in the 'Quick Deposit' section");
    @Getter
    TextField DepositsModal = new TextField(depositsModal,"The deposit modal");
    @Getter
    TextField TransactionsWithdrawalSection = new TextField(transactionsWithdrawalSection, "The 'Transactions & withdrawals' section");
    @Getter
    Button AllTransactionsButton = new Button(allTransactionsButton, "The 'All transactions' button");
    @Getter
    TextField TransactionsModal = new TextField(transactionsModal,"The 'Transactions' modal window");
    @Getter
    Button WithdrawalsButton = new Button(withdrawalsButton,"The 'Withdrawals' button");
    @Getter
    TextField WithdrawModal = new TextField(withdrawModal, "The 'Withdraw' modal");
    @Getter
    Button PendingWithdrawalsButton = new Button(pendingWithdrawalsButton, "The 'pending Withdrawals' button");
    @Getter
    TextField PendingWithdrawalsModal = new TextField(pendingWithdrawalsModal, "The 'Pending Withdrawals' modal");
    @Getter
    TextField ResponsibleGamingSection = new TextField(responsibleGamingSection,"The 'Responsible Gaming' section");
    @Getter
    Button DetailsButton = new Button(detailsButton,"The 'Detail' button in the 'Responsible Gaming' section");
    @Getter
    TextField ResponsibleModal = new TextField(responsibleModal, "The 'Maxbet Gamble Responsibly' modal");
    @Getter
    Button YourLimitsButton = new Button(yourLimitsButton, "The 'Your limits' button");
    @Getter
    TextField YourLimitsModal = new TextField(yourLimitsModal, "The 'Your limits' modal");
    @Getter
    Button SelfExclusionButton = new Button(selfExclusionButton, "The 'Self exclusion' button");
    @Getter
    TextField TakeABreak = new TextField(takeABreak,"The 'Take a break' modal");

    @Step("Click on the edit button in the 'Profile' section")
    public ProfilePage clickOnEditButtonForProfile(){
        getEditButton().clickButton();
        return this;
    }
    @Step("Click on the 'Bonus history' button")
    public ProfilePage clickOnBonusHistoryButton(){
        getBonusHistoryButton().clickButton();
        return this;
    }
    @Step("Click on the 'Payment methods' button in the 'Quick Deposit' section")
    public ProfilePage clickOnPaymentsMethodButton(){
        getPaymentMethodsButton().clickButton();
        return this;
    }
    @Step("Click on the 'All transactions' button in the 'Transactions & withdrawals' section")
    public ProfilePage clickOnAllTransactionsButton(){
        getAllTransactionsButton().clickButton();
        return this;
    }
    @Step("Click on the 'Withdrawals' button")
    public ProfilePage clickWithdrawalsButton(){
        getWithdrawalsButton().clickButton();
        return this;
    }
    @Step("Click on the 'Pending Withdrawals' button")
    public ProfilePage clickPendingWithdrawalsButton(){
        getPendingWithdrawalsButton().clickButton();
        return this;
    }
    @Step("Click on the 'Details' button for the 'Responsible Gaming' section")
    public ProfilePage clickDetailsButton(){
        getDetailsButton().clickButton();
        return this;
    }
    @Step("Click on the 'Your limits' button for the 'Responsible Gaming' section")
    public ProfilePage clickYourLimitsButton(){
        getYourLimitsButton().clickButton();
        return this;
    }
    @Step("Click on the 'Your limits' button for the 'Responsible Gaming' section")
    public ProfilePage clickSelfExclusionButton(){
        getSelfExclusionButton().clickButton();
        return this;
    }
}
