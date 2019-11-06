package com.company;

import java.util.Scanner;

public class Ejercicio_1_Examen {
    public static void main(String[] args) {
        /*Con motivo de la celebración del día de la mujer, el 8 de marzo,
        nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M.
        Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5.
        Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error.
        A continuación, se muestran algunos ejemplos. La anchura de la figura siempre será de 6 caracteres.
         */
        int altura;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Dame un número entero impar, mayor o igual a 5: ");
            altura = sc.nextInt();

            if (altura < 5 || altura % 2 == 0) {
                System.out.println("El número debe ser impar, mayor o igual a 5");
            } else {

                for (int i = 0; i < altura; i++) {

                    for (int j = 0; j < 6; j++) {

                        if (i == 0 || i == altura - 1 || i == altura / 2 || j == 0 || j == 5) {
                            System.out.print("M");
                        } else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            }
        } while (altura < 5 || altura % 2 == 0);
    }
}
