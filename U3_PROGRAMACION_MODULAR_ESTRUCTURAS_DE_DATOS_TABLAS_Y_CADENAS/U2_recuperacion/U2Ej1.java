package com.company;

import java.util.Scanner;

public class U2Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de la pirámide, debe ser un número mayor o igual a 3: ");
        int altura = sc.nextInt();

        while (altura < 3) {
            System.out.print("El numero introducido debe ser mayor o igual a 3: ");
            altura = sc.nextInt();
        }

        int anchura_central = 4;
        int base = altura * 2 + anchura_central;
        int aux1 = altura;
        int aux2 = aux1 + anchura_central;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j >= aux1 && j <= aux2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            aux1--;
            aux2++;
            System.out.println();
        }

    }
}
