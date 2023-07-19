package io.toweriq.pageObjects;

import io.qameta.allure.Step;
import io.toweriq.DriverManager;
import io.toweriq.Elements.*;
import lombok.Getter;
import org.openqa.selenium.By;

public class HomePage {
    private By pageSidebar = By.id("pageSidebar");
    private By sideHomeButton = By.id("sidebarMenuItemHome");
    private By homePageHeader = By.xpath("//div[@id='root']//h1");
    private By sideContactsButton = By.id("sidebarMenuItemContacts");
    private By contactPageHeader = By.xpath("//div[@id='root']//h1");
    private By sideCompaniesButton = By.id("sidebarMenuItemCompanies");
    private By companiesPageHeader = By.xpath("//div[@id='root']//div//h3");
    private By sidePoliciesButton = By.id("sidebarMenuItemPolicies");
    private By policiesPageHeader = By.xpath("//div[@id='root']//div/h1");
    private By sideTransactionsButton = By.id("sidebarMenuItemTransactions");
    private By sideSubmissionsButton = By.id ("sidebarMenuItemSubmissions");
    private By sideLibraryButton = By.id("sidebarMenuItemLibrary");
    private By sideCustomFormsButton = By.id("sidebarMenuItemCustom forms");
    private By sideProposalsButton = By.id("sidebarMenuItemProposals");
    private By sidePortalsButton = By.id("sidebarMenuItemPortals");
    private By portalsPageHeader = By.xpath("//div[@id='root']//div//h1");
    private By sideSignatureButton = By.id("sidebarMenuItemE-signatures");
    private By signaturesPageHeader = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/h3");
    private By sideSettingsButton = By.id("sidebarMenuItemSettings");
    private By settingsPageHeader = By.xpath("//div[@id='root']//div//h3");
    private By profileLink = By.id("accountProfile");
    private By preferencesLink = By.id("accountPreferences");
    private By agentSignOutLink = By.id("accountSignOut");
    private By pipelinesTab = By.id("Pipelines");
    private By dashboardsSubTab = By.id("Dashboards");
    private By pipelinesDashboardsPageHeader = By.xpath("//div[@id='root']//div/div/div//h1");
    private By activityTab = By.id("Activity");
    private By notificationsTab = By.id("Notifications");
    private By notificationPageHeader = By.xpath("//div[@id='root']//div/div/div/h3[text()='Notifications']");
    private By emailsTab = By.id("Emails");
    private By emailsPageHeader = By.xpath("//div[@id='root']//div/div/div/h3[text()='Emails']");
    private By inboxSubTab = By.id("Inbox");
    private By sentSubTab = By.id("Sent");
    private By hiddenSubTab = By.id("Hidden");
    private By notesTab = By.id("Notes");
    private By notesPageHeader = By.xpath("//div[@id='root']//div/div/div/h3[text()='Notes']");
    private By tasksTab = By.id("Tasks");
    private By tasksPageHeader = By.xpath("//div[@id='root']//div/div/div/h3[text()='Tasks']");
    private By addATaskButton = By.xpath("//div[@id='root']//div[3]/div[3]/p/span[.='Add a task']");
    private By taskModalWindow = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable react-draggable-dragged']//h5");
    private By iWantToInputField = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable']//div/div[2]/div[2]/div/div/input");
    private By describeTheTask = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable']//div/div[3]/div[1]/div[@class='ql-container ql-snow']");
    private By saveButtonForTask = By.xpath("//div[@id='crm-draggable-wrapper']/div[@class='react-draggable']//div/div[5]/div[1]/button");

