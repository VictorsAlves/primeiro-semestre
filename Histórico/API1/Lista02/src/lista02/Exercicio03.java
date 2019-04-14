package lista02;

import java.util.Scanner;
/**
 * Escreva um programa que leia um conjunto de 10 números inteiros positivos e determine o maior deles.
 * @author Victor de Souza Alves
 */
public class Exercicio03 {
    public static void main (String args []){
    
        Scanner leitor  = new Scanner (System.in);
        int n2=0;
        
       
       for(int i=1;i<=10;i++){
        System.out.println("Digite "+i+"º número");
       int n1 = leitor.nextInt();
       
       
       if (n1>n2){n2 = n1;}
       
       if (n1<0){System.out.println("Não é aceito números negativos");
       break;}
       }
        System.out.println(n2);
    
    
    
    
    }
}


