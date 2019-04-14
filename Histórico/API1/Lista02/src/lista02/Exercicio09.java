package lista02;

/**
 * Escreva um programa que imprima os múltiplos de 7 menores que 200.
 * @author Victor
 */
public class Exercicio09 {

    public static void main(String[] args) {

        for (int i = 0; i <= 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }

        }
    }

}
