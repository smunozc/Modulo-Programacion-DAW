package UD08_T7;

public class Futbolista {
    //ATRIBUTOS
    private int id;
    private String nombre;
    private String equipo;
    private Estadisticas estadisticas;

    //MÉTODOS
    public Futbolista(int id, String nombre, String equipo, int goles, int pases, int faltas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadisticas.setGoles(goles);
        this.estadisticas.setPases(pases);
        this.estadisticas.setFaltas(faltas);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas.toString() +
                '}';
    }
}
