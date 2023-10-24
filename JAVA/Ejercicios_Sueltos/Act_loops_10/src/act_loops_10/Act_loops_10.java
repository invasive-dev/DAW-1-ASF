package act_loops_10;
import java.util.Scanner;
/* Escribe un programa que pida la edad y el año en que nos encontramos i muestre la edad
que tenia el usuario en cada año hasta su nacimiento.*/ // Adrian Springell Fons

public class Act_loops_10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edadActual=0,dataActual=0,edadData=0,dataAnual=0,dataNacimiento=0;
        System.out.println("Introduce el año actual: ");
        dataActual= sc.nextInt();
        System.out.println("Introduce tu edad: ");
        edadActual= sc.nextInt();
        dataNacimiento=dataActual-edadActual;
        dataAnual=dataNacimiento;
        
        do
        {
         edadData++;
         dataAnual++;
         System.out.println("Tu edad en " + dataAnual + " era de: "+edadData);
        }while(edadData<edadActual-1);
        
        System.out.println("Tu edad en "+dataActual+" es de "+edadActual);
        
    }
}