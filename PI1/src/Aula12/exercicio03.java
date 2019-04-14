
package Aula12;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class exercicio03 {
      public static int fatorial(int n) {
        
        int fatorando = 1;
        for (int i = 1; i <= n; i++) {
           fatorando = fatorando *i;

        }

        return fatorando;
    }
    public static void main(String[] args) {
        Scanner leitor  = new Scanner (System.in);
        int n;
        do {n = leitor.nextInt();        
        int f  = fatorial(n);
            System.out.println(f);
    }while(n!=0);
    
    }
    
}
