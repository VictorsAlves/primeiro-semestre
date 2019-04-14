package Aula06;

/**
 *
 * @author Victor.salves1
 */
public class CaseDiadoMes {
     public static void main(String[] args) {
        int mes = 2;
        int ano = 2000;
        int numerodias = 0;

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numerodias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numerodias = 30;
                break;

            case 2:
                if (((ano / 4 == 0) && !(ano / 100 == 0))
                        || (ano / 400 == 0)) {
                    numerodias = 29;
                } else {
                    numerodias = 28;
                }
                break;
        }
        System.out.println("numero de dias do mês é !" + numerodias);
    }
}
    

