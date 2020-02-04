package U5_POO_Herencia_Interfaces;

public class Avioneta extends Aereo {


    /**
     * Constructor de Vehiculo aereo.
     *
     * @param nombre      nombre del vehiculo.
     * @param numPersonas numero de personas que puede llevar.
     * @param oaci        codigo oaci del vehiculo.
     * @param altitud     altitud a la que vuela.
     */
    public Avioneta(String nombre, int numPersonas, String oaci, double altitud) {
        super(nombre, numPersonas, oaci, altitud);
    }

    /**
     * Metodo toString que devuelve una cadena con los datos del vehiculo.
     * @return devuelve la cadena con los datos del vehiculo.
     */
    @Override
    public String toString() {
        return "Tipo: " + getClass().getSimpleName() + '\n' +
                super.toString();
    }
}
