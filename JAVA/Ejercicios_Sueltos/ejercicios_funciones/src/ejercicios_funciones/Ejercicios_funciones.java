package ejercicios_funciones;

public class Ejercicios_funciones {

    public static void main(String[] args) {
        String frase = "triple aaa+";
        char letra = 'a';
        System.out.println("-------------------------------------------------------------------");
        longitudFrase(frase);
        System.out.println("-------------------------------------------------------------------");
        pasarMayusculasMinusculas(frase);
        System.out.println("-------------------------------------------------------------------");
        fraseEnVertical(frase);
        System.out.println("-------------------------------------------------------------------");
        cuentaVocales(frase);
        System.out.println("-------------------------------------------------------------------");
        cuentaMismoCaracter(frase,letra);
        System.out.println("-------------------------------------------------------------------");
    }
    /**
     * 1.Función que retorna el numero de caracteres de una frase.
     * @param frase
     * @return largo_palabra
     */
    public static int longitudFrase(String frase){
        int largo_frase = frase.length();
        System.out.println("La frase "+frase+" tiene "+largo_frase+" caracteres.");
        return largo_frase;
    }
    /**
     * 2.Función que muestra una frase que recibe por parámetros y la muestra en mayusculas, y luego toda en mínusculas
     * @param frase
     */
    public static void pasarMayusculasMinusculas(String frase){
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase "+frase+" en mayusculas: "+mayusculas+".");
        System.out.println("La frase "+frase+" en minusculas: "+minusculas+".");
    }
    /**
     * 3.Funcion que muestra una frase que recibe por parámetros en vertical, una letra por linea
     * @param frase
     */
    public static void fraseEnVertical(String frase){
       for (int i=0; i<frase.length();i++){
           char letra = frase.charAt(i);
           System.out.println(letra);
       }
    }
    /**
     * 5.Función que retorna, el número de vocales de una frase que ha contado
     * @param frase
     * @return numVocales
     */
    public static int cuentaVocales(String frase){
        int numVocales=0;
        
        frase = frase.toLowerCase();
        for(int i=0; i<frase.length();i++){
            char letra = frase.charAt(i);
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                numVocales++;
            }
        }
        System.out.println("La frase "+frase+" tiene un total de "+numVocales+" vocales.");
        return numVocales;
    }
   
    /**
     * 6.Programa que pide una frase y un carácter y una función que devuelve el numero de veces que aparece ese carácter en la frase.
     * @param frase
     * @return numVeces
     */
    public static int cuentaMismoCaracter(String frase, char caracter){
        int numVeces=0;
        for(int i = 0; i<frase.length();i++){
            if(frase.charAt(i)== caracter){
                numVeces++;
            }
        }
        System.out.println("El caracter "+caracter+" aparece un total de "+numVeces+" veces en la frase "+frase+".");
        return numVeces;
    }
}