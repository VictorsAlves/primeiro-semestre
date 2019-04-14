package lista02;

import java.util.Scanner;

/**
 * Faça um programa que leia um número N, 
 * some todos os números inteiros de 1 a N, e mostre o resultado obtido.
 *
 * @author Victor
 */
public class Exercicio02 {
    public static void main (String args []){
        Scanner lt = new Scanner(System.in);
       
   
        System.out.println("Digite um número");
        int n = lt.nextInt();
        
   for (int i=0;i!=n;i++){
   int soma = i+i;
   System.out.println(i+"+"+i+"="+soma);
   }
    
   
        
        
    
    
    }}

