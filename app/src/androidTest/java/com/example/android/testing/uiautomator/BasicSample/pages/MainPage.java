package com.example.android.testing.uiautomator.BasicSample.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import com.example.android.testing.uiautomator.BasicSample.R;

public class MainPage {

    public void editText(String input) {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText(input), closeSoftKeyboard());
    }

    public void clickChangeText() {
        onView(withId(R.id.changeTextBt)).perform(click());
    }

    public void clickOpenActivityAndChangeText() {
        onView(withId(R.id.activityChangeTextBtn)).perform(click());
    }

    public void validateTextToBeChanged(String input) {
        onView(withId(R.id.textToBeChanged)).check(matches(withText(input)));
    }

    public void validateShowTextView(String input) {
        onView(withId(R.id.show_text_view)).check(matches(withText(input)));
    }

    public void clearEditText() {
        onView(withId(R.id.editTextUserInput)).perform(clearText());
    }
}
