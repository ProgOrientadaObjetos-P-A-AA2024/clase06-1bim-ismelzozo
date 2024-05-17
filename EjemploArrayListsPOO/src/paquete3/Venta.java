/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {
    private double valorVenta;
    private ArrayList<Computador> computadoras; 
    
    public Venta(double n, ArrayList<Computador> c){
        valorVenta = n;
        computadoras = c;
    }
    
    public void establecerValorVenta() {
        double suma = 0;
        
        for (int i = 0; i < obtenerComputadoras().size(); i++) {
            suma = suma + obtenerComputadoras().get(i);
            
        }
    }
    
    public void establecerComputadoras(ArrayList<Computador> n){
        computadoras = n;
    }
    
    public ArrayList<Computador> obtenerComputadoras(){
        return computadoras;
    }
    
       public double obtenerValorVenta() {
        return valorVenta;
    }

}
