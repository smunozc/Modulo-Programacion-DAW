package com.company;

import java.util.Scanner;

public class Ejercicio_5_Examen {
    public static void main(String[] args) {
        /*
        Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
                Ejemplo:
        Entrada: cad = "Hola tu"
        Salida: La cantidad de vocales es 3
        */

        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una frase o palabra para indicar las vocales que contiene: ");
        cadena = sc.nextLine();

        //Formateo de texto introducido
        cadena.replace(" ", "");
        cadena = cadena.toLowerCase();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contador++;
            }
        }

        System.out.println("Tu cadena \"" + cadena + "\" contiene " + contador + " vocales");

    }
}
