package br.com.modulo2.exercicio;

public class Livro {
	private String titulo, autor, anoPublicação;

	public Livro(String titulo, String autor, String anoPublicacao) {
		this.titulo = titulo;
		this.autor  = autor;
		this.anoPublicação = anoPublicacao;
	}
	
	public String informacoes() {
		
		return " ---- Livro ---"+
			   "\n Titulo: "+this.titulo+
			   "\n Autor: "+this.autor+
			   "\n Ano : "+ this.anoPublicação+
			   "\n ---- Livro ---";
	}

}
