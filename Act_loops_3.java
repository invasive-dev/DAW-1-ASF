package act_loops_3;
// Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1. 

public class Act_loops_3 {

    public static void main(String[] args) {
        int num=0;
        
        // Usando for
        for (num = 0; num <= 200; num++) {
            if(num%2 == 0)
            {
             System.out.println("Numeros pares: "+num);
            }
        }
        
        // Usando do while
        do
        {
         num=num+1;
         if (num%2 == 0)
         {
          System.out.println("Numeros pares: "+num); 
         }
        }while(num<=200);
        
        // Usando while
        while(num<=200)
        {
         num=num+1;
         if (num%2 == 0)
         {
          System.out.println("Numeros pares: "+num); 
         }
        }
        
    }
}