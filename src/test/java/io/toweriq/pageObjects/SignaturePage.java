package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class SignaturePage extends AbstractPage {

    private By eSignaturePageHeader = By.xpath("//h3[@innertext='E-signatures']");
    private By createSignatureButton = By.id("eSignatureCreate");
    private By nameForSignatureRequest = By.cssSelector("input[name='name']");
    private By descriptionOfSignature = By.cssSelector("input[name='description']");
    private By saveDraftButton = By.id("saveDraft");
    private By addItems = By.xpath("//div[@id='root']//p[text()=' Add items']");
    private By uploadFileButton = By.id("uploadFileButton");
    private By fileOne = By.xpath("//div[@id='entity-content']/div/div/div[5]/div[1]");
    private By fileTwo = By.xpath("//div[@id='entity-content']/div/div/div[5]/div[2]");
    private By fileThree =By.xpath("//div[@id='entity-content']/div/div/div[5]/div[3]");
    private By confirmAttachmentButton = By.id("attachFileConfirm");
    private By cancelAttachmentButton = By.id("attachFileCancel");
    private By draggableFile = By.cssSelector("[draggable] .MuiTypography-alignLeft");
    private By backToSignatureDashboard = By.id("backToESignature");
    private By confirmBackToDashboard = By.id("confirm-back-redirect-button-modal");
    private By discardBackToDashboard = By.id("discard-back-redirect-button-modal");



    @Getter
    TextField ESignaturePageHeader = new TextField(eSignaturePageHeader, "The 'E-Signature' page header is visible");
    @Getter
    Button CreateSignatureButton = new Button(createSignatureButton,"The 'Create new e-signature' button");
    @Getter
    InputField NameForSignatureRequest = new InputField(nameForSignatureRequest,"The 'Name' input field");
    @Getter
    InputField DescriptionOfSignature = new InputField(descriptionOfSignature,"The 'Description' input field");
    @Getter
    Button SaveDraftButton = new Button(saveDraftButton,"The 'Save Draft' button");
    @Getter
    Link AddItems = new Link(addItems,"The '+Add items' link");
    @Getter
    Button UploadFileButton = new Button(uploadFileButton,"The 'Upload files' button");
    @Getter
    DialogContainer FileOne = new DialogContainer(fileOne, "The first PDF file in the list of attachments");
    @Getter
    Link FileTwo = new Link(fileTwo, "The second PDF file in the list of attachments");
    @Getter
    Link FileThree = new Link(fileThree, "The third PDF file in the list of attachments");
    @Getter
    Button ConfirmAttachmentButton = new Button(confirmAttachmentButton, "The 'Attach file' button to confirm the attachment");
    @Getter
    Button CancelAttachmentButton = new Button(cancelAttachmentButton, "The 'Cancel' button");
    @Getter
    Link BackToSignatureDashboard = new Link(backToSignatureDashboard, "The 'Back to the dashboard' link");
    @Getter
    Button ConfirmBackToDashboard = new Button(confirmBackToDashboard, "The 'Yes' button to confirm returning back to dashboard");
    @Getter
    Button DiscardBackToDashboard = new Button(discardBackToDashboard, "The 'No' button to discard returning back to dashboard");


    @Step("Click on the 'Create new e-signature' button")
    public SignaturePage clickCreateSignatureButton(){
        getCreateSignatureButton().clickButton();
        return new SignaturePage();
    }
    @Step("Enter the name of the e-signature request")
    public SignaturePage enterSignatureName(String signatureName){
        DriverManager.webDriverWait();
        getNameForSignatureRequest().setText(signatureName);
        System.out.println();
        return this;
    }
    @Step("Add the description for the e-signature request")
    public SignaturePage addDescription(String signatureDescription){
        DriverManager.webDriverWait();
        getDescriptionOfSignature().setText(signatureDescription);
        System.out.println();
        return this;
    }
    @Step("Click on the 'Save Draft' button")
    public SignaturePage saveDraftButton(){
        getSaveDraftButton().clickButton();
        return this;
    }
    @Step("Click on the '+Add items' link")
    public SignaturePage clickAddItem(){
        getAddItems().clickLink();
        return this;
    }
    @Step("Select the first file from 'Attach a file' modal")
    public SignaturePage selectFirstFile(){
        DriverManager.webDriverWait();
        getFileOne().click();
        return this;
    }
    @Step("Select the second file from 'Attach a file' modal")
    public SignaturePage selectSecondFile(){
        getFileTwo().clickLink();
        return this;
    }
    @Step("Select the third file from 'Attach a file' modal")
    public SignaturePage selectThirdFile(){
        getFileThree().clickLink();
        return this;
    }
    @Step("Click on the 'Attach file' button")
    public SignaturePage clickAttachButton(){
        getConfirmAttachmentButton().clickButton();
        return this;
    }
    @Step("Click on the 'Back to the dashboard' link")
    public SignaturePage clickBackToDashboard(){
        getBackToSignatureDashboard().clickLink();
        return this;
    }
    @Step("Click on the 'Yes' button to return back on the dashboard")
    public SignaturePage clickYesToConfirm(){
        DriverManager.webDriverWait();
        getConfirmBackToDashboard().clickButton();
        return this;
    }
    @Step("Click on the 'No' button to discard returning on the dashboard")
    public SignaturePage clickNoToConfirm(){
        DriverManager.webDriverWait();
        getConfirmBackToDashboard().clickButton();
        return this;
    }

}
