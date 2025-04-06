package com.bridgelabz.advance;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    public void setUp() {
        registration = new UserRegistration();
    }

    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("john_doe", "john@example.com", "secret123");
        });
    }

    @Test
    public void testEmptyUsernameThrowsException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "secret123");
        });
        assertEquals("Username cannot be empty", ex.getMessage());
    }

    @Test
    public void testInvalidEmailThrowsException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "john-at-example.com", "secret123");
        });
        assertEquals("Invalid email address", ex.getMessage());
    }

    @Test
    public void testShortPasswordThrowsException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "john@example.com", "123");
        });
        assertEquals("Password must be at least 6 characters", ex.getMessage());
    }

    @Test
    public void testNullInputsThrowExceptions() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, "john@example.com", "secret123");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", null, "secret123");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "john@example.com", null);
        });
    }
}
