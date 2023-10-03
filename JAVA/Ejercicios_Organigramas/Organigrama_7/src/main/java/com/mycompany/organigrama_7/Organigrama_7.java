package com.mycompany.organigrama_7;
import java.util.Scanner;
// author: adrianspringellfons
public class Organigrama_7 {

    public static void main(String[] args) 
    {
        // variables I
        double mMarina,conversionKm;
        Scanner sc = new Scanner(System.in);
        // entrada
        System.out.println("Introduce la distancia en millas marinas:");
        mMarina = sc.nextDouble();
        // operacion
        conversionKm = mMarina*1.852;
        // salida
         System.out.println(mMarina+" millas marinas equivalen a: "+conversionKm+"km");
    }
}