package array_ejercicio_randoom;
public class Array_ejercicio_randoom {

    public static void main(String[] args) {
        mostrarArrayDouble();
       
    }
    public static void mostrarArrayDouble(){
       
        // Crear Array
        double array[] = new double[5]; // son 5 valores empezando desde el 0,1,2,3,4

        // Poner los datos del array usando Random
        int min=0,max=10,range=max-min+1,list,nota;
        
        for(list=0;list<array.length;list++){
            nota = (int)(Math.random()*range)+min;
            array[list]=nota;
        }
       
        // Variables
        double suma = 0; // variable acumulativa inicializada
        double media;
       
        // Loop acumulativo del index entero del array que tambien imprime el index como tal sin acumular
        for(list=0; list<array.length;list++){ // for que empieza en 0 y acaba cuando ya no sea menor a la cantidad de valores en el array, se va sumando por iteracion
            System.out.println(array[list]+"/10.0"); // imprime el valor numero index del numero del array por iteracion index++ = 0,1,2,3,4 por lo tanto nota[0],nota[1],nota[2],nota[3],etc...
            suma+= array[list]; // imprime la acumulacion por iteracion: nota[1] 0+nota[0]=1.78, 1.78+nota[1]=3,59, etc...
        }
        // Calculo y mostrar por pantalla
        media = suma/array.length; // media que usa el total de todos los valores sumados dividido entre la cantidad de valores en el array
        System.out.println("");
        System.out.println("Media: "+media+"/10.0");
    }
}