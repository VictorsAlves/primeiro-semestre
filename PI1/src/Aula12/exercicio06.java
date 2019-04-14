package Aula12;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class exercicio06 {

    static int delta(int a, int b, int c) {
        int d;
        d = (b * b) - 4 * a * c;
        return d;

    }

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int a, b, c,d;
        a = lt.nextInt();
        b = lt.nextInt();
        c = lt.nextInt();
        
        d = delta(a, b, c);
        System.out.println(d);
        
        
        
    }

}
