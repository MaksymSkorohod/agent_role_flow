package io.toweriq.testsAgent;

import org.testng.annotations.Test;

public class SchedulesTests extends TestBase {

    @Test(description = "Open 'Schedules' page")
    public void openClientsPage(){
       fillSchedulesPage();
       schedulesPage
               .getSchedulePageHeader().isExists();
    }
}
