package Examen_U4_U5;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {

    //ATRIBUTOS

    private Personaje[] personajes;
    private int contadorPersonajes;

    //MÉTODOS


    public RPG(Personaje[] personajes) {
        if (personajes.length <= 10) {
            this.personajes = new Personaje[personajes.length];
            for (int i = 0; i < personajes.length; i++) {
                this.personajes[i] = personajes[i];
                this.contadorPersonajes++;
            }
        } else {
            System.out.printf("La cantidad de personajes no puede ser superior a 10.");
        }
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }

    public int getContadorPersonajes() {
        return contadorPersonajes;
    }

    public void setContadorPersonajes(int contadorPersonajes) {
        this.contadorPersonajes = contadorPersonajes;
    }

    public void borrarMuertos() {
        for (int i = 0; i < this.personajes.length; i++) {
            if (this.personajes[i].getEnergía() == 0) {
                this.personajes[i] = this.personajes[this.contadorPersonajes - 1];
                this.personajes = Arrays.copyOf(this.personajes,this.personajes.length - 1);
                this.contadorPersonajes--;
            }
        }
    }

    public void addPersonaje(Personaje p) {
        if (contadorPersonajes < this.personajes.length) {
            this.personajes[contadorPersonajes] = p;
            this.contadorPersonajes++;
        } else {
            System.out.println("La capacidad de personajes está al máximo.");
        }
    }

    @Override
    public String toString() {
        return '\n' + "Estado de la partida: " + '\n' +
                "Personajes = " + Arrays.toString(personajes) +
                ", contadorPersonajes=" + contadorPersonajes +
                '}';
    }

    public String mostrarEstado() {
        Arrays.sort(this.personajes);

        return '\n' + "Estado de la partida: " + '\n' +
                "Personajes: " + '\n' + Arrays.toString(this.personajes) + '\n' +
                "Numero de personajes vivos: " + this.contadorPersonajes + '\n' +
                "---------------------------------------------";

    }

    public String mostrarxAtaque() {
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadAtaque() - t1.getCapacidadAtaque();
            }
        });

        return '\n' + "Personajes ordenados por ataque: " + '\n' +
                "Personajes: " + '\n' + Arrays.toString(this.personajes);
    }

    public String mostrarxDefensa() {
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadDefensa() - t1.getCapacidadDefensa();
            }
        });

        return '\n' + "Personajes ordenados por defensa: " + '\n' +
                "Personajes: " + '\n' + Arrays.toString(this.personajes);
    }

    public String hayGanador() {
        int indiceGanador = 0;
        if (this.contadorPersonajes == 1) {
            for (int i = 0; i < this.personajes.length; i++) {
                if (this.personajes[i].getEnergía() > 0) {
                    indiceGanador = i;
                }
            }
            return "¡Hay ganador!" + '\n' + this.personajes[indiceGanador];
        } else {
            return "Aún hay personajes en juego.";
        }
    }
}