    @Getter
    Button SidebarButton = new Button(pageSidebar, "The 'Sidebar menu' button in sidebar menu");
    @Getter
    Button HomeButton = new Button(sideHomeButton, "The 'Home' link in sidebar menu");
    @Getter
    TextField HomePageHeader = new TextField(homePageHeader, "The page header");
    @Getter
    Button ContactsButton = new Button(sideContactsButton, "The 'Contacts' button in sidebar menu");
    @Getter
    TextField ContactPageHeader = new TextField(contactPageHeader, "The page header of the Contacts page");
    @Getter
    Button CompaniesButton = new Button(sideCompaniesButton, "The 'Companies' button in sidebar menu");
    @Getter
    TextField CompaniesPageHeader = new TextField(companiesPageHeader,"The page header of the Companies page");
    @Getter
    Button PoliciesButton = new Button(sidePoliciesButton, "The 'Policies' button in sidebar menu");
    @Getter
    TextField PoliciesPageHeader = new TextField(policiesPageHeader,"The page header of the Policies page");
    @Getter
    Button TransactionsButton = new Button(sideTransactionsButton, "The 'Transactions' button in sidebar menu");
    @Getter
    Button SubmissionButton = new Button(sideSubmissionsButton, "The 'Transactions' button in sidebar menu");
    @Getter
    Button LibraryButton = new Button(sideLibraryButton,"The 'Library' button in sidebar menu");
    @Getter
    Button CustomFormsButton = new Button(sideCustomFormsButton, "The 'Custom forms' button in sidebar menu");
    @Getter
    Button ProposalsButton = new Button(sideProposalsButton, "The 'Proposals' button in sidebar menu");
    @Getter
    Button PortalsButton = new Button(sidePortalsButton, "The 'Portals' button in sidebar menu");
    @Getter
    TextField PortalsPageHeader = new TextField(portalsPageHeader, "The page header of the Portals template page");
    @Getter
    Button SignatureButton = new Button(sideSignatureButton,"The 'E-signature' button in sidebar menu");
    @Getter
    TextField SignaturesPageHeader = new TextField(signaturesPageHeader, "The page header of the E-Signatures template page");
    @Getter
    Button SettingsButton = new Button(sideSettingsButton, "The 'Settings' button in sidebar menu");
    @Getter
    TextField SettingsPageHeader = new TextField(settingsPageHeader, "The page header of the Settings page");
    @Getter
    Link AgentSignOutLink = new Link(agentSignOutLink, "The 'Sign out' link");
    @Getter
    Button UserIcon = new Button(profileLink, "The User's profile icon");
    @Getter
    Button ProfilePreferencesLink = new Button(preferencesLink, "The 'Profile&Preferences' link");
    @Getter
    Tab PipelinesTab = new Tab(pipelinesTab, "The 'Pipelines' tab");
    @Getter
    Tab DashboardsSubTab = new Tab(dashboardsSubTab, "The 'Dashboards' sub tab");
    @Getter
    TextField PipelinesDashboardsPageHeader = new TextField(pipelinesDashboardsPageHeader, "The Pipelines / Dashboards page header");
    @Getter
    Tab ActivityTab = new Tab(activityTab,"The 'Activity' tab");
    @Getter
    Tab NotificationsTab = new Tab (notificationsTab, "The 'Notifications' tab");
    @Getter
    TextField NotificationPageHeader = new TextField(notificationPageHeader,"The Notifications page header");
    @Getter
    Tab EmailsTab = new Tab(emailsTab, "The 'Emails' tab");
    @Getter
    TextField EmailsPageHeader = new TextField(emailsPageHeader, "The Emails page header");
    @Getter
    Tab InboxSubTab = new Tab(inboxSubTab, "The 'Inbox' emails sub tab");
    @Getter
    Tab SentSubTab = new Tab(sentSubTab, "The 'Sent' emails sub tab");
    @Getter
    Tab HiddenSubTab = new Tab(hiddenSubTab, "The 'Hidden' emails sub tab");
    @Getter
    Tab NotesTab = new Tab(notesTab, "The 'Notes' tab");
    @Getter
    TextField NotesPageHeader = new TextField(notesPageHeader, "The Notes page header");
    @Getter
    Tab TasksTab = new Tab(tasksTab, "The 'Tasks' tab");
    @Getter
    TextField TasksPageHeader = new TextField(tasksPageHeader, "The Tasks page header");
    @Getter
    Button AddATaskButton = new Button(addATaskButton, "The 'Add a task' button on the 'Activity feed' page");
    @Getter
    DialogContainer TaskModalWindow = new DialogContainer(taskModalWindow, "The 'New task' modal window");
    @Getter
    InputField IWantToInputField = new InputField(iWantToInputField, "The 'I want to' input field for the task subjects");
    @Getter
    InputField DescribeTheTask = new InputField(describeTheTask, "The text area for the task");
    @Getter
    Button SaveButtonForTask = new Button(saveButtonForTask, "The 'Save' button for the task");

