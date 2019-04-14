package pitemp;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class MDC {

    public static int mdc(int a, int b) {
        int resto;

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;

        }
        return a;

    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        int n = leitor.nextInt();
        int contNumeros = 1;
     
        int n1 = leitor.nextInt();
        int n2;
        while (contNumeros < n) {
            n2 = leitor.nextInt();
            if (n1 > n2) {
                n1 = mdc(n1, n2);
            } else {
                n1 = mdc(n2, n1);
            } contNumeros++;

        }System.out.println(n1);
    }

}
