
package lista02;

import java.util.Scanner;

/**
 * Faça um programa que receba um número e realize as seguintes operações:
 * @author Victor
 */
public class Exercicio08 {
    public static void main (String args[]){
    
    
    Scanner recebe = new Scanner (System.in);
    
    int numero;
        System.out.println("Digite um número");
        numero = recebe.nextInt();
        
        
        for(int i=0;i<5;i++){
            
        if (numero>5){numero = numero+100;}
        else if (numero<5){numero = numero*50;}
        else if (numero==numero){numero = numero-5;}
        
        }    System.out.println(numero);
    
    
    
    }
    
}
