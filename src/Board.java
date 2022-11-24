package src;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Board {

    private int ataque = 0;

    private Batallones batallones;

    private String winner;
    private String loser;

    public void batalla() throws InterruptedException {

        List<Heroes> heroes = new ArrayList<>();

        heroes.add(new Humanos("Rafael", 0, 40, 180));
        heroes.add(new Humanos("Juarez", 0, 40, 180));
        heroes.add(new Humanos("Rebbeca", 0, 40, 180));

        List<Bestias> beasts = new ArrayList<>();
        beasts.add(new Orcos("Orco1", 0, 40, 200));
        beasts.add(new Orcos("Orco2", 0, 40, 200));
        beasts.add(new Orcos("Orco3", 0, 40, 200));

        for (int i = 0; i < beasts.size(); i++){

            while (beasts.get(i).getVida() > 0 && heroes.get(i).getVida() > 0){

                int ataqueHeroe = heroes.get(i).tirarDados();
                atacar(beasts.get(i), ataqueHeroe);
                Thread.sleep(2000);
                System.out.println("Bestia: " + i + " ---- "  + beasts.get(i).getVida());


                int ataqueBestia = beasts.get(i).tirarDados();
                atacar(heroes.get(i), ataqueBestia);
                Thread.sleep(2000);
                System.out.println("Heroe: " + i + " ---- "  + heroes.get(i).getVida());

            }
        }



    }

    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();

        board.batalla();
    }







    public void atacar(Personajes personajes, int ataque){

        if (personajes.getVida() > 0){
            int vida = personajes.getVida() - ataque;
            personajes.setVida(vida);
        }else {
            loser = personajes.getName();
        }


    }


}
