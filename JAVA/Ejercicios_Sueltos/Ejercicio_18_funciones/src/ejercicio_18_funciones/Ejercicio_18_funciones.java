package ejercicio_18_funciones;
import java.util.Scanner;
/*El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’.*/
public class Ejercicio_18_funciones{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Ingresa la numeracion del DNI: ");
     int DNI = leeValorEntero(sc);
     char letraDNI = calculaLetraDNI(DNI);
     System.out.println("El DNI con la letra asignada seria: "+DNI+letraDNI);
    }
    
    /**
     * @param DNI
     * @return letraDNI.charAt(residuo)
     */
    public static char calculaLetraDNI(int DNI){
     String letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
     int residuo = DNI%23; // 23 letras totales  el residuo es equivalente al numero de letra en el string que se escoge
     return letraDNI.charAt(residuo);
    }
    /**
     * @param sc
     * @return sc.nextInt()
     */
    public static int leeValorEntero(Scanner sc){
     return sc.nextInt();
    }
}