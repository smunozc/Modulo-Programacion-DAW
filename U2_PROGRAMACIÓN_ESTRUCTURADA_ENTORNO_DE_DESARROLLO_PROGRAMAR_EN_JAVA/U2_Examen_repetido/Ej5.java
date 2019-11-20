package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Definir variables
        System.out.print("Introduzca horas: ");
        int horas = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        int segundos = sc.nextInt();
        System.out.print("Introduzca segundos a aumentar: ");
        int aumentoSeg = sc.nextInt();

        /*for (int i = segundos; i < (segundos + aumentoSeg); i++) {
            System.out.println(horas + ":" + minutos + ":" + segundos);
            if (aumentoSeg + segundos > 59) {
                minutos++;
                segundos = 0;
                System.out.println(horas + ":" + minutos + ":" + segundos);
                if (minutos < 59) {
                    horas++;
                    minutos = 0;
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                    if (horas < 23) {
                        horas = 0;
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                    }
                }
            }
        }*/

        for (int i = segundos; i <= (segundos + aumentoSeg); i++) {
            if (horas < 60 && minutos < 60 && segundos < 60) {
                segundos++;
                System.out.println(horas + ":" + minutos + ":" + segundos);
            } else if (minutos == 59 && segundos == 59) {
                segundos++;
                segundos = 0;
                minutos = 0;
                horas += 1;
                System.out.println(horas + ":" + minutos + ":" + segundos);
            } else if (segundos == 59) {
                segundos++;
                segundos = 0;
                minutos += 1;
                System.out.println(horas + ":" + minutos + ":" + segundos);
            } else if (horas > 23 && minutos == 59 && segundos == 59) {
                segundos++;
                horas = 0;
                minutos = 0;
                segundos = 0;
                System.out.println(horas + ":" + minutos + ":" + segundos);

            }
        }

    }
}
