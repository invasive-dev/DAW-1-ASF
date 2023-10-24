package act_loops_11;
import java.util.Scanner;
/* Dibuja un ordinograma que pida introducir Pin hasta 3 veces: Simularemos la entrada de
un portal de un banco donde te pide un pin (el pin sera 1234), te ha de pedir el pin hasta que
adivinar el pin, o al tercer golpe tiene terminar diciendo que se ha sobrepasado el número máximo
de intentos.*/ // Adrian Springell Fons

public class Act_loops_11 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin,intentos=3;
        boolean acceso=false;
        
        while(intentos>0 && acceso==false)
        {
         System.out.print("("+intentos+" intentos) Introduce tu clave PIN: ");
         pin=sc.nextInt();
         if(pin==1234)
         {
          System.out.println("Acceso concedido, iniciando sesion...");
          acceso=true;
         }
         intentos--;
        }
        if(acceso==false)
        {
         System.out.println("Acceso denegado, numero maximo de intentos sobrepasado.");
        }
    }
}