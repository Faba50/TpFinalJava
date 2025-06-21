package armas;

import policias.Policia;

public class ArmaCorta extends Arma {

    private boolean automatica;


    public ArmaCorta(int cantidad_municiones, String estado, int calibre, String marca, int alcance_aprox, boolean automatica) {
        super(cantidad_municiones, estado, calibre, marca, alcance_aprox);
        this.automatica = automatica;

    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public boolean en_buen_estado(Arma a){
        if (a.getEstado().equalsIgnoreCase("EN USO") && a.getCalibre()>=9){
            return true;
        }
        System.out.println("No esta apta para su uso");
        return false;
    }

    public void disparo_corta_distancia(Arma a){
        if(a.getAlcance_aprox() <=200){
            System.out.println("No se la puede disparar a mas de 200 metros. ");
        }
        else{
            System.out.println("Es apta para disparar a mas de 200 metros. ");
        }
    }



    @Override
    public String toString() {
        return "ArmaCorta{" +
                "automatica=" + automatica +
                '}';
    }


}
