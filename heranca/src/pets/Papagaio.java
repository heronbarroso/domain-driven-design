package pets;

public class Papagaio extends Ave {

    public Papagaio(String nome, String raca, String porte, int idade, String tipoPena) {
        super(nome, raca, porte, idade, tipoPena);
    }


    public void falar() {
        System.out.println("papaguaio falando nome:" + nome);
    }


    @Override
    public void botarOvo() {
        // TODO Auto-generated method stub

    }



}
