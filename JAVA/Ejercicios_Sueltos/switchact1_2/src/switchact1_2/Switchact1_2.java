package switchact1_2;
import java.util.Scanner;
public class Switchact1_2 {
    public static void main(String[] args)  
    {
     char letra_mes;
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingresa la primera letra del mes: ");
     letra_mes = sc.next().charAt(0);
     switch(letra_mes)
     {
         case 'e':
         case 'E':
             System.out.println("Enero");
             break;
         case 'f':
         case 'F':
             System.out.println("Febrero");
             break;
         case 'm':
         case 'M':
             System.out.println("Marzo");
             break;
         case 'a':
         case 'A':
             System.out.println("Abril");
             break;
         default: // caso predeterminado por si ninguno de los 7 anteriores se asigna es como un else
             System.out.println("Mes no valido, ingresa [e-f-m-a]");
             break;
     }
    }
}