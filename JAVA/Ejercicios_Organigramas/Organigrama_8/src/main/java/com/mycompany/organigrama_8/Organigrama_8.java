package com.mycompany.organigrama_8;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_8 {

    public static void main(String[] args) 
    {
        // variables I
        int edad;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();
        // operacion/salida
        if (edad>=18)
        {
         System.out.println("Eres mayor de edad");
        }
        else if (edad<18)
        {
         System.out.println("Eres menor de edad");
        }
    }
}