package src;

public class Bestias extends Personajes{

        public Bestias(){
            super();
        }

        public Bestias(String nombre, int ataque, int armadura, int vida){
            super(nombre, ataque, ataque, vida);
        }

        @Override
        public void tirarDados() {
            int dado1 =(int) (Math.random() * 90);

            super.setAtaque(dado1);
        }
}
