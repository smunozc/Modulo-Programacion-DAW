package Examen_U4_U5;

public class Elfo extends Personaje implements Atacar {

    //ATRIBUTOS

    private TipoElfo tipo;

    //MÉTODOS

    public Elfo(String nombre, int energía, int capacidadAtaque, int capacidadDefensa, Encantado encantado,
                TipoElfo tipo) {
        super(nombre, energía, capacidadAtaque, capacidadDefensa, encantado);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return '\n' + super.toString() + '\n' +
                "Tipo = " + this.tipo;
    }

    public void atacarPersonaje(Personaje p) {
        System.out.printf(super.getNombre().toUpperCase() + "- ATACANDO.");
        if (this.getClass() == p.getClass()) {
            System.out.println("El personaje atacado es de la misma faccion, no se han producido daños.");
        } else {
            if (p.getEncantado() == Encantado.NO) {
                if (this.getCapacidadAtaque() > p.getCapacidadDefensa()) {
                    p.setEnergía(p.getEnergía() - (this.getCapacidadAtaque() - p.getCapacidadDefensa()));
                } else {
                    System.out.println("No tiene suficiente capacidad de ataque para hacer daño al personaje objetivo.");
                }
            } else {
                if (this.getCapacidadAtaque() > p.getCapacidadDefensa()) {
                    p.setEnergía(p.getEnergía() - ((this.getCapacidadAtaque() - p.getCapacidadDefensa()) * 2));
                } else {
                    p.setEnergía(p.getEnergía() - ( - ((this.getCapacidadAtaque() - p.getCapacidadDefensa()) * 2)));
                }
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        return this.getEnergía() - ((Personaje) o).getEnergía();
    }
}
