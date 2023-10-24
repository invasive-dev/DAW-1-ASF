package caracruz;

public class CaraCruz {

    public static void main(String[] args) {
        String vMoneda;
        int min=1,max=2,range=max-min+1,list,numAleatorio=0;
        for(list=min;list<max;list++)
        {
         numAleatorio=(int)(Math.random()*range)+min;
        }
        if(numAleatorio==2)
        {
         vMoneda="cara";
        }
        else
        {
         vMoneda="cruz";
        }
        System.out.println(numAleatorio);
        System.out.println(vMoneda);
    }
}