package com.mycompany.organigrama_5;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_5 {

    public static void main(String[] args) 
    {
        // variables I
        float radio,Pi,diametro,longitud,area;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.println("Introduce el radio:");
        radio = sc.nextFloat();
        // operacion
        // variables II
        Pi = 3.14f;
        diametro = radio*2;
        longitud = Pi*diametro;
        area = Pi*radio*radio;
        // salida condicional
         System.out.println("La longitud es de: "+longitud+("cm")+(", y el area es de: ")+area+("cm"));
    }
}