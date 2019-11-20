package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Definir variable altura
        System.out.print("Introduce la altura de los calcetines: ");
        int altura = sc.nextInt();

        //bucle que solicita que la altura sea mayor o igual a 4
        while (altura < 4) {
            System.out.print("La altura debe ser mayor o igual que 4: ");
            altura = sc.nextInt();
        }

        //bucle y condiciones para pintar
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 13; j++) {
                if (j < 6 && (i == altura - 1 || i == altura - 2) || j < 3 || j > 6 && j < 10 || j >= 10 && (i == altura - 1 || i == altura - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
