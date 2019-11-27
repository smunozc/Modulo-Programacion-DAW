package com.company;

public class ej4 {

    //Funcion para filtrar primos de una matriz
    public static int[] filtraPrimos(int[] v1) {

        int[] vectorCalculo = new int[v1.length];
        int contador = 0;
        boolean esPrimo = false;

        for (int i = 0; i < v1.length; i++) {

            if (v1[i] % 1 == 0 && v1[i] % v1[i] == 0 && v1[i] % 2 != 0) {

                esPrimo = true;
                vectorCalculo[contador] = v1[i];
                contador++;

            } else if(!esPrimo) {

                contador = 1;

            }

        }

        int[] vectorPrimos = new int[contador];

        for (int i = 0; i < vectorPrimos.length; i++) {

            if (esPrimo) {

                vectorPrimos[i] = vectorCalculo[i];

            } else {

                vectorPrimos[0] = (-1);

            }

        }

        return vectorPrimos;

    }

    //Prueba de funcion
    public static void main(String[] args) {

        int[] vector = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < filtraPrimos(vector).length; i++) {

            System.out.print(filtraPrimos(vector)[i] + " | ");

        }

    }
}
