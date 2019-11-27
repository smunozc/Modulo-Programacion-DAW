package com.company;

import java.util.Scanner;

public class ej2 {

    //Funcion para insertar valor en Array
    public static int[] insertarValor(int[] v1, int pos, int valor) {

        int[] vector = new int[v1.length + 1];

        for (int i = 0; i < v1.length; i++) {

            vector[i] = v1[i];

            if (i == pos) {

                vector[i] = valor;

                while (i >= pos && i < v1.length) {
                    vector[i + 1] = v1[i];
                    i++;
                }

            }
        }

        if (pos == v1.length) {
            vector[v1.length] = valor;
        }

        return vector;

    }

    //Prueba de la funcion
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = {1, 2, 3, 4, 5};

        System.out.print("Introduce el numero entero que quieres insertar: ");
        int num = sc.nextInt();
        System.out.print("Introduce la posición en la que quieres insertar el número entero: ");
        int posicion = sc.nextInt();

        while (posicion >= insertarValor(vector,posicion,num).length || posicion < 0) {
            System.out.print("Debes introducir una posicion valida, comprendida entre 0 y una posicion mas del vector original: ");
            posicion = sc.nextInt();
        }

        for (int i = 0; i < insertarValor(vector, posicion, num).length; i++) {
            System.out.print(insertarValor(vector, posicion, num)[i] + " | ");
        }

    }
}
