package escuadron;


import armas.Arma;
import policias.Policia;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {

   private String nombre_escuadron;
   private String comisaria_perteneciente;
   private List<Policia>  escuadron_policia = new ArrayList<>();
   private List <Arma> arma_asignada = new ArrayList<>();

   public Escuadron(String comisaria_perteneciente, String nombre_escuadron) {
      this.comisaria_perteneciente = comisaria_perteneciente;
      this.nombre_escuadron = nombre_escuadron;
      this.escuadron_policia = new ArrayList<>();
      this.arma_asignada = new ArrayList<>();

   }

   public String getNombre_escuadron() {
      return nombre_escuadron;
   }

   public void setNombre_escuadron(String nombre_escuadron) {
      this.nombre_escuadron = nombre_escuadron;
   }

   public String getComisaria_perteneciente() {
      return comisaria_perteneciente;
   }

   public void setComisaria_perteneciente(String comisaria_perteneciente) {
      this.comisaria_perteneciente = comisaria_perteneciente;
   }

   public List<Policia> getEscuadron_policia() {
      return escuadron_policia;
   }

   public void setEscuadron_policia(List<Policia> escuadron_policia) {
      this.escuadron_policia = escuadron_policia;
   }

   public List<Arma> getArma_asignada() {
      return arma_asignada;
   }

   public void setArma_asignada(List<Arma> arma_asignada) {
      this.arma_asignada = arma_asignada;
   }

   public void agregar_policia(Policia p){
      if(p.getEscuadron() !=null){
         System.out.println("Este oficial ya pertenece a un escuadron.");
      }
      else{
         escuadron_policia.add(p);
         p.setEscuadron(this);
         System.out.println(p + "Ahora pertenece al escuadron " + this.nombre_escuadron );
      }
   }
   public void agregar_arma(Arma a){
      arma_asignada.add(a);
   }

   public void mostrar_miembros(){
      for(Policia e : escuadron_policia)
         System.out.println("los miembros del escuadron " + this.nombre_escuadron + e);
   }



   @Override
   public String toString() {
      return "Escuadron{" +
              "nombre_escuadron='" + nombre_escuadron + '\'' +
              ", comisaria_perteneciente='" + comisaria_perteneciente + '\'' +
              ", escuadron_policia=" + escuadron_policia +
              ", arma_asignada=" + arma_asignada +
              '}';
   }


}
