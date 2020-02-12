package Examen_U4_U5;

public class main {
    public static void main(String[] args) {

        //Nuevos personajes
        Guerrero guerrero1 = new Guerrero("Uno", 1001, 70, 85, Encantado.NO, 35);
        Mago mago1 = new Mago("Dos",100,20,0,Encantado.NO,20);
        Orco orco1 = new Orco("Tres",1000,100,80,Encantado.NO,2);
        Enano enano1 = new Enano("Gimli",900,80,80,Encantado.NO,100);
        Elfo elfo1 = new Elfo("Cinco",200,80,0,Encantado.NO,TipoElfo.BOSQUE);

        Personaje[] p = new Personaje[5];
        p[0] = guerrero1;
        p[1] = mago1;
        p[2] = orco1;
        p[3] = enano1;
        p[4] = elfo1;

        RPG partida = new RPG(p);
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








    }
}
