package io.lucasvalenteds.testing.model.person;

import android.support.annotation.NonNull;

public class Person {

    private static final String PHONE_NUMBER_FORMAT =
            ".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}";

    private String uid;
    private String phoneNumber;

    public void setUid(@NonNull String uid) {
        if (uid.isEmpty()) {
            throw new IllegalArgumentException("The UID cannot be empty");
        }
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setPhoneNumber(@NonNull String phoneNumber) {
        if (!phoneNumber.matches(PHONE_NUMBER_FORMAT)) {
            throw new IllegalArgumentException(
                    "Invalid phone number. It should follow the pattern (xx) xxxxx-xxxx");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
