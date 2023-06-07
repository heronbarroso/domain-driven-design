package pets;

public class Gato extends Animal {

    public Gato(String nome,String raca, String porte, int idade) {
        super(nome,raca,porte,idade);
    }


    public void miar() {
        System.out.println("miau");
    }
}
