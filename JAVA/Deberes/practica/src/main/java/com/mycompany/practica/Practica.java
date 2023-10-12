package com.mycompany.practica;
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioOriginal,precioFinal,diferencia,descuento;
        precioOriginal = sc.nextDouble();
        precioFinal = sc.nextDouble();
        
        diferencia = precioOriginal-precioFinal;
        descuento=(diferencia/precioOriginal);
        
        System.out.println(descuento);
    }
}
