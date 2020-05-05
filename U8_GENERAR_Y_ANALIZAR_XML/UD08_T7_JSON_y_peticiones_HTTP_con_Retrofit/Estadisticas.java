package UD08_T7;

public class Estadisticas {

    //ATRIBUTOS
    private int goles;
    private int pases;
    private int faltas;

    //MÉTODOS

    public Estadisticas(int goles, int pases, int faltas) {
        this.goles = goles;
        this.pases = pases;
        this.faltas = faltas;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "goles=" + goles +
                ", pases=" + pases +
                ", faltas=" + faltas +
                '}';
    }
}
