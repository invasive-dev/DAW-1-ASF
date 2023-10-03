/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2_22_09_2023;
import java.util.Scanner; // coges metodos de una libreria para usar sus funciones, las librerias estan en Libraries en Projects
/**
 *
 * @author adsp8509
 */
public class A2_22_09_2023 {

    /**
     * @param args the command line arguments
     */
    
    // Calculador de nota media (ejercicio hecho propio no lo envio el profesor)
    
    public static void main(String[] args) {
        // Variables
        int notaM01,notaM02,notaM03;
        Scanner pantalla = new Scanner(System.in); // suele ser sc

        System.out.println("Que nota sacaste en M01?");
        notaM01 = pantalla.nextInt();
        System.out.println("Que nota sacaste en M02?");
        notaM02 = pantalla.nextInt();
        System.out.println("Que nota sacaste en M03?");
        notaM03 = pantalla.nextInt();
        System.out.println("Sacaras una media de: "+ (notaM01+notaM02+notaM03)/3);
    }   
    
}

