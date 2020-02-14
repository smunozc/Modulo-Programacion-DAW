package Examen_U4_U5;

public class main {
    public static void main(String[] args) {

        //Nuevos personajes
        Guerrero guerrero1 = new Guerrero("Uno", 1001, 70, 85, Encantado.NO, 35);
        Mago mago1 = new Mago("Magor",100,20,100,Encantado.NO,20);
        Orco orco1 = new Orco("Orco",1000,100,80,Encantado.NO,2);
        Enano enano1 = new Enano("Gimli",900,80,80,Encantado.NO,100);
        Elfo elfo1 = new Elfo("Elis",200,80,0,Encantado.NO,TipoElfo.BOSQUE);
        Elfo elfo2 = new Elfo("Elis",200,80,0,Encantado.NO,TipoElfo.COSTA);
        Enano enano2 = new Enano("Ragnar",400,60,10,Encantado.NO,90);

        RPG partida = new RPG();
        partida.addPersonaje(guerrero1);
        partida.addPersonaje(mago1);
        partida.addPersonaje(orco1);
        partida.addPersonaje(enano1);
        partida.addPersonaje(elfo1);


        System.out.println(partida.mostrarEstado());

        System.out.println("---------------Primer ataque---------------");
        elfo1.atacarPersonaje(enano1);
        System.out.println(partida.mostrarEstado());

        System.out.println("---------------Segundo ataque---------------");
        mago1.encantar(orco1);
        guerrero1.atacarPersonaje(orco1);
        System.out.println(partida.mostrarEstado());

        System.out.println("---------------Tercer ataque---------------");
        mago1.encantar(elfo1);
        orco1.atacarPersonaje(elfo1);
        partida.borrarMuertos();
        System.out.println(partida.mostrarEstado());

        System.out.println("---------------Mostrar ataque---------------");
        System.out.printf(partida.mostrarxAtaque());

        System.out.println("---------------Mostrar defensa---------------");
        System.out.printf(partida.mostrarxDefensa());


        System.out.println("Son iguales elfo1 y elfo2: " + elfo1.equals(elfo2));





    }
}
