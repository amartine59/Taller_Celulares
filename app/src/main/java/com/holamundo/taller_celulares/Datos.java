package com.holamundo.taller_celulares;

import java.util.ArrayList;

/**
 * Created by android on 16/04/2018.
 */

public class Datos {
    private static ArrayList<Celular> celulares = new ArrayList<>();

    public static void guardar(Celular p){
        celulares.add(p);
    }

    public static ArrayList<Celular>obtener(){return celulares;}
}
