package com.holamundo.taller_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Reportes extends AppCompatActivity {
    private ListView lista_reportes;
    private String [] op_menureportes;
    private ArrayList<Celular>celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        lista_reportes = findViewById(R.id.lvReportes);
        op_menureportes = getResources().getStringArray(R.array.op_reportes);
        celulares = Datos.obtener();
        ArrayAdapter<String> adp_reportes = new ArrayAdapter(this,android.R.layout.simple_list_item_1,op_menureportes);
        lista_reportes.setAdapter(adp_reportes);
        lista_reportes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        reporte_4();
                        break;
                    case 1:
                        reporte_5();
                        break;
                }
            }
        });

    }
    public void reporte_4(){
        int cantidad_apple_negro=0;
        for (int j = 0; j < celulares.size(); j++) {
            if ((celulares.get(j).getMarca().equals("Apple"))&&(celulares.get(j).getColor().equals("Negro"))){
                cantidad_apple_negro++;
            }
        }
        Toast.makeText(this,getResources().getString(R.string.reporte_4)+": "+cantidad_apple_negro,Toast.LENGTH_SHORT).show();

    }

    public void reporte_5(){
        double promedio=0,sum=0,cant=0;
        for (int j = 0; j < celulares.size(); j++) {
            if(celulares.get(j).getMarca().equals("Nokia")){
                sum =+ Double.parseDouble(celulares.get(j).getPrecio());
                cant++;
            }
        }
        promedio = sum/cant;
        Toast.makeText(this,getResources().getString(R.string.reporte_5)+": "+promedio,Toast.LENGTH_SHORT).show();

    }
}
