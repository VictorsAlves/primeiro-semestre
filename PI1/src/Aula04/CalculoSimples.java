
/**
 *
 * @author Victor.Salves1
 */
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);

        String cp1, cp2;
        int vu1, vu2, subtotal1, subtotal2, total, np1, np2;

        System.out.println("Leia o código da peça 1");
        cp1 = leia.next();
        System.out.println("Leia número de peças 1");
        np1 = leia.nextInt();
        System.out.println("Leia o valor unitário da peça 1");
        vu1 = leia.nextInt();

        System.out.println("Leia o código da peça 2");
        cp2 = leia.next();
        System.out.println("Leia número de peças 2");
        np2 = leia.nextInt();
        System.out.println("Leia o valor da peça 2");
        vu2 = leia.nextInt();

        subtotal1 = (np1 * vu1);
        subtotal2 = (np2 * vu2);
total = subtotal1+subtotal2;

        System.out.println(subtotal1 +" "+ cp1);
        System.out.println(subtotal2 +" "+cp2);
        System.out.println("O Total é de "+ total);
    }

}
