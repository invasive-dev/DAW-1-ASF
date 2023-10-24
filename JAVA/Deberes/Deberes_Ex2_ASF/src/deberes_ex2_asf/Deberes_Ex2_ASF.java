package deberes_ex2_asf;

/* Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no. 
   Implementa y utiliza la función: boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario. */

// Imports
import java.util.Scanner;

public class Deberes_Ex2_ASF {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        // Variables
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean mayor;
        // Pregunta por la edad y asigna el valor al input del usuario
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt(); sc.nextLine();
        mayor = esMayorEdad(edad);
        // Revisa si mayor(a) es true o false
        if(mayor==true){
         System.out.println("Eres mayor de edad.");
        }
        else{
         System.out.println("Eres menor de edad.");
        }
        
        System.out.println("Acaba main");
    }
    
    /**
     * function esMayorEdad
     * revisa si "a" es mayor o igual (>=) a 18 o no y devuelve true/false dependiendo
     * @param a primer y unico parametro
     * @return true/false para el valor "a"
     */
    
    public static boolean esMayorEdad(int a){
     if(a>=18){
      return true;
     }
     else{
      return false;
     }
    }
}