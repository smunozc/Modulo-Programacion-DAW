package U5_POO_Herencia_Interfaces;

import java.util.Comparator;

public class ComparadorTerrestre implements Comparator {

    public int compare(Object t1, Object t2) {
        return ((Terrestre)t1).getFechaFabricacion()-((Terrestre)t1).getFechaFabricacion();
    }

}
