package com.mycompany.organigrama_3;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_3 {

    public static void main(String[] args) 
    {
        // variables
        float lado,area;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.println("Introduce longitud de lado:");
        lado = sc.nextFloat();
        // operacion
        area = lado*lado;
        //salida
        System.out.println("La longitud del area es de: "+area+"cm");
    }
}