package Aula08;

import java.util.Scanner;

/**
 * peça para o usuário definir o horario que vai parar o alarme somente se for
 * você, ele devera entrar com o nome , minuto e segundo qe deseja parar o
 * alarme
 *
 * @author Victor
 */
public class LacosAninhados {

    public static void main(String[] args) {
        //inicio do programa
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o seu Nome");
        String nome = leitor.next();
//Recebendo o usuário
        System.out.println("Para definir o Alarme Digite o usuário");
        String usuario = leitor.next();
        boolean teste = nome.equals(usuario);
        // se o usuario for válido iniciamos o alarme 

        if (teste) {
            System.out.println("Digite a Hora");
            int h = leitor.nextInt();
            System.out.println("Digite Minutos");
            int m = leitor.nextInt();
            System.out.println("Digite Segundos");
            int s = leitor.nextInt();

            //Simulando a hora de um relógio utilizando o comando For
            Scanner sc = new Scanner(System.in);
            int controle = 1;
            while (controle == 1) {
                //controla hora
                for (int hora = 0; hora <= 23; hora++) {
                    //controla minuto
                    for (int minuto = 0; minuto <= 59; minuto++) {
                        //controla segundos
                        for (int segundo = 0; segundo <= 59; segundo++) {
                            System.out.printf("%d:%d:%d \n", hora, minuto, segundo);

                            //Criando um alarme
                            if ((hora == h) && (minuto == m) && (segundo == s)) {
                                System.out.println("ACOOOORDAAA!!!!! "+h+":"+m+":"+s);
                                break;
                            }
                        }
                        if ((hora == h) && (minuto == m)) {
                            //System.out.println("Alarme!!!");
                            break;
                        }
                    }
                    if (hora == h) {
                        break;
                    }
                }
                System.out.println("1 - Continua 2 - Para");
                controle = sc.nextInt();
                if (controle != 1) {
                    break;
                }
            }
        } else {System.out.println("Nome de usuario inválido");}

    }
}
