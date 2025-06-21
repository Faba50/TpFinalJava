package policias;

import armas.ArmaCorta;
import escuadron.Escuadron;

public class Policia {
    private String nombre;
    private String apellido;
    private int legajo;
    private ArmaCorta arma_asignada;
    private Escuadron escuadron;


    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

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




    public ArmaCorta getArma_asignada() {
        return arma_asignada;
    }

    public void setArma_asignada(ArmaCorta arma_asignada) {
        this.arma_asignada = arma_asignada;
    }

    public Policia(String nombre, ArmaCorta arma_asignada, int legajo, String apellido) {
        this.nombre = nombre;
        this.arma_asignada = arma_asignada;
        this.legajo = legajo;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", arma_asignada=" + (arma_asignada !=null ? arma_asignada.getMarca(): "Sin arma")+
                '}';
    }
}






