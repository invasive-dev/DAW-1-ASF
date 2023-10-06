package loops_3;
import java.util.Scanner;
// programa que pide numeros hasta que introduzcas el -1, en ese momento parara

public class Loops_3 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num=0;
       /*while(num!=-1) //while
       {
        System.out.println("Pon valores, (-1 para terminar): ");
        num = sc.nextInt();
        System.out.println("Has introducio el numero: "+num);
       }
       do
       {
        System.out.println("Pon valores, (-1 para terminar): ");
        num = sc.nextInt();
        System.out.println("Has introducio el numero: "+num);
       }while(num!=-1); // do while */
       
       boolean end = false;
       do
       {
        System.out.println("Pon valores, (-1 para terminar): ");
        num = sc.nextInt();
        System.out.println("Has introducio el numero: "+num);
        if (num==-1)
        {
         end = true;
        }
       }while(end==false);
    }
}
