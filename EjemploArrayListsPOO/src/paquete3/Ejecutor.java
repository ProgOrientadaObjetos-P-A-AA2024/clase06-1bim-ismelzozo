/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computador> c = new ArrayList<>();
        System.out.println("Ingrese la marca de la comutadora");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo de la computadora");
        String modelo = sc.nextLine();
        System.out.println("Ingrese el precio de la computadora");
        double precio = sc.nextDouble();
        
        Computadora c = new Computadora(marca, modelo, precio);
        
    }
}
