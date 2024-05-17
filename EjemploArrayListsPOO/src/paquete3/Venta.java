
package paquete3;

import java.util.ArrayList;

public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta( ArrayList<Computador> c) {
        
        computadoras = c;
    }

    public void establecerValorVenta(double v) {
        valorVenta = v;
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta = valorVenta + computadoras.get(i).obtenerCostoComputador();

        }
    }

    public void establecerComputadoras(ArrayList<Computador> n) {
        computadoras = n;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    @Override
    public String toString() {
        String toString = String.format("Valor de venta %s\n==========================\n",
                valorVenta);
        return toString;
    }

}
