package pets;

public class Galinha extends Ave {


    public Galinha(String nome, String raca, String porte, int idade,String tipoPena) {
        super(nome, raca, porte, idade, tipoPena);
    }


    public void exemplo() {
        System.out.println("raca:" + raca);
        System.out.println("tipodePena:" + tipoPena);
    }


    @Override
    public void botarOvo() {

    }




}