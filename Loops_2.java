package loops_2;
public class Loops_2 {

    public static void main(String[] args) {
        int cont=1;
        
        do{ // comienza sin revisar la condicion
            System.out.println("Contador: " + cont);
            ++cont;
        }while(cont<=10); // revisa si la condicion se cumple
    }
}