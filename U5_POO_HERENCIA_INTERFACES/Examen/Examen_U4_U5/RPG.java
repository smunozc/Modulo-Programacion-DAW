package Examen_U4_U5;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {

    //ATRIBUTOS

    private Personaje[] personajes;
    private int contadorPersonajes;

    //MÉTODOS

    public boolean addPersonaje(Personaje p) {
        if (personajes!=null) {
            if (personajes.length==10) {
                System.out.println("No se pueden añadir más personajes a la partida");
                return false;
            } else {
                //Creo el nuevo vector con la nueva capacidad
                Personaje[] p1 = new Personaje[personajes.length+1];
                //Copio lo que tenía
                for (int i = 0; i <personajes.length ; i++) {
                    p1[i] = personajes[i];
                }
                p1[personajes.length] = p;
                //Cambio el nuevo por el viejo
                personajes = p1;
                return true;
            }
        } else {
            personajes = new Personaje[1];
            personajes[0] = p;
            return true;
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
        int numMuertos = 0;
        //Obtengo el número de
        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia()<=0) {
                numMuertos++;
            }
        }
        Personaje[] p1 = new Personaje[personajes.length-numMuertos];
        int j=0;
        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia()>0) {
                p1[j] = personajes[i];
                j++;
            }
        }
        personajes = p1;
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
                "---------------------------------------------" + '\n';

    }

    public String mostrarxAtaque() {
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadAtaque() - t1.getCapacidadAtaque();
            }
        });

        return '\n' + "Personajes ordenados por ataque: " + '\n' +
                "Personajes: " + '\n' + Arrays.toString(this.personajes) + '\n';
    }

    public String mostrarxDefensa() {
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadDefensa() - t1.getCapacidadDefensa();
            }
        });

        return '\n' + "Personajes ordenados por defensa: " + '\n' +
                "Personajes: " + '\n' + Arrays.toString(this.personajes) + '\n';
    }

    public String hayGanador() {
        int indiceGanador = 0;
        if (this.contadorPersonajes == 1) {
            for (int i = 0; i < this.personajes.length; i++) {
                if (this.personajes[i].getEnergia() > 0) {
                    indiceGanador = i;
                }
            }
            return "¡Hay ganador!" + '\n' + this.personajes[indiceGanador];
        } else {
            return "Aún hay personajes en juego.";
        }
    }
}
