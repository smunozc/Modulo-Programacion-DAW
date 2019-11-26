package U3_Entregable_1920;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int numComensales = sc.nextInt();

        int maxComensales = 4;
        int numMesa = 0;
        boolean mesaVacia = false;
        int[] ocupacion = {3, 2, 1, 2, 1, 2, 3, 1, 1, 1};

        //Rellenar aleatoriamente
        /*int[] ocupacion = new int[10];

        for (int i = 0; i < ocupación.length; i++) {
            ocupacion[i] = (int) (Math.random() * 4 + 1);
        }*/

        while(numComensales != (-1)) {

            while (numComensales > maxComensales || numComensales <= 0) {
                System.out.println("Lo siento, no admitimos grupos de " + numComensales + ", haga grupos de 4 personas como máximo e intente de nuevo");
                System.out.print("¿Cuántos van a ser?: ");
                numComensales = sc.nextInt();
            }

            //Sentar en mesa a los comensales

            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i] == 0) {
                    numMesa = i;
                    mesaVacia = true;
                    ocupacion[i] = numComensales;
                    break;
                } else {
                    mesaVacia = false;
                }
            }
            for (int i = 0; i < ocupacion.length; i++) {
                if ((ocupacion[i] + numComensales) <= maxComensales) {
                    numMesa = i;
                    ocupacion[i] += numComensales;
                    mesaVacia = true;
                    break;
                } else {
                    mesaVacia = false;
                }
            }

            //Imprimir por pantalla las mesas con el numero de comensales
            for (int i = 0; i < ocupacion.length; i++) {
                System.out.print("Mesa " + (i + 1) + ": " + ocupacion[i] + " | ");
            }

            //Imprimir en que mesa se le ha sentado
            System.out.println();
            if (mesaVacia) {
                System.out.println("Por favor, sientese en la mesa número " + (numMesa + 1));
            } else {
                System.out.println("Lo siento, no hay espacio en ninguna mesa");
            }

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            numComensales = sc.nextInt();

        }
    }
}
