package Examen_UD07_Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPerros {

    private Set<Perro> conjuntoPerros = new HashSet<>();

    public void add(Perro perro){
        if(!conjuntoPerros.contains(perro)){
            conjuntoPerros.add(perro);
        } else {
            System.out.println("Error: el perro ya se encuentra en el conjunto.");
        }
    }

    public void remove(Perro perro){
        if (conjuntoPerros.contains(perro)){
            conjuntoPerros.remove(perro);
        } else {
            System.out.println("Error: el perro no existe en el conjunto.");
        }

    }

    public Set<Perro> getConjuntoPerros() {
        return conjuntoPerros;
    }

    public void setConjuntoPerros(Set<Perro> conjuntoPerros) {
        this.conjuntoPerros = conjuntoPerros;
    }
}
