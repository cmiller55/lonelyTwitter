package ca.ualberta.cs.lonelytwitter;

// Refactoring #1 - removed unused imports - unneeded imports needlessly increase codes complexity to
// people who may be working on the code later
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

// Refactoring #4 - used generics in test classes - implementation of generic operators increases
// compatibility with the methods being called
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    private Solo solo;


    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    // Refactoring #5 - added description to exception tag - it is easier to discern the cause of
    // the exceptions with a description

    /**
     * Runs at the beginning of the tests
     * @throws Exception throws generic exception
     */
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        // Refactor #3 - removed unused instance of Activity object - unused objects are simply a
        // misuse of memory resources

    }

    public void testTweet() {

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body), "");

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");

    }

    public void testClickTweetList(){
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);

       String message = ((EditText) solo.getView(R.id.messageView)).getText().toString();
        assertEquals("Test Tweet!", message);
    }

    // Refactoring #5 - added description to exception tag - it is easier to discern the cause of
    // the exceptions with a description

    /**
     * Runs at the end of the tests
     * @throws Exception throws generic exception
     */
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}