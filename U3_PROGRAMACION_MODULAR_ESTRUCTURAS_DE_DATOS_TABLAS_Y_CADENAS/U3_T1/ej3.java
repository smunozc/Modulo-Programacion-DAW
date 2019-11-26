package U3_Entregable_1920;

public class ej3 {

    public static int[] filtraCon7(int x[]) {
        int[] v1 = new int[x.length];

        for (int i = 0; i < v1.length; i++) {
            if (x[i] == 7) {
                v1[i] = x[i];
            }
        }

        return v1;

    }

    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 22, 24, 27, 777};
        for (int i = 0; i < v1.length; i++) {
            System.out.print(filtraCon7(v1)[i] + " | ");
        }

    }
}
