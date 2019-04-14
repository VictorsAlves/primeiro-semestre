package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio11 {

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

// media dos elementos par do vetor
    static int mediaPares(int vetor[]) {
        System.out.println("mediaPares");
        int valor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0 || i % 2 != 0) {
                valor = valor+ vetor[i];
            }
        }
valor = valor/vetor.length;
        System.out.println("Valor"+valor);
return valor;
    }

    public static void main(String[] args) {
        int tamanho = tamanhoVetor();
        int[] vetor = populaVetor(tamanho);
       int  mediaPar = mediaPares(vetor);
        for (int i = 0; i <vetor.length; i++) {
            if (vetor[i]>mediaPar){
                System.out.println("Maiores do que a media dos elementos na posição par: "+vetor[i]);}
            
        }
       
    }

}
