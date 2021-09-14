package io.toweriq.tests;

import org.testng.annotations.Test;

import java.util.Random;

public class PortalsTests extends TestBase {

    @Test(description = "Open the 'Portals' page")
    public void openPortalsPage(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
    }

    @Test(description = "Cancel creation of the new portal")
    public void cancelNewPortal(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
        portalsPage
                .clickCreatePortalButton()
                .typePortalName(generatePortalName())
                .typeRedirectUrl("https://www.google.com/")
                .checkShowNavigationSwitcher()
                .checkShowHeadingSwitcher()
                .formsTab()
                .programsTab()
                .cancelButton();
    }

    @Test(description = "Creating a new portal")
    public void creatingNewPortal(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
        portalsPage
                .clickCreatePortalButton()
                .typePortalName(generatePortalName())
                .typeRedirectUrl("https://www.google.com/")
                .checkShowNavigationSwitcher()
                .checkShowHeadingSwitcher()
                .formsTab()
                .searchField("Hanover Outside Interest")
                .selectForm()
                .createAndReturnButton()
                .getSuccessPortalCreationMessage().isExists();
    }
    @Test(description = "Activating portal")
    public void checkPortal(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
        portalsPage
                .activatePortal();
    }
    @Test(description = "Open the portal landing page")
    public void openPortalLandingPage(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
        portalsPage
                .selectPortalFromTable()
                .getPortalLandingPage().isExists();
    }
    @Test(description = "Copy the portal link")
    public void copyPortalLink(){
        fillPortalsPage();
        portalsPage
                .getPortalsPageHeader().isExists();
        portalsPage
                .selectPortalFromTable()
                .getPortalLandingPage().isExists();
        portalsPage
                .copyClipboard()
                .getLinkIsCopied().isExists();
    }


    private String generatePortalName() {
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        String portalName = "Portal " + a;
        System.out.println(portalName);
        return portalName;
    }
}
