package Aula06;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, d,v , n1, d1, v1;

        System.out.println("Entrada");

        n = sc.nextInt();
        d = sc.nextInt();
        v = sc.nextInt();

        n1 = sc.nextInt();
        d1 = sc.nextInt();
        v1 = sc.nextInt();

        System.out.println("--");

        System.out.println("Saida");

        if (d <= d1 && v <= v1) {

            System.out.println(n);

        } else if (d1 <= d && v1 <= v) {

            System.out.println(n1);

        }

    }
}
