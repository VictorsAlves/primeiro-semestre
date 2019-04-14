package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio04 {

    static int tamanhoVetor() {
        System.out.println("tamanhoVetor");
        Scanner lt = new Scanner(System.in);
        int tamanho = lt.nextInt();
        return tamanho;
    }

    static double[] populaVetor(int t) {
        System.out.println("populaVetor()");
        Scanner lt = new Scanner(System.in);
        double[] v = new double[t];
        for (int i = 0; i < t; i++) {
            v[i] = lt.nextDouble();

        }
        return v;
    }

    public static void main(String[] args) {
        int t = tamanhoVetor();
        double menor = 0;
        double vetor[] = populaVetor(t);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

        }
        System.out.println(menor);

    }

}
