package src;

public class Main {

    public static void main(String[] args) {

        Heroes humano = new Humanos("Humano", 0, 40, 180);

        humano.tirarDados();

        System.out.println(humano.getAtaque());


    }
}
