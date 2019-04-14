package Aula12;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class exercicio04 {
    
     static boolean verificaNum (int n){
  boolean entrega = true;
         if (n>0){ entrega = true;}
         else if (n<0){entrega = false;}
         return entrega;
     }
    public static void main(String[] args) {
        Scanner leitor  = new Scanner (System.in);
        int n = leitor.nextInt();
        boolean teste = verificaNum(n);
        System.out.println(teste);
        
    }
    
}
