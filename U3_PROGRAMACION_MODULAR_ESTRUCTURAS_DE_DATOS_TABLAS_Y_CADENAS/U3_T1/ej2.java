package U3_Entregable_1920;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tablaResultado = new int[5][6];
        int suma = 0;

        for (int i = 0; i < tablaResultado.length - 1; i++) {
            for (int j = 0; j < tablaResultado[i].length - 1; j++) {
                System.out.println("Introduce el numero para la celda " + i + ", " + j + ": ");
                tablaResultado[i][j] = sc.nextInt();
            }
        }

        //calcular filas
        for (int i = 0; i < tablaResultado.length; i++) {
            suma = 0;
            for (int j = 0; j < tablaResultado[i].length; j++) {
                suma += tablaResultado[i][j];
            }
            tablaResultado[i][tablaResultado[i].length - 1] = suma;
        }

        //calcular columnas
        for (int j = 0; j < tablaResultado[j].length-1; j++) {
            suma=0;
            for (int i = 0; i < tablaResultado.length; i++) {
                System.out.println(i +"-"+ j);

                suma += tablaResultado[i][j];
            }
            tablaResultado[tablaResultado.length-1][j]=suma;
        }

        //imprimir tabla
        for (int i = 0; i < tablaResultado.length; i++) {
            for (int j = 0; j < tablaResultado[i].length - 1; j++) {
                System.out.print(tablaResultado[i][j]);
            }
            System.out.println();
        }

    }
}
