/*
 * @author victor.salves1
 */
import java.util.Scanner;
        public class ConversãoSegundos {
    public static void main (String [] args){
        //Conversão Para Seundos
        int hr;
        int m;
        int s = 0;
        int qs;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite Hora");
        hr = leia.nextInt();
        System.out.println("Digite Minutos");
        m = leia.nextInt();
        System.out.println("Digite Segundos");
        s = leia.nextInt();
              
                
        qs = (hr*3600) + (m*60) + s;
         System.out.println("A Converção é:" + qs);
        
        
         
        
        
        
    
    
    
    
    
    
    
    
    
    }
}
