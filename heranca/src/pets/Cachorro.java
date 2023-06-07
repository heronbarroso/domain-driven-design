package pets;

public class Cachorro extends Animal {


    public Cachorro(String nome, String raca, String porte, int idade) {
        super(nome,raca,porte,idade);

    }


    public void latir() {
        System.out.println("au au");
    }

    public static void validaNome(String nomeEstatico) {
        if (nomeEstatico == null || nomeEstatico == "") {
            System.out.println("Nome Inválido!");
        } else {
            System.out.println("Nome Válido!");
        }
    }

}
