package src;

import java.util.List;
public class LordOfTheRing {
    /*private  Board board;*/
    Batallones batallones = new Batallones();

    private Turn turn = new Turn();

    int option=0;
    public void initGame() throws InterruptedException {
        System.out.println("\n************ WELCOME TO LORD OF RINGS GAME ************\n");
        option = Input.getInteger("Creando personajes\n1. Crear Heroes\n2.Crear Bestias\nIngrese su opcion: ");
        if(option==1) {

            createElfos();
            createHobbits();
            createHumanos();

            createBeastsDefault();

        } else if (option ==2) {
            createOrcos();
            createTrasgos();
            createOrcos();

            createHeroesDefault();
        }
        //here goes turn class
        turn.batalla(batallones);
    }


    //************ HEROES ************
    public Batallones createHumanos(){
        String name = Input.getString("Ingrese el nombre para humanos: ");
        batallones.llenarHeroes(new Humanos(name, 0, 10, 180));

        return batallones;
    }

    public Batallones createHobbits(){
        String name = Input.getString("Ingrese el nombre para hobbits: ");
        batallones.llenarHeroes(new Hobbits(name, 0, 10, 200));

        return batallones;
    }

    public Batallones createElfos(){
        String name = Input.getString("Ingrese el nombre para elfos: ");
        batallones.llenarHeroes(new Elfos(name, 0, 10, 250));

        return batallones;
    }

    //************  BESTIAS ************
    public Batallones createOrcos(){
        String name = Input.getString("Ingrese el nombre para los orcos: ");
        batallones.llenarBestias(new Orcos(name, 0, 10, 300));

        return batallones;
    }

    public Batallones createTrasgos(){
        String name = Input.getString("Ingrese el nombre para los trasgos: ");
        batallones.llenarBestias(new Trasgos(name, 0, 10, 325));

        return batallones;
    }


    public Batallones createBeastsDefault(){

        batallones.llenarBestias(new Trasgos("Trasgo 1", 0, 10, 325));
        batallones.llenarBestias(new Orcos("Trasgo 2", 0, 10, 300));
        batallones.llenarBestias(new Orcos("Trasgo 3", 0, 10, 300));

        return batallones;
    }

    public Batallones createHeroesDefault(){

        batallones.llenarHeroes(new Elfos("Heroe 1", 0, 10, 250));
        batallones.llenarHeroes(new Elfos("Heroe 2", 0, 10, 250));
        batallones.llenarHeroes(new Hobbits("Heroe 3", 0, 10, 200));

        return batallones;
    }


}