/**
 *
 * @author Victor.alves
 */
import java.util.Scanner;

public class consumo {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);

        double dt, cg, consumo;
        System.out.println("Digite o Distância total");
        dt = leia.nextDouble();
        System.out.println("Digite Combustível gasto");
        cg = leia.nextDouble();
        consumo = (dt + cg) / 2;
        System.out.println("O Consumo total é de : " + consumo);

    }
}
