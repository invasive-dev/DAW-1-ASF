package ejercicioex_7;
import java.util.Scanner;

// Dissenya una aplicació que demani un numero del 1 al 10, y et faci la taula de multiplicar d'aquell numero.
public class EjercicioEx_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,nMultiplica=0,producto=0;
        
        System.out.print("Introduce un numero (1-10) : ");
        num=sc.nextInt();
        
        while(num<1 || num>10)
        {
         System.out.println("Numero introducido no cumple con los requisitos.");
         System.out.print("Introduce un numero (1-10) : ");
         num=sc.nextInt();
        }
        
        int numTope=num*10;

        for(producto=0;producto<=numTope;nMultiplica++,producto=num*nMultiplica)
        {
         System.out.println(num+" * "+nMultiplica+" = "+producto);
        }
    }
}