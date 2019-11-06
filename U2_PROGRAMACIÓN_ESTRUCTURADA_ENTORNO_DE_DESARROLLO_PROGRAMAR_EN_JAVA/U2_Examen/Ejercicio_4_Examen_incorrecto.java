package com.company;

import java.util.Scanner;

public class Ejercicio_4_Examen {
    public static void main(String[] args) {
        /*
            Realiza un programa que calcule el máximo, el mínimo y la media de una serie de
            números enteros positivos introducidos por teclado. El programa terminará
            cuando el usuario introduzca un número primo. Este último número no se tendrá en
            cuenta en los cálculos. El programa debe indicar también cuántos
            números ha introducido el usuario (sin contar el primo que sirve para salir).
         */

        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo;
        int minimo;
        int maximo;
        int media;

        do {

            System.out.println("Introduce números enteros, el programa terminará cuando introduzcas un número primo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("El numero introducido debe ser entero positivo");
                primo = false;
            } else {
                primo = true;
                for (int i = 2; i < num; i++) {

                    if (num % i == 0) {
                        primo = false;
                    }


                }
            }

        } while (num <=0 || !primo);


    }
}
