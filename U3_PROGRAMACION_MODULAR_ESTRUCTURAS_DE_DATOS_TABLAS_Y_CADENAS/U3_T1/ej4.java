package U3_Entregable_1920;

public class ej4 {

    //Funcion conevrtir Array en String
    public static String convierteArrayEnString(int[] a){
        String cadena = "";

        for(int i=0;i<a.length;i++){
            cadena += a[i];
        }

        return cadena;

    }

    //Prueba de la funcion
    public static void main(String[] args) {

        int[] v1 = {1,2,3,4};
        System.out.println("Su Array convertida a String: " + convierteArrayEnString(v1));

    }
}
