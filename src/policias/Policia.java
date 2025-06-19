package policias;

import escuadron.Escuadron;

public class Policia {
    private String nombre;
    private String apellido;
    private int legajo;
    private Escuadron escuadron_asignado;
    private String arma_asignada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Escuadron getEscuadron_asignado() {
        return escuadron_asignado;
    }

    public void setEscuadron_asignado(Escuadron escuadron_asignado) {
        this.escuadron_asignado = escuadron_asignado;
    }

    public String getArma_asignada() {
        return arma_asignada;
    }

    public void setArma_asignada(String arma_asignada) {
        this.arma_asignada = arma_asignada;
    }

    public Policia(String nombre, String apellido, int legajo, Escuadron escuadron_asignado, String arma_asignada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.escuadron_asignado = escuadron_asignado;
        this.arma_asignada = arma_asignada;



    }

    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", escuadron_asignado=" + escuadron_asignado +
                ", arma_asignada='" + arma_asignada + '\'' +
                '}';
    }
}
