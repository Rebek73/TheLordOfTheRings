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

           // super.ataque = (dado1 > dado2) ? dado1 : dado2;
        }
}
