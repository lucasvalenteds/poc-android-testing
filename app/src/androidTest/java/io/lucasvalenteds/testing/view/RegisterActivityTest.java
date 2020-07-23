package io.lucasvalenteds.testing.view;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import io.lucasvalenteds.testing.R;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class RegisterActivityTest extends TestCase {

    @Rule
    public ActivityTestRule<RegisterActivity> mActivityTestRule =
            new ActivityTestRule<>(RegisterActivity.class, false, true);

    @Test
    public void whenActivityIsLaunchedTheAppNameShouldBeDisplayed() {
        onView(withId(R.id.person_phone)).check(matches(isDisplayed()));
        onView(withId(R.id.person_phone)).check(matches(withText(R.string.app_name)));
    }

    @Test
    public void whenShowMessageButtonClickedThePersonPhoneNumberShouldBeDisplayed() {
        onView(withId(R.id.btn_show_message)).perform(click());
        onView(withId(R.id.person_phone)).check(matches(withText(RegisterActivity.phoneNumber)));
    }
}
