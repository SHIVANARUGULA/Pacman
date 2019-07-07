package com.comp6442.assignment.pacman;
import android.support.test.rule.ActivityTestRule;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class EspressoTest {
    ActivityTestRule<StartActivity> mActivityTestRule = new ActivityTestRule<StartActivity>();

    @Test
    public void startActivity() {
        onView(withId(R.id.button)).perform(click());
    }
}
