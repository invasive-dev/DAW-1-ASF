/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1_pol;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici1_Pol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_random, suma, resultat_random,resultat_usuari;
        int max;
        int min = 1;
        
        System.out.println("Quin es el valor maxim");
        max = sc.nextInt();
        int range = max - min + 1;
        do{
            num_random = (int)(Math.random() * range) + min;
            System.out.println(num_random);
            System.out.println(num_random);
            resultat_random = num_random + num_random;
            System.out.println("Quin es el resultat? Si vols finalitzar posa 404.");
            resultat_usuari = sc.nextInt();
        
        if(resultat_random != resultat_usuari){
            System.out.println("Has fallat");
        }
        else if(resultat_usuari == 404){
            System.out.println("Has finalitzat el joc");
        }
        
        
        
        }while(resultat_random != resultat_usuari && resultat_usuari != 404);
        
        
        
        
        
        
        
        
    }
    
}