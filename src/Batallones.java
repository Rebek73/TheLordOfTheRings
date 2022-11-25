package src;

import java.util.ArrayList;
import java.util.List;

public class Batallones {

    List<Heroes> heroes = new ArrayList<>();
    List<Bestias> beasts = new ArrayList<>();

    public void llenarHeroes(Heroes heroes){

        this.heroes.add(heroes);

    }


    public void llenarBestias(Bestias bestias){
        this.beasts.add(bestias);
    }
}
