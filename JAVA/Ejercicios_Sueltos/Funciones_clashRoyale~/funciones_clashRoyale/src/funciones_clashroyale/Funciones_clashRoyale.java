package funciones_clashroyale;
import java.util.Scanner;

public class Funciones_clashRoyale {
    // Main
    public static void main(String[] args) throws InterruptedException {
     // Variables
     String nombreCarta = "Leñador";
     int nivelMinimoCarta = 9;
     int nivelMaximoCarta = 15;
     
     int nivelMinimoTorre = 1;
     int nivelMaximoTorre = 14;
       
     long velAtaqueCarta = (long) (0.8*1000);
     long velAtaqueTorre = (long) (0.8*1000);
//   String velocidadCarta = "Muy rápido";
     // Llama a ambas funciones para asignar los niveles de la torre y la carta
     int nivelCarta = preguntaNivelCarta(nombreCarta,nivelMinimoCarta,nivelMaximoCarta);
     System.out.println("");
     int nivelTorre = preguntaNivelTorre(nivelMinimoTorre,nivelMaximoTorre);
     // LLama a ambas funciones para asignar el daño de la torre y de la carta dependiendo de su nivel
     int dañoCarta = dañoCarta(nivelCarta);
     int dañoTorre = dañoTorre(nivelTorre);
     // Llama a ambas funciones para asignar la vida de la torre y de la carta dependiendo de su nivel
     int vidaCarta = vidaCarta(nivelCarta);
     int vidaTorre = vidaTorre(nivelTorre);
     // Muestra por pantalla la informacion de la carta
     System.out.println("");
     System.out.println(nombreCarta);
        System.out.println("Nivel: "+nivelCarta);
        System.out.println("Puntos de Vida: "+vidaCarta);
        System.out.println("Daño: "+dañoCarta);
     // Muestra por pantalla la informacion de la torre
     System.out.println("");
     System.out.println("Torre");
        System.out.println("Nivel: "+nivelTorre);
        System.out.println("Puntos de Vida: "+vidaTorre);
        System.out.println("Daño: "+dañoTorre);
     // Muestra por pantalla la batalla entre ambas
     System.out.println("");
     batalla(nombreCarta,dañoCarta,dañoTorre,vidaCarta,vidaTorre,velAtaqueCarta,velAtaqueTorre);
    }
    //  Funcion que pregunta por el nivel de la carta y solo acepta el valor en caso de estar entre el rango valido
    public static int preguntaNivelCarta(String carta, int nivelMinCarta, int nivelMaxCarta){
        Scanner sc = new Scanner(System.in);
        int nivelCarta=0;
        
        do{
         System.out.println("Que nivel tiene tu "+carta+"?  "+"("+nivelMinCarta+"-"+nivelMaxCarta+")");
         nivelCarta = sc.nextInt();
        }while(nivelCarta<nivelMinCarta || nivelCarta>nivelMaxCarta);
        
        return nivelCarta;
    }
    //  Funcion que pregunta por el nivel de la torre y solo acepta el valor en caso de estar entre el rango valido
    public static int preguntaNivelTorre(int nivelMinTorre, int nivelMaxTorre){
        Scanner sc = new Scanner(System.in);
        int nivelTorre=1;
        
        do{
         System.out.println("Que nivel tiene tu torre?  "+"("+nivelMinTorre+"-"+nivelMaxTorre+")");
         nivelTorre = sc.nextInt();
        }while(nivelTorre<nivelMinTorre || nivelTorre>nivelMaxTorre);
        
        return nivelTorre;
    }
    // Asigna el daño correcto a la carta dependiendo de su nivel
    public static int dañoCarta(int nivelCarta){
        int dañoCarta=0;
        
        switch (nivelCarta) {
            case 9:
                dañoCarta=200;
                break;
            case 10:
                dañoCarta=220;
                break;
            case 11:
                dañoCarta=242;
                break;
            case 12:
                dañoCarta=266;
                break;
            case 13:
                dañoCarta=292;
                break;
            case 14:
                dañoCarta=320;
                break;
            case 15:
                dañoCarta=352;
                break;
            default:
                System.out.println("Error al evaluar el daño de la carta.");
                break;
        }
        return dañoCarta;
    }
    // Asigna el daño correcto a la torre dependiendo de su nivel
    public static int dañoTorre(int nivelTorre){
        int dañoTorre=1;
        
        switch (nivelTorre) {
            case 1:
                dañoTorre=50;
                break;
            case 2:
                dañoTorre=54;
                break;
            case 3:
                dañoTorre=58;
                break;
            case 4:
                dañoTorre=62;
                break;
            case 5:
                dañoTorre=67;
                break;
            case 6:
                dañoTorre=72;
                break;
            case 7:
                dañoTorre=78;
                break;
            case 8:
                dañoTorre=84;
                break;
            case 9:
                dañoTorre=90;
                break;
            case 10:
                dañoTorre=99;
                break;
            case 11:
                dañoTorre=109;
                break;
            case 12:
                dañoTorre=119;
                break;
            case 13:
                dañoTorre=131;
                break;
            case 14:
                dañoTorre=144;
                break;
            default:
                System.out.println("Error al evaluar el daño de la torre.");
                break;
        }
        return dañoTorre;
    }
    // Asigna la vida correcta a la carta dependiendo de su nivel
    public static int vidaCarta(int nivelCarta){
        int vidaCarta=1;
        
        switch (nivelCarta) {
            case 9:
                vidaCarta=1060;
                break;
            case 10:
                vidaCarta=1166;
                break;
            case 11:
                vidaCarta=1282;
                break;
            case 12:
                vidaCarta=1409;
                break;
            case 13:
                vidaCarta=1547;
                break;
            case 14:
                vidaCarta=1696;
                break;
            case 15:
                vidaCarta=1865;
                break;
            default:
                System.out.println("Error al evaluar la vida de la carta.");
                break;
        }
        return vidaCarta;
    }
    // Asigna la vida correcta a la torre dependiendo de su nivel
    public static int vidaTorre(int nivelTorre){
        int vidaTorre=1;
        
        switch (nivelTorre) {
            case 1:
                vidaTorre=1400;
                break;
            case 2:
                vidaTorre=1512;
                break;
            case 3:
                vidaTorre=1624;
                break;
            case 4:
                vidaTorre=1750;
                break;
            case 5:
                vidaTorre=1890;
                break;
            case 6:
                vidaTorre=2030;
                break;
            case 7:
                vidaTorre=2184;
                break;
            case 8:
                vidaTorre=2352;
                break;
            case 9:
                vidaTorre=2534;
                break;
            case 10:
                vidaTorre=2786;
                break;
            case 11:
                vidaTorre=3052;
                break;
            case 12:
                vidaTorre=3346;
                break;
            case 13:
                vidaTorre=3668;
                break;
            case 14:
                vidaTorre=4032;
                break;
            default:
                System.out.println("Error al evaluar la vida de la torre.");
                break;
        }
        return vidaTorre;
    }
    // Funcion que simula la batalla entre la carta y la torre 
    public static void batalla(String nombreCarta, int dañoCarta, int dañoTorre, int vidaCarta, int vidaTorre, long velAtaqueCarta, long velAtaqueTorre) throws InterruptedException{
        int numAtaquesCarta=0;
        int numAtaquesTorre=0;
        
        while(vidaTorre>0 && vidaCarta>0){
        Thread.sleep(velAtaqueCarta);
        numAtaquesCarta++;
            System.out.print("(Ataque nº"+numAtaquesCarta+") ");
            System.out.println(nombreCarta+" ataca con fuerza de valor "+dañoCarta);
        vidaTorre -= dañoCarta;
        if(vidaTorre<0){
            vidaTorre=0;
        }
            System.out.println("Vida restante de la torre "+vidaTorre);
            System.out.println("");
        
        Thread.sleep(velAtaqueTorre);
        numAtaquesTorre++;
            System.out.print("(Ataque nº"+numAtaquesTorre+") ");
            System.out.println("La torre ataca con fuerza de valor "+dañoTorre);
        vidaCarta -= dañoTorre;
        if(vidaCarta<0){
            vidaCarta=0;
        } 
        /* Como ambas partes comparten la misma velocidad de ataque añado otro ataque mas para que al ir dos veces mas rapido 
           la torre ataque dos veces por cada ataque del leñador manteniendo todavia el mismo daño de ataque */
            System.out.println("Vida restante de la carta " + nombreCarta + " : " + vidaCarta);
            System.out.println("");
        Thread.sleep(velAtaqueTorre);
        numAtaquesTorre++;
            System.out.print("(Ataque nº"+numAtaquesTorre+") ");
            System.out.println("La torre ataca con fuerza de valor "+dañoTorre);
        vidaCarta -= dañoTorre;
        if(vidaCarta<0){
            vidaCarta=0;
        }
            System.out.println("Vida restante de la carta " + nombreCarta + " : " + vidaCarta);
            System.out.println("");
        }
        // Revisa quien de los dos ha ganado respecto a la vida que les quede y lo muestra por pantalla
        if(vidaTorre==0 && vidaCarta>0){
            System.out.println("Numero de ataques necesarios para derribar la torre: " + numAtaquesCarta);
        }
        else if(vidaCarta==0 && vidaTorre>0){
            System.out.println("Numero de ataques necesarios para matar a la carta " + nombreCarta +" : "+ numAtaquesTorre);
        }
    }
}