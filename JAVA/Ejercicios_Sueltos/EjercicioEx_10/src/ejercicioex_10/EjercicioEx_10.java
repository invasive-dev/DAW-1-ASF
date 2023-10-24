package ejercicioex_10;
import java.util.Scanner;
/* Crear el menú para la nueva versión de FIFA.
El menú será similar a

       ****Bienvenido a FIFA***

       *   A - Jugar                    *

       *  B - Entrenar                *

       * C - Jugar Partido Online *  

       * Escoge Opcion : __

    Si escoges cualquier opción del A a C , debe imprimir "Estas jugando/entrenando/jugando online" y volver a pintar el menú

    Si escoges D. debes salir del menu y mostrarte "EXIT"

Version 2.0 La opción la debe de aceptar en mayúsculas o en mínusculas.*/

public class EjercicioEx_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eleccion;

        do
        {
        System.out.println("********************************");
        System.out.println("Bienvenido a FIFA");
        System.out.println("A - Jugar");
        System.out.println("B - Entrenar");
        System.out.println("C - Jugar Partido Online");
        System.out.print(  "Escoge Opcion : ");
        eleccion=sc.next().charAt(0);
        
        switch (eleccion) {
            case 'a':
            case 'A':
                System.out.println("Estas jugando");
                break;
            case 'b':
            case 'B':
                System.out.println("Estas entrenando");
                break;
            case 'c':
            case 'C':
                System.out.println("Estas jugando online");
                break;
            case 'd':
            case 'D':
                System.out.println("EXIT");
                break;
            default:
                System.out.println("Escoge una opcion entre A-D");
                break;
        }
        System.out.println("********************************");
        System.out.println("");
        }while(eleccion!='D');
    } 
}