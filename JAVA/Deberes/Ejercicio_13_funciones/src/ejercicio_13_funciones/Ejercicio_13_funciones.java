package ejercicio_13_funciones;
import java.util.Scanner;
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.*/
public class Ejercicio_13_funciones{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Ingresa el precio sin descuento: ");
     double precio_sin_desc = pideValoresDescuento(sc);
     System.out.print("Ingresa el precio con descuento: ");
     double precio_con_desc = pideValoresDescuento(sc);
     
     double porcentaje_acorde = calcularDescuento(precio_sin_desc,precio_con_desc);
     System.out.println("El porcentaje de descuento aplicado sera del "+porcentaje_acorde+"%");
    }
    public static double pideValoresDescuento(Scanner sc){
     double sinDescuento = sc.nextDouble();
     return sinDescuento;
    }
    public static double calcularDescuento(double sin,double con){
     double porcentaje = ((sin - con) / sin) * 100;
     return porcentaje;  
// (sin-con)calcula la diferencia, /sin divide diferencia entre precio sin descuento para saber cuanto % representa y el *100 es para representarlo en procentaje
    }
}
