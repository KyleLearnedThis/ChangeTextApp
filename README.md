# Basic Sample App with Espresso tests

Since this is a simple Android App written in Java, I wrote pagified Espresso tests so no external tools and test framework is used.

## App requirements
1. Android Studio Arctic Fox 2020.3.1 Patch 3
2. SDK level 30 (tested on Pixel 3 and Pixel 5 emulators on SDK version 30)


## How to open project
1. Download the code from GitHub.
1. Open the root directory of this repository on the level of build.gradle.


## How to run App

This project uses the Gradle build system. You don't need an IDE to build and execute it but Android Studio is recommended.

1. Download the project code, preferably using `git clone`.
1. Open the Android SDK Manager (*Tools* Menu | *Android*) and make sure you have installed the *Android testing support library Repository* under *Extras*.
1. In Android Studio, select *File* | *Open...* and point to the `./build.gradle` file.
1. Check out the relevant code:
    * The application under test is located in `src/main/java`
    * Tests are in `src/androidTest/java`
1. Create the test configuration with a custom runner: `androidx.test.runner.AndroidJUnitRunner`
    * Open *Run* menu | *Edit Configurations*
    * Add a new *Android Tests* configuration
    * Choose a module
    * Add a *Specific instrumentation runner*: `androidx.test.runner.AndroidJUnitRunner`
1. Run the newly created configuration
1. Or you can just run this in Android Studio IDE as Run Application.

The application will be started on the device/emulator and a series of actions will be performed automatically.

If you are using Android Studio, the *Run* window will show the test results.

## How to run Espresso tests
1.  On the file ChangeTextBehaviorTest.java in the Android Studio, right click to run tests.
2.  Notice the IDE converted this into a adb instrumented test script run, you can see the result in the panel for log messages.
3.  You can also see the test results in the test panel formatted nicely.

## Test cases
1. Functional tests
    * testNoChangeText (validate default title for the app)
    * testChangeTextSameActivity (validate title changed after entering new text and click update text)
    * testChangeTextNewActivity (validate different activity is invoked when text is changed and click on new activity button)
2. Negative test
    * testEnterEmptyText: (validate you can enter empty test and change title to empty)
3. Edge Case
    * testCanGoBackFromNewActivity: (validate you can exit from new activity and validate that you can see the title)

