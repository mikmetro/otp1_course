package TempConverter;

import junit.framework.TestCase;

public class TemperatureConverterTest extends TestCase {
    public void testCelsiusToFahrenheit() {
        assertEquals(86, TemperatureConverter.celsiusToFahrenheit(30), 0.0001);
    }

    public void testFahrenheitToCelsius() {
        assertEquals(54.44444, TemperatureConverter.fahrenheitToCelsius(130), 0.0001);
    }

    public void testExtremeTemp() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-41));
        assertFalse(TemperatureConverter.isExtremeTemperature(0));
        assertTrue(TemperatureConverter.isExtremeTemperature(50.1));
    }
}