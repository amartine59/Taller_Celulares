package com.holamundo.taller_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registro_Celular extends AppCompatActivity {
    private Spinner spnMarca,spnColor;
    private String [] opcMarca,opcColor;
    private EditText precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__celular);
        spnMarca = findViewById(R.id.cmbMarca);
        spnColor = findViewById(R.id.cmbColor);
        opcMarca = getResources().getStringArray(R.array.op_marca);
        ArrayAdapter<String> adp_marca = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opcMarca);
        spnMarca.setAdapter(adp_marca);
        opcColor = getResources().getStringArray(R.array.op_color);
        ArrayAdapter<String> adp_color = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opcColor);
        spnColor.setAdapter(adp_color);
        precio = findViewById(R.id.txtPrecio);

    }
    public void almacenar_celular(String marca,String color ,String precio){
        Celular celular_actual = new Celular(marca,color,precio);
        celular_actual.GuardarCelular();

    }
    public void limpiar(){precio.setText("");}
    public void Borrar(View v){
        precio.setText("");
    }

    public boolean validar(EditText dato){
        if (dato.getText().toString().trim().isEmpty()){
            dato.requestFocus();
            dato.setError(getResources().getString(R.string.error_vacio));
            return false;
        }
        if (Double.parseDouble(dato.getText().toString())<=0){
            dato.requestFocus();
            dato.setError(getResources().getString(R.string.error_negativos));
            return false;
        }
        return true;
    }

    public void registrarCelular(View v){
        String marca="";
        String color="";
        String pre="";
        if (validar(precio)){
            marca = spnMarca.getSelectedItem().toString();
            color = spnColor.getSelectedItem().toString();
            pre = precio.getText().toString();

            almacenar_celular(marca,color,pre);
            Toast.makeText(this,getResources().getString(R.string.guardado),Toast.LENGTH_SHORT).show();
            limpiar();
        }
    }



}
