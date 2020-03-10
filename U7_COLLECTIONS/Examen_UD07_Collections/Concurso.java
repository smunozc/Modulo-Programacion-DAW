package Examen_UD07_Collections;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable {

    //ATRIBUTOS

    private Map<String,ConjuntoPerros> perros = new HashMap<>();
    private String nombreConcurso;
    private String localidad;

    //MÉTODOS

    public void addDog(String raza, Perro perro){
        if (raza.equals(perro.getRaza()) && !perros.containsKey(raza)){
            perros.put(raza,new ConjuntoPerros());
            perros.get(raza).add(perro);
        } else if (raza.equals(perro.getRaza()) && perros.containsKey(raza)) {
            perros.get(raza).add(perro);
        } else {
            System.out.println("Error: la raza introducida no coincide con la del perro.");
        }
    }

    public void disqualifyDog(Perro perro){
        Set<Map.Entry<String,ConjuntoPerros>> aux = perros.entrySet();
        Iterator it = aux.iterator();
        while(it.hasNext()){
            Map.Entry<String,ConjuntoPerros> e = (Map.Entry<String,ConjuntoPerros>)it.next();
            if (e.getValue().getConjuntoPerros().contains(perro)){
                e.getValue().getConjuntoPerros().remove(perro);
            }
        }
    }

    public void ownerDogs(int numSocio){
        System.out.println("Perros del socio " + numSocio + ": " + '\n');
        int contadorPerros = 0;
        //Set para iterar los conjuntos de perros
        Set<Map.Entry<String,ConjuntoPerros>> perrosAux = perros.entrySet();
        Iterator it = perrosAux.iterator();

        while(it.hasNext()){
            //Seleccion del valor del map e introducirlo en una variable
            Map.Entry<String,ConjuntoPerros> conjuntoPerrosAux = (Map.Entry<String,ConjuntoPerros>)it.next();
            //Iterador del conjunto de perros cogiendo el valor(set de perros)
            Iterator it2 = conjuntoPerrosAux.getValue().getConjuntoPerros().iterator();
            //Recorrer el set de perros
            while(it2.hasNext()){
                //Seleccion de un perro para introducirlo en la variable
                Perro perroAux = (Perro) it2.next();
                //Comparar si el numero de socio del propietario coincide con el parametro pasado a la función
                if (perroAux.getPropietario().getNumSocio() == numSocio){
                    System.out.println(perroAux.toString());
                    contadorPerros++;
                }
            }
        }
        if (contadorPerros == 0){
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    /*public void perrosPorPeso(String raza){
        Set<Map.Entry<String, ConjuntoPerros>> aux = perros.entrySet();
    }

    public void perrosPorEdad(String raza){

    }*/

   public void guardarPerros(String nombreArchivo){
       try{
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
           Set<Map.Entry<String,ConjuntoPerros>> s1 = perros.entrySet();
           Iterator it = s1.iterator();
           while(it.hasNext()){
               Map.Entry<String,ConjuntoPerros> e = (Map.Entry<String,ConjuntoPerros>)it.next();
               Iterator it2 = e.getValue().getConjuntoPerros().iterator();
               while(it2.hasNext()){
                   Perro perro = (Perro) it2.next();
                   oos.writeObject(perro);
               }
           }
           oos.close();
       }catch (Exception e){
           System.out.println("Error: " + e.getMessage() + " , " + e.getCause());
       }
   }

   public void cargarPerros(String nombreArchivo){
       try{
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo));
           while(true){
               this.addDog(((Perro)ois.readObject()).getRaza(),((Perro)ois.readObject()));
           }
       }catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }
   }

    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
    }

    public Map<String, ConjuntoPerros> getPerros() {
        return perros;
    }

    public void setPerros(Map<String, ConjuntoPerros> perros) {
        this.perros = perros;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        String cadena = "";
        Set<Map.Entry<String,ConjuntoPerros>> aux = perros.entrySet();
        Iterator it = aux.iterator();
        cadena += "Concurso" + '\n' + "--------" + '\n' +
                "Perros: " + '\n';

        while(it.hasNext()){
            Map.Entry<String,ConjuntoPerros> e = (Map.Entry<String,ConjuntoPerros>)it.next();
            Iterator it2 = e.getValue().getConjuntoPerros().iterator();
            while(it2.hasNext()){
                Perro p = (Perro) it2.next();
                cadena += p.toString();
            }
        }

        cadena += "---------------------------" + '\n' +
                "Nombre del Concurso = " + nombreConcurso + " , " +
                "Localidad = " + localidad + '\n';

        return cadena;
    }
}
