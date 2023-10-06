package augment_sou;
import java.util.Scanner;
class Augment_Sou {

    public static void main(String[] args) {
        double sueldo,incremento,aumento,sueldoFinal;
        incremento=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa sueldo: ");
        sueldo = sc.nextDouble();
        
        if (sueldo<18000)
        {
         incremento=0.12;
        }
        else if (sueldo>=18000 && sueldo<=30000)
        {
         incremento=0.10;
        }
        else if (sueldo>30000 && sueldo<45000)
        {
         incremento=0.08;
        }
        else if (sueldo>=45000)
        {
         incremento=0.06;
        }
        aumento=sueldo*incremento;
        sueldoFinal=sueldo+aumento;
        System.out.println("Has recibido un aumento de sueldo por un total de: "+aumento+"€");
        System.out.println("Tu sueldo luego de aplicar el aumento sera de: "+sueldoFinal+"€");
    }  
}