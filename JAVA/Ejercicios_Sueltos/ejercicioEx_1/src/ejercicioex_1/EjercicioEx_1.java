package ejercicioex_1;
import java.util.Scanner;
// Llegir un nombre i indicar si és positiu o negatiu. El procés es repetirà fins que s'introdueixi un 0.
public class EjercicioEx_1 {

    public static void main(String[] args) {
        int valor,listaValor=0; 
        final int VALOR_FINAL=50;
        String tipoValor;
        Scanner sc = new Scanner(System.in);
        
        do
        {
         valor=0; tipoValor="nulo"; listaValor++;
         
         System.out.print("("+listaValor+")"+"Introduce valor: ");
         valor=sc.nextInt();
         
         if(valor<0)
         {
          tipoValor="negatiu";
         }
         else if(valor>0)
         {
          tipoValor="positiu";
         }
         
         System.out.println("El valor ingresado es "+tipoValor);
        }while(!(valor==VALOR_FINAL));
        System.out.println("El programa se ha detenido al ingresar el valor '"+VALOR_FINAL+"'");
    } 
}