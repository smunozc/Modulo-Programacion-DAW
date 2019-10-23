package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        float nota1 = teclado.nextInt();
        System.out.print("Introduzca la segunda nota: ");
        float nota2 = teclado.nextInt();
        System.out.print("Introduce la tercera nota: ");
        float nota3 = teclado.nextInt();

        float suma = nota1 + nota2 + nota3;
        float media = suma / 3;
        System.out.println(media);

        if ((media >= 5) && (media < 6)) {
            System.out.println("Suficiente");
        } else if ((media >= 6) && (media < 7)) {
            System.out.println("Bien");
        } else if ((media >= 7) && (media < 9)) {
            System.out.println("Notable");
        } else if (media >= 9) {
            System.out.println("Sobresaliente");
        } else if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? apto o no apto: ");
            String recuperacion = teclado.next();
            if (recuperacion.equals("apto")) {
                media = 5;
                System.out.println("Nota media: " + media);
            } else {
                System.out.println("No apto, nota media: " + media);
            }
        }

    }
}
