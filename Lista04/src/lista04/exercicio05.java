/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio05 {

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
        double media = 0;
        double vetor[] = populaVetor(t);
        for (int i = 0; i < vetor.length; i++) {
            media = vetor[i] + media;

        }
        media = media / vetor.length;
        System.out.println(media);

    }

}
