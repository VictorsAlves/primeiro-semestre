package Aula5;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner lt  = new Scanner (System.in);
        int numero;
        for (int i = 0; i < 16; i++) {
            System.out.println("Digite "+i+"º numero");
            numero = lt.nextInt();
           
            if (numero>numero){System.out.println("O maior é: "+numero);}
        }
    }
}
