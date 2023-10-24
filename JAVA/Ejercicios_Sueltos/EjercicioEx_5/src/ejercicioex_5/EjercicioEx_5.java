package ejercicioex_5;
import java.util.Scanner;
// Escribe un programa que pida la edad y el año en que nos encontramos i muestre la edad que tenia el usuario en cada año hasta su nacimiento.
public class EjercicioEx_5 {

    public static void main(String[] args) {
        int dataNacimiento,dataActual,edadActual,edadProgresiva,dataProgresiva;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduce tu edad actual: ");
        edadActual=sc.nextInt();
        System.out.print("Introduce la data actual: ");
        dataActual=sc.nextInt();
        
        dataNacimiento=dataActual-edadActual;
        dataProgresiva=dataNacimiento;
        
        System.out.println("Naciste en el "+dataNacimiento);
        for(edadProgresiva=1;edadProgresiva<edadActual;edadProgresiva++)
        {
         dataProgresiva++;
         System.out.println("Tenias "+edadProgresiva+" en "+dataProgresiva);
        }
        System.out.println("Tienes "+edadActual+" este "+dataActual);
    }
}