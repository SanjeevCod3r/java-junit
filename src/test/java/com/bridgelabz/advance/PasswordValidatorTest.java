package com.bridgelabz.advance;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Secure123"));
        assertTrue(PasswordValidator.isValid("A1b2c3d4"));
    }

    @Test
    public void testTooShortPassword() {
        assertFalse(PasswordValidator.isValid("A1b2"));
    }

    @Test
    public void testMissingUppercase() {
        assertFalse(PasswordValidator.isValid("secure123"));
    }

    @Test
    public void testMissingDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }

    @Test
    public void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""));
    }
}
