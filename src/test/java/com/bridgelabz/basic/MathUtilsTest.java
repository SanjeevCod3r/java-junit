package com.bridgelabz.basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testDivide_ValidInput() {
        assertEquals(2, MathUtils.divide(10, 5));
    }

    @Test
    public void testDivide_ByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

