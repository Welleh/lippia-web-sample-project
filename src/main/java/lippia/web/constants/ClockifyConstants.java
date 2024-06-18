package lippia.web.constants;

public class ClockifyConstants {

    public static final String MANUALLY_BUTTON = "xpath:/html/body/app-root/register-layout/div/div/div/div/div[2]/login/div/form/div/div/div[3]/a";
    public static final String USER_INPUT = "xpath://*[@id=\"email\"]";
    public static final String PASSWORD_INPUT = "xpath://input[contains(@id, 'password') and not(@type='hidden')]";
    public static final String LOGIN_BUTTON = "xpath:/html/body/app-root/register-layout/div/div/div/div/div[2]/login/div/form/div/div/div[3]/div[2]/button";
    public static final String CLOCKIFY_TITLE = "xpath://*[@id=\"topbar-menu\"]/div/div[1]/div[2]/div/img";
    public static final String DATE_BUTTON = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/div/entry-group/div/time-tracker-entry/div/div[4]/div/single-date-picker2/div[2]";
    public static final String DAY_BUTTON = "xpath://td[@class='available' and @data-title='r2c0' and contains(text(), '10')]";
    public static final String DATE_INPUT = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/div/entry-group/div/time-tracker-entry/div/div[4]/div/single-date-picker2/div[2]";
    public static final String TIME_INPUT = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/div/entry-group/div/time-tracker-entry/div/div[4]/div/div[1]/input-duration/input";
    public static final String SAVE_BUTTON = "xpath://*[@id='save-button']";
    public static final String START_BUTTON = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/stopwatch/div[2]/div/app-button[2]/button";
    public static final String STOP_BUTTON = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/stopwatch/div[2]/div/app-button[2]/button";
    public static final String EDIT_BUTTON = "xpath://*[@id='edit-button']";
    public static final String TIME_ENTRY_XPATH = "xpath://*[@data-date='%s' and @data-time='%s']";
    public static final String TIME_TRACKER_URL = "xpath://*[@id=\"cdk-drop-list-0\"]/li[2]/div/a/div";


}