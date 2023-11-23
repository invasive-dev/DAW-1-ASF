package array_ejercicio_randoom;
import java.text.DecimalFormat; // Para mostrar solo dos decimales
public class Array_ejercicio_randoom {

    public static void main(String[] args) {
        mostrarArrayDouble();
    }
    public static void mostrarArrayDouble(){
        
       // Variables
        double suma = 0; // variable acumulativa inicializada
        double media;
        DecimalFormat decimal = new DecimalFormat("0.00"); // Creamos aqui el formato usando el import
        
        // Crear Array
        double array[] = new double[5]; // son 5 valores empezando desde el 0,1,2,3,4

        // Poner los datos del array usando Random
        double min=0,max=10,range=max-min+1,nota; // variables del random con la nota min y la maxima
        int index; // index en int para que no de lossy conversion al calcular con un int el index++ y el array que esta en double
        for(index=0;index<array.length;index++){
            nota = (double)(Math.random()*range)+min;
            if(nota>10){ // para que la nota no sea 10.54 por ejemplo le asignamos la nota a 10 si es mayor que 10.0
                nota=10;
            }
            array[index]=nota;
        }

        // Loop acumulativo del index entero del array que tambien imprime el index como tal sin acumular
        for(index=0; index<array.length;index++){ // for que empieza en 0 y acaba cuando ya no sea menor a la cantidad de valores en el array, se va sumando por iteracion
            System.out.println(decimal.format(array[index])+"/10"); // imprime el valor numero index del numero del array por iteracion index++ = 0,1,2,3,4 por lo tanto nota[0],nota[1],nota[2],nota[3],etc...
            suma+= array[index]; // imprime la acumulacion por iteracion: nota[1] 0+nota[0]=8.78, 8.78+nota[1]=4,59, 13.37+nota[2]=6,30 etc...
        }
        // Calculo y mostrar por pantalla
        media = suma/array.length; // media que usa el total de todos los valores sumados dividido entre la cantidad de valores en el array
        System.out.println("");
        System.out.println("Media: " + decimal.format(media) + "/10"); // mostramos con el formato por dos decimales la media por pantalla
    }
}
