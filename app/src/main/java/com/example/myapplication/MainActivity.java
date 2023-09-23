package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtTxtAlt;
    private TextView txtResultado;
    private EditText edtTxtPeso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcularIMC(View view){
        edtTxtAlt = findViewById(R.id.edtTxtAlt);
        edtTxtPeso = findViewById(R.id.edtTxtPeso);
        txtResultado = findViewById(R.id.txtResultado);
        
        double peso = Double.parseDouble(edtTxtPeso.getText().toString());
        double altura = Double.parseDouble(edtTxtAlt.getText().toString());
        double resultado = peso/ (altura * altura);


        if(resultado <19){
            txtResultado.setText("Abaixo do Peso");
        } else if (resultado>=20 && resultado<25) {
            txtResultado.setText("Peso Normal");
        } else if (resultado >= 25 && resultado <30) {
                txtResultado.setText("Sobrepeso");
            } else if (resultado >= 30 && resultado<35) {
                txtResultado.setText("Obesidade Classe I");
            } else if (resultado>=35&&resultado<40) {
                txtResultado.setText("Obesidade Classe II");
            } else if (resultado>=40) {
                txtResultado.setText("Obesidade Classe III");
            }

        }
        }
