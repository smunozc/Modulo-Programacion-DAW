package com.company;

import java.util.Scanner;

public class ej1 {

    //Funcion para sacar el numero mayor de una matriz
    public static int maxMatriz(int[][] v1) {

        int numMayor = v1[0][0];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {
                if (v1[i][j] > numMayor) {
                    numMayor = v1[i][j];
                }
            }
        }

        return numMayor;

    }

    //Prueba de la funcion
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de filas del vector: ");
        int filas = sc.nextInt();
        System.out.print("Ahora el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] vector = new int[filas][columnas];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int) (Math.random() * 1000 + 1);
            }
        }

        System.out.println(maxMatriz(vector));

    }
}
