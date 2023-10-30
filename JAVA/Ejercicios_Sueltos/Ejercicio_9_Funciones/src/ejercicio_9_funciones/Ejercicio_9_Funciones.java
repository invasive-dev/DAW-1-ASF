package ejercicio_9_funciones;
/* Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado. 
Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.*/
import java.util.Scanner;
public class Ejercicio_9_Funciones {

    public static void main(String[] args) {
     // Variables
     Scanner sc = new Scanner(System.in);
     int mayor=0; // Inicializo mayor
     // Bucle que sigue hasta que se hayan introducido tres valores
     for(int introducido=0;introducido<3;introducido++)
     {
      System.out.print("["+(introducido+1)+"]"+"Introduce el valor: "); // Pregunta el valor
      int valor = leeValorEntero(sc); // Asigna el valor al input del usuario
      mayor = comparaDosEnteros(mayor,valor); 
      /* Iteracion 1. Compara 0 que es con lo que se ha inicializado con el numero ingresado por el usuario asi : 0 compara a 50 por ejemplo 
         Iteracion 2. mayor se actualizo al numero mas grande en la iteracion 1 que seria 50 y se compara a 123 por ejemplo y el valor mas grande es ahora 123
         Iteracion 3. mayor es ahora 123 y se compara con el siguiente input que seria 20 
         Resultado.   mayor se quedo siendo 123 ya que 20 no es mas grande por lo que se acaba mostrando al acabar el loop "123" como mayor */
     }
     // Muestra el valor mas grande
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