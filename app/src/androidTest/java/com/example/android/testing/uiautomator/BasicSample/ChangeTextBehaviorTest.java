package com.example.android.testing.uiautomator.BasicSample;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;

import com.example.android.testing.uiautomator.BasicSample.pages.MainPage;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class ChangeTextBehaviorTest extends BaseTest {

    public MainPage mainPage = new MainPage();

    @Test
    public void testNoChangeText() {
        String input = getResourceString(R.string.hello_world);
        mainPage.validateTextToBeChanged(input);
    }

    @Test
    public void testChangeTextSameActivity() {
        String input = "Hello Android!";
        // Type text and then press the button.
        mainPage.editText(input);
        mainPage.clickChangeText();

        // Check that the text was changed.
        mainPage.validateTextToBeChanged(input);
    }

    @Test
    public void testChangeTextNewActivity() {
        String input = "Hello Android!";
        // Type text and then press the button.
        mainPage.editText(input);
        mainPage.clickOpenActivityAndChangeText();

        // This view is in a different Activity, no need to tell Espresso.
        mainPage.validateShowTextView(input);
    }

    @Test
    public void testEnterEmptyText() {
        String input = getResourceString(R.string.hello_world);
        mainPage.validateTextToBeChanged(input);
        mainPage.clearEditText();
        mainPage.clickChangeText();
        mainPage.validateTextToBeChanged("");
    }

    @Test
    public void testCanGoBackFromNewActivity() {
        String input = "Hello Android!";
        mainPage.editText(input);
        mainPage.clickOpenActivityAndChangeText();
        mainPage.validateShowTextView(input);

        Espresso.pressBack();
        input = getResourceString(R.string.hello_world);
        mainPage.validateTextToBeChanged(input);
    }
}