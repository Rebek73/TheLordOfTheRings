package src;

import java.util.ArrayList;
import java.util.List;

public class Batallones {

    List<Heroes> heroes = new ArrayList<>();
    List<Bestias> beasts = new ArrayList<>();

    public List<Heroes> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Heroes> heroes) {
        this.heroes = heroes;
    }

    public List<Bestias> getBeasts() {
        return beasts;
    }

    public void setBeasts(List<Bestias> beasts) {
        this.beasts = beasts;
    }
}
