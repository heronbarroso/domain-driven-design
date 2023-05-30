package br.com.modulo2.exercicio;

public class Circulo {
	private double area, raio, pi=3.14159;;

	public Circulo(double raio) {
		System.out.println("Calculando area do circulo para o raio :"+ raio);
		this.area = pi*(this.raio*this.raio);
		this.raio = raio;
	}
	
	public double retornaArea() {
		System.out.println("O valor da area é "+ this.area);
		return this.area;
	}
	
	public double ValorPI() {
		System.out.println(" O valor do PI Ã© "+ pi);
		return this.pi;
	}
	

}
