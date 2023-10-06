package act_loops_5;
import java.util.Scanner;
/* Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1*/

public class Act_loops_5 {

    public static void main(String[] args) {

        int numero,natural;
        float factorial= 1.0f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un numero natural: ");
        natural = sc.nextInt();
        
        while(natural<=0) // revisa que el numero que has introducido es natural y si no lo es tienes que volver a introducirlo
        {
         System.out.println("El numero que has escogido no es un numero natural.");
         System.out.print("Introduce un numero natural: ");
         natural = sc.nextInt();
        }
        // una vez el numero natural es valido se empieza a multiplicar 1*1,1*2,1*3 sucesivamente hasta que llegue al valor del numero natural.
        // ejemplo : pones 5 de natural, seria asi : 1*1=1, 1*2=2, 1*3=3, 1*4=4, 1*5=5 por lo que factorial 
        for(numero=1;numero<=natural;numero++)
        {
            factorial=factorial*numero;  //por lo que factorial seria, 5,4,3,2 y 1.
        }
        
        System.out.println("El factorial de " + natural + " es: " + factorial); // se multiplica el natural por todos los numero que le preceden en una sola multiplicacion 

    }
}