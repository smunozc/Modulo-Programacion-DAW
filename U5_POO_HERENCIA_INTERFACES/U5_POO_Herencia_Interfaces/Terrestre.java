package U5_POO_Herencia_Interfaces;

import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable {

    //ATRIBUTOS

    private String matricula;
    private int fechaFabricacion;
    private Color color;

    //METODOS

    /**
     * Constructor de Vehiculo Terrestre.
     *
     * @param matricula        matricula del vehiculo.
     * @param fechaFabricacion año de fabricación del vehiculo.
     * @param color            color del vehiculo.
     */
    public Terrestre(String nombre, int numPersonas, String matricula, int fechaFabricacion, Color color) {
        super(nombre, numPersonas);
        this.matricula = matricula;
        this.fechaFabricacion = fechaFabricacion;
        this.color = color;
    }

    /**
     * Getter de matricula.
     *
     * @return devuelve la matricula.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Setter de matricula.
     *
     * @param matricula matricula que se pasa como parametro a la funcion para asignarsela al vehiculo terrestre.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Getter del año de fabricación del vehiculo
     *
     * @return devuelve el año de fabricación del vehiculo
     */
    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * Setter del año de fabricación del vehiculo
     *
     * @param fechaFabricacion Año de fabricación que se pasa como parametro a la funcion
     *                         para asignarsela al vehiculo terrestre.
     */
    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Getter del color del vehiculo terrestre.
     *
     * @return devuelve el color del vehiculo terrestre.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el Color del vehiculo terrestre.
     *
     * @param color color que se pasa como parametro a la funcion para asignarselo al vehiculo terrestre.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método que devuelve una cadena con la información básica del vehiculo terrestre.
     *
     * @return devuelve la cadena con la información del vehiculo terrestre.
     */
    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Matricula = " + matricula + '\n' +
                "Fecha Fabricacion = " + fechaFabricacion + '\n' +
                "Color = " + color + '\n';
    }

    /**
     * Método para comprobar si dos vehiculos terrestres son iguales.
     *
     * @param o objeto que se pasa como parámetro a la clase para saber si es igual al vehiculo terrestre actual.
     * @return devuelve true si son iguales y false si son distintos.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return Objects.equals(getMatricula(), terrestre.getMatricula());
    }

    /**
     * CompareTo para ordenar un vector de vehiculos terrestres por su matricula.
     *
     * @param o objeto vehiculo terrestre que se pasa como parámetro para comparar y ordenar.
     * @return devuelve positivo si el vehiculo actual es mayor, negativo si es menor y 0 si son iguales.
     */
    public int compareTo(Object o) {
        Terrestre t = (Terrestre) o;
        return this.getMatricula().compareTo(t.getMatricula());
    }
}