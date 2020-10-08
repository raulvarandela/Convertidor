package com.rvmarra17.convertidor.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.rvmarra17.convertidor.R;
import com.rvmarra17.convertidor.core.conversor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText GRADOS = this.findViewById(R.id.grados);

        GRADOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversion();
            }
        });

    }

    private void conversion() {
        final EditText GRADOS = this.findViewById(R.id.grados);
        final TextView resultado1 = this.findViewById(R.id.resultado1);
        final TextView resultado2 = this.findViewById(R.id.resultado2);
        double aux1 = conversor.conversionFerenheit(GRADOS.getText().toString());
        double aux2 = conversor.conversionCelsius(GRADOS.getText().toString());
        resultado1.setText(Double.toString(aux1)+"º");
        resultado2.setText(Double.toString(aux2)+"º");
    }
}