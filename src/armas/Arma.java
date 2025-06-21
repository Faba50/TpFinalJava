package armas;

public class Arma {
    private int cantidad_municiones;
    private int alcance_aprox;
    private String marca;
    private int calibre;
    private String estado;
    private String oficial_asignado;
    public int getCantidad_municiones() {
        return cantidad_municiones;
    }

    public void setCantidad_municiones(int cantidad_municiones) {
        this.cantidad_municiones = cantidad_municiones;
    }

    public int getAlcance_aprox() {
        return alcance_aprox;
    }

    public void setAlcance_aprox(int alcance_aprox) {
        this.alcance_aprox = alcance_aprox;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Arma(int cantidad_municiones, String estado, int calibre, String marca, int alcance_aprox) {
        this.cantidad_municiones = cantidad_municiones;
        this.estado = estado;
        this.calibre = calibre;
        this.marca = marca;
        this.alcance_aprox = alcance_aprox;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "cantidad_municiones=" + cantidad_municiones +
                ", alcance_aprox=" + alcance_aprox +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                '}';

    }




    }