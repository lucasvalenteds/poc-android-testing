package io.lucasvalenteds.testing.model.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private static final String VALID_UID = "123";
    private static final String VALID_PHONE_NUMBER = "(51) 98222-3333";

    @Test
    public void ItAllowsToDefineValidUID() {
        Person person = new Person();
        person.setUid(VALID_UID);

        assertEquals(VALID_UID, person.getUid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void ItFailsToDefineEmptyUID() {
        Person person = new Person();
        person.setUid("");

        assertNull(person.getUid());
    }

    @Test
    public void ItAllowsToDefinePhoneNumberWithBrazilianFormat() {
        Person person = new Person();
        person.setPhoneNumber(VALID_PHONE_NUMBER);

        assertEquals(VALID_PHONE_NUMBER, person.getPhoneNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void ItFailsToDefinePhoneNumberWithForeignFormat() {
        Person person = new Person();
        person.setPhoneNumber("12345-7890");

        assertNull(person.getPhoneNumber());
    }
}
