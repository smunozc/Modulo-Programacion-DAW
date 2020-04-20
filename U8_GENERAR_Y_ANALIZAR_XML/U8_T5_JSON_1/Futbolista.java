package UD08_JSON_T1;

public class Futbolista {
    //ATRIBUTOS
    private int dorsal;
    private String nombre;
    private String[] demarcaciones;
    private String equipo;
    //MÉTODOS

    public Futbolista(int dorsal, String nombre, String[] demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDemarcaciones() {
        return demarcaciones;
    }

    public void setDemarcaciones(String[] demarcaciones) {
        this.demarcaciones = demarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
