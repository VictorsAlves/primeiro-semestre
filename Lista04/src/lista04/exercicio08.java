package lista04;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class exercicio08 {

    static int tamanhoVetor() {
        System.out.println("tamanhoVetor()");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        return a;
    }

    static int[] populaVetor(int tamanho) {
        System.out.println("populaVetor()");
        Scanner lt = new Scanner(System.in);
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = lt.nextInt();

        }
        return v;

    }

    static boolean percorreVetor(int vetor[], int numero) {
        boolean pertence = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                pertence = true;
                break;

            } else {
                pertence = false;
            }

        }
        return pertence;

    }

    public static void main(String[] args) {
        int t = tamanhoVetor();
        Scanner leitor = new Scanner(System.in);
        int dados[] = new int[t];
        dados = populaVetor(t);
        System.out.println("Digite um número para verificar se esta presente no vetor");
        int n = leitor.nextInt();
        boolean numeroPresenteVetor = percorreVetor(dados, n);

        if (numeroPresenteVetor == true) {
            System.out.println("Numero " + n + " presente no vetor");
        } else {
            System.out.println("Numero " + n + " Não presente no vetor");
        }

    }

}
