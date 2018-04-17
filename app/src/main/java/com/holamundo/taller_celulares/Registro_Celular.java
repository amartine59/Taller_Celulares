package com.holamundo.taller_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Registro_Celular extends AppCompatActivity {
    private Spinner spnMarca,spnColor;
    private String [] opcMarca,opcColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__celular);
    }

    public Celular traducir_a_string(int marca,int color,double precio){

    }
}
