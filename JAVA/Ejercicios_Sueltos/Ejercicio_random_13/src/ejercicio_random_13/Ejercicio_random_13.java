package ejercicio_random_13;
import java.lang.Math;
import java.util.Scanner;

// Adrian Springell Fons
// Programa que piensa un numero del 1 al 20 y el usuario va introduciendo numeros hasta adivinarlo, debe dar una pista de mayor o menor si no lo adivinas
public class Ejercicio_random_13{

    public static void main(String[] args) {
        /* METODO 1 */    
        int min=1,max=20,range=max-min+1,list,numAleatorio=0,numUser,intentos=1;
        String estado;
        Scanner sc = new Scanner(System.in);
       
        for(list=min;list<max;list++)
        {
         numAleatorio = (int)(Math.random()*range)+min;
        }
        System.out.print("Adivina el numero que ha generado el ordenador: ");
        numUser=sc.nextInt();
        do
        {
         intentos++;
         if(numUser>numAleatorio)
         {
          estado=("mayor");
         }
         else
         {
          estado=("menor");
         }
         System.out.println("El numero introducido es "+estado+" al del ordenador");
         System.out.print("Intentalo de nuevo: ");
         numUser=sc.nextInt();
        }while(!(numUser==numAleatorio));
       
        System.out.println("Has adivinado el numero despues de "+intentos+" intentos.");
    }
}
