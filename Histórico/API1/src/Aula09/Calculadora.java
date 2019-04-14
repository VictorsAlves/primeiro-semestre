package Aula09;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class Calculadora {

    static int n1;
    static int n2;

    public static void entradaDados() {
        System.out.println("Entrada dados");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1");
        n1 = sc.nextInt();
        System.out.println("Digite n2");
        n2 = sc.nextInt();
    }
// Função de adição

    public static int adicao(int x, int y) {
        System.out.println("adicao");
        int resultado = x + y;
        return resultado;
    }
// função de subtração

    public static int subtracao(int x, int y) {
        System.out.println("subtracao");
        int resultado = x - y;
        return resultado;

    }
// função de multiplicação

    public static int multiplicacao(int x, int y) {
        System.out.println("multi");
        int resultado = x * y;
        return resultado;
    }
// função de divisão

    public static int divisao(int x, int y) {
        System.out.println("div");
        int resultado = x / y;
        return resultado;
    }

    public static int menu() {
        System.out.println("menu");
        Scanner leitor = new Scanner(System.in);
        //op = operação escolhida
        int op;
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.print("Opção: ");
        op = leitor.nextInt();
        return op;
    }

    public static float processo(int opcao) {
        System.out.println("procsso");
        float resultado;
        switch (opcao) {

            case 1:
                resultado = adicao(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = multiplicacao(n1, n2);
                break;
            case 4:
                resultado = divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida!!!");
                resultado = -1;
        }
        return resultado;
    }

    public static void imprime(float r) {
        System.out.println("Resultado: " + r);
    }

    public static void main(String[] args) {
        int m = menu();
        entradaDados();
        float p = processo(m);
        imprime(p);

    }

}
