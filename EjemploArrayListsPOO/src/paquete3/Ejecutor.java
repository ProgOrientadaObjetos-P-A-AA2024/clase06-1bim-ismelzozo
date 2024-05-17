package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Computador> computadoras = new ArrayList<>();

        String val1 = "";
        String val2 = "";

        System.out.println("Cuantas computadoras desea ingresar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese la marca del " + i + " ° procesador");
            String marca = sc.nextLine();
            System.out.println("Ingrese el costo " + i + " ° procesador");
            double costo = sc.nextDouble();
            Procesador pro = new Procesador(marca, costo);

            System.out.println("Ingrese la marca de la " + i + " ° memoria");
            String marcam = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el costo de la " + i + " ° memoria");
            double costom = sc.nextDouble();

            Memoria men = new Memoria(marcam, costom);

            System.out.println("Ingrese la marca del " + i + " ° computador");
            String marcac = sc.nextLine();

            Computador compu1 = new Computador(marcac, men, pro);
            compu1.establecerCostoComputador();
            sc.nextLine();

            val1 = String.format("%s - %s\n", val1, compu1);
            computadoras.add(compu1);
            Venta v = new Venta(computadoras);
            v.establecerValorVenta(compu1.obtenerCostoComputador());
            val2 = String.format("%s\n", v);

        }
        System.out.printf("%s - %s\n", val1, val2);
    }
}
