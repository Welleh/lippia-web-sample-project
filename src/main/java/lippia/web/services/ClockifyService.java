package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ClockifyConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ClockifyService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterTimeEntry(Integer time) {

    }

    public static void saveTimeEntry() {
        click(ClockifyConstants.SAVE_BUTTON);
    }

    public static void cancelTimeEntry() {
        click(ClockifyConstants.STOP_BUTTON);
    }

    public static void modifyTimeEntry(String newDate, String newTime) {
        click(ClockifyConstants.EDIT_BUTTON);
        setInput(ClockifyConstants.DATE_INPUT, newDate);
        setInput(ClockifyConstants.TIME_INPUT, newTime);

    }

    public static boolean isTimeEntryPresent(String date, String time) {
        return ActionManager.isPresent(ClockifyConstants.CLOCKIFY_TITLE);

    }

    public static boolean isTimeTrackerSectionVisible() {
        return true;
    }

    public static void enterLoginCredentials(String username, String password) {
        click(ClockifyConstants.MANUALLY_BUTTON);
        setInput(ClockifyConstants.USER_INPUT,username);
        click(ClockifyConstants.PASSWORD_INPUT);
        setInput(ClockifyConstants.PASSWORD_INPUT,password);
    }

    public static void clickLoginButton() {
        click(ClockifyConstants.LOGIN_BUTTON);
    }

    public static void saveTheModification() {
    }

    public static void iHaveAnExistingTimeEntryWithDateAndTime(String date, String time) {
    }

    public static void enterDate(Integer year, Integer month, Integer day) {
        //clean(ClockifyConstants.DATE_INPUT, date);
        click(ClockifyConstants.DATE_BUTTON);
        click(ClockifyConstants.DAY_BUTTON);
    }

    public static void registerTime(int seconds) {
        click(ClockifyConstants.START_BUTTON);
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(ClockifyConstants.STOP_BUTTON);
    }
}