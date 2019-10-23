package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n1 = teclado.nextInt();
        String cadena = "";

        while (n1 >= 2) {
            System.out.println(n1 + " / 2");
            cadena = (n1 % 2) + cadena;
            n1 = n1 / 2;
            if (n1 == 1) {
                cadena = n1 + cadena;
            }
        }

        System.out.print(cadena);

    }
}
