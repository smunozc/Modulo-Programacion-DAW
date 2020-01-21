package com.company.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana.Ej1;

public class Pizza {

    //ATRIBUTOS

    //Size es como un método
    public enum Size {Mediana, Familiar}

    private Size size;
    private int numIngredientes;
    private Ingrediente ingredientes[] = new Ingrediente[3];

    //MÉTODOS

    /**
     * Constructor de pizza especificando el tamaño y el numero de ingredientes.
     *
     * @param size         Tamaño de la pizza, Mediana o Familiar.
     * @param ingredientes Ingredientes que contiene la pizza, como máximo 3.
     */
    Pizza(Size size, Ingrediente[] ingredientes) {
        this.size = size;
        for (int i = 0; i < ingredientes.length; i++) {
            this.ingredientes[i] = ingredientes[i];
            this.numIngredientes++;
        }
    }

    /**
     * Constructor de Pizza sin especificar el tamaño.
     */
    Pizza() {
        this.size = Size.Familiar;
    }

    /**
     * Getter del número de ingredientes, para saber cuantos ingredientes que tiene una pizza.
     *
     * @return devuelve el número de ingredientes.
     */
    public int getNumIngredientes() {
        return numIngredientes;
    }

    /**
     * Método para añadir 1 ingrediente a la pizza.
     *
     * @return devuelve true si hay menos de tres ingredientes y se ha podido añadir, devuelve
     * false si hay tres ingredientes y no se pueden añadir más.
     */
    public boolean setIngrediente(Ingrediente i) {
        if (this.numIngredientes < 3) {
            this.ingredientes[numIngredientes] = i;
            this.numIngredientes++;
            System.out.println("Ingrediente añadido correctamente.");
            return true;
        } else {
            System.out.println("Ya hay 3 ingredientes en la pizza, no se pueden añadir más.");
            return false;
        }
    }

    /**
     * Método que muestra por pantalla el tamaño y los ingredientes de la pizza actual.
     */
    public void displayPizza() {
        System.out.print("Tamaño: " + this.size + " | " + "Ingredientes: ");
        for (int i = 0; i < this.ingredientes.length; i++) {
            System.out.print(this.ingredientes[i].getNombre());
            if (i == (this.ingredientes.length - 1)) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }

        }
    }

    /**
     * Método que muestra los tamaños de las pizzas por pantalla.
     */
    public void displaySizes() {
        System.out.print("Tamaños de pizza: ");
        for (int i = 0; i < Size.values().length; i++) {
            System.out.print(Size.values()[i]);
            if (i == (Size.values().length - 1)) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
    }


}
