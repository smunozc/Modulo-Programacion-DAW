package Examen_U4_U5;


public abstract class Personaje implements Comparable {

    //ATRIBUTOS

    private String nombre;
    private int energía;
    private int capacidadAtaque;
    private int capacidadDefensa;
    private Encantado encantado;


    //MÉTODOS

    public Personaje(String nombre, int energía, int capacidadAtaque, int capacidadDefensa, Encantado encantado) {
        this.nombre = nombre;
        if (energía >= 0 && energía <= 1000) {
            this.energía = energía;
        } else {
            this.energía = 1000;
            System.out.println("La energía establecida se sale de los valores limites.");
        }

        if (capacidadAtaque >= 0 && capacidadAtaque <= 100) {
            this.capacidadAtaque = capacidadAtaque;
        } else {
            this.capacidadAtaque = 50;
            System.out.println("La capacidad de ataque establecida se sale de los valores limites.");
        }

        if (capacidadDefensa >= 0 && capacidadDefensa <= 100) {
            this.capacidadDefensa = capacidadDefensa;
        } else {
            this.capacidadDefensa = 50;
            System.out.println("La capacidad de defensa establecida se sale de los valores limites.");
        }

        this.encantado = encantado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergía() {
        return energía;
    }

    public void setEnergía(int energía) {
        this.energía = energía;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    public Encantado getEncantado() {
        return encantado;
    }

    public void setEncantado(Encantado encantado) {
        this.encantado = encantado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return getNombre().equals(personaje.getNombre());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + '\n' +
                "Nombre = " + nombre + '\n' +
                "Energía = " + energía + '\n' +
                "Capacidad de Ataque = " + capacidadAtaque + '\n' +
                "Capacidad de Defensa = " + capacidadDefensa + '\n' +
                "Encantado = " + encantado;
    }
}
