/**
 *
 * @author Victor.salves1
 */
import java.util.Scanner;
public class Diferenca {
public static void main (String args []){
    Scanner leia =  new Scanner (System.in);

int a,b,c,d,dif;

    System.out.println("Digite A");
    a = leia.nextInt();
    System.out.println("Digite B");
    b = leia.nextInt();
    System.out.println("Digite C");
    c = leia.nextInt();
    System.out.println("Digite D");
    d = leia.nextInt();


dif = (a*b)-(c*d);
    System.out.println("A diferença dos produtos de A*B por C*D é :"+dif);
}    
}
