
package Aula12;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class exercicio02 {
    
    public static int quadrado(int a){
    int duas  = a*a;
    return duas;}
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
     int ab = quadrado(a);
     int bb = quadrado(b);
     int cb = quadrado(c);
        System.out.println(ab);
        System.out.println(bb);
        System.out.println(cb);
    }
    
}
