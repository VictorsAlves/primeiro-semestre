package lista02;

import java.util.Scanner;

/** Escreva um programa que imprima a tabuada de um número inteiro positivo N.
 *
 * @author victor
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner (System.in);
         System.out.println("Digite o Número que pretende receber a tabuada");
         int n = teclado.nextInt();
         int tab;
         for (int i=0;i<=10;i++){
         tab = n*i;
             System.out.println(n+"*"+i+"= "+tab);
         }
        
        
    }
    
}
