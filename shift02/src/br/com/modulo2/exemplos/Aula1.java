package br.com.modulo2.exemplos;

public class Aula1 {

	public static void main(String[] args) {

		Pessoa joao = new Pessoa("Joao");
		Pessoa paulo = new Pessoa();
		paulo.setNome("Paulo");
		
		joao.falar();
		paulo.falar();

	}

}
