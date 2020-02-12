package Examen_U4_U5;

public class Guerrero extends Hombres implements Atacar {

    //ATRIBUTO

    private int edad;

    //MÉTODOS

    public Guerrero(String nombre, int energía, int capacidadAtaque, int capacidadDefensa, Encantado encantado,
                    int edad) {
        super(nombre, energía, capacidadAtaque, capacidadDefensa, encantado);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return '\n' + super.toString() + '\n' +
                "Edad = " + this.edad;
    }

    @Override
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
