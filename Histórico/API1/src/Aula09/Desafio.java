/*
 * escreva uma função que recebe 2 números inteiros n1 e n2 como entrada
 e retorna a soma de todos os números inteiros contidos no intervalo de [n1,n2]
 Use esta função em um programa que lê n1 e n2 do usuario e imprime a soma.

 */
package Aula09;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class Desafio {
    static int n1; 
    static int n2;

    public static int somaRep() {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        int contador = 0;
        System.out.println("Digite n1");
        n1 = sc.nextInt();
        System.out.println("Digite n2");
        n2 = sc.nextInt();

        if (n1 > n2) {

            while (n1 != n2) {

                resultado = n1++;

            }

        } else {
            while (n2 != n1) {
                resultado = n1++;
            }
        }
        return resultado;

    }

    public static void main(String[] args) {
        
        int soma  = somaRep();
        System.out.println("A soma é "+ soma);

    }
}
