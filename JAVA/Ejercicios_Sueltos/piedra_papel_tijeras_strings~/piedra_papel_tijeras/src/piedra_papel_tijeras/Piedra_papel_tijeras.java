package piedra_papel_tijeras;
// Adrian Springell Fons
import java.util.Scanner;

public class Piedra_papel_tijeras {

    public static void main(String[] args) throws InterruptedException {   
      int ms = 1000;
      int puntos_player1=0 , puntos_player2=0;
      int ganador_final=0;
      
      for(int lanzamientos = 0; lanzamientos<6 && puntos_player1<3 && puntos_player2<3; lanzamientos++){
      
      String player1 = jugada_persona();
      imp_jugada(player1);
      String player2 = jugada_ordenador();
      imp_jugada(player2);
      int ganador = ganador(player1,player2);
      imp_ganador(ganador);
      
      if(ganador == 1){
       puntos_player1 = aumentar_punto(puntos_player1);  
      }
      else if(ganador == 2){
       puntos_player2 = aumentar_punto(puntos_player2);  
      }
      marcador(puntos_player1,puntos_player2);
      Thread.sleep(ms);
      System.out.println("");
     }
      
      if(puntos_player1 > puntos_player2){
       ganador_final=1;
      }
      else if(puntos_player1 < puntos_player2){
       ganador_final=2;
      }
      else{
       ganador_final=0;
      }
      
      imp_ganador(ganador_final);
      marcador(puntos_player1,puntos_player2);
    }
    
   
    /**
     * Pide al usuario una tirada al jugador mostrando una frase similar a "que sacas? (0 piedra, 1 papel, 2 tijera)"
     */
    public static void jugada(){
     System.out.print("Que sacas? (piedra, papel, tijera): ");
    }
   
    /**
     * Retorna el valor introducido siempre que sea un valor vàlido, sino debe seguir pidiendo tirada. No escribe nada cuando eliges, lo hará otra función  0,5 ptos
     * @return opcion
     */
    public static String jugada_persona(){
     String opcion="";
         do{
          Scanner sc  = new Scanner(System.in);
          jugada();
          opcion = sc.nextLine();
          opcion = opcion.toLowerCase();
         }while(!(opcion.equals("piedra")||opcion.equals("papel")||opcion.equals("tijera")));
     return opcion;
    }
   
    /**
     * proporciona un valor aleatoria entre 0 y 2 incluido . Retorna el valor generado 0,5 ptos
     * @return valor
     */
    public static String jugada_ordenador(){
     int min=0,max=2,range=max-min+1,list,valor=3;
     
        for(list=min;list<max;list++)
        {
         valor = (int)(Math.random()*range)+min;
        }
        String valorString="";
        switch (valor) {
            case 0:
                valorString="piedra";
                break;
            case 1:
                valorString="papel";
                break;
            case 2:
                valorString="tijera";
                break;
            default:
                break;
        }
        
     return valorString;
    }
   
    /**
     * imprime por pantalla la frase "Piedra", "papel" o "tijera" en función del parametro de entrada (0 piedra, 1 papel, 2 tijera)) . 0,5 puntos
     * @param valorString
     */
    public static void imp_jugada(String valorString){
        System.out.println(valorString);
    }
    /**
     * imprime el ganador de la tirada siguiendo esta regla,  si ganador vale 0 imprimir "hay empate", si es un 1 imprimir "has ganado", si es 2 debe imprimi que ha ganado el ordenador  0,5 ptos
     * @param ganador
     */
    public static void imp_ganador(int ganador){
        switch (ganador) {
            case 0:
                System.out.println("Hay empate");
                break;
            case 1:
                System.out.println("Has ganado");
                break;
            case 2:
                System.out.println("Ha ganado el ordenador");
                break;
            default:
                break;
        }
    }
    /**
     * imprime la puntuación de cada jugador por pantalla 0,5 puntos
     * @param point_player1
     * @param point_player2
     */
    public static void marcador(int point_player1, int point_player2){
        System.out.println("Puntuacion jugador 1: "+point_player1);
        System.out.println("Puntuacion jugador 2: "+point_player2);
    }
     /**
     * retorna el valor de entrada aumentado en uno
     * @param score
     * @return score+1
     */
    public static int aumentar_punto(int score){
     return score+1;
    }
    /**
     * retorna 0 si hay empate, 1 si gana el jugador 1 y 2 si gana el ordenador
     * @param choose_player1
     * @param choose_player2
     */
    public static int ganador(String choose_player1, String choose_player2){
      if(choose_player1.equals(choose_player2)){
      return 0; // empate
     }
     else if((choose_player1.equals("piedra") && choose_player2.equals("tijera")) || (choose_player1.equals("papel") && choose_player2.equals("piedra")) || (choose_player1.equals("tijera") && choose_player2.equals("papel"))){
      return 1; // gana jugador 1
     }
     else{
      return 2; // gana jugador 2 (el ordenador en este caso)
     }
     
    }
}