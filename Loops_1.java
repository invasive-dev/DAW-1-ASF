package loops_1;
public class Loops_1 {

    public static void main(String[] args) {
        int count/*=1*/;
        
        /*while(count<=10)
        {
            System.out.println("Countdown: "+1+count);
        }
        
        System.out.println("***************");*/
        
        boolean end = false;
        count = 1;
        while(!end) // revisa la condicion y si es cierta comienza y no para
        {
            System.out.println("Countdown: " + count);
            count = count+1;
            if (count>10) // if para ponerle un freno al cambiar al variable que es revisada haciendo que deje de repetirse
            {
             end = true;
            }
        }
    }
    
}