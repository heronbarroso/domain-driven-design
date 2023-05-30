package shift02br.com.modulo2.exemplos;

public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;

	public Pessoa(String nome,int idade,String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
	}
	
	public void falar() {
		System.out.println("to falando coisa porque sou uma pessoa e me chamo: " + nome);		
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			System.out.println("Nome invalido");;
		} else {
			this.nome = nome;
		}
	}

}
