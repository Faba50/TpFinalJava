package armas;

public class ArmaLarga extends Arma {

    private boolean sello_RENAR;
    private String descripcion_uso;
    private int nivel_arma;


    public ArmaLarga(int cantidad_municiones, String estado, int calibre, String marca, int alcance_aprox, int nivel_arma) {
        super(cantidad_municiones, estado, calibre, marca, alcance_aprox);
        this.nivel_arma = nivel_arma;
    }

    public String getDescripcion_uso() {
        return descripcion_uso;
    }

    public void setDescripcion_uso(String descripcion_uso) {
        this.descripcion_uso = descripcion_uso;
    }

    public int getNivel_arma() {
        return nivel_arma;
    }

    public void setNivel_arma(int nivel_arma) {
        this.nivel_arma = nivel_arma;
    }

    public boolean isSello_RENAR() {
        return sello_RENAR;
    }

    public void setSello_RENAR(boolean sello_RENAR) {
        this.sello_RENAR = sello_RENAR;
    }

    public void comparar_nivel(ArmaLarga otraArma){
        if(this.nivel_arma > otraArma.getNivel_arma()){
            System.out.println("El arma actual tiene mayor nivel que la comparada");
        } else if (this.nivel_arma < otraArma.getNivel_arma()) {
            System.out.println("El arma comparada tiene mayor nivel que la actual");
        }else{
            System.out.println("Las dos armas son del mismo nivel. ");
        }

    }


    @Override
    public boolean en_buen_estado() {
        if (!super.en_buen_estado(this)) {
            return false;

        }
        if (!this.sello_RENAR) {
            System.out.println("No tiene el sello RENAR. ");
            return false;
        }
        return true;
    }
}