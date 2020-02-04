package U5_POO_Herencia_Interfaces;

public class Motocicleta extends Terrestre {

    /**
     * Constructor de Vehiculo Terrestre.
     *
     * @param matricula        matricula del vehiculo.
     * @param fechaFabricacion año de fabricación del vehiculo.
     * @param color            color del vehiculo.
     */
    public Motocicleta(String nombre, int numPersonas, String matricula, int fechaFabricacion, Color color) {
        super(nombre, numPersonas, matricula, fechaFabricacion, color);
    }

    @Override
    public String toString() {
        return "Tipo: " + getClass().getSimpleName() + '\n' +
                super.toString();
    }
}
