package act_loops_12;
import java.util.Scanner;
/* Escribe un programa que pida al usuario una letra y el número de veces que debe mostrar.
Después se deberá mostrar la letra tantas veces como se haya indicado.*/ 
// Adrian Springell Fons

public class Act_loops_12 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int maxVeces,veces=0;
        char letra;
        
        System.out.print("Introduce una letra: ");
        letra = sc.nextLine().charAt(0);
        System.out.print("Introduce el numero de veces que debe mostrarse: ");
        maxVeces = sc.nextInt();
        
        do{
         System.out.println(letra+" numº"+veces);
         veces++;
        }while(veces<maxVeces+1);
        
    }
}