package Aula5;

import java.util.Scanner;

/**
 * essa pessoa pode votar?
 *
 * @author Victor
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;
        String nome;
        System.out.println("Digite o Nome");
        nome = teclado.next();
        System.out.println("Digite Idade");
        idade = teclado.nextInt();

        if (idade < 16) {
            System.out.println("Voto não autorizado");
        } else if (idade < 18 || idade >= 65) {
            System.out.println("Voto Facultativo");
        } else {
            System.out.println("Voto Obigatório");
        }

    }

}
