package ejercicioex_3;
// Escriu un programa que mostri per pantalla els 10 múltiples de 7 a partir del 12
public class EjercicioEx_3 {

    public static void main(String[] args) {
        int num=12,cantMult;
        
        for(cantMult=0;cantMult<10;num++)
        {
         if(num>12 & num%7==0)
         {
          cantMult++;
          System.out.println(("(")+cantMult+(")")+num);
         }
        }
    }
}