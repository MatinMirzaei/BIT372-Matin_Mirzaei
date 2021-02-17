package com.example.unitcoverter;

import android.content.Context;
import android.view.View;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.unitcoverter", appContext.getPackageName());
    }

    @Test
    public void can_enter_fahrenheit() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("Fahrenheit to Celsius")).perform(click());
        onView(withId(R.id.cv_input)).perform(typeText("45"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.cv_text)).check(matches(withText("7.22 ºC")));
    }

    @Test
    public void can_enter_pound() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("Pound to Kilogram")).perform(click());
        onView(withId(R.id.cv_input)).perform(typeText("150"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.cv_text)).check(matches(withText("68.04 kg")));
    }

    @Test
    public void can_enter_mile() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("Mile to kilometer")).perform(click());
        onView(withId(R.id.cv_input)).perform(typeText("20"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.cv_text)).check(matches(withText("32.19 km")));
    }

    @Test
    public void can_enter_ounce() {
        onView(withId(R.id.spinner)).perform(click());
        onView(withText("Ounce to Milliliter")).perform(click());
        onView(withId(R.id.cv_input)).perform(typeText("10"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.cv_text)).check(matches(withText("295.73 ml")));
    }
}