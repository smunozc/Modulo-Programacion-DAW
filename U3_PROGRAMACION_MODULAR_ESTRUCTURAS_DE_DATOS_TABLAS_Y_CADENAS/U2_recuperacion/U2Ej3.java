package com.company;

import java.util.Scanner;

public class U2Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la fecha de hoy en formato dd/mm/yyyy: ");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int year = sc.nextInt();

        dia++;

        if (dia > 30 && mes < 12) {
            dia = 1;
            mes++;
            if (dia > 30 && mes > 12) {
                dia = 1;
                mes = 1;
                year++;
            }
        }

        System.out.println("Dia siguiente: " + dia + "/" + mes + "/" + year);
    }
}
