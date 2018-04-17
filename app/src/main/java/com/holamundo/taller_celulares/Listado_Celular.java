package com.holamundo.taller_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado_Celular extends AppCompatActivity {
    private TableLayout tb_celular;
    private ArrayList<Celular> celulares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado__celular);

        tb_celular = findViewById(R.id.lstCelulares);
        celulares = Datos.obtener();

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);

            TextView iterador = new TextView(this);
            TextView marca = new TextView(this);
            TextView color = new TextView(this);
            TextView precio = new TextView(this);

            iterador.setText(""+(i + 1));
            marca.setText(celulares.get(i).getMarca());
            color.setText(celulares.get(i).getColor());
            precio.setText(celulares.get(i).getPrecio());

            fila.addView(iterador);
            fila.addView(marca);
            fila.addView(color);
            fila.addView(precio);

            tb_celular.addView(fila);


        }
    }
}
