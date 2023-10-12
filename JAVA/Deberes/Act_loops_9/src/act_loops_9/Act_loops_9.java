package act_loops_9;
import java.util.Scanner;
/* Dibuja un ordinograma de un programa que calcula y escribe la suma y el producto de los
10 primeros números naturales.*/ // Adrian Springell Fons

public class Act_loops_9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0,lista=0,suma=0,producto=1;
        System.out.println("Introduce numeros no nulos: ");
        
        do 
        {
         lista++;
         num = sc.nextInt();
         suma = suma+num;
         producto = producto*num;
        }while(lista<10); // se detiene la solicitud de valores cuando el valor 0 es introducido
        
        System.out.println("Suma de los valores introductidos: " + suma);
        System.out.println("Producto de los valores introductidos: " + producto);
        
    }
}