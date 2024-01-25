package com.example.examenii;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextParcial1, editTextParcial2;
    private TextView textViewPromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextParcial1 = findViewById(R.id.editTextParcial1);
        editTextParcial2 = findViewById(R.id.editTextParcial2);
        textViewPromedio = findViewById(R.id.textViewPromedio);

        Button buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        String calificacion1Str = editTextParcial1.getText().toString();
        String calificacion2Str = editTextParcial2.getText().toString();

        if (!calificacion1Str.isEmpty() && !calificacion2Str.isEmpty()) {
            double calificacion1 = Double.parseDouble(calificacion1Str);
            double calificacion2 = Double.parseDouble(calificacion2Str);

            double promedio = (calificacion1 + calificacion2) / 2;

            textViewPromedio.setText("Promedio de Calificaciones: " + promedio);
        } else {
            textViewPromedio.setText("Ingrese ambas calificaciones.");
        }
    }
}