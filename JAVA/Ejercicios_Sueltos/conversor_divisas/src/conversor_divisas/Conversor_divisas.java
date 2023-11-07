package conversor_divisas;
import java.util.Scanner;
public class Conversor_divisas {

    public static void main(String[] args) {
        mostrar_menu();
        char nombre_divisa = preguntar_divisa1();
        double cantidad = preguntar_cantidad(nombre_divisa);
        char tipo_conversion = detectar_tipo_conversion(nombre_divisa);
        double conversionTotal = conversion_divisas(tipo_conversion, cantidad);
        mostrar_conversion(cantidad,nombre_divisa,tipo_conversion,conversionTotal);
    }
    /**
     * @param sin variables de entrada
     * Muestra el menu inicial
     * @return no devuelve nada
     */
    public static void mostrar_menu(){
        System.out.println("**********************************************");
        System.out.println("Bienvendio al exchange Euro/Dolar | Dolar/Euro");
        System.out.println("**********************************************");
    }
    
    /**
     * @param sin variables de entrada
     * Pregunta por el tipo de divisa que quieres cambiar dandote solo dos opciones mostradas por validas
     * @return nombre_divisa el nombre de la divisa ya sea 'e' o '$'
     */
    public static char preguntar_divisa1(){
        Scanner sc = new Scanner(System.in);
        char nombre_divisa=' ';
        do{
        System.out.print("(e/$) Que divisa quieres cambiar? ");
            nombre_divisa = sc.next().charAt(0);
        }while(nombre_divisa != 'e' && nombre_divisa!='$');
        
        System.out.println("**********************************************");
        return nombre_divisa;
    }
    
    /**
     * @param nom_divisa1 indica el tipo de divisa que va a ser cambiada
     * Revisa si el tipo es euro o dolar y si es euro convierte a dolar si no pues al reves
     * @return tipo el tipo de  conversion que se realizara ya sea a dolares '$' o a euros '€'
     */
    public static char detectar_tipo_conversion(char nom_divisa1){
        char tipo=' ';
        switch (nom_divisa1) {
            case 'e':
                tipo='$';
                break;
            case '$':
                tipo='€';
                break;
            default:
                System.out.println("Error al detectar tipo de conversion");
                break;
        }
        return tipo;
    }
    
    /**
     * @param nom_divisa indica el tipo de divisa que va a ser cambiada para mostrarlo por pantalla
     * Pregunta cual es la cantidad de la divisa declarada anteriormente que se quiere convertir (no puede ser 0 o inferior)
     * @return cantidad_1 la cantidad de esa divisa que sera convertida
     */
    public static double preguntar_cantidad(char nom_divisa){
        Scanner sc = new Scanner(System.in);
        double cantidad_1;
        do{
            System.out.print("("+nom_divisa+") "+"Cuanta cantidad? ");
            cantidad_1 = sc.nextDouble();
        }while(cantidad_1<=0);
        System.out.println("**********************************************");
        return cantidad_1;
    }
    
    /**
     * @param tipo_conversion indica el tipo de conversion que sera utilizada
     * @param cant_divisa1 indica la cantidad que se va a tener que convertir
     * Revisa cual es el tipo de divisa que sera intercambiada y multiplica por su valor acorde para convertirlo
     * @return el valor de la moneda convertida al otro tipo
     */
    public static double conversion_divisas(char tipo_conversion,double cant_divisa1) {
        
        double conversion = 0.0;
        
        if(tipo_conversion=='€'){
            conversion = cant_divisa1 * 0.93; // 1€ vale 1.07$
        }
        else if(tipo_conversion=='$'){
            conversion = cant_divisa1 * 1.07; // 1$ vale 0.93€
        }

        return conversion;
    }

    /**
     * @param cantidad indica la cantidad que se va a tener que convertir
     * @param nom_divisa1 indica el tipo de la divisa que sera convertida
     * @param nom_divisa2 indica el tipo a la divisa a la que se va a convertir
     * @param conversion indica el resultado final de la conversion
     * Muestra por pantalla los valores introducidos hasta ahora y el resultado de la conversion
     * @return nada
     */
    public static void mostrar_conversion(double cantidad, char nom_divisa1, char nom_divisa2, double conversion) {
        System.out.println("El cambio de " + cantidad + nom_divisa1 + " a " + nom_divisa2 + " sera de: " + conversion + nom_divisa2);
        System.out.println("**********************************************");
    }
}
