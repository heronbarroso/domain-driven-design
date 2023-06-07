package pets;

public abstract class Ave extends Animal {

    protected String tipoPena;
    public Ave(String nome, String raca, String porte, int idade,String tipoPena) {
        super(nome, raca, porte, idade);
    }


    public abstract void botarOvo();


}