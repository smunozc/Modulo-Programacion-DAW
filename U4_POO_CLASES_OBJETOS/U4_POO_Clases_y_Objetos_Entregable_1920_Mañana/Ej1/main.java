package com.company.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana.Ej1;

import javax.print.attribute.standard.Media;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        //CREAR INGREDIENTES
        Ingrediente i1 = new Ingrediente("Jamon",200);
        Ingrediente i2 = new Ingrediente();
        Ingrediente i3 = new Ingrediente("Atun",100);
        //ARRAY PARA AÑADIR LOS INGREDIENTES A LA PIZZA
        Ingrediente[] ing = new Ingrediente[2];
        ing[0] = i1;
        ing[1] = i2;

        //CREAR PIZZA NUEVA
        Pizza p = new Pizza(Pizza.Size.Mediana, ing);
        //MOSTRAR TAMAÑOS DISPONIBLES
        p.displaySizes();
        //AÑADIR INGREDIENTE
        p.setIngrediente(i3);
        //MOSTRAR DATOS DE LA PIZZA
        p.displayPizza();


    }
}
