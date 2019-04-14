package lista02;

import java.util.Scanner;

/**
 * Faça um programa para ler e escrever dados de uma turma de 5 alunos O
 * programa deve pedir dados como nome, idade e sexo. O programa deve imprimir
 * os dados do aluno mais velho.
 *
 * @author Victor
 */
public class Exercicio07 {

    public static void main(String args[]) {

//iniciando variaveis de comparação
        Scanner teclado = new Scanner(System.in);

        //iniciando variaveis
        int idade = 0;
        int novaIdade = 0;
        String nome;
        String novoNome = "";
        String sexo;

        String novoSexo;
        String nomeMaisVelho;
        String sexoMaisVelho = "";
        int idadeMaisVelho;
        int i = 0;
        while (i != 3) {
            //recebendo dados
            System.out.println("Informe Nome");
            nome = teclado.next();
            System.out.println("Informe Sexo");
            sexo = teclado.next();
            System.out.println("Informe Idade");
            idade = teclado.nextInt();

            //Variavel de teste
            if (idade > novaIdade) {
                novaIdade = idade;
                novoSexo = sexo;
                novoNome = nome;
            }
            i = i + 1;
            if (i == 3) {
                System.out.println("Nome do mais velho = " + novoNome + "\n idade = " + novaIdade + "\n Sexo" + sexoMaisVelho);
                break;
            }
        }

    }
}
