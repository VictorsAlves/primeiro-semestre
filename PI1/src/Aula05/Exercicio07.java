/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

import java.util.Scanner;

/**
 *
 * @author Victor.Salves1
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas");
        int m = teclado.nextInt();

        double preco;
        preco = m * 1.30;
        if (m >= 12) {
            preco = m * 1;
        }
        System.out.printf("Quantidade de maças  "+ m +   " \n %.2f Preço " , preco);

    }

}
