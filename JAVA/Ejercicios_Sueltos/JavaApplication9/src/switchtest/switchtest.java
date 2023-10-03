package switchtest;
import java.util.Scanner;
// Escribir un numero del dia de la semana y te respondera con el dia de la semana correspondiente
public class switchtest {
    public static void main(String[] args) 
    {
     int nDia;
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingresa dia [1-7] : ");
     nDia = sc.nextInt();
     switch(nDia)
     {
         case 1:
             System.out.println("Lunes");
             break; // el break sirve para que los casos posteriores tambien salten hasta el siguiente break
         case 2:
             System.out.println("Martes");
             break;
         case 3:
             System.out.println("Miercoles");
             break;
         case 4:
             System.out.println("Jueves");
             break;
         case 5:
             System.out.println("Viernes");
             break;
         case 6:
             System.out.println("Sabado");
             break;
         case 7:
             System.out.println("Domingo");
             break;
         default: // caso predeterminado por si ninguno de los 7 anteriores se asigna es como un else
             System.out.println("Dia no valido, ingresa [1-7]");
             break;
     }
    }
}