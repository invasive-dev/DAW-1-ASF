package deberes_ex3_asf;

/* Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el mínimo. 
   Implementa y utiliza la función: int minimo(int a, int b) // Devuelve el menor entre a y b. */

// Imports
import java.util.Scanner;

public class Deberes_Ex3_ASF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        // Variables
        Scanner sc = new Scanner(System.in);
        int num1,num2,menor;
        // Pregunta por ambos numeros y asigna los valores al input del usuario
        System.out.print("Ingresa el primer numero: ");
        num1 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingresa el segundo numero: ");
        num2 = sc.nextInt(); sc.nextLine();
        // Asigna num1 y num2 a "a" y "b" de la funcion minimo y lo guarda en menor
        menor=minimo(num1,num2);
        // Muestra cual es el numero menor
        System.out.println("El numero menor es: "+menor);
        
        System.out.println("Acaba main");
    }
    
    /**
     * function minimo
     * revisa cual de los dos valores ("a" y "b") es menor
     * @param a primer parametro
     * @param b segundo parametro
     * @return el valor minimo ya sea a/b
     */
    
    public static int minimo(int a, int b){
     if(a>b){
      return b;
     }
     else{
      return a;
     }
    }
}