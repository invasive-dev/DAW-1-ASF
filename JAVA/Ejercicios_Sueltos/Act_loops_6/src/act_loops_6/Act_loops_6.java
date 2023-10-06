package act_loops_6;
import java.util.Scanner;
// Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no. (El unico numero nulo es 0)

public class Act_loops_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0,lista=0;
        boolean negativo=false;
        System.out.println("Introduce 10 numeros no nulos: ");
        
        do // 
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
         negativo=true;
        }
         
        }while(lista<10); // la lista comienza con el valor 0 y cada vez que llega a su fin se suma 1 hasta llegar a 10 haciendo que se repita solo 10 veces
        
        if (negativo==true)//Revisa si algun numero ha sido negativo y envia este mensaje en caso afirmativo
        {
         System.out.println("Se ha detectado algún numero negativo.");
        }
        
    }
}