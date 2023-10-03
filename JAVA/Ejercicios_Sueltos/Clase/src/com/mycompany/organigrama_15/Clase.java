package com.mycompany.organigrama_15;
import java.util.Scanner;
// author: adrianspringellfons
public class Clase {

    public static void main(String[] args) 
    {
        // variables I
        double num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Introduce nº1: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce nº2: ");
        num2 = sc.nextDouble();
        System.out.print("Introduce nº3: ");
        num3 = sc.nextDouble();
        // salida condicional
        if (num1==num2 && num2==num3)
        {
         System.out.println("Los tres numeros son del mismo valor.");
        }
        else if(num1!=2 || num2!=num3)
        {
         if (num1>num2 && num1>num3)
         {
          System.out.println(num1+" es mayor.");
         }
         if (num2>num1 && num2>num3)
         {
          System.out.println(num2+" es mayor.");
         }
         if (num3>num1 && num3>num2)
         {
          System.out.println(num3+" es mayor.");
         } 
        }
        else
         {
          System.out.println("Error, vuelve a introducir los valores.");
         }
    }
}