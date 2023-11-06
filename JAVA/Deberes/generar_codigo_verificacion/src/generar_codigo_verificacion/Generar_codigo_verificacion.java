package generar_codigo_verificacion;

public class Generar_codigo_verificacion {

    public static void main(String[] args) {
        final int MAXIMO_CARACTERES = 4; // Ponemos el numero de caracteres que queramos tomando en cuenta comodidad y seguridad
        String codigo_verificacion=""; // Inicializamos el string
        for(int numCaracteres=0;numCaracteres<MAXIMO_CARACTERES;numCaracteres++){  // Bucle que llama a la funcion de generar un numero hasta que se llege al numero de caracteres maximo
            int numero = generar_numero_aleatorio();
            codigo_verificacion = codigo_verificacion+numero;  // Se va acumulando todos los numeros en el String
            // Nos deja hacer esto ya que al ser string no es un valor numerico por lo que si lo sumas se pone al lado como cuando imprimimos un char en el sout
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
    
}
