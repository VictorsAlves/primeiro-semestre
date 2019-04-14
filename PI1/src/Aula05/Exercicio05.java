
package Aula5;

import java.util.Scanner;

/**
 *
 * @author VictorAlves
 */
public class Exercicio05 {
    public static void main (String [] args){
        Scanner lt = new Scanner (System.in);
        
        System.out.println("Pares e Impares negativos e positivos");
        System.out.println("Digite um número");    
        int n  = lt.nextInt();
        
        if(n%2==0&&n>0){System.out.println("Par, Positivo");}
        else if (n%2==0&&n<0){System.out.println("Par, Negativo");}
        else if (n%2!=0&&n>0){System.out.println("Impar, Positivo");}
        else if (n==0){System.out.println("O número 0 é nulo");}
        else {System.out.println("Impar, Negativo");}
    }
}
