package src;

public class Elfos extends Heroes{

    public Elfos(String nombre, int ataque, int armadura, int vida){

        super(nombre, ataque, armadura, vida);
    }

    public Elfos(){
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
