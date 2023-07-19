package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PortalsPage extends AbstractPage {

    private By portalsPageHeader = By.xpath("//h1[text()='Portals']");
    private By createPortalButton = By.xpath("//button/div[text()='Create portal']");
    private By newPortalTitle = By.id("portal-dialog-title");
    private By portalNameField = By.xpath("//input[@id='name']");
    private By redirectUrlField = By.id("redirectUrl");
    private By showNavigation = By.xpath("//form[@id='new-program-form']/div/div[4]//span[1]//input");
    private By showHeading = By.xpath("//form[@id='new-program-form']/div/div[5]");
    private By programsTab = By.id("transactionTabPrograms");
    private By formsTab = By.id("transactionTabForms");
    private By searchItemsField = By.id("tiq-unknown-search-input");
    private By formForSelect = By.xpath("//form[@id='new-program-form']//label/span[.='Hanover Outside Interest']");
    private By portalConfirmButton = By.id("create-portal-button-confirm");
    private By portalCancelButton = By.id("create-portal-button-cancel");
    private By successPortalCreationMessage = By.xpath("//div[@id='root']//div[@class='notification-message']");
    private By selectPortalFromTable = By.xpath("//table[@id='portals-table']//tr[1]/td[1]//a");
    private By activatePortal = By.xpath("//table[@id='portals-table']//tr[1]//span[1]//input");
    private By portalLandingPage = By.id("portal-landing-page");
    private By copyToClipboard = By.xpath("//div[@role='region']//h6//button/div[.='Copy to clipboard']");
    private By linkIsCopied = By.xpath("//*[@id=\"portal-landing-page\"]//div[3]/h6/span/span");



    @Getter
    TextField PortalsPageHeader = new TextField(portalsPageHeader,"The 'Programs' page header is visible");
    @Getter
    Button CreatePortalButton = new Button(createPortalButton, "The 'Create portal' button");
    @Getter
    TextField NewPortalTitle = new TextField(newPortalTitle, "The title of the 'New portal' modal");
    @Getter
    InputField PortalNameField = new InputField(portalNameField,"The 'Portal name' input field");
    @Getter
    InputField RedirectUrlField = new InputField(redirectUrlField, "The 'Redirect URL' input field");
    @Getter
    Check ShowNavigation = new Check(showNavigation, "The 'Show navigation' switcher");
    @Getter
    Check ShowHeading = new Check(showHeading, "The 'Show heading' switcher");
    @Getter
    Button ProgramsTab = new Button(programsTab, "The 'Programs' tab");
    @Getter
    Button FormsTab = new Button(formsTab, "The 'Forms' tab");
    @Getter
    InputField SearchItemsField = new InputField(searchItemsField, "The 'Search' field for the items");
    @Getter
    Link FormForSelect = new Link(formForSelect,"The form for select");
    @Getter
    Button PortalConfirmButton = new Button(portalConfirmButton, "The 'Create and return' button");
    @Getter
    Button PortalCancelButton = new Button(portalCancelButton, "The 'Cancel' button");
    @Getter
    TextField SuccessPortalCreationMessage = new TextField(successPortalCreationMessage,"Success message that the portal has been created");
    @Getter
    Link SelectPortalFromTable = new Link(selectPortalFromTable,"The first portal in the table on the 'Portals' page");
    @Getter
    Check ActivatePortal = new Check(activatePortal,"Activation of the new portal");
    @Getter
    TextField PortalLandingPage = new TextField(portalLandingPage, "The 'Portal' landing page");
    @Getter
    Button CopyToClipboard = new Button(copyToClipboard, "The 'Copy to Clipboard' button");
    @Getter
    TextField LinkIsCopied = new TextField(linkIsCopied,"The 'Copied' message");


    @Step("Click on the 'Create portal' button")
    public PortalsPage clickCreatePortalButton(){
        getCreatePortalButton().clickButton();
        return this;
    }
    @Step("Enter the name of the portal")
    public PortalsPage typePortalName(String portalName){
        DriverManager.getWaiter(3);
        getPortalNameField().setText(portalName);
        Assert.assertTrue(true, "portalName");
        System.out.println();
        return this;
    }
    @Step("Enter URL for redirect")
    public PortalsPage typeRedirectUrl(String Url){
        DriverManager.waitForElementVisible(redirectUrlField,5);
        getRedirectUrlField().setText(Url);
        System.out.println();
        return this;
    }
    @Step("Click on the 'Show navigation' switcher to check it")
    public PortalsPage checkShowNavigationSwitcher(){
        getShowNavigation().select();
        return this;
    }
    @Step("Click on the 'Show navigation' switcher to uncheck it")
    public PortalsPage unCheckShowNavigation() {
        getShowNavigation().unSelect();
        return this;
    }
    @Step("Click on the 'Show heading' switcher to check it")
    public PortalsPage checkShowHeadingSwitcher(){
        getShowHeading().select();
        return this;
    }
    @Step("Click on the 'Show headings' switcher to uncheck it")
    public PortalsPage unCheckShowHeadingSwitcher(){
        getShowHeading().unSelect();
        return this;
    }
    @Step("Click on the 'Programs' tab")
    public PortalsPage programsTab(){
        getProgramsTab().clickButton();
        return this;
    }
    @Step("Click on the 'Forms' tab")
    public PortalsPage formsTab(){
        getFormsTab().clickButton();
        return this;
    }
    @Step("Enter the item name into the 'Search' field")
    public PortalsPage searchField(String text){
        getSearchItemsField().setText(text);
        return this;
    }
    @Step("Select the form")
    public PortalsPage selectForm(){
        getFormForSelect().clickLink();
        return this;
    }
    @Step("Click on the 'Create and return' button")
    public PortalsPage createAndReturnButton(){
        getPortalConfirmButton().clickButton();
        return this;
    }
    @Step("Click on the 'Cancel' button")
    public PortalsPage cancelButton(){
        DriverManager.webDriverWait();
        getPortalCancelButton().clickButton();
        return this;
    }
    @Step("Select and click on the first portal from the table")
    public PortalsPage selectPortalFromTable(){
        getSelectPortalFromTable().clickLink();
        return  this;
    }
    @Step("Click on the check box to activate new portal")
    public PortalsPage activatePortal(){
        if (getActivatePortal().isSelected())
            getActivatePortal().unSelect();
        else
            getActivatePortal().select();
        return this;
    }
    @Step("Click on the 'Copy to clipboard' button")
    public PortalsPage copyClipboard(){
        DriverManager.webDriverWait();
        getCopyToClipboard().clickButton();
        return this;
    }
}
