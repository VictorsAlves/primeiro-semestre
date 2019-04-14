package Aula08;

/**
 *
 * @author Victor
 */
public class JogoCraps {

    public static void main(String[] args) {
        int dado1;
        int dado2;
        int resultado;
        int resultado2;
        int totalv = 0, totald = 0;

        for (int rep = 0; rep <= 10001; rep++) {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            resultado = dado1 + dado2;

            if (resultado == 7 || resultado == 11) {
                System.out.println("Ganhou " + " Dado1 " + dado1 + " Dado2 " + dado2 + " Resultado " + resultado);
                totalv = totalv + 1;

            } else if (resultado == 2 || resultado == 3 || resultado == 12) {
                System.out.println("Perdeu" + " Dado1 " + dado1 + " Dado2 " + dado2 + " Resultado " + resultado);
                totald = totald + 1;

            } else {
                resultado2 = resultado;

                dado1 = (int) (Math.random() * 6 + 1);
                dado2 = (int) (Math.random() * 6 + 1);
                int resultado3 = dado1 + dado2;

                if (resultado3 == resultado2) {
                    System.out.println("Ganhou" + " Dado1 " + dado1 + " Dado2 " + dado2 + " Resultado " + resultado3);
                    totalv = totalv + 1;
                } else {
                    while (resultado3 != resultado2) {

                        dado1 = (int) (Math.random() * 6 + 1);
                        dado2 = (int) (Math.random() * 6 + 1);
                        resultado3 = dado1 + dado2;

                        if (resultado3 == 7) {
                            System.out.println("Perdeu" + " Dado1 " + dado1 + " Dado2 " + dado2 + " Resultado " + resultado3);
                            totald = totald + 1;
                        }

                    }
                }

            }

        }
        System.out.println("Total de vitorias = " + totalv + " Total de derrotas = " + totald);
    }

}
