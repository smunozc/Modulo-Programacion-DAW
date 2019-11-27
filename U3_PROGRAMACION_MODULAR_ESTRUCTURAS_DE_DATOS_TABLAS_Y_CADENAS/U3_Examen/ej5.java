package com.company;


public class ej5 {
    public static void main(String[] args) {

        //Llamar funcion de vectorUnion
        String[] vectorUnion_1 = {"Hello", "World"};
        String[] vectorUnion_2 = {"Hola", "Mundo"};

        for (int i = 0; i < VectoresExamen.unir(vectorUnion_1, vectorUnion_2).length; i++) {
            System.out.print(VectoresExamen.unir(vectorUnion_1, vectorUnion_2)[i] + " ");
        }

        System.out.println();

        //Llamar funcion rotar
        String[] vectorRotar = {"a", "b", "c", "d", "e"};
        int posiciones = 2;

        for (int i = 0; i < vectorRotar.length; i++) {
            System.out.print(VectoresExamen.rotar(vectorRotar,posiciones)[i]);
        }

    }
}
