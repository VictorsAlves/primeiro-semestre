package Aula5;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        //ususario dia mes e ano
        int dia, mes, ano, dia2, mes2, ano2;
        String nome;
        System.out.println("Data Mais Recente");
        System.out.printf("Informe o Nome");
        nome = lt.next();
        System.out.println("Informe o dia da primeira data ");
        dia = lt.nextInt();
        System.out.println("informe o mês da primeira data");
        mes = lt.nextInt();
        System.out.println("Informe o Ano da primeira data");
        ano = lt.nextInt();

        System.out.println("Informe o dia da segunda data ");
        dia2 = lt.nextInt();
        System.out.println("informe o mês da segunda data");
        mes2 = lt.nextInt();
        System.out.println("Informe o Ano da segunda data");
        ano2 = lt.nextInt();

        if (ano > ano2) {
            System.out.println(nome + " " + dia + "." + mes + "." + ano);
        } else if (ano == ano2 && mes > mes2) {
            System.out.println(nome + " " + dia + "." + mes + "." + ano);
        } else if (ano == ano2 && mes > mes2 && dia > dia) {
            System.out.println(nome + " " + dia + "." + mes + "." + ano);
        } else {System.out.println(nome+" "+dia2+"."+mes2+"."+ano2);}

    }

}
