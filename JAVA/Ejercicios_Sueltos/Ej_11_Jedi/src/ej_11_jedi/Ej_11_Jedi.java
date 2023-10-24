package ej_11_jedi;
/* Realiza un programa que sume independientemente los pares y los impares de los numeros comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.*/ 
// Adrian Springell Fons

public class Ej_11_Jedi {

    public static void main(String[] args) {
        
        int num=100,sumaPares=0,sumaImpares=0;
        
        while(num>=100 && num <=200)
        {
         System.out.println(num);
         if(num%2 == 0)
         {
          sumaPares = sumaPares + num;
         }
         else
         {
          sumaImpares = sumaImpares + num;
         }
         num++;
        }
        System.out.println("La suma de los pares es de: "+sumaPares);
        System.out.println("La suma de los pares es de: "+sumaImpares);
        
    }
}