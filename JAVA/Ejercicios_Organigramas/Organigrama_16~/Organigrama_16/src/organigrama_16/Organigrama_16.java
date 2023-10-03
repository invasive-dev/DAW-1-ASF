package organigrama_16;
import java.util.Scanner;
// @author adsp8509

public class Organigrama_16 {
 
    public static void main(String[] args) {
        // variables I
        double cal;
        Scanner sc = new Scanner(System.in );
        // entrada
        System.out.print("Introduce calificacion: ");
        cal = sc.nextDouble();
        // salida condicional
        if (cal<=10 && cal>=0)
        {
            if (cal<3)
            {
                System.out.print("Muy deficiente ");
            }
            else if (cal<5 && cal>=3)
            {
               System.out.print("Insuficiente "); 
            }
            else if (cal<6 && cal>=5)
            {
                System.out.print("Bien ");
            }
            else if (cal<9 && cal>=6)
            {
                System.out.print("Notable ");
            }
            else if (cal<=10 && cal>=9)
            {
                System.out.print("Sobresaliente ");
            }
        }
        else if (cal>10 || cal<0)
        {
            System.out.print("Ingresa un valor entre 0 y 10 ");
        }
    }
}
