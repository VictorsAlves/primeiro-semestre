/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Exercicio03 {

    public static void main(String[] args) {
        int r;
        int r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Peso 1");
        int p1 = sc.nextInt();
        System.out.println("Digite o comprimento 1");
        int c1 = sc.nextInt();
        System.out.println("Digite o peso 2");
        int p2 = sc.nextInt();
        System.out.println("Digite o comprimento 2");
        int c2 = sc.nextInt();
        r = p1 * c1;
        r2 = p2 * c2;
        if (r == r2) {
            System.out.println("0");
        } else if (r < r2) {
            System.out.println("1");
        } else if (r > r2) {
            System.out.println("-1");
        }

    }

}
