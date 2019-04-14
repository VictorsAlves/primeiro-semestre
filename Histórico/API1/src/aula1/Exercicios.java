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
public class Exercicios {
    public static void main(String args[]){
    // declaração de variaveis 
        Scanner leia = new Scanner(System.in);
        float n1,n2,n3, media = 0;
        System.out.println("Digite Nota 1");
     n1 = leia.nextFloat();
     System.out.println("Digite Nota 2");
     n2 = leia.nextFloat();
     System.out.println("Digite Nota 3");
     n3 = leia.nextFloat();
     media = (n1+n2+n3)/3;
     System.out.println("Sua média é: "+media);
}
}