package com.company;

public class VectoresExamen {

    //Funcion unir Strings
    public static String[] unir(String[] v1, String[] v2) {

        String[] vectorUnion = new String[v1.length + v2.length];

        for (int i = 0; i < v2.length; i++) {
            vectorUnion[i] = v2[i];
        }
        for (int i = 0; i < v1.length; i++) {
            vectorUnion[i + v2.length] = v1[i];
        }

        return vectorUnion;

    }

    //Funcion rotar String
    public static String[] rotar(String[] v1, int num_pos) {

        String[] v2 = new String[v1.length];
        int contador = num_pos;

        for (int i = 0; i < v2.length; i++) {

            if (contador >= v1.length) {
                contador = 0;
                v2[i] = v1[contador];
            }

            v2[i] = v1[contador];
            contador++;

        }

        return v2;

    }

}
