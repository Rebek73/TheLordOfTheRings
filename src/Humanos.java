package src;

public class Humanos extends Heroes{


    public Humanos(String nombre, int ataque, int armadura, int vida){

        super(nombre, ataque, armadura, vida);
    }

    public Humanos(){
        super();
    }


    @Override
    int tirarDados() {
        return super.tirarDados();
    }

    @Override
    public Integer getAtaque() {
        return super.getAtaque();
    }
}
