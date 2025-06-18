package armas;

public class ArmaLarga extends Arma{

    private boolean sello_RENAR;
    private int nivel_arma;

    public ArmaLarga(int cantidad_municiones, String estado, int calibre, String marca, int alcance_aprox, boolean sello_RENAR, int nivel_arma) {
        super(cantidad_municiones, estado, calibre, marca, alcance_aprox);
        this.sello_RENAR = sello_RENAR;
        this.nivel_arma = nivel_arma;
    }

    public boolean isSello_RENAR() {
        return sello_RENAR;
    }

    public void setSello_RENAR(boolean sello_RENAR) {
        this.sello_RENAR = sello_RENAR;
    }

    public int getNivel_arma() {
        return nivel_arma;
    }

    public void setNivel_arma(int nivel_arma) {
        this.nivel_arma = nivel_arma;
    }

    @Override
    public String toString() {
        return "ArmaLarga{" +
                "sello_RENAR=" + sello_RENAR +
                ", nivel_arma=" + nivel_arma +
                '}';
    }
}
