package steps;

import org.junit.jupiter.api.Test;

public class TestStep extends TestBase {

    @Test
    public void PlansLinkIsLoaded(){
        Plans.isNewPlanDisplayed();
    }

    @Test
    public void KeywordsLinkIsLoaded(){
        Keywords.clickKeywordsTab();
        Keywords.isNewKeywordButtonDisplayed();
    }

    @Test
    public void ExecutionsLinkIsLoaded(){
        Executions.clickExecutionsTab();
        Executions.isExecutionListDisplayed();
    }

    @Test
    public void ParametersLinkIsLoaded(){
        Parameters.clickParametersTab();
        Parameters.isNewParameterButtonDisplayed();
    }

    @Test
    public void SchedulerLinkIsLoaded(){
        Scheduler.clickSchedulerTab();
        Scheduler.isNewTaskButtonDisplayed();
    }

    @Test
    public void GridLinkIsLoaded(){
        Grid.clickGridTab();
        Grid.isAgentsTabDisplayed();
    }

    @Test
    public void AdminLinkIsLoaded(){
        Admin.clickAdminTab();
        Admin.isAddUserButtonDisplayed();
    }
}
