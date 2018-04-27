package com.tanuj.testreport;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Tanuj on 13-04-2018.
 */

public class EmailValidatorTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"));
    }
}
