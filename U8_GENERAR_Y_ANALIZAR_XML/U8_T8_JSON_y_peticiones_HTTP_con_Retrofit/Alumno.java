package UD08_T8;

import java.util.ArrayList;

public class Alumno {

    //ATRIBUTOS

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<Asigantura> asignaturas;


    //MÉTODOS


    public Alumno(int id, String nombre, String apellidos, int edad, ArrayList<Asigantura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.asignaturas = asignaturas;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Asigantura> getAsiganturas() {
        return asignaturas;
    }

    public void setAsiganturas(ArrayList<Asigantura> asiganturas) {
        this.asignaturas = asiganturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas.toString() +
                '}';
    }
}
