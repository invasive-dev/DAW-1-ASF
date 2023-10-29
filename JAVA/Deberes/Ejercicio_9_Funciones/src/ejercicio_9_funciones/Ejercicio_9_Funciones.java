package ejercicio_9_funciones;
/* Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado. 
Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.*/
import java.util.Scanner;
public class Ejercicio_9_Funciones {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int mayor=0;
     
     for(int introducido=0;introducido<3;introducido++)
     {
      System.out.print("["+(introducido+1)+"]"+"Introduce el valor: ");
      int valor = leeValorEntero(sc);
      mayor = comparaDosEnteros(mayor,valor);
     }
     System.out.println("El numero mayor es: " + mayor);
    }
    
    public static int comparaDosEnteros(int v1, int v2){
     if(v1>v2){
      return(v1);
     }
     else{
      return(v2);
     }
    }
    
    public static int leeValorEntero(Scanner sc){
     return sc.nextInt();
    }
}
