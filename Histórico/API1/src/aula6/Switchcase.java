package aula6;

import java.util.Scanner;

/**
 * switch case somente igualdade
 *
 * @author victor.salves1
 */
public class Switchcase {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int diaDaSemana;
        System.out.println("Digite o Dia ");
        diaDaSemana = teclado.nextInt();
        switch (diaDaSemana) {
            case 1:
                System.err.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("este não é um dia válido");
        }

    }

}
// system.out.printf
//%s = Texto (String)
//%i = Inteiro (int)
//%f = Decimais (float)
//%c =  um caracter (Char)
