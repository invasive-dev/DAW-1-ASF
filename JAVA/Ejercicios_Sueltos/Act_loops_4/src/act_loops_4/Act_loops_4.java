package act_loops_4;
import java.util.Scanner;
// Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.

public class Act_loops_4 {

    public static void main(String[] args) {
        int num=0,numN;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un numero natural: ");
        numN = sc.nextInt();
        
        while(numN<=0)
        {
         System.out.println("El numero que has escogido no es un numero natural.");
         System.out.print("Introduce un numero natural: ");
         numN = sc.nextInt();
        }
        
        /* Usando for
        for (num = 1; num != numN+1; num++) // Empieza por 1, acaba en numN+1. Muestra el numN introducido al final ej:numN=50, llega hasta el 50 no 49
        { 
         System.out.println(num);
        }*/
        
        /* Usando do while
        do
        {
         num++;
         System.out.println(num);
        }while(num != numN);*/
        
        // Usando while
        while(num != numN)
        {
         num++;
         System.out.println(num);
        }
    }
}