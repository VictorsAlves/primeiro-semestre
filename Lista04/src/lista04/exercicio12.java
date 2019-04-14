package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio12 {

    static int tamanhoVetor() {
        System.out.println("tamanhoVetor");
        Scanner lt = new Scanner(System.in);
        int a = lt.nextInt();
        return a;

    }

    static int media(int vetor[]) {
        System.out.println("media()");
        int valor = 0;
        for (int i = 0; i < vetor.length; i++) {
            valor = valor + vetor[i];
        }
        valor = valor / vetor.length;

        return valor;
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

    static int soma(int[] v) {
        System.out.println("somaElementos()");
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + v[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tamanho dos vetores");
        int tamanhoVE = tamanhoVetor();

        System.out.println("Populule o primeiro vetor");
        int[] vetor1 = populaVetor(tamanhoVE);
        System.out.println("Popule o segundo Vetor");
        int[] vetor2 = populaVetor(tamanhoVE);
        int media1 = media(vetor1);
        int media2 = media(vetor2);
        int soma1 = soma(vetor1);
        int soma2 = soma(vetor2);

        if (media1 < media2) {
            System.out.println(media1);
        } else {
            System.out.println(media2);
        }
        if (soma1 > soma2) {
            System.out.println(soma1);
        } else {
            System.out.println(soma2);
        }
    }

}
