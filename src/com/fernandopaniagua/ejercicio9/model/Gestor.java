package com.fernandopaniagua.ejercicio9.model;

public class Gestor {
    /**
     * 0-5 Niños
     * 6-15 Adolescentes
     * 16-60 Adulto
     * 61-infinito Viejuno
     * 
     * @param edad
     * @return 
     */
    public static String calcularSegmento(int edad){
        String segmento;
        if (edad <= 5) {
            segmento = "Niños";
        } else if (edad <= 15) {
            segmento = "Adolescentes";
        } else if (edad <= 60){
            segmento = "Adulto";
        } else {
            segmento = "Viejuno";
        }
        return segmento;
    }
    public static boolean esMayorEdad(int edad){
        boolean es;
        /*
        //Version tradicional
        if (edad>=18){
            es = true;
        } else {
            es = false;
        }
        */
        //Ternaria
        es = edad>=18 ? true : false;
        //'Guay'
        //es = edad>=18;
        
        return es;
    }
}
