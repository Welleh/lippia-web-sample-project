package lippia.web.steps;

import io.cucumber.java.en.*;
import com.crowdar.core.PageSteps;
import junit.framework.Assert;
import lippia.web.constants.ClockifyConstants;
import lippia.web.services.ClockifyService;

import static com.crowdar.core.actions.ActionManager.click;

public class ClockifySteps extends PageSteps{

    @Given("I navigate to the Clockify login page")
    public void navigateToLoginPage() {
        ClockifyService.navegarWeb();
    }

    @And("^I enter the username (.*) and password (.*)$")
    public void enterUsernameAndPassword(String username, String password) {
        ClockifyService.enterLoginCredentials(username, password);
    }

    @And("I click on the login button")
    public void clickLoginButton() {
        ClockifyService.clickLoginButton();
    }

    @And("I see the main page")
    public void verifyTimeTrackerSection() {
        Assert.assertTrue(ClockifyService.isTimeTrackerSectionVisible());
    }

    @Given("I navigate to the Time Tracker section")
    public void navigateToTimeTracker() {
        click(ClockifyConstants.TIME_TRACKER_URL);
    }

    @Given("^I have an existing time entry with date (.*) and time (.*)$")
    public void iHaveAnExistingTimeEntryWithDateAndTime(String date, String time) {
        ClockifyService.iHaveAnExistingTimeEntryWithDateAndTime(date,time);
    }


    @When("I save the time entry")
    public void saveTimeEntry() {
        ClockifyService.saveTimeEntry();
    }

    @When("I cancel the time entry")
    public void cancelTimeEntry() {
        ClockifyService.cancelTimeEntry();
    }

    @When("^I modify the time entry to date (.*) and time (.*)$")
    public void modifyTimeEntry(String newDate, String newTime) {
        ClockifyService.modifyTimeEntry(newDate, newTime);
    }


    @And("I save the modification")
    public void iSaveTheModification() {
        ClockifyService.saveTheModification();
    }

    @Then("^I should see the entry with date (.*) and time (.*) in the list$")
    public void verifyTimeEntry(String date, String time) {
        Assert.assertTrue(ClockifyService.isTimeEntryPresent(date, time));
    }

    @Then("^I should not see the entry with date (.*) and time (.*) in the list$")
    public void verifyNoTimeEntry(String date, String time) {
        Assert.assertFalse(ClockifyService.isTimeEntryPresent(date, time));
    }

    @Then("^I should see the modified entry with date (.*) and time (.*) in the list$")
    public void verifyModifiedTimeEntry(String newDate, String newTime) {
        Assert.assertTrue(ClockifyService.isTimeEntryPresent(newDate, newTime));
    }


    @When("^I enter the date (.*) (.*) (.*) and time (.*) worked$")
    public void iEnterTheDateAndTimeWorked(Integer year, Integer month, Integer day, Integer time) {
       ClockifyService.enterDate(year, month, day);
       ClockifyService.enterTimeEntry(time);
    }

    @When("^I register (.*) seconds worked$")
    public void iRegisterSecondsWorked(int seconds) {
        ClockifyService.registerTime(seconds);
    }

    @Then("I should see the time entry")
    public void iShouldSeeTheTimeEntry() {
    }
}