package com.mycompany.intento_salarios;
import java.util.Scanner;
public class Intento_Salarios {
// autor : adrianspringellfons
/* Codifica un ordinograma que calcula el salario neto semanal de un trabajador en funciÃ³n del
nÃºmero de horas trabajadas y de acuerdo a las siguientes hipÃ³tesis: 
â€¢ Las primeras 35 horas se pagan a tarifa normal.
â€¢ Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
Escribir nombre, salario.
    
En una ampliación del programa calcularemos la retención de impuesto que tiene nuestra
nomina.
• Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• El resto tienen un 25% de impuestos. Para calcular impuestos que deberán
restarse, son la cantidad(resto) que sea multiplicada por 25 y dividirlo por 100.

Escribir nombre, salario bruto, tasas y salario neto(salario bruto-tasas).

En una tercera ampliación, los impuestos tienen una nueva condición
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.
Escribir nombre, salario bruto, tasas y salario neto.*/

    public static void main(String[] args) 
    {
     double salario_extra,salario_normal,salario_bruto,salario_neto,libre_impuesto,tasas,tasas_restantes;
     int horas,h_extra;
     final int HORAS_NORMAL;
     final double T_NORMAL,PRECIOS_EXTRA;
     String nombre;
             
     Scanner sc = new Scanner(System.in);
     System.out.print("Identificate: ");
     nombre =  sc.next();
     System.out.print("Ingresa el numero de horas trabajadas esta semana: ");
     horas = sc.nextInt(); // Leer horas
     T_NORMAL = 20;
     HORAS_NORMAL = 35; // Operacion inicial
     PRECIOS_EXTRA = 1.5;
     libre_impuesto = 500;
     tasas = 0;
     tasas_restantes = 0;

     if (horas>HORAS_NORMAL) // Pregunta si las horas son mayores a las horas normales
     { // Hay horas extra
      h_extra = horas - HORAS_NORMAL;
      salario_extra = h_extra * T_NORMAL * PRECIOS_EXTRA;
      salario_normal = HORAS_NORMAL * T_NORMAL;
      salario_bruto = salario_extra + salario_normal;

      if (salario_bruto <= libre_impuesto) // revisa si se ha ganado mas de 500€ o no
      {
          salario_neto = salario_bruto;
      }
      else if(salario_bruto <= 900)
      {
       tasas = (salario_bruto - libre_impuesto) * 0.25;
       salario_neto = salario_bruto - tasas;
      }
      else
       {
        tasas = (900 - libre_impuesto) * 0.25;
        tasas_restantes = (salario_bruto - 900) * 0.45;
        salario_neto = salario_bruto - tasas - tasas_restantes;
       }
     System.out.println(nombre + " tu salario bruto es de " + salario_bruto + "€, las tasas correspondientes son de " + (tasas + tasas_restantes) + "€, y tu salario neto acaba siendo: " + salario_neto + "€");
     }
     else // No hay horas extra
     {
      salario_bruto = horas * T_NORMAL;
      System.out.println(nombre + " tu salario bruto es de " + salario_bruto + "€, en tu caso no se aplican tasas correspondientes, y tu salario neto acaba siendo: " + salario_bruto + "€");
     } 
    }
}