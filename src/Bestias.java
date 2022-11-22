package src;

public class Bestias extends Personajes{

    public Bestias(){
        super();
    }

    public Bestias(String nombre, int ataque, int armadura, int vida){
        super(nombre, ataque, ataque, vida);
    }


    @Override
    void atacar() {

        int dado = (int) Math.random() * 90;
        super.ataque = dado;

    }
}
