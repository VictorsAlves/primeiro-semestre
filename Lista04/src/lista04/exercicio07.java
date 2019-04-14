package lista04;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class exercicio07 {

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
        double vetor[] = populaVetor(t);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado");
        double multiplica = input.nextDouble();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * multiplica;
            System.out.println(vetor[i]);
        }

    }
}
