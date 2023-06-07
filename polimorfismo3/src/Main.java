
import funcionarios.Estagiario;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import funcionarios.PessoaCLT;

public class Main {

	public static void main(String[] args) {
		/*
		 * Cachorro toto = new Cachorro("toto","sem raca definida","medio",10);
		 * toto.andar(); Cachorro.validaNome("toto");
		 * 
		 * Animal jack = new Cachorro("jack","pitbull","grande", 8);
		 * 
		 * Cachorro jackCachorro = (Cachorro) jack;
		 * 
		 * Galinha galinha = new Galinha("galinha","angola","pequeno",11, "pluma");
		 * 
		 * Galinha galinha2 = new Galinha("galinha","angola","pequeno",11, "pluma");
		 * 
		 * Ave ave = new Galinha("galinha","angola","pequeno",11, "pluma");
		 * 
		 * Galinha animal = new Galinha("galinha","angola","pequeno",11, "pluma");
		 * 
		 * 
		 * animal.botarOvo();
		 * 
		 * ave.botarOvo();
		 * 
		 * ave.botarOvo();
		 * 
		 * galinha.botarOvo(); galinha.andar(); galinha.getNome();
		 * 
		 * galinha.botarOvo();
		 */
		
		//funcionario
		
		
		  Funcionario funcionario1 = new Estagiario();
		  
		  Funcionario clt = new PessoaCLT();
		  
		  gerenciar(funcionario1);
		  gerenciar(clt);
		 
		
		
	}
	
	public static void gerenciar(Funcionario funcionario) {
		if(funcionario instanceof Gerente) {
			PessoaCLT pessoaCLT = (PessoaCLT) funcionario;
		}
		
		if(funcionario instanceof Estagiario) {
			System.out.println("InstanceOF me disse que é estagiario");
		}
		funcionario.trabalhar();
		funcionario.descansar();
	}

}
