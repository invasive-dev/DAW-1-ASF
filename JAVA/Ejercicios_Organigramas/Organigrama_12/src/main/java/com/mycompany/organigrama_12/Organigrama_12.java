package com.mycompany.organigrama_12;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_12 {

    public static void main(String[] args) 
    {
        // variables I
        double num;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();
        // salida condicional
        if (num>=0)
        {
         System.out.println(num+" es positivo.");
        }
        else if (num<0)
        {
         System.out.println(num+" es negativo.");
        }
    }
}