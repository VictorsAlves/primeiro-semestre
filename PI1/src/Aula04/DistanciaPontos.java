/**
 *
 * @author victor.salves1
 */
import java.util.Scanner;

public class DistanciaPontos {
    public static void main (String [] args){
    
    Scanner leia = new Scanner (System.in);
    
    float x1=0, x2=0, y1=0, y2=0, p1=0, p2 = 0;
               
    float dis;
    
    System.out.println("Digite X1");
    x1 = leia.nextFloat();
    
    System.out.println("Digite Y1");   
    y1 = leia.nextFloat();
    
    System.out.println("Digite X2");
    x2 = leia.nextFloat();
    
    System.out.println("Digite Y2");
    y2 = leia.nextFloat();
    
    p1 = (x1-y1);
    p2 = (x2-y2);
    
    dis = (float) Math.sqrt ((Math.pow(p2, 2)) + (Math.pow(p1, 2)));
    System.out.println("A distância entre os pontos é de:" + dis);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
