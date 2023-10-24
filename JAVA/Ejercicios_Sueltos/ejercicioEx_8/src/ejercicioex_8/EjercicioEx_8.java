package ejercicioex_8;
import java.util.Scanner;
// Modifica el programa anterior, perque no demani ja numero si no que faci les taules de multiplicar del 1, 2, 3, 4 i 5. Pista (bucles anidats, un dins d'un altre).
public class EjercicioEx_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;
        do
        {
        int nMultiplica=0,numTope=num*10,producto=0;
        for(producto=0;producto<=numTope;nMultiplica++,producto=num*nMultiplica)
        {
         System.out.println(num+" * "+nMultiplica+" = "+producto);
        }
        System.out.println("");
        num++;
        }while(num<=5);
    }
}