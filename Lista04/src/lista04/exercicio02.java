/*
*Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e 
imprima o resultado. 
 */
package lista04;

import java.util.Scanner;


/**
 *
 * @author Flavio
 */
public class exercicio02 {
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
    static double somaElementos(double [] v){
        System.out.println("somaElementos()");
    double soma = 0;
        for (int i = 0; i < 10; i++) {
                soma = soma+v[i];
        }

    
    return soma;
    }

    public static void main(String[] args) {
        int tamanho = tamanhoVetor();
        double[] vetor;
        vetor = populaVetor(tamanho);
      double soma = somaElementos(vetor);
        System.out.println(soma);
    }
}
