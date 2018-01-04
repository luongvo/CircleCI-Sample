package vn.luongvo.circleci.sample;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import vn.luongvo.circleci.sample.ui.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@LargeTest
public class MainActivityTest extends BaseActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testHello() throws Exception {
        intending(hasComponent(MainActivity.class.getName()));
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }
}
