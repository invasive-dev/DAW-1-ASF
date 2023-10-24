package act_correo;
import java.util.Scanner;
/* Programa que demana 2 valors, i ens ha de dir si son pars els dos, important, sol que un no sigui parell, ha de mostrar el numero X no es parell. 
(si els dos no son parells, mostrara dos linees on dira cadascun dels numeros que no son parells)*/

public class Act_correo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v1,v2;
        String v1par="negativo",v2par="negativo";
        // pide los valores
        System.out.print("Introduce el primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Introduce el segundo valor: ");
        v2 = sc.nextInt();
        
        if(v1%2 == 0)
        {
         v1par = "positivo";
        }
        if(v2%2 == 0)
        {
         v2par = "positivo";
        }
        
        // te dice si son pares o impares
        System.out.println("El primer valor es "+v1par);
        System.out.println("El segundo valor es "+v2par);
    }
}