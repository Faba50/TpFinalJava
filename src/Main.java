import armas.Arma;
import armas.ArmaCorta;
import escuadron.Escuadron;
import policias.Policia;

public class Main {
    public static void main(String[] args) {


        Escuadron cuadrilla1 = new Escuadron("lomas de zamora", "alcon");
        Arma arma1 = new ArmaCorta(19,"en uso", 9, "bereta", 250, true);
        Policia poli1 = new Policia("Javier", (ArmaCorta) arma1, 430940, "Lopez");

        cuadrilla1.agregar_policia(poli1);
        //instanciamos todos los objetos, ahora veremos si el metodo de agregar al escuadron permite que un policia pertenezca a mas de uno

        Escuadron cuadrilla2 = new Escuadron("burzaco", "beta");
        cuadrilla2.agregar_policia(poli1);
        //no lo permite asi que funcionan bien las validaciones

        //ahora vamos a probar los metodos de condicion del arma con una buena y una mala

        Arma arma2 = new ArmaCorta(20,"desgastada", 1, "baltimore", 90, false);
        Policia poli2 = new Policia("Fabian", (ArmaCorta) arma2, 3821398, "Bustos");
        ((ArmaCorta) arma2).en_buen_estado(arma2);
        //como es debido nos dice que no esta apta para su uso

        //ahora vamos a probar si se las puede disparar a mas de 200 metros
        ((ArmaCorta) arma1).disparo_corta_distancia(arma1);
        ((ArmaCorta) arma2).disparo_corta_distancia(arma2);

        //ahora vamos a ver toda la info de los escuadrones, miembros y sus armas
        cuadrilla1.agregar_policia(poli2);
        cuadrilla1.mostrar_miembros();

    }


}