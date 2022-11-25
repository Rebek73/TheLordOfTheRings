package src;

import java.util.Random;

public class Heroes extends Personajes{


    public Heroes(){
        super();
    }

    public Heroes(String nombre, int ataque, int armadura, int vida){
        super(nombre, ataque, ataque, vida);
    }

    @Override
    int tirarDados() {

        int dado1 =(int) (Math.random() * 100);
        int dado2 =(int) (Math.random() * 100);

        return ((dado1 > dado2) ? dado1 : dado2);

    }


}
