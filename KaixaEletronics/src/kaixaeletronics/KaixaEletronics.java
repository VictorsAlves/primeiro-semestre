package kaixaeletronics;

import java.util.Scanner;


public class KaixaEletronics {
    /*--------------------------------------------------[]
    /* Centro Universitario Senac - 2 Semestre 2015
    /*  Nome: Rafael Costa Bezerra
    /*  Nome: Victor de Souza Alves
    /*--------------------------------------------------[]
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Notas
        int notaCem;
        int notaCinquenta;
        int notaVinte;
        int notaDez;
        int notaCinco;
        int notaUm;
        
        int saldoTotal;

        // Iniciando Variaveis temporarias
        int tempNotaCem = 0;
        int tempNotaCinquenta = 0;
        int tempNotaVinte = 0;
        int tempNotaDez = 0;
        int tempNotaCinco = 0;
        int tempNotaUm = 0;
        int valorOperacao = 0;
        
        //Entrada quantidade de cada nota
        //Valida se o numero digitado e negativo
        //Valida Nota 100
        do {
            System.out.println("Entre com a quantidade inicial de notas de 100:");
            notaCem = sc.nextInt();
            if (notaCem < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaCem < 0);
        
        //Valida Nota 50
        do {
            System.out.println("Entre com a quantidade inicial de notas de 50:");
            notaCinquenta = sc.nextInt();
            if (notaCinquenta < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaCinquenta < 0);
        
        //Valida Nota 20
        do {
            System.out.println("Entre com a quantidade inicial de notas de 20:");
            notaVinte = sc.nextInt();
            if (notaVinte < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaVinte < 0);
        
        //Valida Nota 10
        do {
            System.out.println("Entre com a quantidade inicial de notas de 10:");
            notaDez = sc.nextInt();
            if (notaDez < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaDez < 0);
        
        //Valida Nota 5
        do {
            System.out.println("Entre com a quantidade inicial de notas de 5:");
            notaCinco = sc.nextInt();
            if (notaCinco < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaCinco < 0);
        
        //Valida Nota 1
        do {
            System.out.println("Entre com a quantidade inicial de notas de 1:");
            notaUm = sc.nextInt();
        if (notaUm < 0) {
                System.out.println("Numero invalido, digite novamente:");
            }
        } while (notaUm < 0);
        
        //Calculando saldo total
        saldoTotal = (notaCem*100) + (notaCinquenta*50) + (notaVinte*20) + (notaDez*10) + (notaCinco*5) + (notaUm*1);
        
        //Mostra ao usuario quantidade de notas
        System.out.println("Situacao atual " + notaCem + " " + notaCinquenta + " " + notaVinte + " " + notaDez + " " + notaCinco + " " + notaUm);
        
        //Mostra ao usuario o saldo total
        System.out.println("Saldo Total: M$ " + saldoTotal);
        
        //Menu do caixa
        int operacao;
        do {
            //Solicita a operacao
            System.out.println("Operacao: (1)Saque; (2)Deposito; (3)Sair");
            operacao = sc.nextInt();

            switch(operacao){
                //Operacao saque
                case 1:
                    int valorSaque = 0;

                    //Valida se o valor do saque nao e negativo
                    do {
                    System.out.println("Valor do saque (M$):");
                    valorSaque = sc.nextInt();

                        if (valorSaque < 0) {
                            System.out.println("Valor do saque invalido");
                        }
                    } while (valorSaque < 0);

                    //Popula as variaveis temporarias
                    tempNotaCem = notaCem;
                    tempNotaCinquenta = notaCinquenta;
                    tempNotaVinte = notaVinte;
                    tempNotaDez = notaDez;
                    tempNotaCinco = notaCinco;
                    tempNotaUm = notaUm;
                    valorOperacao = valorSaque;
                    
                    //Utiliza todas notas possiveis para realizar a operacao
                    //Notas de 100
                    while (valorOperacao >= 100) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaCem == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 100;
                            tempNotaCem--;
                        }                                                
                    }
                    
                    //Notas de 50
                    while (valorOperacao >= 50) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaCinquenta == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 50;
                            tempNotaCinquenta--;
                        }                                                
                    }
                    
                    //Notas de 20
                    while (valorOperacao >= 20) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaVinte == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 20;
                            tempNotaVinte--;
                        }                                                
                    }
                    
                    //Notas de 10
                    while (valorOperacao >= 10) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaDez == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 10;
                            tempNotaDez--;
                        }                                                
                    }
                    
                    //Notas de 5
                    while (valorOperacao >= 5) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaCinco == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 5;
                            tempNotaCinco--;
                        }                                                
                    }
                    
                    //Notas de 1
                    while (valorOperacao >= 1) {
                        //Verifica se a operacao se o saque ja foi realizado
                        if (tempNotaUm == 0) {
                            break;
                        }
                        //Saco mais uma nota
                        else {
                            valorOperacao = valorOperacao - 1;
                            tempNotaUm--;
                        }                                                
                    }
                    
                    //Se o saque foi concluido
                    if (valorOperacao == 0) {
                        //Atualiza o quantidade de notas
                        notaCem = tempNotaCem;
                        notaCinquenta = tempNotaCinquenta;
                        notaVinte = tempNotaVinte;
                        notaDez = tempNotaDez;
                        notaCinco = tempNotaCinco;
                        notaUm = tempNotaUm;
                        //Atualiza o saldo total
                        saldoTotal = saldoTotal - valorSaque;
                    }
                    //Se o saque nao for concluido
                    else if (valorOperacao > 0) {
                       System.out.println("NAO HA DINHEIRO SUFICIENTE PARA SAQUE");
                    }

                    //Imprime na tela
                    System.out.println("\nSituacao atual " + notaCem + " " + notaCinquenta + " " + notaVinte + " " + notaDez + " " + notaCinco + " " + notaUm);
                    System.out.println("Saldo Total: M$ " + saldoTotal);
                    
                    //Zerando variaveis temperarias
                    tempNotaCem = 0;
                    tempNotaCinquenta = 0;
                    tempNotaVinte = 0;
                    tempNotaDez = 0;
                    tempNotaCinco = 0;
                    tempNotaUm = 0;
                    valorOperacao = 0;
                    
                    break;

                //Operacao deposito
                case 2:
                    
                    //Valida Nota 100
                    do {
                        System.out.println("Entre com a quantidade de notas de 100:");
                        tempNotaCem = sc.nextInt();
                        if (tempNotaCem < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaCem < 0);

                    //Valida novaNota 50
                    do {
                        System.out.println("Entre com a quantidade de novaNotas de 50:");
                        tempNotaCinquenta += sc.nextInt();
                        if (tempNotaCinquenta < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaCinquenta < 0);

                    //Valida novaNota 20
                    do {
                        System.out.println("Entre com a quantidade de novaNotas de 20:");
                        tempNotaVinte += sc.nextInt();
                        if (tempNotaVinte < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaVinte < 0);

                    //Valida novaNota 10
                    do {
                        System.out.println("Entre com a quantidade de novaNotas de 10:");
                        tempNotaDez += sc.nextInt();
                        if (tempNotaDez < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaDez < 0);

                    //Valida novaNota 5
                    do {
                        System.out.println("Entre com a quantidade de novaNotas de 5:");
                        tempNotaCinco += sc.nextInt();
                        if (tempNotaCinco < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaCinco < 0);

                    //Valida novaNota 1
                    do {
                        System.out.println("Entre com a quantidade de novaNotas de 1:");
                        tempNotaUm += sc.nextInt();
                        if (tempNotaUm < 0) {
                            System.out.println("Numero invalido, digite novamente:");
                        }
                    } while (tempNotaUm < 0);

                    //Atualza o valor do saldo total
                    valorOperacao = (tempNotaCem * 100) + (tempNotaCinquenta * 50) + (tempNotaVinte * 20) + (tempNotaDez * 10) + (tempNotaCinco * 5) + (tempNotaUm * 1);
                    saldoTotal = saldoTotal + valorOperacao;
                    
                    //Imprime o valor do saque
                    System.out.println("Total depositado: M$" + valorOperacao);

                    //Atualiza o quantidade de notas
                    notaCem = tempNotaCem + notaCem;
                    notaCinquenta = tempNotaCinquenta + notaCinquenta;
                    notaVinte = notaVinte + tempNotaVinte;
                    notaDez = notaDez + tempNotaDez;
                    notaCinco = notaCinco + tempNotaCinco;
                    notaUm = notaUm + tempNotaUm;
                    
                    //Imprime na tela
                    System.out.println("Situacao atual " + notaCem + " " + notaCinquenta + " " + notaVinte + " " + notaDez + " " + notaCinco + " " + notaUm);
                    System.out.println("Saldo Total: " + saldoTotal);
                    
                    //Zerando variaveis temperarias
                    tempNotaCem = 0;
                    tempNotaCinquenta = 0;
                    tempNotaVinte = 0;
                    tempNotaDez = 0;
                    tempNotaCinco = 0;
                    tempNotaUm = 0;
                    valorOperacao = 0;

                    break;

                //Operacao sair
                case 3:
                    break;

                //Caso usuario digite uma opcao nao esperada
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (operacao !=3);     
    }
}