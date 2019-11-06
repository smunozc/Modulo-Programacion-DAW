package com.company;

import java.util.Scanner;

public class Ejercicio_3_Examen {
    public static void main(String[] args) {
        /*
        Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
        número entero introducido por teclado. El orden es el que se muestra en
        los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
        largos.
        */

        Scanner sc = new Scanner(System.in);
        Long n1;
        System.out.print("Dame un número entero: ");
        n1 = sc.nextLong();

        //Definición de cadenas
        String contiene = "";
        String noContiene = "";
        String numero = String.valueOf(n1);

        //Contador del 0 al 9
        for (int i = 0; i <= 9; i++) {
            //Comparación de "i" y "número"
            if (numero.contains(String.valueOf(i))) {
                contiene = contiene + String.valueOf(i);
            } else {
                noContiene = noContiene + String.valueOf(i);
            }
        }

        System.out.println("Dígitos que aparecen en el número: " + contiene);
        System.out.println("Dígitos que no aparecen: " + noContiene);

    }
}
