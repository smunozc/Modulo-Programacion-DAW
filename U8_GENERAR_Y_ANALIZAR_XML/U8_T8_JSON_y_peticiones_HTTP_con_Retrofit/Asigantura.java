package UD08_T8;

public class Asigantura {

    //ATRIBUTOS

    private int id;
    private String nombre;
    private int alumnoId;

    //METODOS

    public Asigantura(int id, String nombre, int alumnoid) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoid;
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

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    @Override
    public String toString() {
        return "Asigantura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alumnoId=" + alumnoId +
                '}';
    }
}
