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
public class exercicio13 {

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

	static int[] criaVetor(int tamanho) {
		tamanho = tamanho * 2;
		int[] vetorC = new int[tamanho];
		return vetorC;

	}

	public static void main(String args[]) {
		int t = tamanhoVetor();
		int[] vetor01 = populaVetor(t);
		int[] vetor02 = populaVetor(t);
		int[] vetor03 = criaVetor(t);
		int tamanhoVetor1 = vetor01.length;
		int tamanhoVetor2 = vetor02.length * 2;
		for (int i = 0; i < vetor03.length; i++) {

			if (vetor03.length != tamanhoVetor1) {
				vetor03[i] = vetor01[i];

			}
			for (int j = i; j < vetor03.length; j++) {
				if (vetor03.length != tamanhoVetor2) {
					vetor03[j] = vetor02[i];

				}

			}
			System.out.println("pocicao: " + i +"="+ vetor03);
		}
	}

}
