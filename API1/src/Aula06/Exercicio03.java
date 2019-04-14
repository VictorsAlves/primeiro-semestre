package Aula06;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio03 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um mês de 1 a 12");
        int mes = teclado.nextInt();

        switch (mes) {
            case 01:
                System.out.println("Férias");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("1ºSemestre letivo");
                break;
            case 07:
                System.out.println("Recesso");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("2ºSemestre letivo");
                break;
            case 12:
                System.out.println("Férias");

        }

    }

}
