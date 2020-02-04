package U5_POO_Herencia_Interfaces;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //PRUEBA DE VEHICULOS TERRESTRES
        Coche c1=new Coche("coche 1",5,"3456WRD",2007,Color.ROJO);
        Coche c2=new Coche("coche 2",7,"1334WRD",2010,Color.AMARILLO);
        Coche c3=new Coche("coche 3",5,"1234WRD",2015,Color.AZUL);

        Motocicleta m1=new Motocicleta("moto 1",2,"3456FRD",2001,Color.AMARILLO);
        Motocicleta m2=new Motocicleta("moto 2",1,"3156WRD",1990,Color.VERDE);
        Motocicleta m3=new Motocicleta("moto 3",2,"3446WRD",2010,Color.ROJO);

        //toString
        System.out.println(c1.toString());
        System.out.println("------------------------");
        System.out.println(m1.toString());
        System.out.println("------------------------");
        //Equals
        System.out.println("Son c1 y c2 iguales: " + c1.equals(c2));
        System.out.println("Son c1 y c3 iguales: " + c1.equals(m1));
        System.out.println("------------------------");

        //ORDENAR VECTORES DE COCHES
        Coche[] coches = new Coche[3];
        coches[0]=c1;
        coches[1]=c2;
        coches[2]=c3;

        System.out.println("Antes de ordenar por matricula: ");
        System.out.println(Arrays.toString(coches));

        Arrays.sort(coches);
        System.out.println("Despues de ordenar por matricula: ");
        System.out.println(Arrays.toString(coches));

        System.out.println("------------------------");
        //ORDENAR POR AÑO DE FABRICACION
        Arrays.sort(coches, new ComparadorTerrestre());
        System.out.println("Después de ordenar por año de fabricacion: ");
        System.out.println(Arrays.toString(coches));

        //PRUEBA VEHICULOS AEREOS
        Helicoptero h1 = new Helicoptero("heli",9,"HE-A300I",150);
        Avioneta a1 = new Avioneta("avioneta",5,"HE-A300I",200);
        h1.transportar(9);
        System.out.println("Mostrar por pantalla contenido de helicoptero h1: ");
        System.out.println(h1.toString());

    }
}
