package com.bridgelabz.advance;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    private static final double DELTA = 0.001; // Tolerance for floating point comparison

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), DELTA);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), DELTA);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), DELTA);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), DELTA);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), DELTA);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), DELTA);
    }

    @Test
    public void testRoundTripConversion() {
        double celsius = 25.0;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        double convertedBack = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        assertEquals(celsius, convertedBack, DELTA);
    }
}
