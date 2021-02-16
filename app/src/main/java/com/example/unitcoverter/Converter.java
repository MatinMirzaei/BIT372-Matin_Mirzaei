package com.example.unitcoverter;

import androidx.lifecycle.MutableLiveData;

public class Converter {

    public MutableLiveData<String> name;

    public Converter(String name) {
        this.name = new MutableLiveData<>();
        this.name.setValue(name);
    }

    public static float toCelsius(float fah) {
        return (fah - 32) * 5/9;

    }
    public static float toKilogram(float pod) {

        return (float) (0.45359237 * pod);
    }
}

