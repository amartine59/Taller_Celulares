package com.holamundo.taller_celulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lista_principal;
    private String [] op_menuPrincipal;
    private Intent in_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lista_principal = findViewById(R.id.lvPrincipal);
        op_menuPrincipal = getResources().getStringArray(R.array.op_menup);

        ArrayAdapter<String> adp_menup = new ArrayAdapter(this,android.R.layout.simple_list_item_1,op_menuPrincipal);
        lista_principal.setAdapter(adp_menup);
        lista_principal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in_principal = new Intent(Principal.this,Registro_Celular.class);
                        startActivity(in_principal);
                        break;

                    case 1:
                        in_principal = new Intent(Principal.this,Listado_Celular.class);
                        startActivity(in_principal);
                        break;

                    case 2:
                        in_principal = new Intent(Principal.this,Reportes.class);
                        startActivity(in_principal);
                        break;
                }
            }
        });
    }
}
