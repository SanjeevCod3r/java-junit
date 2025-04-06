package com.bridgelabz.advance;

// File: DateFormatterTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    public void testValidDateFormatting() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"));
    }

    @Test
    public void testInvalidDateFormatThrowsException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("12/25/2023"); // wrong format
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd", ex.getMessage());
    }

    @Test
    public void testEmptyStringThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("");
        });
    }

    @Test
    public void testNullInputThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            DateFormatter.formatDate(null);
        });
    }
}
