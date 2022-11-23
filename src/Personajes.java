package src;


public abstract class Personajes {

    private String name;
    private Integer ataque;
    private Integer armadura;
    private Integer vida;

    public Personajes(){

    }
    public Personajes(String name, Integer ataque, Integer armadura, Integer vida) {
        this.name = name;
        this.ataque = ataque;
        this.armadura = armadura;
        this.vida = vida;

    }
    abstract void tirarDados();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getArmadura() {
        return armadura;
    }

    public void setArmadura(Integer armadura) {
        this.armadura = armadura;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }




}
