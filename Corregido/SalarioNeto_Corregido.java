package salarioneto;
import java.util.Scanner;
public class SalarioNeto_Corregido {
// autor : adrianspringellfons
/* Codifica un ordinograma que calcula el salario neto semanal de un trabajador en función del
número de horas trabajadas y de acuerdo a las siguientes hipótesis: 
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
Escribir nombre, salario.*/

    public static void main(String[] args) 
    {
     double salario_extra,salario_normal,salario;
     int horas,h_extra;
     final int HORAS_NORMAL;
     final double T_NORMAL,PRECIOS_EXTRA; // Final y mayusculas son para definir constantes
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingresa el numero de horas trabajadas esta semana: ");
     horas = sc.nextInt(); // Leer horas
     
     T_NORMAL = 20;
     HORAS_NORMAL = 35; // Operacion inicial
     PRECIOS_EXTRA = 1.5;
     
     if (horas>HORAS_NORMAL) // Pregunta si las horas son mayores a las horas normales
     { // true
      h_extra = horas - HORAS_NORMAL;
      salario_extra = h_extra * T_NORMAL * PRECIOS_EXTRA;
      salario_normal = HORAS_NORMAL * T_NORMAL;
      salario = salario_extra + salario_normal;
     }
     else
     { // false
      salario = horas * T_NORMAL;
     } 
     System.out.println("Tu salario sera un total de: "+salario+("€")); // salida
    }
}