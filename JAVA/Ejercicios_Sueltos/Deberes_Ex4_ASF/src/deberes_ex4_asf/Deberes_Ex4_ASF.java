package deberes_ex4_asf;
/* Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. 
   Implementa y utiliza la función: int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo. */

// Imports
import java.util.Scanner;

public class Deberes_Ex4_ASF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        // Variables
        Scanner sc = new Scanner(System.in);
        int numEntero,valorEstado;
        String estado="nulo";
        // Pregunta por un número entero y asigna los valores al input del usuario
        System.out.print("Ingresa el numero: ");
        numEntero = sc.nextInt();
        // Asigna numEntero a "a" de la funcion dimeSigno y lo guarda en valorEstado
        valorEstado = dimeSigno(numEntero);
        // Convertimos a algo mas legible los valores de la funcion con otra variable
        if(valorEstado==1){
         estado="positivo";
        }
        else if(valorEstado==-1){
         estado="negativo";
        }
        // Muestra por pantalla si es positivo, negativo o cero.
        System.out.println("El numero es "+estado);
        
        System.out.println("Acaba main");
    }
    
    /**
     * function dimeSigno
     * revisa si "a" es negativo, positivo o nulo
     * @param a primer y unico parametro
     * @return -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    
    public static int dimeSigno(int a){
     if(a<0){
      return -1;
     }
     else if(a>0){
      return 1;
     }
     else{
      return 0;
     }
    }
}