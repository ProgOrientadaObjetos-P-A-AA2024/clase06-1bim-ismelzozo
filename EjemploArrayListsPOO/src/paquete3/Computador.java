/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
   public void establecerCostoComputador(){
       costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
   }
   
   public void establecerMarca(String n) {
        marca = n;
    }
   

    public void establecerProcesador(Procesador n) {
        procesador = n;
    }
    
    public void establecerMemoria(Memoria n) {
        memoria = n;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }
    
    public Memoria obtenerMemoria() {
        return memoria;
    }
    public double obtenerCostoComputador(){
        return costoComputador;
    }
   
}
