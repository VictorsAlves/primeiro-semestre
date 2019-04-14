package revisaopi;

import java.util.Scanner;

/**
 *
 * @author
 */
public class RevisaoPI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota100;
        int nota50;
        int nota20;
        int nota10;
        int nota5;
        int nota1;
        int operacao;
        int saldoTotal;
     
        // variaveis temporarias
        int tempNota100 = 0;
        int tempNota50= 0;
        int tempNota20= 0;
        int tempNota10= 0;
        int tempNota5= 0;
        int tempNota1= 0;
        int tempSaldototal;
              System.out.println("Digite a quantidade de notas de 100");
        nota100 = sc.nextInt();
        System.out.println("Digite a quantidade de notas de 50");
        nota50 = sc.nextInt();
        System.out.println("Digite a quantidade de notas de 20");
        nota20 = sc.nextInt();
        System.out.println("Digite a quantidade de notas de 10");
        nota10 = sc.nextInt();
        System.out.println("Digite a quantidade de notas de 5");
        nota5 = sc.nextInt();
        System.out.println("Digite a quantidade de notas de 1");
        nota1 = sc.nextInt();

        while (nota100 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 100");
            nota100 = sc.nextInt();
        }

        while (nota50 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 50");
            nota50 = sc.nextInt();
        }
        while (nota20 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 20");
            nota20 = sc.nextInt();
        }
        while (nota10 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 10");
            nota10 = sc.nextInt();
        }
        while (nota5 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 5");
            nota5 = sc.nextInt();

        }
        while (nota1 < 0) {
            System.out.println("nota invalida");
            System.out.println("Digite a quantidade de notas de 1");
            nota1 = sc.nextInt();

        }
        saldoTotal = (nota100 * 100) + (nota50 * 50) + (nota20 * 20) + (nota10 * 10) + (nota5 * 5) + nota1;
        System.out.println("saldo total: " + saldoTotal);
        System.out.printf("Situacao atual:" + nota100+ " " + nota50 + " " + nota20 + " " + nota10 + " " + nota5 + " " + nota1+"\n");
        System.out.println("Digite (1)Saque;(2)Deposito;(3)Sair");
        operacao = sc.nextInt();
        while (operacao != 3) {
            switch (operacao) {
                // saque 
                case 1:
                    int valorSaque = 0;
                    System.out.println("Valor do saque (M$):");
                    valorSaque = sc.nextInt();
                    while (valorSaque<0){
                    System.out.println("Valor do saque (M$):");
                    valorSaque = sc.nextInt();
                    if (valorSaque>0){
                        int saque = valorSaque;
break;
                    
                    
                    
                    
                    
                    
                    
                    }
                        if (valorSaque < 0) {
                            System.out.println("Valor do saque invalido");
                        }
                    } 
                    
                    break;

                // deposito
                case 2:
                    System.out.println("Digite a quantidade de notas de 100");
                    nota100 = sc.nextInt();
                    System.out.println("Digite a quantidade de notas de 50");
                    nota50 = sc.nextInt();
                    System.out.println("Digite a quantidade de notas de 20");
                    nota20 = sc.nextInt();
                    System.out.println("Digite a quantidade de notas de 10");
                    nota10 = sc.nextInt();
                    System.out.println("Digite a quantidade de notas de 5");
                    nota5 = sc.nextInt();
                    System.out.println("Digite a quantidade de notas de 1");
                    nota1 = sc.nextInt();

                    while (nota100 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 100");
                        nota100 = sc.nextInt();
                    }

                    while (nota50 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 50");
                        nota50 = sc.nextInt();
                    }
                    while (nota20 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 20");
                        nota20 = sc.nextInt();
                    }
                    while (nota10 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 10");
                        nota10 = sc.nextInt();
                    }
                    while (nota5 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 5");
                        nota5 = sc.nextInt();

                    }
                    while (nota1 < 0) {
                        System.out.println("nota invalida");
                        System.out.println("Digite a quantidade de notas de 1");
                        nota1 = sc.nextInt();

                    }
                    tempNota100 = (nota100)+(tempNota100);
                    tempNota50 = (nota50)+(tempNota50);
                    tempNota20 = (nota20)+(tempNota20);
                    tempNota10 = (nota10)+(tempNota10);
                    tempNota5 = (nota5)+(tempNota5);
                    tempNota1 = (nota1)+(tempNota1);
                    tempSaldototal = (tempNota100*100)+(tempNota50*50)+(tempNota20*20)+(tempNota5*5)+(tempNota1*1);

                    
                    System.out.println("Situacao atual: " + tempSaldototal);
                    System.out.printf("Situacao atual:" + tempNota100+ " " + tempNota50 + " " + tempNota20 + " " + tempNota10 + " " + tempNota5 + " " + tempNota1+"\n");
                    System.out.println("Digite (1)Saque;(2)Deposito;(3)Sair");
                    operacao = sc.nextInt();
                    
                    
                    // zerando variaveis temporarias
                     tempNota100 = 0;
                    tempNota50 = 0;
                    tempNota20 = 0;
                    tempNota10 = 0;
                    tempNota5 = 0;
                    tempNota1 = 0;
            int valorOperacao = 0;
                    break;
                default:
                    System.out.println("opcao invalida");

            }

        }

    }
}
