package ej_10_jedi;
import java.util.Scanner;
/*Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.*/ 
// Adrian Springell Fons

public class Ej_10_Jedi {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int nota,minNota=0,maxNota=10,modulo=1,valorFinal=-1;
        String moduloExcelente=("M0"+modulo+": ");
        boolean excelente=false;
        
        System.out.println("Introduce la nota de cada una de tus asignaturas: ");
        do
        {
         System.out.print("M0"+modulo+": ");
         nota=sc.nextInt();
         while(nota>maxNota || (nota<minNota && nota!=-1))
         {
          System.out.println("La nota introducida no es valida, vuelve a intentarlo.");
          System.out.print("M0"+modulo+": ");
          nota=sc.nextInt();
         }
         if(nota==10)
         {
          excelente=true;
          moduloExcelente=("M0"+modulo);
         }
         modulo++;
        }while(nota!=valorFinal);
        
        if(excelente==true)
        {
         System.out.println("Hubo un excelente y uno de ellos fue en "+moduloExcelente);
        }
        else
        {
         System.out.println("No hubo ningun modulo con calificacion excelente.");
        }
    }
}