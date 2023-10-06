
package loops_4;

public class Loops_4 {

    public static void main(String[] args) {
        // for se utiliza cuando sabes que necesitaras hacer algo un numero de veces determinado
        int cont;
        for (cont=0; cont<=10; cont++/*cont=cont+1*/) //condicion para que empieze, condicion del while, que cada vez aumente en 1 el cont
        {
            System.out.println("Contador: " + cont);
        }
        System.out.println("Ha parado porque ha llegado a "+cont);
        
    }
    
}

// 1,2,3 con el for
// y con el while y do while luego alternando