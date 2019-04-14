
/**
 *
 * @author victor.salves1
 */
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double p1, p2, p3, media;

        System.out.println("Digite Prova 1");
        p1 = leia.nextDouble();
        System.out.println("Digite Prova 2");
        p2 = leia.nextDouble();
        System.out.println("Digite Prova 3");
        p3 = leia.nextDouble();

        media = ((p1 * 0.2) + (p2 * 0.3) + (p3 * 0.5) / 3);

        System.out.println("Sua média é: "+media);
    }
}
