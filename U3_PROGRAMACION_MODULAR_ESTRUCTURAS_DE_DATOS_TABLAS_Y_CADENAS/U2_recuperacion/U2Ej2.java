package com.company;

import java.util.Scanner;

public class U2Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero a descifrar: ");
        int numero = sc.nextInt();
        int contador = 0;
        int numero_descifrado;

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        while (numero >= 0) {

            System.out.print("Introduzca un nuevo numero a descifrar: ");
            numero = sc.nextInt();

        }

    }
}
