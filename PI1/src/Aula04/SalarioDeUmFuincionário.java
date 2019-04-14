/**
 *
 * @author victor.salves1
 */
import java.util.Scanner;

public class SalarioDeUmFuincionário {

    public static void main(String args[]) {

        Scanner leia = new Scanner(System.in);
        double nf, horast, valorph, salario;

        System.out.println("Digite o número do funcionário");
        nf = leia.nextInt();
        System.out.println("Digite Quantidade de Horas trabalhadas");
        horast = leia.nextInt();
        System.out.println("Digite Valor Ganho por Hora");
        valorph = leia.nextInt();

        salario = horast * valorph;
        System.out.println("O Salário do funcionário nº" + nf + "é R$" + salario);

    }

}
