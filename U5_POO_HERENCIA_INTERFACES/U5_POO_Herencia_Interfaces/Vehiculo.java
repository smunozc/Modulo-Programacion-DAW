package U5_POO_Herencia_Interfaces;

import java.util.Objects;

public abstract class Vehiculo {

    //ATRIBUTOS

    private String nombre;
    private int numPersonas;
    private int pasajeros;

    //MÉTODOS

    /**
     * Constructor de Vehiculo.
     *
     * @param nombre      Nombre del vehiculo.
     * @param numPersonas Numero de personas que caben en el vehiculo.
     */
    public Vehiculo(String nombre, int numPersonas) {
        this.nombre = nombre;
        this.numPersonas = numPersonas;
        this.pasajeros = 0;

    }

    /**
     * Getter de nombre.
     *
     * @return devuelve el nombre del vehiculo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre
     *
     * @param nombre establece el nombre del vehiculo según el parámetro que se haya pasado al método.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de numPersonas.
     *
     * @return devuelve el numero de personas que caben en un vehiculo.
     */
    public int getNumPersonas() {
        return numPersonas;
    }

    /**
     * Setter de numPersonas.
     *
     * @param numPersonas establece el numero de personas que el vehiculo puede transportar
     *                    según el parámetro que se haya pasado al método.
     */
    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    /**
     * Metodo que compara si los nombres de ambos vehiculos son iguales
     *
     * @param o objeto vehiculo que se pasa como parametro
     * @return devuelve true si los nombres son iguales y false si no lo son.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return getNombre().equals(vehiculo.getNombre());
    }

    /**
     * Método que convierte los atributos del vehiculo en una cadena y los devuelve.
     *
     * @return devuelve los atributos del vehiculo en una cadena.
     */
    @Override
    public String toString() {
        return "Nombre = " + nombre + '\n' +
                "Num Personas = " + numPersonas;
    }

    /**
     * Metodo que añade el numero de personas que se pasa como parametro al vehiculo como pasajeros, si cabe.
     *
     * @param pasajeros nuemero de personas que se van a añadir
     */
    public void transportar(int pasajeros) {
        if (pasajeros <= this.numPersonas) {
            this.pasajeros = pasajeros;
        } else {
            System.out.println("No cabe este numero de pasajeros.");
        }

    }
}
