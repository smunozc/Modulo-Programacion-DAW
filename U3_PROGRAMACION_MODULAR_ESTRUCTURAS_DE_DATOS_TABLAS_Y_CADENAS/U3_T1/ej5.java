package U3_Entregable_1920;

public class ej5 {
    //Funcion para sacar numero aleatoriamente de un Array
    public static int aleatorioDeArray(int[] a) {
        int numAleatorio = (int) (Math.random() * (a.length + 1) - 1);
        int elección = a[numAleatorio];
        return elección;
    }

    //Prueba de la funcion
    public static void main(String[] args) {

        int[]v1={111,222,333,444,555};
        System.out.println("Numero aleatorio del Array: " + aleatorioDeArray(v1));

    }
}
