package br.com.modulo2.exercicio;

public class Circulo {
	private double area, raio, pi=3.14159;;

	public Circulo(double raio) {
		System.out.println("Calculando area do circulo para o raio :"+ raio);
		this.raio = raio;
		this.area = pi*(this.raio*this.raio);
		
	}
	
	public double retornaArea() {
		System.out.println("O valor da area � "+ this.area);
		return this.area;
	}
	
	public double ValorPI() {
		System.out.println(" O valor do PI é "+ pi);
		return this.pi;
	}
	

}
