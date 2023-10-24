package ejercicioex_4;
import java.util.Scanner;
/*Dibuja un ordinograma que pida introducir Pin hasta 3 veces: Simularemos la entrada de un portal de un banco donde te pide un pin (el pin sera 1234), 
  te ha de pedir el pin hasta que adivinar el pin, o al tercer golpe tiene terminar diciendo que se ha sobrepasado el número máximo de intentos.*/
public class EjercicioEx_4 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     final int PIN_CORRECTO=1234;
     int pinIntroducido,intentos=3;
     boolean acceso=false;
     
     do
     {
      System.out.print(("(")+intentos+(") ")+"Introduce tu clave PIN: ");
      pinIntroducido=sc.nextInt();
      intentos--;
      
      if(pinIntroducido==PIN_CORRECTO)
      {
       acceso=true;
       System.out.println("Iniciando sesion...");
      }
      
     }while(acceso==false & intentos!=0);
     
     if(acceso==false)
     {System.out.println("Acceso denegado.");}
     
    }
}