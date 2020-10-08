package com.rvmarra17.convertidor.core;

import android.widget.EditText;

public class conversor {

    public static final double conversionFerenheit(double valor) {
        return 1.8 * valor + 32;
    }

    public static final double conversionFerenheit(String valor) {
        return conversionFerenheit(Double.parseDouble(valor));
    }

    public static final double conversionCelsius(double valor) {
        return (valor - 23) / 1.8;
    }

    public static final double conversionCelsius(String valor) {
        return conversionCelsius(Double.parseDouble(valor));
    }

}
