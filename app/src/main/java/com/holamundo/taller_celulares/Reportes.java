package com.holamundo.taller_celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportes extends AppCompatActivity {
    private ListView lista_reportes;
    private String [] op_menureportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        lista_reportes = findViewById(R.id.lvReportes);
        op_menureportes = getResources().getStringArray(R.array.op_reportes);
        ArrayAdapter<String> adp_reportes = new ArrayAdapter(this,android.R.layout.simple_list_item_1,op_menureportes);
        lista_reportes.setAdapter(adp_reportes);
        lista_reportes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        break;
                    case 1:
                        break;
                }
            }
        });

    }
}
