/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor.salves1
 */
import java.util.Scanner;

public class Cigarro {

    public  static void main(String args[]) {
        Scanner leia = new Scanner(System.in);

        int qc, qa, pm;
        System.out.println("Digite a quantidade de cigarros fumados por dia");
        qc = leia.nextInt();
        System.out.println("Digite a Quantidade de anos fumando ");
        qa = leia.nextInt();
        System.err.println("Digite o Preço do Cigarro");
        pm = leia.nextInt();

        int media = (qc * pm) / (365 * qa);
        System.out.println("A Quantidade de Dinheiro Gasto com Cigarro durante " + qa + "Anos, é igual á " + media);

    }
}
