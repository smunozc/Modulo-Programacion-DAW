package U5_POO_Herencia_Interfaces;

public abstract class Aereo extends Vehiculo {

    //ATRIBUTOS

    private double altitud;
    private String oaci;

    //METODOS

    /**
     * Constructor de Vehiculo aereo.
     *
     * @param nombre      nombre del vehiculo.
     * @param numPersonas numero de personas que puede llevar.
     * @param oaci        codigo oaci del vehiculo.
     * @param altitud     altitud a la que vuela.
     */
    public Aereo(String nombre, int numPersonas, String oaci, double altitud) {
        super(nombre, numPersonas);
        this.oaci = oaci;
        this.altitud = altitud;
    }

    /**
     * Getter de altitud.
     *
     * @return devuelve la altitud.
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * Setter de altitud.
     *
     * @param altitud establece la altitud del vehiculo.
     */
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    /**
     * Getter del codigo OACI.
     *
     * @return devuelve el codigo OACI.
     */
    public String getOaci() {
        return oaci;
    }

    /**
     * Setter de OACI.
     *
     * @param oaci establece el código OACI del vehiculo.
     */
    public void setOaci(String oaci) {
        this.oaci = oaci;
    }

    /**
     * Este metodo pasa los datos del vehiculo Aereo a cadenas.
     *
     * @return devuelve los atributos del vehiculo en cadenas.
     */
    @Override
    public String toString() {
        return "Altitud = " + altitud + '\n' +
                "OACI = " + oaci + '\n' +
                super.toString();
    }

    /**
     * Metodo que compara dos vehiculos aereos para comprobar si son iguales.
     *
     * @param o objeto que se pasa como parametro para comparar con el vehiculo aereo actual.
     * @return devuelve true si tienen el mismo oaci y false si no lo tienen.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aereo aereo = (Aereo) o;
        return getOaci().equals(aereo.getOaci());
    }

    public String tipoYAltitud() {
        return "Tipo: " + getClass().getSimpleName() + '\n' +
                "Altitud: " + this.altitud;
    }

}
