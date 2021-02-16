package com.example.unitcoverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterTest {
    @Test
    public void fahrenheit_conversion_isCorrect() {
        assertEquals(0.0, Converter.toCelsius(32),0.01);

    }

    @Test
    public void pound_conversion_isCorrect() {
        assertEquals(0.45359237, Converter.toKilogram((float) 1), 0.01);
    }

    @Test
    public void mile_conversion_isCorrect() {
        assertEquals(3.21869, Converter.toKilometer((float) 2), 0.01);
    }

    @Test
    public void feet_conversion_isCorrect() {
        assertEquals(1.524, Converter.toMeter((float) 5), 0.01);
    }
}