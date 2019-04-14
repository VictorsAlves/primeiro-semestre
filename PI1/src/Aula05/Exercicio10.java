package Aula5;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int indice;
        double n1,n2,n3;
        //define tipo de média que será calculada
        System.out.printf("Digite 1. para média aritimética \n Digite 2. para média ponderada \n Digite 3. para média aritimética \n" );
        indice = lt.nextByte();
        
        //Recebe notas
        System.out.println("Digite Primeira nota");
        n1 = lt.nextInt();
        System.out.println("Digite Segunda nota");
        n2 = lt.nextInt();
        System.out.println("Digite Terceira nota");
        n3 = lt.nextInt();
        if (indice==1){}
        else if (indice==2){}
        else if (indice==3){}
    }

}
