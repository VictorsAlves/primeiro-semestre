/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class Exercicio3 {
    public static void main (String args[]){
     Scanner leia = new Scanner (System.in);
     float N1, N2, media= 0;
     System.out.println("Digite nota 1");
     N1 = leia.nextFloat();
       System.out.println("Digite nota 2");
     N2 = leia.nextFloat();
    
    media = (float) ((N1*0.6)+(N2*0.4));
    System.out.println("Sua Média é: "+ media);    
    
    
    
    
    
    }
    
    
}
