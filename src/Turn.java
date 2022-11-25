package src;

import java.util.ArrayList;
import java.util.List;

public class Turn {

    private Batallones batallones;

    private Board board = new Board();
    int heroesMuertos = 0;
    int bestiasMuertas = 0;

     public void batalla(Batallones batallones) throws InterruptedException {


        for (int i = 0; i < batallones.heroes.size(); i++){

            while (batallones.beasts.get(i).getVida() >= 0 && batallones.heroes.get(i).getVida() >= 0){

                int ataqueBestia = batallones.beasts.get(i).tirarDados();

                if(ataqueBestia > batallones.heroes.get(i).getArmadura()){

                    Thread.sleep(2000);

                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println(batallones.heroes.get(i).getName() + " recibe un ataque");
                    System.out.println("Ataque recibido: " + ataqueBestia);
                    int vida = batallones.heroes.get(i).getVida();

                    if(batallones.beasts.get(i) instanceof Orcos){
                        batallones.heroes.get(i).setVida(vida - (ataqueBestia  - (batallones.heroes.get(i).getArmadura() - 10)));
                    }else{
                        batallones.heroes.get(i).setVida(vida - (ataqueBestia  - batallones.heroes.get(i).getArmadura() ));
                    }

                    System.out.println("Vida restante con la proteccion de la armadura: " + batallones.heroes.get(i).getVida());
                    if (batallones.heroes.get(i).getVida() <= 0){
                        System.out.println("Jugador: " + batallones.heroes.get(i).getName() + " ha muerto");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------");
                        heroesMuertos++;
                        break;
                    }
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");

                }else{
                    System.out.println("La armadura te defendio");
                }


                int ataqueHeroe = 0;

                if (batallones.heroes.get(i) instanceof  Hobbits){

                    if (batallones.beasts.get(i) instanceof Trasgos){
                        ataqueHeroe = batallones.heroes.get(i).tirarDados() - 5;
                    }else{
                        ataqueHeroe = batallones.heroes.get(i).tirarDados();
                    }



                }

                if (batallones.heroes.get(i) instanceof  Elfos){

                    if (batallones.beasts.get(i) instanceof Orcos){
                        ataqueHeroe = batallones.heroes.get(i).tirarDados() + 10;
                    }else{
                        ataqueHeroe = batallones.heroes.get(i).tirarDados();
                    }


                }

                if(batallones.heroes.get(i) instanceof Humanos){
                    ataqueHeroe = batallones.heroes.get(i).tirarDados();
                }

                if(ataqueHeroe > batallones.beasts.get(i).getArmadura()){

                    Thread.sleep(2000);
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println(batallones.beasts.get(i).getName() + " recibe un ataque");
                    System.out.println("Ataque recibido: " + ataqueHeroe);
                    int vida = batallones.beasts.get(i).getVida();
                    batallones.beasts.get(i).setVida(vida - (ataqueHeroe - batallones.beasts.get(i).getArmadura()));
                    System.out.println("Vida restante con la armadura: " + batallones.beasts.get(i).getVida());
                    if (batallones.beasts.get(i).getVida() <= 0){
                        System.out.println("Jugador: " + batallones.beasts.get(i).getName() + " ha muerto");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------");
                        bestiasMuertas++;
                        break;
                    }
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                }else{
                    System.out.println("La armadura te defendio");
                }
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println(bestiasMuertas > heroesMuertos ? board.win("Heroes ganan") : board.win("Bestias ganan"));
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");


    }



}
