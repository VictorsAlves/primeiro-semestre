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
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
       int n = 10;
        //comando escreva
        System.out.println("Olá Mundo!");
        System.out.println("O valor de n é:" + n);
       n = n+10;
       System.out.println("Novo valor de N:" + n );
       
   String nome;
  System.out.println("Digite seu nome");
  nome = leitor.next();
  System.out.println("Seu nome é " + nome);
    }
   
}
