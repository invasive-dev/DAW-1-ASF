package listaamistades;
import java.util.Scanner;
public class ListaAmistades {

public static void main(String[] args) {
    int posicion=0;
    boolean sortir=false;
    //definir estructura de string per 10 noms
    String[] listaContactos = new String[10];
    char opcio;

     do {
        mostrarMenu();
        opcio = obtenirOpcioUsuari();
        switch (opcio) {
        case 'a':
         llistarNoms(listaContactos);
        break;
        case 'b':
         afegirNom(listaContactos);
        break;
        case 'c':
         modificarNom(listaContactos);
        break;
        case 'd':
         cercaPosicio(listaContactos);
        break;
        case 'e':
         esborrarNom(listaContactos);
        break;
        case 'f':
         sortir=true;
        break;
        case 'g':
         //opcio
        break;
        default:
         System.out.println("Opció no vàlida. Torna a intentar.");
        }
     }while(sortir==false);
}

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Cerca en quina posició nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
        System.out.println("g. Opció a escollir, ficar nom");
    }

    private static char obtenirOpcioUsuari() {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Selecciona una opció: ");
        return scanner.next().charAt(0);
    } 
    
    private static void llistarNoms(String[] listaContactos){
        for (int i = 0; i < listaContactos.length; i++) {
            System.out.println(listaContactos[i]);
        }
    }
    
    private static void afegirNom(String[] listaContactos){
        Scanner sc = new Scanner(System.in);
        int posicion_final = listaContactos.length-1; // -1 para que no de error
        System.out.print("Introduce el nombre de tu nuevo contacto: ");
        String nombre = sc.nextLine();
        // for que revisa todos los valores de uno en uno desde el primer valor de la lista hasta el numero 0
        for (int i = posicion_final; i >= 0; i--){
        if (listaContactos[i] == null) { // Revisa si el valor en el que esta es nulo
            listaContactos[i] = nombre; // Si lo es se actualiza con el nombre que se puso
            return; // sale del bucle justo luego de asignar el valor actual al nombre para que no pase por otros nulls y los cambie todos
            }
        }
    }
    
    private static void modificarNom(String[] listaContactos){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre que quieras modificar: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa el nuevo nombre que le quieras asignar: ");
        String nombreNuevo = sc.nextLine();
        
        // for que va desde el 0 hasta el ultimo numero de la lista
        for (int i = 0; i < listaContactos.length;i++) {
            if(listaContactos[i] != null && listaContactos[i].equalsIgnoreCase(nombre)){ // Si no es nulo y es igual al nombre puesto por el usuario
                listaContactos[i]=nombreNuevo; // se actualizara el nombre por el nombre introducido
            }
        }
    }
    
    private static void cercaPosicio(String[] listaContactos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre que quieras buscar: ");
        String nombre = sc.nextLine();
        // for que va desde el 0 hasta el ultimo numero de la lista
        for (int i = 0; i < listaContactos.length;i++) {
            if(listaContactos[i] != null && listaContactos[i].equalsIgnoreCase(nombre)){ // Si no es nulo y es igual al nombre puesto por el usuario
                System.out.println(nombre+" se encuentra en la posicion "+(i+1)); // Te dira donde esta el nombre que buscas en la lista +1 para que el primero sea el 1 no el 0
            }
        }
    }
    
    private static void esborrarNom(String[] listaContactos){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre que quieras borrar: ");
        String nombre = sc.nextLine();
        // for que va desde el 0 hasta el ultimo numero de la lista
        for (int i = 0; i < listaContactos.length;i++) {
            if(listaContactos[i] != null && listaContactos[i].equalsIgnoreCase(nombre)){ // Si no es nulo y es igual al nombre puesto por el usuario
                listaContactos[i]=null; // Convertira el valor a nulo de nuevo
            }
        }
    }
    
}