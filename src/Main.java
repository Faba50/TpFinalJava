import armas.Arma;
import armas.ArmaCorta;
import policias.Policia;

public class Main {
    public static void main(String[] args) {



        Arma arma1 = new ArmaCorta("en uso", 9, "beretta", 250, true );
        Policia policia1 = new Policia("Javier", "Lopez", 4304513, "01", arma1);
    }
}