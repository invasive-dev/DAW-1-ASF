package generar_codigo_verificacion;

public class Generar_codigo_verificacion {

    public static void main(String[] args) {
        final int MAXIMO_CARACTERES = 4; // Ponemos el numero de caracteres que queramos tomando en cuenta comodidad y seguridad
        String codigo_verificacion=""; // Inicializamos el string
        for(int numCaracteres=0;numCaracteres<MAXIMO_CARACTERES;numCaracteres++){  // Bucle llamara la funcion de generar numero hasta el n de caracteres max
            int numero = generar_numero_aleatorio();
            codigo_verificacion = juntar_numeros_aleatorios(codigo_verificacion,numero);  
        }
        System.out.println("Tu codigo de verificacion para iniciar sesion es: "+codigo_verificacion); // Muestra por pantalla el codig de verificacioon
    }
    
    public static int generar_numero_aleatorio(){ // Genera numeros aleatoris
     int min=0,max=9,range=max-min+1,list,numero=0;
     
        for(list=min;list<max;list++)
        {
         numero = (int)(Math.random()*range)+min;
        }
     return numero;
    }
    /**
     * @param codigo variable de entrada 1, indica el string inicializado y se usa para guardar dentro los 4 caracteres
     * @param num variable de entrada 2, indica el numero aleatorio generado con la otra funcion, se usa para ser acumulado en el string
     * Funcion que junta los numeros aleatorios
     * @return devuelve un String de 4 caracteres que eran antes int
     */
    public static String juntar_numeros_aleatorios(String codigo, int num){ // Acumula todos los numeros en el String
        codigo = codigo+num; // Al ser string no es un valor numerico asi que al sumarlo se pone al lado como cuando imprimimos un char en el sout
        return codigo;
    }
}