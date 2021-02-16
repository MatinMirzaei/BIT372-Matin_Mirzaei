package com.example.unitcoverter;



public class Converter {


    public static float toCelsius(float fah) {
        return (fah - 32) * 5/9;
    }
    public static float toKilogram(float pod) {

        return (float) (0.45359237 * pod);
    }
    public static float toKilometer(float mls) {
        return (float) (mls * 1.60934);
    }
    public static float toMilliliter(float oz) {
        return (float) (oz * 29.5735);
    }
    public static float toMeter(float ft) {
        return (float) (ft * 0.3048);
    }
}

