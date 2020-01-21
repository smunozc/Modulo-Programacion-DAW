package com.company.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana.Ej1;

public class Ingrediente {

    //ATRIBUTOS

    private String nombre;
    private int calorias;

    //MÉTODOS

    /**
     * Constructor especificando el ingrediente.
     *
     * @param nombre Nombre del ingrediente.
     * @param cal    calorias del ingrediente por 100g de este.
     */
    Ingrediente(String nombre, int cal) {
        this.nombre = nombre;
        this.calorias = cal;
    }

    /**
     * Constructor sin especificar ingrediente.
     * Por defecto será Queso, con 250 calorias por 100g.
     */
    Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    /**
     * Getter del nombre del ingrediente.
     *
     * @return devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del ingrediente.
     *
     * @param nombre nombre del ingrediente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de calorias.
     *
     * @return devuelve las calorias del ingrediente.
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * Setter de las calorias.
     *
     * @param calorias calorias del ingrediente.
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
