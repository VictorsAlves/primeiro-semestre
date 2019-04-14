package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio10 {

    static int tamanhoVetor() {
        System.out.println("tamanhoVetor");
        Scanner lt = new Scanner(System.in);
        int a = lt.nextInt();
        return a;

    }

    static int[] populaVetor(int a) {
        System.out.println("populaVetor()");
        int vetor[] = new int[a];
        Scanner lt = new Scanner(System.in);

        for (int i = 0; i < a; i++) {
            vetor[i] = lt.nextInt();
        }

        return vetor;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = tamanhoVetor();
        int vetor[];
        vetor = populaVetor(t);
        System.out.println("Digite um número real");
        int a = leitor.nextInt();
        int impar;
        for (int i = 0; i < vetor.length; i++) {
            impar = vetor[i];

            if (impar % 2 != 0) {
               impar = vetor[i] * a;
                System.out.println(vetor[i]+"X"+a+"="+impar);
            }

        }

    }
}
