# POC: Android Testing

It demonstrates how to write unit tests and UI tests to an Android application.

The unit tests are based on [JUnit](https://github.com/junit-team/junit4) and verify that a person has a valid phone number. They run in the host machine.

The UI tests are based on [Espresso](https://developer.android.com/training/testing/espresso) and verify that the app shows a phone number when a button is pressed by the user. They run in the Android VM (emulator).

## How to run

| Description        | Command        |
| :----------------- | :------------- |
| Install tooling    | `make install` |
| Create the emulator | `make create`  |
| Delete the emulator | `make delete`  |
| Start the emulator | `make device`  |
| Run tests          | `make test`    |

## Preview

![App screen with button and text](./preview/01.gif)
