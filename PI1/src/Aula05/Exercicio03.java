package Aula5;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio03 {

    public static void main(String args[]) {

        Scanner lt = new Scanner(System.in);

        System.out.println("Multiplicidade");
        System.out.println("Digite o primeiro número");
        int n1 = lt.nextInt();
        System.out.println("Digite o segundo númeor");
        int n2 = lt.nextInt();

        int r = n1 % n2;
        if (r == 0) {
            System.out.println("São multiplios");
        } else {
            System.out.println("Não são multiplos ");
        }

    }

}
