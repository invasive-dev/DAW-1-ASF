package ejercicio_19_funciones;
import java.util.Scanner;
/*Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
Por ejemplo: 3 ² + 4 ² = 5 ².*/
public class Ejercicio_19_funciones{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int x = leeValorEntero(sc);
     int y = leeValorEntero(sc);
     int z = leeValorEntero(sc);
     comprobacionPitagoras(x,y,z);
    }
    
    public static void comprobacionPitagoras(int x, int y, int z){
     if(x*x+y*y==z*z){ 
      System.out.println("Es triangulo pitagoras.");
     }
     else{
      System.out.println("No es triangulo pitagoras.");
     }  
    }
    public static int leeValorEntero(Scanner sc){
     System.out.print("Ingresa un valor: ");
     return sc.nextInt();
    }
}
