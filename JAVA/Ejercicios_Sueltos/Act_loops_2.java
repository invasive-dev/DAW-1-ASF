package act_loops_2;
// Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.

public class Act_loops_2 {

    public static void main(String[] args) {
        int num=0;
        
        // Usando for
        for (num = 0; num <= 200; num=num+2) {
            System.out.println("Numeros pares: "+num);
        }
        
        // Usando do while
        do
        {
         num=num+2;
         System.out.println("Numeros pares: "+num);
        }while(num<200);
        
        // Usando while
        while(num<200)
        {
         num=num+2;
         System.out.println("Numeros pares: "+num);
        }
    }
}