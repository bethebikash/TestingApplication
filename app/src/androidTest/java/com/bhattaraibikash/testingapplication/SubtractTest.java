package com.bhattaraibikash.testingapplication;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SubtractTest {
    @Rule
    public ActivityTestRule<MainActivity>
            testRule =new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkSubtract() {
        onView(withId(R.id.firstNum)).perform(typeText("12"), closeSoftKeyboard());
        onView(withId(R.id.secondNum)).perform(typeText("10"), closeSoftKeyboard());
        onView(withId(R.id.btnSubtract)).perform(click());


        onView(withId(R.id.tvResult)).check(matches(withText("2.0")));

    }

}
