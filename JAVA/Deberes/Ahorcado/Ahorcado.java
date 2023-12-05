package ahorcado;
// Imports
import java.util.Scanner;

public class Ahorcado{
    // Main
    public static void main(String[] args) {
        // Inicializamos el numero de vidas inicial
        boolean victoria;
        boolean correcto;
        int vidas = 6;
        // Asignamos a la variable palabra la palabra que devuelva la funcion
        String palabra = pidePalabra("Escribe una palabra para el juego del ahorcado: ").toLowerCase();
        // Asignamos a este array la palabra como tal pero en guiones
        char[] array = guiones(palabra);
        // Bucle que revisa si las vidas del usuario no son menores a una para salir del mismoo o no
        do{
            char letra = pideLetra("Escribe una letra: ");
            correcto = revisaLetra(letra, palabra, array);
            // Revisa si es correcto o no y resta vidas acorde a ello
            if(correcto==false){
                vidas--;
            }
            progreso(array);
            revisaVidas(vidas, palabra);
            victoria = revisaGanar(palabra, array);
        }while(vidas>0 && victoria==false);
        
    }

    public static String pidePalabra(String textoPedir){
        Scanner sc = new Scanner(System.in);
        System.out.print(textoPedir);
        String palabra = sc.nextLine().toUpperCase();
        return palabra;
    }
    
    public static char[] guiones(String palabraPedida){
        // Convierte la palabra a Array
        char arrayPalabra[];
        arrayPalabra = palabraPedida.toCharArray();
        
        // Cambia cada caracter con un guion y lo muestra por pantalla
        System.out.print("Frase: ");
        for (int index = 0; index < arrayPalabra.length; index++){
            // Inicializamos con guiones
            arrayPalabra[index] = '_';
            // Mostramos con guiones
            System.out.print("_");
        }
        System.out.println(""); // Espacio al final para que no quede mal
        
        return arrayPalabra;
    }
    
    public static char pideLetra(String textoPedir){
        Scanner sc = new Scanner(System.in);
        System.out.print(textoPedir);
        char letra = sc.nextLine().charAt(0);
        return letra;
    }
    
    public static boolean revisaLetra(char letra, String palabra, char array[]){
        boolean correcto=false;
        
        for (int index = 0; index < palabra.length(); index++){
            if(palabra.charAt(index)==letra){
                array[index]=letra;
                correcto=true;
            }
        }
        return correcto;
    }
    
    public static void progreso(char array[]){
        System.out.println(array);
    }

    public static void revisaVidas(int nVidas,String palabra){
        // Una vez ya no se tengan mas vidas se muestra por pantalla uno de los dos mensajes
        switch (nVidas) {
            case 6:
                System.out.println(nVidas+" vidas");
                break;
            case 5:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" ------------------------------------");
                break;
            case 4:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" ------------------------------------");
                break;
            case 3:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                System.out.println(" ------------------------------------");
                break;
            case 2:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | | ");
                System.out.println(" |                  /  |   | ");
                System.out.println(" |                 /   |     | ");
                System.out.println(" |                     |   ");
                System.out.println(" ------------------------------------");
                break;
            case 1:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | | ");
                System.out.println(" |                  /  |   | ");
                System.out.println(" |                 /   |     | ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / ");
                System.out.println(" |                   /     ");
                System.out.println(" |                  /      ");
                System.out.println(" ------------------------------------");
                break;
            case 0:
                System.out.println(nVidas+" vidas restantes.");
                System.out.println(" ------------------------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | | ");
                System.out.println(" |                  /  |   | ");
                System.out.println(" |                 /   |     | ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / |");
                System.out.println(" |                   /   |  ");
                System.out.println(" |                  /     | ");
                System.out.println(" ------------------------------------");
                System.out.println(" | Has muerto! La palabra correcta era : "+ palabra);
                break;
            default:
                break;
        }
    }
    
    public static boolean revisaGanar(String palabra, char array[]){
        boolean adivinado = false;
        if(palabra.equalsIgnoreCase(new String (array))){
            System.out.println("Palabra adivinada!");
            adivinado=true;
        }
        return adivinado;
    }
    
}