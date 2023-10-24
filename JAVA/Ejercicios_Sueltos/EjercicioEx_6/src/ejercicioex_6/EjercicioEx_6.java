package ejercicioex_6;
import java.util.Scanner;
// Escribe un programa que pida al usuario una letra y el número de veces que debe mostrar. Después se deberá mostrar la letra tantas veces como se haya indicado.
public class EjercicioEx_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        int numVeces=0,numVecesMax;
        
        System.out.print("Introduce una letra: ");
        letra=sc.next().charAt(0);
        System.out.print("Introduce el numero de veces que quieras que aparezca: ");
        numVecesMax=sc.nextInt();
        
        while(numVeces<numVecesMax)
        {
         numVeces++;
         System.out.println(letra);
         System.out.println(numVeces);
        }
    }
}