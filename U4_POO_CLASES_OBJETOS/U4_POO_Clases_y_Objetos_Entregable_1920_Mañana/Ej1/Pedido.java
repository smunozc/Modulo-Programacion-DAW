package com.company.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana.Ej1;

import java.util.Calendar;

public class Pedido {

    //ATRIBUTOS

    private Pizza pizza;
    private Calendar hora;

    //MÉTODOS

    /**
     * Constructor de pedido en el que especificas la pizza que se ha pedido.
     * @param pizza pizza creada que se va a pedir.
     */
    Pedido(Pizza pizza) {
        this.pizza = pizza;
        this.hora = Calendar.getInstance();
    }

    /**
     * Getter de la hora del pedido.
     * @return devuelve la hora del pedido.
     */
    public Calendar getHora() {
        return hora;
    }

    public void productoEstrella(){

    }

}
