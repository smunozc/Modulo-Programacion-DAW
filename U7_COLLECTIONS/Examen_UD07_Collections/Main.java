package Examen_UD07_Collections;


public class Main {
    public static void main(String[] args) {
        //Instanciar propietarios
        Propietario p1 = new Propietario("Manuel","Ortiz Jimenez",45,"España");
        Propietario p2 = new Propietario("Ernesto","de la Villa",24,"España");
        //Instanciar perros
        Perro perro1 = new Perro("perro1",10,30,true,p1,"Mastin");
        Perro perro2 = new Perro("perro2",10,30,true,p1,"Mastin");
        Perro perro3 = new Perro("perro3",10,30,true,p1,"Pastor Alemán");
        Perro perro4 = new Perro("perro4",10,30,true,p2,"Pomerania");
        Perro perro5 = new Perro("perro5",10,30,true,p2,"Bulldog");
        Perro perro6 = new Perro("perro6",10,30,true,p2,"Mastin");
        //Instanciar concurso
        Concurso concurso = new Concurso("Concurso canino anual de Sevilla","Sevilla");
        concurso.addDog("Mastin",perro1);
        concurso.addDog("Mastin",perro2);
        concurso.addDog("Mastin",perro6);
        concurso.addDog("Pastor Alemán",perro3);
        concurso.addDog("Pomerania",perro4);
        concurso.addDog("Bulldog",perro5);

        concurso.ownerDogs(24);
        System.out.println("====================================================");
        concurso.ownerDogs(45);

        System.out.println(concurso.toString());
        concurso.guardarPerros("concurso.bin");

        /*Concurso concurso2 = new Concurso("concurso 2","Sevilla");
        concurso2.cargarPerros("concurso.bin");
        System.out.println(concurso2.toString());*/


    }
}
