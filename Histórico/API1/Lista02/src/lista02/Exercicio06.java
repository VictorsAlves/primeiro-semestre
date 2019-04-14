package lista02;

/**
 * Faça um programa que some os números de 1 a 10, apresentando as somas
 * parciais e, no final, o total.
 *
 * @author Victor
 */
public class Exercicio06 {

    public static void main(String args[]) {

        int num = 0, i;
        String somaparcial = "";
        for (i = 1; i <= 10; i++) {
            num = num + i;
            somaparcial = somaparcial +i+"+"; 
                    

            System.out.println(somaparcial+" = " + num);

        }
    }
}
