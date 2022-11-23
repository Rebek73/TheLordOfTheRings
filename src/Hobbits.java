package src;

public class Hobbits extends Heroes{
    public Hobbits(String nombre, int ataque, int armadura, int vida){

        super(nombre, ataque, armadura, vida);
    }

    public Hobbits(){
        super();
    }


    @Override
    void tirarDados() {
        super.tirarDados();
    }

    @Override
    public Integer getAtaque() {
        return super.getAtaque();
    }
}
