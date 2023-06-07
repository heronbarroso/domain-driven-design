
import pets.Animal;
import pets.Ave;
import pets.Cachorro;
import pets.Galinha;

public class Main {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro("toto","sem raca definida","medio",10);
        toto.andar();
        Cachorro.validaNome("toto");

        Animal jack = new Cachorro("jack","pitbull","grande", 8);

        Cachorro jackCachorro = (Cachorro) jack;

        Galinha galinha = new Galinha("galinha","angola","pequeno",11, "pluma");

        Galinha ave = new Galinha("galinha","angola","pequeno",11, "pluma");

        ave.botarOvo();

        galinha.botarOvo();
        galinha.andar();
        galinha.getNome();

        galinha.botarOvo();

    }

}
