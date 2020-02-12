package Examen_U4_U5;

public interface Magia {
    default void encantar(Personaje personaje) {
        personaje.setEncantado(Encantado.SI);
    }

    default void desencantar(Personaje personaje) {
        personaje.setEncantado(Encantado.NO);
    }
}
