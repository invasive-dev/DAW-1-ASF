package act_loops_8;
import java.util.Scanner;
/* Dibuja un ordinograma de un programa que lea una secuencia de números no nulos hasta
que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y
cuantos negativos.*/ // Adrian Springell Fons

public class Act_loops_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0,negativos=0,positivos=0;
        System.out.println("Introduce numeros no nulos: ");
        
        do 
        {
         num = sc.nextInt(); 
         
         if (num<0) // detecta numeros negativos
        {
         negativos = negativos + 1;
        }
         else
         {
          positivos = positivos + 1;
         }
        
        }while(num!=0); // se detiene la solicitud de valores cuando el valor 0 es introducido
        
        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
        
    }
}