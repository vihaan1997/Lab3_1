 package com.example.temp_app;

public class Calculation {
    protected float convertCelciusToFahrenheit(Float value) {
        Float ans = (value * 9/5) + 32;
        return ans;
    }
    protected float convertFahernheitToCelcius(Float value) {
        Float ans = (value - 32) * 5/9;
        return ans;
    }
}
