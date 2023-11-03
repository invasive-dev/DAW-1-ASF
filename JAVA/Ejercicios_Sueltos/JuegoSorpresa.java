package juegosorpresa;

import java.util.Scanner;

public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean puedes = true;
        while(puedes == true){
        int num = pedirNumero();
        int maximoDinero = 500;
        int dinero = pedirDineroApuesta(maximoDinero);
        int bola = caidaBola();
        pintaAsteriscos(num);
        eresGanador(bola,num);
        
        ganancias(dinero, num);
        char respuesta = seguirJugando();
        puedes = puedesJugar(respuesta,dinero);
        }
    }
 
    
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    
    public static int pedirNumero()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("(1-38) Escribre un numero: ");
        int num = sc.nextInt();
        
        while(!(num>=1 && num<=38)){
         System.out.println("Apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
         System.out.print("(1-38) Escribre un numero: ");
         num = sc.nextInt();
        }
        
        return num;
    }
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        int min = 1;
        int max =36;
        int range = max-min+1;
        int bola = (int)(Math.random()*range) + min;
        System.out.println(bola);
        return bola;
    }
    
    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero)
    {
        if((respuesta =='s'||respuesta=='S') && dinero>0){
          return true;
        }
        else{
          return false;
        }
    }
    
    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        if(dinero_apostado>=1 && dinero_apostado<=36){
            return dinero_apostado*35;
        }
        else if(num_apostado==37 || num_apostado==38){
            return dinero_apostado*2;
        }
        return 0;
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
         Scanner sc = new Scanner(System.in);
         int apuesta;
         do{
             System.out.println("("+dinero_disponible+")"+"Cuanto quieres apostar: ");
             apuesta= sc.nextInt();
         }while(apuesta>dinero_disponible ||  apuesta<0);
         return apuesta;
     }
     
         /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
        // No tiene que revisar si es par o impar
        return bola==num_apostado || (num_apostado==37 /*&& bola==impar*/) || (num_apostado ==38 /*&& bola ==par */);  
        }
    
     
    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    
     public static char seguirJugando()
     {
         char opcion;
         do{
          Scanner sc  = new Scanner(System.in);
          System.out.println("Quieres seguir jugando(S/N)");
          opcion = sc.next().charAt(0);
         }while(!(opcion=='s' || opcion=='S' || opcion=='n' || opcion=='N'));
         return opcion;
     }
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
         for (int numAsteriscos = 0; numAsteriscos < num; numAsteriscos++) {
          System.out.print("*");
         }
         System.out.println("-"+num);
     }
    
}
    
