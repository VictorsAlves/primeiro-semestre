package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio09 {

    static int tamanhoVetor() {
        System.out.println("tamanhoVetor");
        Scanner lt = new Scanner(System.in);
        int tamanho = lt.nextInt();
        return tamanho;
    }

    static int[] populaVetor(int t) {
        System.out.println("populaVetor()");
        Scanner lt = new Scanner(System.in);
        int[] v = new int[t];
        for (int i = 0; i < t; i++) {
            v[i] = lt.nextInt();

        }
        return v;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tamaho dos vetores");

        int t = tamanhoVetor();
        int vetor1[] = new int[t];
        int vetor2[] = new int[t];
        int vetorSoma[] = new int[t];
        System.out.println("Popule o primeiro vetor");
        vetor1 = populaVetor(t);

        System.out.println("Popule o segundo vetor");
        vetor2 = populaVetor(t);

        for (int i = 0; i < t; i++) {
            vetorSoma[i] = vetor1[i] * vetor2[i];
            System.out.println(vetor1[i] + "X" + vetor2[i] + "= " + vetorSoma[i]);
        }

    }
}
