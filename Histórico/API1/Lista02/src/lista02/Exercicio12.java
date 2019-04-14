package lista02;

/**
 * Calcular e mostrar a média aritmética dos números pares compreendidos entre
 * 13 e 73.
 *
 * @author Victor
 */
public class Exercicio12 {

    public static void main(String[] args) {
        int n = 13;
        int n2 = 0;
        int n3 = 0;
        int media = 0;
        while (n < 73) {
            n++;
            if (n % 2 == 0) {
                n2 = n + n2;

                n3 = n3 + 1;

                media = n2 / n3;

            }

        }
        System.out.println("A média é igual à: " + media);

    }

}
