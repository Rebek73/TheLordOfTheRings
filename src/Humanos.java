package src;

public class Humanos extends Heroes{

    public Humanos(){

    }

    public Humanos(String nombre, int ataque, int armadura, int vida){
        super(nombre, ataque, armadura, vida);
    }

    @Override
    void atacar() {
        super.atacar();
    }

    @Override
    public Integer getAtaque() {
        return super.getAtaque();
    }


}
