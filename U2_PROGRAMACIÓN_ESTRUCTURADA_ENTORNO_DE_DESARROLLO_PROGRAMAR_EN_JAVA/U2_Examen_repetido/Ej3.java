package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Definir variables
        int contador_nFav1 = 0;
        int contador_nFav2 = 0;
        int contador_nFav3 = 0;

        System.out.println("Introduzca sus 3 números favoritos: ");
        System.out.print("Numero1: ");
        String nFav1 = sc.nextLine();
        System.out.print("Numero2: ");
        String nFav2 = sc.nextLine();
        System.out.print("Numero3: ");
        String nFav3 = sc.nextLine();
        System.out.print("Introduzca el número de la loteria: ");
        String numLoteria = sc.nextLine();
        while (numLoteria.length() != 5) {
            System.out.println("El número de la loteria debe tener 5 dígitos: ");
            numLoteria = sc.nextLine();
        }

        //Contar veces que aparecen nFav en loteria
        for (int i = 0; i < 5; i++) {
            if (nFav1.equals(numLoteria.charAt(i))) {
                contador_nFav1++;
            } else if (nFav2.equals(numLoteria.charAt(i))) {
                contador_nFav2++;
            } else if (nFav3.equals(numLoteria.charAt(i))) {
                contador_nFav3++;
            }
        }

        System.out.println("Hay del n1: " + contador_nFav1 + " del n2: " + contador_nFav2 + " y del n3: " + contador_nFav3);
        //Total de veces que aparecen los numeros favoritos en el numero de loteria y si da suerte
        if ((contador_nFav1 + contador_nFav2 + contador_nFav3) > 2) {
            System.out.println("Este número de lotería te va a dar suerte");
        } else {
            System.out.println("Este número de lotería no te va a dar suerte");
        }

    }
}
