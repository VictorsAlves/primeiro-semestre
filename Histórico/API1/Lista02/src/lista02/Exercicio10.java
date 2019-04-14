package lista02;

/**
 * Escreva um programa para encontrar o menor número inteiro ímpar divisível por
 * 3, cuja terceira potência (ou seja, o número elevado ao cubo) é maior que
 * 4000.
 *
 * @author Victor
 */
public class Exercicio10 {

    public static void main(String[] args) {

        int n = 2;
        while (n * n * n != 4000) {
            n = n + 1;
            if (n * n * n > 4000 && n % 7 == 0) {
                System.out.println(n);
                break;
            }

        }

    }
}
