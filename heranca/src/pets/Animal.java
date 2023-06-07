package pets;

public abstract class Animal {

    protected String nome;

    String raca;

    private String porte;
    private int idade;

    public Animal(String nome, String raca, String porte, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    public void andar() {
        System.out.println("Animal andando nome: "+ nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
