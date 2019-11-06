package com.company;

import java.util.Scanner;

public class Ejercicio_2_Examen {
    public static void main(String[] args) {
        /*Escribe un programa que permita partir un número introducido por teclado en dos partes.
        Las posiciones se cuentan de izquierda a derecha empezando por el 1.
        Suponemos que el usuario introduce correctamente los datos, es decir,
        el número introducido tiene dos dígitos como mínimo y la posición en la que se parte el número
        está entre 2 y la longitud del número.
        No se permite en este ejercicio el uso de funciones de manejo de String
        (por ej. para extraer subcadenas dentro de una cadena).
         */
        Scanner sc = new Scanner(System.in);
        int numero;

        do {

            System.out.println("Introduce el número a partir: ");
            numero = sc.nextInt();

            if (numero < 10) {
                System.out.println("El número debe tener como mínimo dos cifras");
            }

        } while (numero < 10);

        int partir;
        int aux = numero;
        int contador = 0;
        //contador de cifras
        while (aux > 0) {
            aux = aux / 10;
            contador++;
        }

        do {

            System.out.println("Dame la posición por la que quieras partir el número: ");
            partir = sc.nextInt();

            if (partir < 2 || partir > contador) {
                System.out.println("La posición debe ser mayor a 2 y menor que el total de caracteres");
            }

        } while (partir < 2 || partir > contador);

        int aux1 = numero;

        for (int i = partir; i < contador; i++) {
            aux1 = aux1 / 10;
        }
        System.out.print("Los números partidos son el " + aux1);
        aux1 = numero;
        for (int j = partir; j < contador; j++) {
            aux1 = aux1 * 10;
        }
        System.out.print(" y el " + aux1);

    }
}
