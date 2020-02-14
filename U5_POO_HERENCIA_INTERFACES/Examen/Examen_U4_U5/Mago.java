package Examen_U4_U5;

import java.util.Objects;

public class Mago extends Hombres implements Magia{

    //ATRIBUTOS

    private int longitudBarba;


    public Mago(String nombre, int energía, int capacidadAtaque, int capacidadDefensa, Encantado encantado,
                int longitudBarba) {
        super(nombre, energía, capacidadAtaque, capacidadDefensa, encantado);
        this.longitudBarba = longitudBarba;
    }

    public int getLongitudBarba() {
        return longitudBarba;
    }

    public void setLongitudBarba(int longitudBarba) {
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return '\n' + super.toString() + '\n' +
                "Longitud de la barba = " + this.longitudBarba + '\n' +
                "----------------------------" + '\n';
    }

    @Override
    public int compareTo(Object o) {
        return this.getEnergia() - ((Personaje) o).getEnergia();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mago mago = (Mago) o;
        return getLongitudBarba() == mago.getLongitudBarba();
    }

}
