package armas;

public abstract class Arma {
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

    public boolean en_buen_estado(Arma a){
        if (a.getEstado().equalsIgnoreCase("EN USO")){
            return true;
        }
        else if(a.getEstado().equalsIgnoreCase("EN MANTENIMIENTO"))
            System.out.println("No esta apta para su uso puesto que se encuentra en mantenimiento");

        else if (a.getEstado().equalsIgnoreCase("NUEVA")) {
            System.out.println("El estado actual del arma es nuevo, se encuentra apta para su uso");
        }
        return false;

    }


    public abstract boolean en_buen_estado();

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