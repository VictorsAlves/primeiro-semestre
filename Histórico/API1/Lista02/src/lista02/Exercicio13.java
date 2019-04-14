
package lista02;

import java.util.Scanner;

/**
 *Escreva um programa para ler o número de alunos existentes em uma turma,
 *ler as notas destes alunos e calcular a média aritmética destas notas.
 * @author Victor
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int alunos;
      float nota, resultado = 0;
      
        System.out.println("Digite a Quantidade de alunos na Turma");    
        alunos = sc.nextInt();
        
       for (int rep = 1;rep<=alunos;rep++){
        
            System.out.println("Digite as notas do aluno Nº"+rep);
            nota = sc.nextFloat();
        resultado  = resultado+nota/alunos;
        
        } System.out.println("A média é igual à: "+resultado);
        
    }
}
