package Aula5;

import java.util.Scanner;

/**
 * @inss @author Victor
 */
public class Exercicio09 {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        double inss = 0;
        System.out.println("Digite salário");
        salario = leitor.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else if (salario < 1200) {
            inss = salario * 0.2;
        } else if (salario > 1200 && salario <= 2000) {
            inss = salario * 0.25;
        } else {
            inss = salario * 0.30;
        }
        System.out.println("O desconto do inss é: " + inss);

    }
}
