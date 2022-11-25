package src;

import java.util.ArrayList;
import java.util.List;

public class Turn {

    private Batallones batallones;

    private Board board = new Board();
    int heroesMuertos = 0;
    int bestiasMuertas = 0;

    public void batalla(Batallones batallones) throws InterruptedException {
        
        int ataqueHeroe = 0;
        int ataqueArmadura=0;

        for (int i = 0; i < batallones.heroes.size(); i++){

            while (batallones.beasts.get(i).getVida() >= 0 && batallones.heroes.get(i).getVida() >= 0){

                int ataqueBestia = ataqueBestia = batallones.beasts.get(i).tirarDados();

                if(ataqueBestia > 0){

                    Thread.sleep(2000);

                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println(batallones.heroes.get(i).getName() + " recibe un ataque");
                    System.out.println("Ataque recibido: " + ataqueBestia);
                    int vida = batallones.heroes.get(i).getVida();
                    batallones.heroes.get(i).setVida(vida - ataqueBestia);
                    System.out.println("Vida restante: " + batallones.heroes.get(i).getVida());
                    if (batallones.heroes.get(i).getVida() <= 0){
                        System.out.println("Jugador: " + batallones.heroes.get(i).getName() + " ha muerto");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------");
                        heroesMuertos++;
                        break;
                    }
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                     if(ataqueHeroe> batallones.beasts.get(i).getArmadura()){
                        ataqueArmadura= (batallones.beasts.get(i).getVida()-ataqueBestia-batallones.beasts.get(i).getArmadura());
                        System.out.println("Daño a armadura de bestia: "+ ataqueArmadura);
                    }if(ataqueBestia> batallones.heroes.get(i).getArmadura()){
                        ataqueArmadura= (batallones.heroes.get(i).getVida()-ataqueBestia-batallones.heroes.get(i).getArmadura());
                        System.out.println("Daño a armadura de heroe: "+ ataqueArmadura);
                    }

                }

                if (batallones.heroes.get(i) instanceof  Hobbits){

                    if (batallones.beasts.get(i) instanceof Trasgos){
                        ataqueHeroe = batallones.heroes.get(i).tirarDados() - 5;
                    }

                    ataqueHeroe = batallones.heroes.get(i).tirarDados();

                }

                if (batallones.heroes.get(i) instanceof  Elfos){

                    if (batallones.beasts.get(i) instanceof Orcos){
                        ataqueHeroe = batallones.heroes.get(i).tirarDados() + 10;
                    }

                    ataqueHeroe = batallones.heroes.get(i).tirarDados();
                }

                if(batallones.heroes.get(i) instanceof Humanos){
                    ataqueHeroe = batallones.heroes.get(i).tirarDados();
                }

                if(ataqueHeroe > 0){

                    Thread.sleep(2000);
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println(batallones.beasts.get(i).getName() + " recibe un ataque");
                    System.out.println("Ataque recibido: " + ataqueHeroe);
                    int vida = batallones.beasts.get(i).getVida();
                    batallones.beasts.get(i).setVida(vida - ataqueHeroe);
                    System.out.println("Vida restante: " + batallones.beasts.get(i).getVida());
                    if (batallones.beasts.get(i).getVida() <= 0){
                        System.out.println("Jugador: " + batallones.beasts.get(i).getName() + " ha muerto");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------");
                        bestiasMuertas++;
                        break;
                    }
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------");
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
