package armas;

import policias.Policia;

public class ArmaCorta extends Arma {

    private boolean automatica;
    private Policia policia;
    public ArmaCorta(int cantidad_municiones, String estado, int calibre, String marca, int alcance_aprox) {
        super(cantidad_municiones, estado, calibre, marca, alcance_aprox);
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    @Override
    public String toString() {
        return "ArmaCorta{" +
                "automatica=" + automatica +
                ", policia=" + policia +
                '}';
    }


}
