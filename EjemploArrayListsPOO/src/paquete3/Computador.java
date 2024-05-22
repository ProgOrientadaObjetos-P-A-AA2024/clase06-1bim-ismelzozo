
package paquete3;

public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
    public Computador(String n, Memoria m, Procesador p){
       marca = n;
       memoria = m;
       procesador = p;
   }
    
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

    
    @Override
    public String toString() {        
        String toString = String.format("\n===========================Lista de computadoras %s\n"
                + "Marca Memoria %s\n============================\n"
                + "Marca Procesador %s\n=============================\n"
                + "Costo Memoria %.2f\n===============================\n"
                + "Costo Procesador %.2f\n==============================\n"
                + "Costo Computador %2.f\n===============================\n",
                obtenerMarca(), obtenerMemoria().obtenerMarca(),
                obtenerProcesador().obtenerMarca(),
                obtenerMemoria().obtenerCosto(),
                obtenerProcesador().obtenerCosto(),
                obtenerCostoComputador());
        return toString;
    }
   
}
