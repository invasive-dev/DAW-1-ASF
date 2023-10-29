package ejercicio_6_funciones;
/* Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA */
import java.util.Scanner;
public class Ejercicio_6_Funciones {

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     for(int veces=0;veces<5;veces++){
      System.out.print("["+(veces+1)+"]"+"Introduce el precio: ");
      double precio = leeValorDecimal(sc);
      double precioConIVA = precioConIVA(precio);
      System.out.println("El precio con IVA es: " + precioConIVA);
     }
    }
    
    public static double precioConIVA(double precio){
     final double IVA = 0.21;
     return precio+(precio*IVA);
    }
    
    public static double leeValorDecimal(Scanner sc){
     return sc.nextDouble();
    }
}