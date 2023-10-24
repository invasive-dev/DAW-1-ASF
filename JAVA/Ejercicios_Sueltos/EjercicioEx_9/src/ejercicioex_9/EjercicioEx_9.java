package ejercicioex_9;
// Escriu un programa que mostri el codi ascii dels caracters de la l'A fins a la Z.

public class EjercicioEx_9 {

    public static void main(String[] args) {
        char letra='A';
        int ASCII=65;
        do
        {
        System.out.println(letra+" ("+ASCII+")");
        letra++;
        ASCII++;
        }while(ASCII<=90);
    }  
}