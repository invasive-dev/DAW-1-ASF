package act_loops_8;
import java.util.Scanner;
// Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos. 

public class Act_loops_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0,lista=0,negativos=0,positivos=0;
        System.out.println("Introduce 10 numeros no nulos: ");
        
        do 
        {
         lista++; // va sumando a lista de 1 en 1
         num = sc.nextInt(); 
         
         while(num==0) // en caso de escribir algun numero nulo te hace volver a escribir otro que no lo sea
         {
         System.out.println("El numero que has escogido es un numero nulo.");
         System.out.println("Introduce un numero no nulo: ");
         num = sc.nextInt();
         }
         
         if (num<0) // detecta numeros negativos
        {
         negativos = negativos + 1;
        }
         else
         {
          positivos = positivos + 1;
         }
        
        }while(lista<10); // la lista comienza con el valor 0 y cada vez que llega a su fin se suma 1 hasta llegar a 10 haciendo que se repita solo 10 veces
        
        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
        
    }
}