
import java.util.Scanner;

public class ExemploSwitch1 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int month, year;
        int numDays = 0;
        System.out.println("Digite o mês");
        month = teclado.nextInt();
        System.out.println("Digite o ano");
        year = teclado.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0))
                        || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }

                break;
        }

        System.out.println("number of Days = " + numDays);

    }

}
