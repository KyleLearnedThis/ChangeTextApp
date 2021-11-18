package com.example.android.testing.uiautomator.BasicSample;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;

import java.util.concurrent.atomic.AtomicReference;

public class BaseTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    // Note that IDE suggested to change text to AtomicReference instead of String, so I did.
    public String getResourceString(Integer id) {
        AtomicReference<String> text = new AtomicReference<>("");
        activityScenarioRule.getScenario().onActivity(it -> text.set(it.getResources().getString(id)));
        return text.get();
    }
}