    @Step("Click on the 'Home' button from the sidebar menu")
    public HomePage clickOnHomeButton(){
        getHomeButton().clickButton();
        return new HomePage();
    }
    @Step("Click on the 'Contacts' page from the sidebar menu")
    public ContactsPage clickOnContactsButton(){
        getContactsButton().clickButton();
        return new ContactsPage();
    }
    @Step("Click on the 'Companies' button from the sidebar menu")
    public CompaniesPage clickOnCompaniesButton() {
        getCompaniesButton().clickButton();
        return new CompaniesPage();
    }
    @Step("Click on the 'Policies' button from the sidebar menu")
    public PoliciesPage clickOnPoliciesButton(){
        getPoliciesButton().clickButton();
        return new PoliciesPage();
    }
    @Step("Click on the 'Transactions' button from the sidebar menu")
    public TransactionsPage clickOnTransactionsButton(){
        getTransactionsButton().clickButton();
        return new TransactionsPage();
    }
    @Step("Click on the 'Submissions' button from the sidebar menu")
    public SubmissionsPage clickOnSubmissionsButton(){
        getSubmissionButton().clickButton();
        return new SubmissionsPage();
    }
    @Step("Click on the 'Library' button from the sidebar menu")
    public LibraryPage clickOnLibraryButton(){
        getLibraryButton().clickButton();
        return new LibraryPage();
    }
    @Step("Click on the 'Custom Forms' button from the sidebar menu")
    public CustomFormsPage clickOnCustomFormsButton(){
        getCustomFormsButton().clickButton();
        return new CustomFormsPage();
    }
    @Step("Click on the 'Proposals template' button from the sidebar menu")
    public ProposalsPage clickOnProposalsButton(){
        DriverManager.webDriverWait();
        getProposalsButton().clickButton();
        return new ProposalsPage();
    }
    @Step("Click on the 'Portals' portals from the sidebar menu")
    public PortalsPage clickOnPortalsButton(){
        DriverManager.webDriverWait();
        getPortalsButton().clickButton();
        return new PortalsPage();
    }
    @Step("Click on the 'E-signature' button from the sidebar menu")
    public SignaturePage clickOnESignatureButton(){
        DriverManager.webDriverWait();
        getSignatureButton().clickButton();
        return new SignaturePage();
    }
    @Step("Click on the 'Settings' button")
    public SettingsPage clickOnSettingsButton(){
        getSettingsButton().clickButton();
        return new SettingsPage();
    }
    @Step("Click on the Users profile icon")
    public HomePage clickOnProfileIcon(){
        getUserIcon().clickButton();
        return this;
    }
    @Step("Click on the 'Profile&Preferences' link")
    public ProfileAndPreferencesPage clickOnProfilePreferencesLink(){
        getProfilePreferencesLink().clickButton();
        return new ProfileAndPreferencesPage();
    }
    @Step("Click on the 'Sign out' link")
    public SignInPage clickSignOutLink(){
        DriverManager.webDriverWait();
        getAgentSignOutLink().clickLink();
        return new SignInPage();
    }
    @Step("Click on the 'Pipeline' tab")
    public HomePage clickOnPipelineTab(){
        getPipelinesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Dashboard' sub tab")
    public HomePage clickOnDashboardSubTab(){
        getDashboardsSubTab().clickTab();
        return this;
    }
    @Step("Click on the 'Activity' tab")
    public HomePage clickOnActivityTab(){
        getActivityTab().clickTab();
        return this;
    }
    @Step("Click on the 'Notifications' tab")
    public HomePage clickOnNotificationsTab(){
        getNotificationsTab().clickTab();
        return this;
    }
    @Step("Click on the 'Emails' tab")
    public HomePage clickOnEmailsTab(){
        getEmailsTab().clickTab();
        return this;
    }
    @Step("Click on the 'Sent' emails sub tab")
    public HomePage clickOnSentEmailsSubTab(){
        getSentSubTab().clickTab();
        return this;
    }
    @Step("Click on the 'Hidden' emails sub tab")
    public HomePage clickOnTheHiddenSubTab(){
        getHiddenSubTab().clickTab();
        return this;
    }
    @Step("Click on the 'Notes' tab")
    public HomePage clickOnNotesTab(){
        getNotesTab().clickTab();
        return this;
    }
    @Step("Click on the 'Tasks' tab")
    public HomePage clickOnTasksTab(){
        getTasksTab().clickTab();
        return this;
    }
    @Step("Click on the 'Add a task' button")
    public HomePage clickAddTaskButton(){
        DriverManager.webDriverWait();
        getAddATaskButton().clickButton();
        return this;
    }
    @Step ("Enter the subject for the task")
    public HomePage enterSubjectForTask(String taskSubject){
        getIWantToInputField().setText(taskSubject);
        System.out.println(taskSubject);
        return this;
    }
    @Step("Enter the text for the task into the 'Text' area")
    public HomePage enterTextForTask(String taskText){
        getDescribeTheTask().setText(taskText);
        System.out.println(taskText);
        return this;
    }
    @Step("Click on the 'Save' button for the task")
    public HomePage clickSaveButtonForTask(){
        getSaveButtonForTask().clickButton();
        return this;
    }


}
