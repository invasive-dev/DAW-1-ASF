package descomptes;
// author adrianspringellfons
import java.util.Scanner;
public class Descomptes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gastos,descuento,dineroDescontado,pagoFinal;
        descuento = 0;
        System.out.print("Cuanto gastaras con tu compra: ");
        gastos = sc.nextDouble();
        
        if (gastos<800)
        {
         descuento = 0.00;
        }
        else if(gastos>=800 && gastos<=1500)
        {
         descuento = 0.06;
        }
        else if(gastos>1500 && gastos<=3000)
        {
         descuento = 0.08;
        }
        else if(gastos>3000)
        {
         descuento = 0.10;
        }
        dineroDescontado = gastos*descuento;
        pagoFinal = gastos-dineroDescontado;
        System.out.println("Con esta compra gastaras un total de: "+pagoFinal+"€");
    }
}