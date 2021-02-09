package com.example.unitcoverter;

public class Converter {
    public static float toCelsius(float fah) {
        return (fah - 32) * 5/9;

    }
    public static float toKilogram(float pod) {
        return (float) (0.45359237 * pod);
    }
}
