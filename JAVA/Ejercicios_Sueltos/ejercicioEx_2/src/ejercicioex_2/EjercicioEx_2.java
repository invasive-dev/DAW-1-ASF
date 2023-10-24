package ejercicioex_2;
import java.util.Scanner;
/*   Programes molt similars amb petites variacions:
     *Demanar nombres fins que es teclegi el 0, i mostrar quants números s'han introduït fins aquell moment
     *Demanar nombres fins que es teclegi un 0, mostrar la suma de tots els números introduïts fins aquest moment.*/
public class EjercicioEx_2 {

    public static void main(String[] args) {
        int num=0,cantidadNum=0,sumaTotal=0;
        final int NUMERO_FINAL=0;
        Scanner sc = new Scanner(System.in);
        
        do
        {
         System.out.print("Introduce un numero: ");
         num=sc.nextInt();
         cantidadNum++;
         sumaTotal=sumaTotal+num;
        }while(!(num==NUMERO_FINAL));
        
        System.out.println(sumaTotal+" es la suma total de todos los numeros introducidos.");
        System.out.println(cantidadNum+" es el total de los numeros introducidos.");
    }
}