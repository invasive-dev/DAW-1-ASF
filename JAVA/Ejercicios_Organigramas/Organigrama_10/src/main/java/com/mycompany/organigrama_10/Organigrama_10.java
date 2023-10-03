package com.mycompany.organigrama_10;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_10 {

    public static void main(String[] args) 
    {
        // variables I
        int num1,num2,suma,resta,producto,division;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.print("Introduce nº1: ");
        num1 = sc.nextInt();
        System.out.print("Introduce nº2: ");
        num2 = sc.nextInt();
        // operacion
        // variables II
        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;
        division = num1/num2;
        // salida condicional
        if (num2==0)
        {
         System.out.println(("Suma: ")+suma+(", ")+("Resta: ")+resta+(", ")+("Producto: ")+producto+(", ")+("Division: ")+"No se puede dividir entre cero.");
        }
        else if (num2!=0)
        {
         System.out.println(("Suma: ")+suma+(", ")+("Resta: ")+resta+(", ")+("Producto: ")+producto+(", ")+("Division: ")+division);
        }
    }
}