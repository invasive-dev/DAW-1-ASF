package com.mycompany.organigrama_11;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_11 {

    public static void main(String[] args) 
    {
        // variables I
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Introduce nº1: ");
        num1 = sc.nextInt();
        System.out.print("Introduce nº2: ");
        num2 = sc.nextInt();
        // salida condicional
        if (num1==num2)
        {
         System.out.println("Ambos son iguales");
        }
        else if (num1!=num2)
        {
         if (num1>num2)
         {
          System.out.println("nº1 es mayor");
         }
         else if (num1<num2)
         {
          System.out.println("nº2 es mayor");
         }
        }
    }
}