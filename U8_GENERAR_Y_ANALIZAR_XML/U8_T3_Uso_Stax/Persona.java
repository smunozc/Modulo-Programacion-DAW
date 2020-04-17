package U8_T3_Uso_Stax;

public class Persona {

    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private int edad;
    private String empleo;

    //MÉTODOS

    public Persona(String nombre, String apellido, int edad, String empleo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.empleo = empleo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }


}
