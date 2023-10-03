package com.mycompany.organigrama_13;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_13 {

    public static void main(String[] args) 
    {
        // variables I
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Introduce nº1: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce nº2: ");
        num2 = sc.nextDouble();
        // salida condicional
        if (num1==num2)
        {
         System.out.println("Ambos son del mismo valor.");
        }
        else if (num1!=num2)
        {
         if (num1>num2)
         {
          System.out.println(num2+(", ")+num1);
         }
         else if (num1<num2)
         {
          System.out.println(num1+(", ")+num2);
         }
        }
    }
}