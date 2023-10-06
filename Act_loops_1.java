package act_loops_1;
// Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
public class Act_loops_1 {

    public static void main(String[] args) {
        int num=0;
        // Usando for
        for (num =0; num <=20; num++) {
            System.out.println("Contador: "+num);
        }
        
        // Usando do while
        do
        {
         num=num+1;
         System.out.println("Contador: "+num);
        }while(num<20);
        
        // Usando while
        while(num<20)
        {
         num=num+1;
         System.out.println("Contador: "+num);
        }
    } 
}